<%@ page import="listaspesa.Voce " %>
<jsp:useBean id="listaSpesa" class="listaspesa.ListaSpesaBean" scope="request" />
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />
	
<div class="container">
	<h1>LISTA SPESA</h1>

	<div class="col-md-6 col-sm-6">
		<form action="doAggiungi.jsp" method = "post">
			<input type="text" name="voce"/>
			<input type="submit" value="Aggiungi"/>
		</form>	
	</div>	

	<div class="col-md-6 col-sm-6">
		<a href="doLista.jsp?stampa=true" class="btn btn-primary">Stampa la Lista</a>
		<a href="doPulisci.jsp" class="btn btn-primary">Pulisci lista</a>
	</div>
	
</div>	

<div class="container">
	
	<table class="table table-hover">
	<%
	

	int pos = 1;
	
	for (Voce v :  listaSpesa.getSpesa()){
		
		out.print("<tr><td>");
		out.print(v.getMessaggio());
		out.print("</td><td>");
		out.print("<a href='doElimina.jsp?posizione=" + pos  +"'>elimina</a>");
		out.print("</td><td>");
		out.print("<a href='doModifica.jsp?posizione=" + pos  +"'>modifica</a>");
		out.print("</td><td>");
		out.print("<a href='doSuGiu.jsp?posizione=" + pos  +"&direzione=su '>su</a>");
		out.print("</td><td>");
		out.print("<a href='doSuGiu.jsp?posizione=" + pos  +"&direzione=giu '>giu</a>");
		out.print("</td></tr>");
		
		pos++;
		
	}
	
	
	%>

	</table>


   </div><!-- /.container -->

<jsp:include page="footer.jsp" />
