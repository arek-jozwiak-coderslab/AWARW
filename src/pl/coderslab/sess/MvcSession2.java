package pl.coderslab.sess;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MvcSession
 */
@WebServlet("/MvcSession2")
public class MvcSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Book b =(Book) session.getAttribute("MySessionVariable");
		
		response.getWriter().append(b.toString());
		response.getWriter().append(Arrays.toString((Book[]) session.getAttribute("books")));

	}

}
