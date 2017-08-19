package pl.coderslab.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class First
 */
@WebFilter("/*")
public class Second implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		long startTime = System.currentTimeMillis();
		filterChain.doFilter(request, response);
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime - startTime);
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String browserName = httpRequest.getHeader("User-Agent");
		System.out.println(browserName);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
