<%@include file="view_header.jsp" %>
<%@ page import="dao.*" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">
            <div class="col-lg-12 text-center">
                <h1>A Bootstrap Starter Template</h1>
                <p class="lead">Complete with pre-defined file paths that you won't have to change!</p>

	<% 
	
		int num_biglietti = Integer.parseInt(request.getParameter("num_biglietti"));
		String data_prenotazione = request.getParameter("data_viaggio");
	%>
	
	
	<%= session.getValue("utente") %><br/>
	<%= session.getValue("tratta") %><br/>
	<%= num_biglietti %>
	<%= data_prenotazione %>

	<%
		UtentiDAO u = (UtentiDAO) session.getValue("utente");
		Tratte t = (Tratte) session.getValue("tratta");
		
		int id_utente = u.getIdUtente();
		int id_tratta = t.getIdTratta();
	
		Viaggi v = new Viaggi(  
				id_utente, id_tratta, data_prenotazione, num_biglietti
				);
		if(v.inserisciViaggio()) out.println("prenotazione effettuata");
		else out.println("prenotazione non effettuata");
	
	%>

 
                
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
<%@include file="view_footer.jsp" %>