package pl.coderslab.web.coo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

/**
 * Servlet implementation class Servlet_08
 */
@WebServlet("/addToCookie")
public class Servlet_08 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("<form action='' method='POST'>"+
    "<label>Klucz: <input type='text' name='key'></label>"+
    "<label> Wartość:<input type='text' name='value'> </label>"+
    "<input type='submit'></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		Cookie newCookie = new Cookie(key, StringUtils.deleteWhitespace(value));
		newCookie.setMaxAge(60 * 60 * 24);
		response.addCookie(newCookie);
	}

}
