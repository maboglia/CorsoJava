<%@ page import="java.util.ArrayList" %>

<div id="pulsantiServizio">
	<button id="switchElementi" class="btn btn-primary">Registrati</button>
</div>

<% if (session.getValue("isLogged") != null ){%> 
	<% if (session.getValue("isLogged").equals("true")) { %>
	
	<div id="carrello" class="elementoScomparsa">
	
		<div class="header"><h1>carrello</h1></div>
	
		<ul>
			<li>uno</li>
			<li>due</li>
			<li>tre</li>
		</ul>
	
	</div>
	
	<% } %>
<% } %>

<div id="registrazione">

	<div class="header"><h1>registrazione</h1></div>

	<form method="post" name="doRegistrazione" action="doRegistrazione.jsp">
	
		username <input type="text" name="username" />
		<br/>
		password <input type="text" name="password" />
	
		<br/>
		<br/>
	
		M: <input type="radio" name="genere" value="M" />
		F: <input type="radio" name="genere" value="F" />
	
		<br/>
		
		<select name="eta">
			<option value="giovane">giovane 18-35</option>
			<option value="esperto">esperto 36-49</option>
			<option value="maturo">maturo 50-65</option>	
		</select>
		<br/>
		
		metodi pagamento preferiti
		contanti <input type="checkbox" name="payment" value="contanti" /><br/>
		bonifico <input type="checkbox" name="payment" value="bonifico" /><br/>
		carta credito <input type="checkbox" name="payment" value="creditcard" /><br/>
		paypal <input type="checkbox" name="payment" value="paypal" /><br/>
	
		<br/>
	
		<input type="submit" name="invia" value="registrati" />
	
	</form>

</div>


<div id="login">
	<div class="header"><h1>login</h1></div>
	<form method="post" name="doLogin" action="login">
	
		username <input type="text" name="username" />
		<br/>
		password <input type="text" name="password" />
		<br/>
	
		<input type="submit" name="btnLogin" id="btnLogin"  value="login" />	

	</form>
</div>
