package it.maboglia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/login")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username, password;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		HttpSession session = request.getSession();
		
		if (username.equals("mauro") && password.equals("12345")){
			
			session.putValue("isLogged", "true");
			response.sendRedirect("content.jsp");
		}
		else {
			session.putValue("isLogged", "false");
			response.sendRedirect("errorLogin.jsp");
		}
		
	}

}
