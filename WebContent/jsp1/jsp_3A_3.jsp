<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
<input type="text" name="a"/>
<input type="text" name="b"/>
<input type="submit">
</form>

	<% if(request.getParameter("a")!=null &&
			request.getParameter("b")!=null){
	
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
	%>
	a =
	<%=a%><br> b =
	<%=b%><br>
	<ul>
	<%
		while (a < b) {
	%>
	<li><%=a%></li>
	<%
		a++;
		}}
	%>
</ul>
</body>
</html>
