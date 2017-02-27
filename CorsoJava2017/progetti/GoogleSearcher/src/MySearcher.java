import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySearcher extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		//response.sendRedirect("https://www.google.it/#q="+name);

	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	
	pw.println("<h1>Hai cercato " + name + "</h1>" );
	
	pw.close();
	
	}
	

	
	
}
