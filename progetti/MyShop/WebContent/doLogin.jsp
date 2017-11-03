<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<%


		if(request.getParameter("username").equals("mauro") &&   request.getParameter("password").equals("12345")     ){
			
			%>
				<h2>Benvenuto</h2>			
				<h3> Username:      <%= request.getParameter("username") %>        </h3>
				<h3> Password:      ${param.password}        </h3>
			
			
			<% 
			
		} else {
			
			out.print("<h2>Non puoi entrare con queste credenziali</h2>	");
			
		}




%>


</body>
</html>