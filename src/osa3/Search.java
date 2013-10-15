package osa3;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Dao;

public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (isDeleted(request)) {

			deleted(request);
		}
		setSearchResults(request);
		request.getRequestDispatcher("WEB-INF/jsp/search.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String searchString = request.getParameter("searchString");
		response.sendRedirect("Search?searchString=" + searchString);
	}

	private void setSearchResults(HttpServletRequest request) {

		String searchString = request.getParameter("searchString");
		Dao dao = new Dao();

		try {
			if (searchString == null || searchString.equals("")) {
				request.setAttribute("searchResults", dao.findAllItems());
			} else {
				request.setAttribute("searchResults", dao.searchLikeItems(searchString));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private void deleted(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));

		try {
			new Dao().deleteItemById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private boolean isDeleted(HttpServletRequest request) {
		return request.getParameter("do") != null
				&& request.getParameter("id") != null
				&& request.getParameter("do").equals("delete");
	}

}