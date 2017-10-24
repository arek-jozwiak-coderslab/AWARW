package pl.coderslab.web.coo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.coderslab.web.CookieWebUtils;

/**
 * Servlet implementation class Servlet_01_Get
 */
@WebServlet("/showCookie")
public class ServletCGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String USER_COOKIE_NAME = "User";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cookieValue = CookieWebUtils.getCookieValue(USER_COOKIE_NAME, request);
		if (cookieValue == null) {
			response.getWriter().append("brak cookie");
		} else {
			response.getWriter().append("jest cookie" + cookieValue);
		}
	}

}
