package pl.coderslab.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BurgerInit
 */
@WebServlet("/burgerinit")
public class BurgerInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Burger> burgers = new ArrayList<>();
		burgers.add(new Burger(1, "burger1", 10));
		burgers.add(new Burger(2, "burger2", 9));
		burgers.add(new Burger(3, "burger3", 8));
		burgers.add(new Burger(4, "burger4", 7));
		HttpSession sess = request.getSession();
		sess.setAttribute("burgers", burgers);

		response.getWriter().append("burgers ok");
	}

}
