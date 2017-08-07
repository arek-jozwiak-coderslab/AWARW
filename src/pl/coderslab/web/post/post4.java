package pl.coderslab.web.post;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class post4
 */
@WebServlet("/post4")
public class post4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Random ran = new Random();
		int x = ran.nextInt(6) + 5;
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("<form action='' method='POST'>");
		for (int i = 0; i < x; i++) {
			response.getWriter().append("<input type='text' name='numbers'/>");
		}
		response.getWriter().append("<input type='submit'/></form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] numbers = request.getParameterValues("numbers");
		List<Integer> sortedNumbers = new ArrayList<>();
		for (String s : numbers) {
			try {
				Integer i = Integer.parseInt(s);
				sortedNumbers.add(i);
				
			} catch (Exception e) {

			}
		}
		Collections.sort(sortedNumbers);
		
		response.getWriter().append(sortedNumbers.toString());
		response.getWriter().append(Arrays.toString(sortedNumbers.toArray()));
	}
}
