package pl.coderslab.web.coo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/addToCookie")
public class Cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Cookie cookie = new Cookie(request.getParameter("key"),
				StringUtils.deleteWhitespace(request.getParameter("value")));
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
	}

}
