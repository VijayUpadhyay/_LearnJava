package com.vijay.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "Validate User", urlPatterns = { "/LogInSubmitPath" })
public class LogInSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside GET");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		System.out.println("Inside Post");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String profession = request.getParameter("profession");
		String location = request.getParameter("location");
		writer.println("Insde Post");
		HttpSession session = request.getSession();
		session.setAttribute("userName", userName+"session");
		session.setAttribute("password", password);
		session.setAttribute("profession", profession);
		session.setAttribute("location", location);
		System.out.println("Session data saved");
		
		//ServletContext context = getServletContext();
		if(userName.equals("vijay") && password.equals("vijay")){
			request.setAttribute("profession", profession);
		    request.setAttribute("location", location);
			request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
		}
	}

}
