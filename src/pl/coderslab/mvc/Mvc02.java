package pl.coderslab.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc02
 */
@WebServlet("/mvc02")
public class Mvc02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int start = Integer.parseInt(request.getParameter("start")) +10;
		int end = Integer.parseInt(request.getParameter("end"))+10;
		request.setAttribute("start",start);
		request.setAttribute("end",end);
		getServletContext().getRequestDispatcher("/WEB-INF/mvc/jsp2.jsp").forward(request, response);
	}

}
