package pl.coderslab.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product-list")
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product>  list = new ArrayList<>();
		list.add(new Product("name 1", "desc 1", 22.0, 1));
		list.add(new Product("name 2", "desc 2", 32.0, 2));
		list.add(new Product("name 3", "desc 3", 42.0, 3));
		
		request.setAttribute("products", list);
		
		getServletContext()
		.getRequestDispatcher("/products.jsp")
		.forward(request, response);
	}

}
