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
		
			response.sendRedirect("index.jsp?pagina=prodotti");
		}
		else {
			session.putValue("isLogged", "false");
			response.sendRedirect("errorLogin.jsp");
		}
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String azioneGet = "test";
		
		azioneGet = req.getParameter("azione");
		HttpSession session = req.getSession();
		
		switch (azioneGet) {
		case "esci":
			session.putValue("isLogged", "false");
			resp.sendRedirect("index.jsp?pagina=home");
			System.out.println("esci");
			break;

		default:
			
			System.out.println("default");			
			break;
		}


	
	}
	

	
	
	
}
