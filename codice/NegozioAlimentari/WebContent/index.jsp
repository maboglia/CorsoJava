<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



        <%!    Date theDate = new Date();

            Date getDate() {
                System.out.println("In getDate() method");
                return theDate;
            }
        %>
        Hello! The time is now <%= getDate()%>
	
	        <h1>Request</h1>
        <%= "IP Address: "+request.getRemoteAddr() %><br>
        <%= "Server: "+request.getLocalAddr() %><br>
        <%= "Server Name: "+request.getLocalName() %><br>
        <%= "Protocol: "+request.getProtocol() %><br>
        <%= "RemoteHost "+request.getRemoteHost() %><br>
	

</body>
</html>