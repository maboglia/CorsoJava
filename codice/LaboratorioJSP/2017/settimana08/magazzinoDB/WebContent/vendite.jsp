<%@ page import="model.*, magazzino.*" %>

<h1>report vendite</h1>



<table class="table table-striped">
<% 

MagazzinoDAO mDao = new MagazzinoDAO();
mDao.open();
for (Movimento mov : mDao.stampaMovimenti()) {
	if(mov.getQuantita() < 0){
	out.println("<tr>");
	out.println(
			"<td>"+
			mov.getData()
			+"</td><td>"+
			mov.getP().getDescrizioneProdotto()
			+"</td><td>"+
			+ Math.abs(  mov.getQuantita() )
			+"</td><td>"+
			+ Math.abs(  mov.getQuantita() ) * mov.getP().getPrezzoProdotto()
			+ "</td>"
			);
	out.println("</tr>");
	}
}
mDao.close();





%>
</table>