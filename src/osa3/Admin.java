package osa3;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Dao;
import db.SetupDao;

public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("do") != null) {
			String method = request.getParameter("do");

			if ("clear_data".equals(method)) {
				try {
					new Dao().deleteAllItems();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if ("insert_data".equals(method)) {
				new SetupDao().insertTestData();
			} 

			response.sendRedirect("Search");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
