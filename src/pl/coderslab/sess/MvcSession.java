package pl.coderslab.sess;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MvcSession
 */
@WebServlet("/MvcSession1")
public class MvcSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book[] books = new Book[3];
		HttpSession session = request.getSession();
		books[0] = new Book("title 1", "author 1");
		books[1] = new Book("title 2", "author 2");
		books[2] = new Book("title 3", "author 3");
		session.setAttribute("MySessionVariable", new Book("myTitle", "myAuthor"));
		session.setAttribute("books", books);
		response.sendRedirect("MvcSession2");
	}

}
