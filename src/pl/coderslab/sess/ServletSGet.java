package pl.coderslab.sess;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_01_Get
 */
@WebServlet("/showSession")
public class ServletSGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();

		if (sess.getAttribute("counter") == null) {
			response.getWriter().append("Brak atrybutu");
		} else {
			int counter = (int) sess.getAttribute("counter") +1;

			sess.setAttribute("counter", counter);
			response.getWriter().append(counter + "");
		}
	}

}
