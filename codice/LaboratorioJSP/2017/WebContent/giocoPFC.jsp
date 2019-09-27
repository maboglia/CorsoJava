<%@page import="giochi.*"%>
<div class="row">

	<a href="?pagina=4&scelta=1" class="btn btn-primary">Pietra</a> 
	<a href="?pagina=4&scelta=2" class="btn btn-primary">Forbici</a> 
	<a href="?pagina=4&scelta=3" class="btn btn-primary">Carta</a> 


</div>


<%

	if (request.getParameter("scelta") != null){
		
		int sceltaUtente = Integer.parseInt(request.getParameter("scelta"));
		
		PietraForbiceCarta3 pfc = new PietraForbiceCarta3();
		pfc.giocaPFC(sceltaUtente);
			out.print("<div class='panel'>");
			out.print(pfc.getG());
			out.print("</div>");
		
			out.print("<h1>elenco giocate</h1>");
		for (Giocata g : pfc.getReport()){
			out.print("<div class='panel'>");
			out.print(g);
			out.print("</div>");
		}
		
	}







%>


