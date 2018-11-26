<%@page import="model.Prodotto"%>
<%@page import="controller.ProdottiJar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Elenco prodotti</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

	$(document).ready(
	function(){
		$(".prodotti").click(function(event) {
			let prod = $(this).text();
			let codProd = $(this).attr("rel");

			$.ajax({
			  method: "POST",
			  url: "prodotti",
			  data: { prodotto: prod, codProdotto: codProd }
			})
			  .done(function( msg ) {
			    //alert( "Scheda prodotto: " + msg );
			    $("#scontrino").append("<li>" + msg + "</li>")
			  });
		});


	}		
	);


</script>

</head>
<body>


<h2>prodotti in magazzino</h2>
<ul>

<% for(Prodotto p : ProdottiJar.elencoProdotti){ %>		
		<li><a href="#" class="prodotti" rel="<%= p.getCodice() %>"><%= p.getDescrizione() %></a></li>
<% } %>


<h2>prodotti acquistati</h2>
</ul>

<ol id="scontrino">


</ol>

</body>
</html>