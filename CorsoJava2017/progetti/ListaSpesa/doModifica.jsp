<%@page import="db.LIstaSpesaDAO" %>
<%@page import="listaspesa.Voce" %>

<jsp:useBean id="modificaVoce" class="listaspesa.ModificaVoce" scope="request" />
<jsp:setProperty name="modificaVoce" property="posizione" param="posizione" />

<%
	
	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();

	String messaggio = spesaDAO.getElemento(modificaVoce.getPosizione());
	
	modificaVoce.setVoce(new Voce(messaggio));


%>


<jsp:forward page="viewModifica.jsp" />