<%@page import="java.util.Date"%>
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
<%--${param.foo} --%>

${param.a+0 > param.b+0 ? "A większe" : "B większe"} 

<c:if test="${param.a > param.b }">A większe </c:if>
<hr/>
${param.a}
<hr/>
${param.b}
<br/><br/>
	<%Date d = new Date();%>
	<%=d%>
	<br/>
	<%!Date d2 = new Date();%>
	<%=d2%>

</body>
</html>