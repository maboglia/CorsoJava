package com.maboglia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String un = request.getParameter("userName");
		String up = request.getParameter("userPass");
		
		if (up.equals("12345")){
			
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else {
			out.println("Mi dispiace devo andare");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/header.jsp").include(request,response);
			rd.include(request, response);
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/footer.jsp").include(request,response);
	
		}
		
		
		
	}

}
