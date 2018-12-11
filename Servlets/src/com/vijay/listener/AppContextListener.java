package com.vijay.listener;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

@WebListener
public class AppContextListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent servletContext){
		
		ServletContext ctx = servletContext.getServletContext();
		
		//initialize DB connection
		String dbUsername = ctx.getInitParameter("dbUserName");
		String dbPassword = ctx.getInitParameter("dbPassword");
		String dbURL = ctx.getInitParameter("dbURL");
		
		try{
			DBConnectionManager connect = new DBConnectionManager(dbUsername, dbPassword, dbURL);
			ctx.setAttribute("DBConnection", connect.getConnection());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		// initialize log4j
		String log4jConfig = ctx.getInitParameter("log4j-config");
		if(log4jConfig == null){
			System.out.println("No log 4j init param available in web.xml, initializing with basic configuration");
			BasicConfigurator.configure();
		}else{
			String webAppPath = ctx.getRealPath("/");
			String log4jProp =log4jConfig + webAppPath;
			File log4jConfigFile = new File(log4jProp);
			if (log4jConfigFile.exists()) {
				System.out.println("Initializing log4j with: " + log4jProp);
				DOMConfigurator.configure(log4jProp);
			} else {
				System.err.println(log4jProp + " file not found, initializing log4j with BasicConfigurator");
				BasicConfigurator.configure();
			}
		}
		System.out.println("log4j configured properly");
	}
	
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
    	Connection con = (Connection) servletContextEvent.getServletContext().getAttribute("DBConnection");
    	try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
	
}
