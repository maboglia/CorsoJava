<%@page import="giochi.Dado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="corso.Registro"%>
<%@page import="corso.Studente" %>
<div class="well">

		<%
		
			//verifico di essere nella home page, oppure in una sottopagina
			//se mi passi il paramentro pagina vuol dire che vuoi visualizzare una sottopagina
			//altrimenti ti trovi nella home page
			if (request.getParameter("pagina") != null){
				
				int pagina = Integer.parseInt(        request.getParameter("pagina")         ) ;
				
				//costruisco un router, instradatore della navigazione, per includere dinamicamente i contenuti
				switch(pagina){
				
					case 1:
						out.print("<h1>elenco studenti</h1>");
						
						//creo un nuovo registro, che viene inizializzato automaticamente con gli studenti
						Registro registro = new Registro();
						ArrayList<Studente> studenti = registro.getStudenti();
						
						out.print("<table class='table table-striped'>");
						
						for (Studente s : studenti) {
							
						%>	
							
							<tr>    <td><%= s.matricola %></td>    <td><%= s.nome %></td>    <td><%= s.cognome %></td>    </tr>
						
						<%
						
						
						}						
						
						out.print("</table>");
						
						
						
						break;
					
					case 2:
						out.print("<h1>aritmetica e geometria</h1>");
						
						%>
						
						<jsp:include page="tabellina.jsp" />
						
						<%
						
						break;
					
					case 3:
						
						Dado.giocaDadi();
						
// 						for(String g : Dado.getGiocate()){
// 							out.print("<p>" + g +"</p>");
// 						}
						out.print("<h1>Hai vinto " +  Dado.getVittorie().size()   +" volte!</h1>");
						for(String v : Dado.getVittorie()){
							out.print("<p>" + v +"</p>");
						}
						
						break;
					case 4:
						
						out.print("<h1>pietra forbici carta</h1>");
						%>
						<jsp:include page="giocoPFC.jsp"/>
						
						<%
						break;
						
					default:
						out.print( "La pagina " +     request.getParameter("pagina")  + " non è disponibile"  );
						break;
				
				}
		
			}
			else
			//apro parentesi del blocco di codice else: sei in home page
			{
				//out.print("sei in home page");
		%>
				<h2>home</h2>
				<%@include file="home.jsp" %>
		<% 
		//chiudo: sei in home page
			} 
		%>
		

</div>