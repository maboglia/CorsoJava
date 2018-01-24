<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>

      <div class="row">
        <div class="col-lg-12 text-center">
          <h1 class="mt-5">A Bootstrap 4 Starter Template</h1>
          <p class="lead">Complete with pre-defined file paths and responsive navigation!</p>
          <ul class="list-unstyled">
            <li>Bootstrap 4.0.0</li>
            <li>jQuery 3.3.0</li>
          </ul>
        </div>
      </div>


<%-- questo è un commento in JSP --%>

<%!  String s = "Hello, JSP!"; String t = "rosso";    %>


<%-- quella che segue è un'espressione e corrisponde ad out.print(s) --%>

<p class="<%= t %>">ciao</p>

<%= s %>
<%-- infatti se --%>
<%
	for(int i = 1; i <= 6; i++){
	out.print(   "<h"+i+">" +   s +  "</h"+i+">" );
	}


%>

<%@ include file="footer.html" %>