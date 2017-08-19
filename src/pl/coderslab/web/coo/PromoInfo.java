package pl.coderslab.web.coo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Popup
 */
@WebServlet("/promoinfo")
public class PromoInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie userCookie = new Cookie("promoinfo", "visited");
		userCookie.setMaxAge(60*60*24*20);
		response.addCookie(userCookie);
		response.sendRedirect("promoinfo.html");
	}

}
