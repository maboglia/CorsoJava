<%@ page import="model.*, magazzino.*" %>

<h1>magazzino</h1>



<table class="table table-striped">
<% 

MagazzinoDAO mDao = new MagazzinoDAO();
mDao.open();
for (Movimento mov : mDao.stampaMovimenti()) {
	out.println("<tr>");
	out.println(
			"<td>"+
			mov.getData()
			+"</td><td>"+
			mov.getP().getDescrizioneProdotto()
			+"</td><td>"+
			+ mov.getQuantita()
			+ "</td>"
			);
	out.println("</tr>");
}
mDao.close();





%>
</table>