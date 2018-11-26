<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>richiesta registrazione da parte di</h1>

	<h3> Username:      <%= request.getParameter("username") %>        </h3>
	<h3> Password:      ${param.password}        </h3>
	<h3> Genere:      ${param.genere}        </h3>
	<h3> Fascia di età:      ${param.eta}        </h3>
	
	<h3>forma di pagamento desiderata</h3>
	<ul>
	<%
		String[] pagamenti = request.getParameterValues("payment");
		for(String temp : pagamenti){
			out.println("<li>"   + temp  +  "</li>"  );		
		}
	%>
	</ul>
</body>
</html>