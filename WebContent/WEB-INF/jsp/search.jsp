<%@ include file="mainmenu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form action="Search" method="post" class="form">
	<input id="searchStringBox" value="" name="searchString" /> <input
		id="filterButton" type="submit" value="Filtreeri" /> <br /> <br />
</form>
<table id="listTable" class="listTable">
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

