<%@ page import="db.LIstaSpesaDAO" %>
<jsp:useBean id="listaSpesa" class="listaspesa.ListaSpesaBean" scope="request" />

<%

	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();

	spesaDAO.riempiListaSpesa(listaSpesa);


%>




<%     if(request.getParameter("stampa") != null ){      %>
	<jsp:forward page="viewStampa.jsp" />
<% } else   if(request.getParameter("stampa") == null ){ %>
	<jsp:forward page="viewLista.jsp" />
<% }  %>

