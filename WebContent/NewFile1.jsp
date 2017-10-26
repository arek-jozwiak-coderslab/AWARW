<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Jestem JSP

<%! Date date = new Date(); %>
<% out.println(date); %>

<%=request.getParameter("a") %>

<hr/>

<% Date date2 = new Date(); %>
<% out.println(date2); %>

</body>
</html>