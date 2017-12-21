package pl.coderslab.sess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session2
 */
@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String COOKIE_NAME = "counter";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();

		if (sess.getAttribute(COOKIE_NAME) == null) {
			sess.setAttribute(COOKIE_NAME, 0);
			response.getWriter().append("Brak atrybutu");
		} else {
			int counter = (int) sess.getAttribute(COOKIE_NAME) + 1;
			sess.setAttribute(COOKIE_NAME, counter);
			response.getWriter().append(sess.getAttribute(COOKIE_NAME).toString());
		}

	}

}
