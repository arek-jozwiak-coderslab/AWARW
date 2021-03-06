package pl.coderslab.web.coo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest
 */
@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie c = new Cookie("lang", "PL");
		Cookie c1 = new Cookie("user", "Arek");
		
		response.addCookie(c);
		response.addCookie(c1);
		response.getWriter().append("cookieTest");
	}

}
