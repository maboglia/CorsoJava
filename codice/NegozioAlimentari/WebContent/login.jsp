<%-- 
    Document   : login
    Created on : 12-apr-2012, 13.25.01
    Author     : teacher
--%>

<%@page import="java.util.*"  contentType="text/html" pageEncoding="UTF-8"%>

<%
if(request.getParameter("invia")!=null){

    Vector error = new Vector();
    
    String username="";
    String password="";    
    
    if(request.getParameter("txtUsername").isEmpty())
        error.add("Username non presente");
    else
        username=request.getParameter("txtUsername");

    if(request.getParameter("txtPassword").isEmpty())
        error.add("Password non presente");
    else
        password=request.getParameter("txtPassword");
    

    if(error.size()==0)
        out.println("Username: "+username+"<br>"+"Password: "+password);
       else{
        out.println("Si sono verificati i seguenti errori<br><br>");
        for(int i=0; i<error.size();i++)
            out.println(error.get(i)+"<br />");
       }
}
%>
<style>
th {
	text-align: right;
}

legend {
	font-weight: bold;
	font-family: arial;
	font-size: 16px;
	background-color: red;
	color: blue;
	font-style: italic;
}

fieldset {
	border-color: green;
	width: 80%;
}
</style>
</head>
<body>
    <jsp:include page="login.html"></jsp:include>
</body>
<%  %>
