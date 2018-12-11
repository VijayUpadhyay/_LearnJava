package com.vijay.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

//@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	private Logger logger = Logger.getLogger(AuthenticationFilter.class);
	
	public void init(FilterConfig filterConfig) throws ServletException{
		logger.info("Authentication filter initialized");
	} 
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String uri = req.getRequestURI();
		
		logger.info("Requested resource"+uri);
		
		HttpSession session = req.getSession();
		
		if(session == null && !((uri.endsWith("Register")) || (uri.endsWith("html") ||(uri.endsWith("LogIn"))))){
			logger.error("Unauthorised access request");
			res.sendRedirect("index.html");
		}
		else{
			//pass the request under filter chain
			chain.doFilter(request, response);
		}
		
	}

	public void destroy() {	
		// close any resource if required
		
	}
}
