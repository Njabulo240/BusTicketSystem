package com.digitalbd;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet("/SignUpActoin")
public class SignUpActoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<String> formData;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		formData = new ArrayList<String>();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password =  request.getParameter("password");
		
		
		out.println("<br>Name" + name);
		out.println("<br>Email" + email);
		out.println("<br>Passord" + password);
		
		HttpSession session = request.getSession();
		
		formData.add(name);
		formData.add(email);
		formData.add(password);
		
		session.setAttribute("formData", formData );
		
		out.println("<br> <a href='SessionTest  '>View Session Data</a>");
	}

}
