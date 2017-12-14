package pl.coderslab.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcMyTest
 */
@WebServlet("/MvcMyTest")
public class MvcMyTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName").toUpperCase();
		
		Book b = new Book(1, "Thinking in Java", "Bruce Eclkel"); 
		request.setAttribute("book", b);
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(2, "Java 2 podstawy", "Horstmann"));
		books.add(b);
		request.setAttribute("books", books);

		
//		int a = Integer.parseInt(request.getParameter("a"));
		request.setAttribute("userName", "Witaj " + userName);
		
		getServletContext().getRequestDispatcher("/mvcMyTest.jsp").forward(request, response);
	}

}
