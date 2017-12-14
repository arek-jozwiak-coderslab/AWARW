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

<hr/>
	<c:forEach var="myRole" items="${paramValues.role}">${myRole}</c:forEach>
<hr/>





	<c:out value="${param.role}" default="guest" />

	${cookie.User.value}
	<hr />
	${cookie.foo.value}
	<hr />
	${pageContext.request.contextPath}
	<hr />
	Jestem linkiem z context path
	<a href="<%=request.getContextPath()%>/Servlet02">Name</a>
	<hr />
	Link z jstl:
	<a href='<c:url value="/Servlet02" />'Servlet02">Jestem linkiem z c
		url</a>
	<br />

</body>
</html>