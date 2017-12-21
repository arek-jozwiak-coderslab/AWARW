package pl.coderslab.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleMvc
 */
@WebServlet("/mvcexample")
public class ExampleMvc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int n = Integer.parseInt(request.getParameter("a"));
		int b = n * n * n + 3;
		request.setAttribute("b", b);
		getServletContext().getRequestDispatcher("/exampleMvc.jsp")
		.forward(request, response);
	}

}
