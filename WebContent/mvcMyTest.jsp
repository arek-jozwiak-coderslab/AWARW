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
	<h1>Jestem widokiem z MVC</h1>

	<h3>${userName}</h3>

	<p>${book.id }</p>
	<p>${book.title }</p>
	<p>${book.author }</p>
	<hr/>
	<ul>
		<c:forEach items="${books}" var="book">
			<li>${book.id }: ${book.title } : ${book.author } </li>
	</c:forEach>
	</ul>

	
</body>
</html>