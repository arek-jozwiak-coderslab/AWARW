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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String counterName = "counter";
		HttpSession sess = request.getSession();

		if (sess.getAttribute(counterName) == null) {
			sess.setAttribute(counterName, 1);
		} else {
			int counter = (int) sess.getAttribute(counterName) + 1;
			sess.setAttribute(counterName, counter);
		}
		response.getWriter().append(sess.getAttribute(counterName).toString());

	}

}
