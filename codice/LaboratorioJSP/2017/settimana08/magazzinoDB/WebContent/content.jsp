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
						
						break;
					
					case 2:
	
					
						break;
					
					case 3:
						

						break;
					case 4:
						

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