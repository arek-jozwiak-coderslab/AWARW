package pl.coderslab.mvcjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/edit-book")
public class mvcjdbcedit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookDao bookDao = new BookDao();
		Book book = bookDao.read(id);
		request.setAttribute("book", book);
		getServletContext().getRequestDispatcher("/WEB-INF/mvcjdbc/edit.jsp").forward(request, response);
	}



}
