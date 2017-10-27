package pl.coderslab.mvcjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcJdbc01
 */
@WebServlet("/add-book")
public class MvcJdbc01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/WEB-INF/mvcjdbc/add-book.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Book b = new Book(request.getParameter("title"), request.getParameter("author"), request.getParameter("isbn"));
		BookDao bookDao = new BookDao();
		bookDao.create(b);
		response.sendRedirect("/AWARW/all-books");
	}

}
