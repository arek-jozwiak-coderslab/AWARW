package pl.coderslab.web.get;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get4")
public class get4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int page = Integer.parseInt(request.getParameter("page"));

		response.getWriter().append("Dzielniki: <br/>");
		for (int i = 1; i < page; i++) {
			if (page % i == 0) {
				response.getWriter().append(i + "<br/>");
			}
		}
	}

}
