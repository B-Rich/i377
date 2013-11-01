<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.css"
	type="text/css">
<title>Part 3 | JavaWebProject</title>
</head>
<body>
	<div class="container">
	
		<%@ include file="mainmenu.jsp"%>
		
		<div class="divider"></div>
		
		<div id="formTable" class="col-lg-4">
			<form action="Add" method="post">
				<div class="form-group">
					<label>Nimi</label> <input type="text" class="form-control"
						name="name">
				</div>
				<div class="form-group">
					<label>Kood</label> <input type="text" class="form-control"
						name="code">
				</div>
				<button type="submit" class="btn btn-default" value="Lisa">Lisa</button>
			</form>
		</div>
	</div>
</body>
</html>