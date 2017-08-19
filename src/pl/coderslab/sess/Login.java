package pl.coderslab.sess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter()
				.append("<html><head><meta charset=\"UTF-8\"><title>Insert title here</title>" + "</head>" + "<body>"
						+ "<h3>Zaloguj sie do panelu administracyjnego</h3>" + "<form action=''./login' method='post'>"
						+ "<p><input type='text' name='login' placeholder='Podaj login'/></p>"
						+ "<p><input type='password' name='pass' placeholder='Podaj hasło'/></p>"
						+ "<p><input type='submit'/></p>" + "</form>" + "</body>" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = getInitParameter("login");
		String pass = getInitParameter("pass");
		if (request.getParameter("login").equals(login) && request.getParameter("pass").equals(pass)) {
			HttpSession sess = request.getSession();
			sess.setAttribute("user", login);
			response.sendRedirect(request.getContextPath() + "/admin");
		} else {
			doGet(request, response);
		}
	}

}
