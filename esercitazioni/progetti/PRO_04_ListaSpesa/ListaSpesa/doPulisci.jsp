<%@page import="db.LIstaSpesaDAO"%>
<%@page import="listaspesa.Voce"%>



<% 
	
	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();
	spesaDAO.pulisci();
	
	response.sendRedirect("doLista.jsp");

%>