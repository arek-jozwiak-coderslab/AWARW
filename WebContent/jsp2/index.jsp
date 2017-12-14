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
<!-- tutaj wtawiamy header -->
<%@include file="/WEB-INF/header.jsp" %>
<h1>JESTEM INDEX</h1>


<c:out value="<b> bold text </b>" escapeXml="true"/>

<%! String str = null; %>
<c:out value="${str}" default="default value"/>

<% String[] animals = {"Pies", "Kot", "Nietoperz", "Ważka"}; %>
<ul>
  <c:forEach var="animal" items="<%= animals%>">
    <li> ${animal}</li>
  </c:forEach>
</ul>
<a href=''>tutaj kliknij</a>

<a href='<c:url value="/Servlet02" />'>Servlet02 </a>
</body>
</html>