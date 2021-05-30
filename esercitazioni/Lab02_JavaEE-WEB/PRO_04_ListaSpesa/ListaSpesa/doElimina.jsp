<%@page import="db.LIstaSpesaDAO" %>
<%@page import="listaspesa.Voce" %>

<jsp:useBean id="listaSpesa" class="listaspesa.ListaSpesaBean" scope="session" />


<%
	String posizione = request.getParameter("posizione");
	int posVoce = Integer.parseInt(posizione);
	
	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();
	spesaDAO.elimina(posVoce);
	
	response.sendRedirect("doLista.jsp");


%>