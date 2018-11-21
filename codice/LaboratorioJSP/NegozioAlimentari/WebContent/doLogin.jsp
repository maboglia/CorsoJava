<%@page import="java.util.Vector"  contentType="text/html" pageEncoding="UTF-8"%>

<%
if(request.getParameter("invia")!=null){

    Vector error = new Vector();
    
    String username="";
    String password="";    
    
    if(request.getParameter("txtUsername").isEmpty())
        error.add("Username non presente");
    else
        username=request.getParameter("txtUsername");

    if(request.getParameter("txtPassword").isEmpty())
        error.add("Password non presente");
    else
        password=request.getParameter("txtPassword");
    

    if(error.size()==0){
    		if (username.equals("mauro")  && password.equals("12345") ){
		
    			session.setAttribute("loggedUser", true);
    			response.sendRedirect("area_riservata.jsp");
    		}
		else
    	        out.println("Non puoi entrare!!!<br><br>");    			
    }else{
        out.println("Si sono verificati i seguenti errori<br><br>");
        for(int i=0; i<error.size();i++)
            out.println(error.get(i)+"<br />");
       }
}
%>
