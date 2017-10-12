<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Fahrenheit to Celsius</title>
</head>
<%@include file="/WEB-INF/header.jsp" %>
<body>
	<%!Date d1 = new Date();%>
	<%!double fahrenheit = 100, celsius;%>
	<%
		Date d2 = new Date();
		celsius = (fahrenheit - 32) * 5 / 9;
	%>
	d1 =
	<%=d1%>
	<br /> d2 =
	<%=d2%>
	<br />

	<p>
		<%=fahrenheit%>
		stopni Fahrenheita to
		<%=celsius%>
		stopni Celsjusza
	</p>

	<%
		Date d = new Date();
		int counter = 10;
		for (int i = 0; i < counter; i++) {
	%>
	<p>
		<%
			out.print(i);
		%>
	</p>
	<%
		}
	%>
</body>
</html>