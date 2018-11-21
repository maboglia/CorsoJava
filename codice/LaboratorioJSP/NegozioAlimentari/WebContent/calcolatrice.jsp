<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>


<h2>calcolatrice</h2>

<%! double calcola(int o1, int o2, String operatore){
	double calc = 0.0;
	
	switch(operatore){
	case "+": 
		calc = o1+o2;
	break;
	
	default: 
		calc = 1000;
		break;
	}
	
	
	return calc;
} %>

<%

if (request.getParameter("operando1") != null && request.getParameter("operando2") != null ){
int op1 = Integer.parseInt(  request.getParameter("operando1")  );
int op2 = Integer.parseInt(  request.getParameter("operando2")  );

out.print("il risultato della operazione di addizione è: " + calcola(op1,  op2, "+")  );
out.print("il risultato della operazione di divisione è: " + calcola(op1,  op2, "/")  );
out.print("il risultato della operazione di sottrazione è: " + (op1 +  op2)  );
out.print("il risultato della operazione di moltiplicazionezione è: " + (op1 +  op2)  );
}
else {

%>


<form method="post" action="">
	op1 <input type="number" name="operando1"><br>
	op2 <input type="number" name="operando2"><br>
	<input type="submit" value="calcola">
</form>

<% } %>


<%@ include file="footer.html" %>