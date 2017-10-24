package pl.coderslab.web.coo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.coderslab.web.CookieWebUtils;

@WebServlet("/deleteCookie")
public class ServletCDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String USER_COOKIE_NAME = "User";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CookieWebUtils.deleteCookie(USER_COOKIE_NAME, request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
