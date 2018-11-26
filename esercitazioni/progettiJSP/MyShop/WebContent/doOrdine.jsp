<%@page import="model.*"%>
<%@page import="controller.Ordini"%>
<%  

if( request.getParameter("giacca").length() > -1 ){
	int ngiacca = Integer.parseInt(request.getParameter("giacca"));
	int npantalone = Integer.parseInt(request.getParameter("pantalone"));
	int ncamicia = Integer.parseInt(request.getParameter("camicia"));
	int nmaglione = Integer.parseInt(request.getParameter("maglione"));
	int nscarpe = Integer.parseInt(request.getParameter("scarpe"));

	Ordini mOrdine = new Ordini();
	if (ngiacca > 0) mOrdine.inserisciProdotto(new Giacca(Taglie.XL, Colori.BLUE, 19.99), ngiacca);
	if (npantalone > 0) mOrdine.inserisciProdotto(new Pantalone(Taglie.M, Colori.RED, 29.99), npantalone);
	if (ncamicia > 0) mOrdine.inserisciProdotto(new Camicia(Taglie.S, Colori.GREEN, 39.99), ncamicia);
	if (nmaglione > 0) mOrdine.inserisciProdotto(new Maglione(Taglie.XL, Colori.BLUE, 49.99), nmaglione);
	if (nscarpe > 0) mOrdine.inserisciProdotto(new Scarpe(Taglie.M, Colori.GREEN, 59.99), nscarpe);
	

	
	for (String s : mOrdine.getOrdini()){
		out.print( s  + "<br/>");
	}
	out.print(mOrdine.totaleOrdine());
}
	%>