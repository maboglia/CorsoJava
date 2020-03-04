<%@page import="db.LIstaSpesaDAO"%>
<%@page import="listaspesa.Voce"%>

<%
	String voce = request.getParameter("voce");

	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();
	
	if(!voce.isEmpty()){
	spesaDAO.aggiungi(voce);
	}
	
	response.sendRedirect("doLista.jsp");
%>