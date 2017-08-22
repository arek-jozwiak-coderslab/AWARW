package pl.coderslab.mvcjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add-book")
public class mvcjdbcadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/WEB-INF/mvcjdbc/add.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book book = new Book();
		book.setTitle(request.getParameter("title"));
		book.setAuthor(request.getParameter("author"));
		book.setIsbn(request.getParameter("isbn"));
		
		Book book2 = new Book(request.getParameter("title"), request.getParameter("author"),
				request.getParameter("isbn"));
		
		response.getWriter().append(book.toString());
		
		BookDao bookDao = new BookDao();
		bookDao.create(book);
		
		
		//doGet(request, response);
	}

}
