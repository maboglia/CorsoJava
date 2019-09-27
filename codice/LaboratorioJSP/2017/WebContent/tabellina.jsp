<h2>Tabellina java</h2>

<%
//script server-side


//inizializzo tabella
out.println("<table class='table'>");


for(int i =1; i<=10; i++){
	//ogni giro del ciclo aggiungo una riga
	out.println("<tr>");

	for(int j =1; j<=10; j++){
		//ogni giro del ciclo innestato aggiungo una cella/colonna
		out.println("<td>");
									
		//all'interno della cella scrivo il valore della moltiplicazione i * j							
		out.print(    i * j );
		
		//chiudo cella
		out.println("</td>");
	}
	
	//chiudo riga
	out.println("</tr>");
	
}
//chiudo table
out.println("</table>");





%>

<h2>Tabellina javascript</h2>
<script>
//script client-side


//inizializzo tabella
document.writeln("<table class='table'>");

for(var i = 1; i<=10;i++){
	//ogni giro del ciclo aggiungo una riga
	document.writeln("<tr>");
	
	for(var j = 1; j<=10;j++){
		document.write(  "<td>" +    (i * j)  + "</td>" );		
	}
	document.writeln("</tr>");


}

document.writeln("</table>");


</script>
