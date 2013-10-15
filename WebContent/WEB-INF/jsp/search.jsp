<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

		<div class="col-lg-4">
			<form class="form-inline" action="Search" method="post">
				<div class="form-group">
					<input class="form-control" id="searchStringBox" value=""
						name="searchString" />
				</div>
				<button type="submit" class="btn btn-default" value="Filtreeri">Filtreeri</button>
			</form>
		</div>
		<br> <br>
		<table id="listTable" class="table">
			<thead>
				<tr>
					<th scope="col">Nimi</th>
					<th scope="col">Kood</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${searchResults}">
					<tr>
						<td>
							<div id="row_${item.code}">${item.name}</div>
						</td>
						<td>${item.code}</td>
						<td><a href="Search?do=delete&id=${item.id}"
							id="delete_${item.code}">Kustuta</a></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>