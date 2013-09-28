package osa2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePage
 */
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String attribute = (String) request.getParameter("param");
		
		if (attribute != null) {
			session.setAttribute("attribute", attribute);
		}
		
		response.getWriter().println("Hello" + "<br>");
		response.getWriter().println("Your session ID is " + session.getId() + "<br>");
		response.getWriter().println("Session attribute is " + session.getAttribute("attribute"));
	}
}
