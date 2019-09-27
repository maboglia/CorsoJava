<%@page import="magazzino.ProdottiDAO"%>
<%@page import="model.Prodotto"%>
<%@page import="controller.Magazzino"%>
<h1>Prodotto</h1>

<%
	if(request.getParameter("codiceProdotto") != null ){
		
		int codP = Integer.parseInt(request.getParameter("codiceProdotto"));
		ProdottiDAO p = new ProdottiDAO();
		p.open();
		Prodotto pnew = p.trovaprodottoPerId(codP);

		out.println(pnew);
		
		p.close();
		
	}



%>
