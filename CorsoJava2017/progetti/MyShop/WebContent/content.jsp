<%@page import="controller.Ordini"%>
<%@page import="model.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="controller.Prodotti" %>
<%! ArrayList<Abito> elencoProdotti ; %>
<h1>content</h1>

<%

	String r = request.getParameter("pagina");
	String elenco = null;
	/**/
	
	try{
	
		if (r.equals("prodotti")) {
			//response.sendRedirect("corsi.jsp");
			//out.print("corsi");
		//elenco = Prodotti.getMostraProdottiProvv();
			
			 elencoProdotti = Prodotti.getMostraProdotti();
			
			out.print("<form method='post' action='doOrdine.jsp'> ");
			int i=0;
			for (Abito a : elencoProdotti){
				i++;
				
				if (a instanceof Giacca) {
					out.print(a.descriviProdotto());
					out.print(" ");
					out.print("<input type='number' name='giacca' />");
				} 
				
				
				if (a instanceof Pantalone) {
					out.print(a.descriviProdotto());
					out.print(" ");
					out.print("<input type='number' name='pantalone' />");
				} 
				
				
				if (a instanceof Maglione) {
					out.print(a.descriviProdotto());
					out.print(" ");
					out.print("<input type='number' name='maglione' />");
				} 
				
				
				if (a instanceof Camicia) {
					out.print(a.descriviProdotto());
					out.print(" ");
					out.print("<input type='number' name='camicia' />");
				} 
				
				
				if (a instanceof Scarpe) {
					out.print(a.descriviProdotto());
					out.print(" ");
					out.print("<input type='number' name='scarpe' />");
				} 
				
				%>
				
				<hr/>
				
				<% 
			}
			
			out.print("<input type='submit'  value='metti nel carrello'   />");
			out.print("</form>");
		}
			
		else if (r.equals("studenti")) 
			out.print("studenti");	
			
		else
			out.print("home");
		
	} catch(Exception e){
		out.print("non va!" );
	}

%>


<h2><%= r %></h2>
<h3><%= elenco %></h3>

	
