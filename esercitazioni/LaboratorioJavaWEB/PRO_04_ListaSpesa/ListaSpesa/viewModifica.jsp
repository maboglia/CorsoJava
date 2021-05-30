<%@page import="listaspesa.Voce" %>
<jsp:useBean id="modificaVoce" class="listaspesa.ModificaVoce" scope="request"   />
<jsp:include page="header.jsp" />
<div class="container">
	<h1>Modifica voce</h1>

	<form action="doModificaEsegui.jsp" method="post">
		<input type="text" name="voce" value="${modificaVoce.getVoce().getMessaggio()}" /><br/>
		<input type="hidden" name="posVoce" value="${modificaVoce.getPosizione()}" />
		<input type= "submit" value="Modifica" />	
	</form>

</div>
<jsp:include page="footer.jsp" />
