<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>

<%  if ( session.getAttribute("loggedUser") != null &&  (Boolean)  session.getAttribute("loggedUser") == true) {  %>

<h2>sono l'area riservata</h2>

<h3><a href="doLogout.jsp" title="fai logout">logout</a></h3>

<% } 

else {
	out.print("<h2>non puoi entrare!!!</h2>");
}

%>
<%@ include file="footer.html" %>