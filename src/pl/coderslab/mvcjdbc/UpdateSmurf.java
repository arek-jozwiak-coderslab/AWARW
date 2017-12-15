package pl.coderslab.mvcjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateSmurf")
public class UpdateSmurf extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		SmurfDao dao = new SmurfDao();
		request.setAttribute("smurf", dao.read(id));
		getServletContext().getRequestDispatcher("/smurfs/update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Smurf s = new Smurf();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String attribute = request.getParameter("attribute");
		String description = request.getParameter("description");
		s.setId(id);
		s.setName(name);
		s.setAttribute(attribute);
		s.setDescription(description);
		SmurfDao dao = new SmurfDao();
		dao.update(s);
		response.sendRedirect(request.getContextPath() + "/smurfs");

	}

}
