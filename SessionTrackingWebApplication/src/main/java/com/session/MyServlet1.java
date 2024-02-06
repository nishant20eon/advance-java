package com.session;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			String name = request.getParameter("userName");
			String password = request.getParameter("userPassword");
			pwriter.print("Hello here:" + name);
			pwriter.print(" Your Password is: " + password);
			// Creating two cookies
			Cookie c1 = new Cookie("userName", name);
			Cookie c2 = new Cookie("userPassword", password);
			// Adding the cookies to response header
			response.addCookie(c1);
			response.addCookie(c2);
			pwriter.print("<a href='welcomehere'>View Details</a>");
			pwriter.close();
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}
}