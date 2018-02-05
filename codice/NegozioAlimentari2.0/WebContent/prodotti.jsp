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

			$.ajax({
			  method: "POST",
			  url: "prodotti",
			  data: { prodotto: prod, codProdotto: "C00001" }
			})
			  .done(function( msg ) {
			    alert( "Scheda prodotto: " + msg );
			  });
		});


	}		
	);


</script>

</head>
<body>



<jsp:useBean id="p" class="model.Prodotto" />
<jsp:setProperty property="descrizione" name="p" value="Pasta"/>
<jsp:getProperty property="descrizione" name="p"/>

<ul>
<li><a href="#" class="prodotti"><%= p %></a></li>
<li><a href="#" class="prodotti">Acqua tonica</a></li>

</ul>



</body>
</html>