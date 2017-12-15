package pl.coderslab.mvcjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Smurfs
 */
@WebServlet("/smurfs")
public class Smurfs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SmurfDao dao = new SmurfDao();
		
		request.setAttribute("smurfs", dao.findAll());
		
		
//		request.getRequestDispatcher("/smurfs/index.jsp").forward(request, response);
		getServletContext().getRequestDispatcher("/smurfs/index.jsp").forward(request, response);

	}

}
