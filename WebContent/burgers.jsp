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
	<h1>Burgers List</h1>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>rating</th>
			<th>Akcja</th>
		</tr>
		<c:forEach items="${burgers}" var="burger">
			<tr>
				<td>${burger.id}</td>
				<td>${burger.name}</td>
				<td>${burger.rating}</td>
				<td><a href="/deleteburger?id=${burger.id}">usun</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>