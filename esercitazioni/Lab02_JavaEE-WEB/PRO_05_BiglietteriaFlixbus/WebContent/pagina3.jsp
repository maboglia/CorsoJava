<%@include file="view_header.jsp" %>
<%@ page import="dao.*" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">
            <div class="col-lg-12 text-center">
                <h1>A Bootstrap Starter Template</h1>
                <p class="lead">Complete with pre-defined file paths that you won't have to change!</p>

	<%  UtentiDAO utente = (UtentiDAO) session.getValue("utente");   %>
	<h1>Benvenuto <%= utente.getUtente()%></h1>

	<% int id_tratta =  Integer.parseInt(   request.getParameter("tratta")   )  ; %>
	<%  Tratte t = new Tratte();  %>
	<%  Tratte prenotaTratta = t.trovaTratta(id_tratta);  %>

		<h1>prenotazione viaggio</h1>
		<%= utente.getUtente() %>	
		<%= prenotaTratta.getDescrizione()%>
		<% session.putValue("tratta", prenotaTratta); %>

		<form action="pagina4.jsp" method="post">
		
	
		
			data <input type="text"  name="data_viaggio" value="20170703"  /><br/>
			numero biglietti <input type="number" name="num_biglietti"></br>		
			
			<input type="submit" name= "invia_prenotazione" value="prenota" />
			
			
				
		</form>
		
 
                
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
<%@include file="view_footer.jsp" %>