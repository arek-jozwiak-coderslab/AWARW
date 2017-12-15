<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>Name</td>
				<td>Description</td>
				<td>Attribute</td>
				<td>Akcje</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${smurfs}" var="smurf">
<tr>
<td>${smurf.id}</td>
<td>${smurf.name}</td>
<td>${smurf.description}</td>
<td>${smurf.attribute}</td>
<td>
<a href='<c:url value="/deleteSmurf?id=${smurf.id}"/>'>Usuń</a>
<a href='<c:url value="/updateSmurf?id=${smurf.id}"/>'>Edytuj</a>
</td>
</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>