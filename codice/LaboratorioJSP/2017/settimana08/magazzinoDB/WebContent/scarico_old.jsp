<%@page import="model.Prodotto"%>
<%@page import="controller.Magazzino"%>
<h1>scarico</h1>

<% 




Magazzino.scaricoMagazzino("20170713", new Prodotto(3, "camicia", 30.00), -10);


%>