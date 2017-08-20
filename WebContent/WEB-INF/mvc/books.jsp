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
	<h1>Lista książek</h1>
	<table>
	<tr><th>Title</th><th>Author</th><th>ISBN</th><th>Akcja</th></tr>
		<c:forEach items="${books}" var="book">
		<tr>
		<td>${book.title}</td>
		<td>${book.author}</td>
		<td>${book.isbn}</td>
		<td><a href="update-book?id=${book.id}">Edytuj</a></td>
		</tr>
		</c:forEach>

	</table>
</body>
</html>