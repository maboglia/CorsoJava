<%@page import="model.Movimento"%>
<%@page import="java.time.LocalDate"%>
<%@page import="controller.Magazzino"%>
<%@page import="java.util.List"%>
<%@page import="model.Prodotto"%>
<%@page import="magazzino.*"%>
<h1>scarico</h1>


<%
	if(request.getParameter("codiceProdotto") != null  && Integer.parseInt(request.getParameter("quantitaCarico")) > 0   ){
		
		int codP = Integer.parseInt(request.getParameter("codiceProdotto"));
		int qP = - Math.abs(Integer.parseInt(request.getParameter("quantitaCarico")));
		LocalDate oggi = LocalDate.now();
// 		Magazzino.caricoMagazzino(oggi.toString(), pnew, qP);

		ProdottiDAO p = new ProdottiDAO();
		p.open();
		Prodotto pnew = p.trovaprodottoPerId(codP);
		p.close();
		
		MagazzinoDAO mDao = new MagazzinoDAO();
		mDao.open();
		Movimento m = new Movimento(pnew,qP,oggi);
		
		mDao.inserisciMovimento(m);
		mDao.close();
		
		out.println("<h1>Prodotto venduto</h1>");
		
	}


%>



<%

ProdottiDAO dao = new ProdottiDAO();

dao.open();

List<Prodotto> listaProdotti = dao.elencoProdotti();

if (listaProdotti.size() == 0) {
    out.println("<h3>Non ci sono prodotti in database</h3>");
} else {
    
    out.println("<ul class='list-group'>");
    for (Prodotto p : listaProdotti){
        out.println("<li class='list-group-item'><a href='?pagina=5&codiceProdotto=" + p.getCodiceProdotto() + "'>" + p.getDescrizioneProdotto() + "</a>");
        %>

        <form method="post" action="?pagina=2">
		

        <input type="hidden" name="codiceProdotto" value="<%= p.getCodiceProdotto()%>" />
        <input type="number" name="quantitaCarico" />

        <input type= "submit" value="scarica" />

        </form>


        <%
    }
        out.println("</li>");
        out.println("</ul>");

    dao.close();
}


out.println("</div>");






%>




<%



// Magazzino.caricoMagazzino("20170713", new Prodotto(1, "maglia", 10.00), 50);
// Magazzino.caricoMagazzino("20170713", new Prodotto(2, "giacca", 20.00), 50);
// Magazzino.caricoMagazzino("20170713", new Prodotto(3, "camicia", 30.00), 50);




%>
