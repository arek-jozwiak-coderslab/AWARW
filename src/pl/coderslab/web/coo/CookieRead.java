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
 * Servlet implementation class CookieRead
 */
@WebServlet("/cookieRead")
public class CookieRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LANG_COOKIE = "lang";


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String lang = null;
		  for (Cookie c : cookies) {
		      if (LANG_COOKIE.equals(c.getName())) {
		    	  lang = c.getValue();
		      }
		  }
		
		response.getWriter().append("lang: " + lang);
		String user = CookieWebUtils.getCookieValue("user", request);
		response.getWriter().append("user: " + user);
	}

}
