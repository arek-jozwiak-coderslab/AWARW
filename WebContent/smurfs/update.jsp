<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Update smurfa : ${smurf.name}</h1>

	<form action="" method="post">
		<input type="hidden" value="${smurf.id}" name="id" /> 
		<input type="text" name="name" value="${smurf.name }" />
		<input type="text"	name="attribute" value="${smurf.attribute}" />
		<textarea rows="3" cols="10" name="description">${smurf.description}</textarea>
		<input type="submit" />
	</form>
</body>
</html>