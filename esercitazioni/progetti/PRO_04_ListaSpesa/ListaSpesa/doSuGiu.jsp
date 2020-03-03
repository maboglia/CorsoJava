<%@page import="db.LIstaSpesaDAO"%>

<% 


	String posizione = request.getParameter("posizione");
	int posVoce = Integer.parseInt(posizione);

	LIstaSpesaDAO spesaDAO = new LIstaSpesaDAO();
	
	if(request.getParameter("direzione").equals("su")){
		spesaDAO.spostaSu(posVoce);
	} else 
		if(request.getParameter("direzione").equals("giu")){
			spesaDAO.spostaGiu(posVoce);
		}

	
	
	response.sendRedirect("doLista.jsp");

%>