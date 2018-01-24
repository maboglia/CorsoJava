<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="negozio.Prodotto" %>
<%@ page import="java.util.ArrayList" %>
<%@ include file="header.jsp" %>

<%!  ArrayList<Prodotto>  prodotti  = new ArrayList<>();  %>

<h2>sono la sottopagina 1</h2>

<form method="post" action="">

	codice prodotto <input type="text" name="codProdotto"><br/>
	desc prodotto <input type="text" name="descProdotto"><br/>
	prezzo prodotto <input type="text" name="prezzoProdotto"><br/>
	<input type="submit" value="inserisci prodotto" name="inserisciProdotto">	

</form>


<%
	if(request.getParameter("inserisciProdotto") != null){
	String codiceP = request.getParameter("codProdotto");
	String descP = request.getParameter("descProdotto");	
	double prezzoP = Double.parseDouble(request.getParameter("prezzoProdotto"));
	

	Prodotto p = new Prodotto(codiceP, descP, prezzoP);
	
	prodotti.add(p);
	}

	for (Prodotto pp : prodotti){
		out.println(pp);
		
	}

%>




<%@ include file="footer.html" %>