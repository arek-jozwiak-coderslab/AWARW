package pl.coderslab.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BurgerServlet
 */
@WebServlet("/burgers")
public class BurgerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		request.setAttribute("burgers", (List<Burger>) sess.getAttribute("burgers"));
		getServletContext().getRequestDispatcher("/burgers.jsp").forward(request, response);

	}

}
