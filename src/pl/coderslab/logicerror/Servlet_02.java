package pl.coderslab.logicerror;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Servlet_02
 */
@WebServlet("/logicalerror")
public class Servlet_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession ses = request.getSession();
		String[] grades = request.getParameterValues("grade");
		response.setContentType("text/html; charset=UTF-8");
		double[][] gradesTab = new double[grades.length][2];

		if (ses.getAttribute("grades") != null) {
			gradesTab = (double[][]) ses.getAttribute("grades");
		}
		response.getWriter().append("<hr/>");

		for (int i = 0; i < grades.length; i++) {
			// sprawdzanie czy większa od 1 czy mniejsza od 6
			try {
				double grade = Double.parseDouble(grades[i]);
				// walidacja ocen
				if (grade >= 1 && grade <= 6) {
					gradesTab[i][0] = gradesTab[i][0] + 1;
					gradesTab[i][1] = gradesTab[i][1] + grade;
				}
			} catch (NumberFormatException e) {

			}
		}
		ses.setAttribute("grades", gradesTab);

		GradeUtils gs = new GradeUtils(gradesTab);
		response.getWriter().append(gs.printAvg());
		response.getWriter().append(gs.printGeneralAvg());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}