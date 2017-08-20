<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/update-book" method="post">
<input type="hidden" name="id" value="${book.id}"/>
<input type="text" name="title" value="${book.title}" placeholder="title"/>
<input type="text" name="author" value="${book.author}" placeholder="author"/>
<input type="text" name="isbn" value="${book.isbn}" placeholder="isbn"/>
<input type="submit"/>
</form>

</body>
</html>