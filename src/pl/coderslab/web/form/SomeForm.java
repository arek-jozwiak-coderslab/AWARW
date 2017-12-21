package pl.coderslab.web.form;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/someForm")
public class SomeForm extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("first");
		
		String second = request.getParameter("second");
		String someSelect = request.getParameter("someSelect");


		response.getWriter().append("<html><h1>GET</h1>")

		.append("first: " + first).append("<br/>")
		.append("second: " + second).append("<br/>")
		.append("someSelect: " + someSelect).append("<br/>")

		;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("first");
		String id = request.getParameter("id");
		String second = request.getParameter("second");
		String someSelect = request.getParameter("someSelect");
		
		String[] someMulti = request.getParameterValues("someMulti");
		
	
		
		response.getWriter().append("<html><h1>POST</h1>")
		.append("id: " + id).append("<br/>")
		.append("first: " + first).append("<br/>")
		.append("second: " + second).append("<br/>")
		.append("someSelect: " + someSelect)
		.append("someMulti: " + Arrays.toString(someMulti))
		;
	}

}
