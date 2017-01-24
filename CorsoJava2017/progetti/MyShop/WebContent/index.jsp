<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Shop</title>
<style>
.container { padding:0 auto; margin:0auto;}
.row {display:block; width: 90%; border:1px solid #ccc;}
#testata, #menu, #footer{ clear:both; border:1px solid #c00;  }
#content {float:left; width:65%; border:1px solid #fc3;min-height:450px;}
#sidebar {float:right; width:30%; border:1px solid green;}
#menu  li {list-style-type: none;  display:inline;  }
</style>

</head>
<body>


<div class="container">

	<div class="row" id="testata">
		<jsp:include page="header.jsp"></jsp:include>
	</div>
	
	<div class="row" id="menu">
		<%@ include file="menu.jsp" %>
	</div>
	
	<div class="row">
		<div id="content">
			<%@ include file="content.jsp" %>
		</div>
		<div id="sidebar">
			<%@ include file="sidebar.jsp" %>
		</div>
	
	</div>
	
	<div class="row" id="footer">
		<jsp:include page="footer.jsp"></jsp:include>
	</div>

</div>




</body>
</html>