package pl.coderslab.web.servlety2;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet21
 */
@WebServlet("/Servlet21")
public class Servlet21 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Date d2;

	@Override
	public void init(ServletConfig config) throws ServletException {
		d2 = new Date();
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date d1 = new Date();
		response.getWriter().append("<html>");
		response.getWriter().append(d1.toString());
		response.getWriter().append("<br/>");
		response.getWriter().append(d2.toString());
	}

}
