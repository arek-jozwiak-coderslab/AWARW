package pl.coderslab.sess;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess03_Add
 */
@WebServlet("/Sess03_Add")
public class Sess03_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		response.getWriter()
				.append("<form action='' method='POST'> <label>"
						+ "Klucz: <input type='text' name='key'> </label> <label> Wartość:"
						+ "<input type='text' name='value'></label> <input type='submit'></form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();

		Set<String> sessKeys = (Set<String>) sess.getAttribute("sessKeys");
		
		if (sessKeys == null) {
			sessKeys = new HashSet<String>();
		}
		sessKeys.add(request.getParameter("key"));
		sess.setAttribute("sessKeys", sessKeys);
		
		sess.setAttribute(request.getParameter("key"), request.getParameter("value"));

	}

}
