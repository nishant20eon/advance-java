package com.session;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcomehere")
public class MyServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			// Reading cookies
			Cookie[] c = request.getCookies();
			// Displaying User name value from cookie
			pwriter.print("Name here: " + c[0].getValue());
			pwriter.print("Password: " + c[1].getValue());
			pwriter.print("<a href='welcome'>View Details</a>");
			pwriter.close();
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}
}