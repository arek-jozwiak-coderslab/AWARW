package pl.coderslab.web.post;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

/**
 * Servlet implementation class Post2
 */
@WebServlet("/post2")
public class Post2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> list = Arrays.asList(new String[] { "dupa", "dupa2" });
		String message = request.getParameter("message");
		String confirm = request.getParameter("confirm");
		if (confirm == null) {
			String censored = "";

			String[] words = message.split(" ");
			for (String s : words) {
				if (list.contains(s)) {
					censored += StringUtils.repeat("*", s.length())+" ";
				} else {
					censored += s + " ";
				}
			}
			response.getWriter().append(censored);
		} else {
			response.getWriter().append(message);
		}

	}

}
