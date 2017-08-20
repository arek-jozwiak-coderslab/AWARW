package pl.coderslab.mvcjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/update-book")
public class mvcjdbcupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookDao bookDao = new BookDao();
		Book book = bookDao.read(id);
		request.setAttribute("book", book);
		getServletContext().getRequestDispatcher("/WEB-INF/mvcjdbc/jsp1.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookDao bookDao = new BookDao();
		
		Book book = new Book();
		book.setId(Integer.parseInt(request.getParameter("id")));
		book.setTitle(request.getParameter("title"));
		book.setAuthor(request.getParameter("author"));
		book.setIsbn(request.getParameter("isbn"));
				
		bookDao.update(book);
		response.sendRedirect(request.getContextPath() + "/all-books");

	}

}
