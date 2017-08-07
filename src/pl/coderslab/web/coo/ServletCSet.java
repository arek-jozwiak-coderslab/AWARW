package pl.coderslab.web.coo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class ServletCSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String USER_COOKIE_NAME = "User";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie newCookie = new Cookie(USER_COOKIE_NAME, "NazwaUsera");
		newCookie.setMaxAge(60 * 60 * 24);
		response.addCookie(newCookie);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
