<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
<title>Part 3 | JavaWebProject</title>
</head>
<body>
	<ul id="menu">
		<li><a id="menu_Search" href="Search">Otsi</a></li>
		<li><a id="menu_Add" href="Add">Lisa</a></li>
		<li><a id="menu_ClearData" href="Admin?do=clear_data">Tühjenda</a></li>
		<li><a id="menu_InsertData" href="Admin?do=insert_data">Sisesta näidisandmed</a></li>
	</ul>
</body>
</html>