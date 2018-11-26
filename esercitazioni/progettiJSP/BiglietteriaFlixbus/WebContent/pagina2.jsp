<%@include file="view_header.jsp" %>
<%@ page import="dao.*" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">
            <div class="col-lg-12 text-center">
                <h1>A Bootstrap Starter Template</h1>
                <p class="lead">Complete with pre-defined file paths that you won't have to change!</p>

		<%! UtentiDAO u = new UtentiDAO(); %>
		<% int id_u = Integer.parseInt(request.getParameter("codice_utente")); %>

		<%

			UtentiDAO	utente = u.trovaUtente(id_u); 
			Tratte v = new Tratte();
		
		%>
		<% session.putValue("utente", utente); %>
	<h1>Benvenuto <%= utente.getUtente()%></h1>

<table class="table table-striped">

	<%
		for (Tratte t : v.elencoTratte()){		
		
		%>


			<tr><td><a href="pagina3.jsp?tratta=<%= t.getIdTratta()%>"><%= t.getDescrizione()%></a></td></tr>
		
	<% } %>
                </table>
 
 
 
 
 
                
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
<%@include file="view_footer.jsp" %>