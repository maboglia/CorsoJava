<%@ page import="listaspesa.Voce" %>
<jsp:useBean id="listaSpesa" class="listaspesa.ListaSpesaBean" scope="request"></jsp:useBean>
<jsp:include page="header.jsp" />
<div class="container">

	<h1>Stampa Lista della Spesa</h1>

	<table>
	
		<%
		
		int pos = 0;
		
		for(Voce v : listaSpesa.getSpesa()){
			
			out.print("<tr><td>");
			out.print(v.getMessaggio());
			out.print("</td></tr>");
			
			pos++;
			
		}
		
		%>
	
	</table>
<jsp:include page="footer.jsp" />