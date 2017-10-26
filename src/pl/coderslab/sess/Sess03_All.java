package pl.coderslab.sess;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess03_All
 */
@WebServlet("/Sess03_All")
public class Sess03_All extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		List<String> sessKeys = (List<String>) sess.getAttribute("sessKeys");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(sess.getMaxInactiveInterval() + "");
		response.getWriter().append("<table>");
		for (String string : sessKeys) {
			response.getWriter().append("<tr>");
			response.getWriter().append("<td>");
			response.getWriter().append(string);
			response.getWriter().append("</td>");

			response.getWriter().append("<td>");
			response.getWriter().append((String) sess.getAttribute(string));
			response.getWriter().append("</td>");
			response.getWriter().append("</tr>");
		}
		response.getWriter().append("</table>");
	}

}
