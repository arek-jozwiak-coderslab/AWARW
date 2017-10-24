package pl.coderslab.web.get;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_02
 */
@WebServlet("/get2")
public class get2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> allMap = request.getParameterMap();
		
		Set<String> setKeys = allMap.keySet();
		for (String key : setKeys) {
			String[] strArr = allMap.get(key);
			
			for (String val : strArr) {
				response.getWriter().append("key = " + key + "; val = " + val);
			}
			
		}

	}

}
