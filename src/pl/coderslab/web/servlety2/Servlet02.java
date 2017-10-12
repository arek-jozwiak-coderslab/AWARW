package pl.coderslab.web.servlety2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private String myParam;
	public void init(ServletConfig config) throws ServletException {
	    myParam = config.getInitParameter("myParam");
	    super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = getInitParameter("myParam");
		String newsCount = getInitParameter("news-count");
		response.getWriter().append("news-count: ").append(newsCount);
		response.getWriter().append("<br/><hr/>");
		response.getWriter().append("param: ").append(param);
	}

}
