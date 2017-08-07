package pl.coderslab.web.coo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_01_Get
 */
@WebServlet("/showCookie")
public class ServletCGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String USER_COOKIE_NAME = "User";

	public String getCookieValue(Cookie[] cookies, String cookieNane) {
		String cookieValue = null;
		for (Cookie c : cookies) {
			if (USER_COOKIE_NAME.equals(c.getName())) {
				cookieValue = c.getValue();
			}
		}
		return cookieValue;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		response.getWriter().append(getCookieValue(cookies, USER_COOKIE_NAME));
	}

}
