package pl.coderslab.web.coo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookie")
public class ServletCDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String USER_COOKIE_NAME = "User";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (USER_COOKIE_NAME.equals(c.getName())) {
				c.setMaxAge(0);
				response.addCookie(c);
			}

			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

	}
}
