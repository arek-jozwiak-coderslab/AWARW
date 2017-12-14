package pl.coderslab.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/for-each")
public class ForEach extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] animals = {"Pies", "Kot", "Nietoperz", "Ważka"};
		request.setAttribute("animals", animals);
		getServletContext().getRequestDispatcher("/WEB-INF/mvc/forEach.jsp").forward(request, response);
	}
}
