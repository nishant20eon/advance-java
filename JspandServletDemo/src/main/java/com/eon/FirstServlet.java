 package com.eon;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	// doGet
	// doPost
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// URL in case POST of http://localhost:8080/JspandServletDemo/processFirstServlet
		String FirstName = req.getParameter("fname");
		String LastName = req.getParameter("lname");
		String fullName = FirstName +" "+LastName;
//		// 1st way
//		
		System.out.println("My Name is "+fullName);
		
//		// 2nd way
//		/*
//		 * If we want to see output in browser(like chrome) instead of console then will
//		 * use printWriter instead of Sysout
//		 * For this resp obj has method name getWriter() 
//		 * In PrintWriter.println() accepting HTML code
//		 */
//		
//			PrintWriter writer = resp.getWriter();
//			writer.println("<html><body><h1> My Name is "+fullName+"</h1></body></html>");
//		
//		// We are not suppose to use HTML code inside servlet  bcz it become more complex when we have to many data 
//		// To solve this we use JSP
		
		// 3rd way
//		resp.sendRedirect("https://www.google.com/");
//		resp.sendRedirect("test.html");
//		
//		// sendRedirect() works at client side, using which we cannot send any data 
//		//  will use if the client want to perform futher action.
		
//		// 4th way
//		
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
//		dispatcher.forward(req, resp);
//		// ServletRequest , ServletResponse are interface and parent of HttpServletRequest, HttpServletResponse 
		
//	// 5hth way
		req.setAttribute("name", fullName);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		System.out.println("dispatcher: "+dispatcher.toString());
		dispatcher.forward(req, resp);
//		// ServletRequest , ServletResponse are interface and parent of HttpServletRequest, HttpServletResponse 
//		
//		
	}
	
}
