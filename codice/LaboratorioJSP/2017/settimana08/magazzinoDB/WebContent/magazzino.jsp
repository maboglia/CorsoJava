<%@ page import="model.*, magazzino.MagazzinoDAO, magazzino.ProdottiDAO, java.util.*" %>

<h1>magazzino</h1>



<table class="table table-striped">
<% 

MagazzinoDAO mDao = new MagazzinoDAO();
mDao.open();

HashMap map = mDao.statoMagazzino();
Set<Prodotto> prodotti = map.keySet();


Iterator<Prodotto> iterator1 = prodotti.iterator();

for (Prodotto prod : prodotti) {
	out.println("<tr>");
	out.println(
			"<td>"+
			prod.getCodiceProdotto()
			+"</td><td>"+
			prod.getDescrizioneProdotto()
			+"</td><td>"+
			+ prod.getPrezzoProdotto()
			+"</td><td>"+
			map.get(prod)
			+ "</td>"
			);
	out.println("</tr>");
}

mDao.close();

%>
</table>