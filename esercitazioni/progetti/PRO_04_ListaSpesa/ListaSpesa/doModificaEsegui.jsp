<%@page import="db.LIstaSpesaDAO" %>
<%@page import="listaspesa.Voce" %>

<jsp:useBean id="modificaVoce" class="listaspesa.ModificaVoce" scope="request" />
<jsp:setProperty name="modificaVoce" property="posizione" param="posVoce" />
<jsp:setProperty name="modificaVoce" property="messaggio" param="voce" />

<%
	
	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();

	spesaDAO.modifica(modificaVoce.getPosizione(), modificaVoce.getVoce().getMessaggio());
	
	response.sendRedirect("doLista.jsp");

%>