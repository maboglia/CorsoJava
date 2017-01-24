<%@ page import="controller.Prodotti" %>
<h1>content</h1>

<%

	String r = request.getParameter("pagina");
	String elenco = null;
	/**/
	
	try{
	
		if (r.equals("prodotti")) {
			//response.sendRedirect("corsi.jsp");
			//out.print("corsi");
		elenco = Prodotti.getMostraProdottiProvv();
			
			
			
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
