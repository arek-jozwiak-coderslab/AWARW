package pl.coderslab.web.readFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadFile
 */
@WebServlet("/readFile")
public class ReadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String path = getServletContext().getRealPath("/file.txt");
		Path path1 = Paths.get(path);
		try {
			for (String line : Files.readAllLines(path1)) {
				response.getWriter().append(line).append("<br/>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
