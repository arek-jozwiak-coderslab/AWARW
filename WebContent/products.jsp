<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Products list</title>
</head>
<body>
<table>
<thead><tr><th>L.p.</th><th>Name</th><th>Desc</th><th>price</th><th>Akcja</th></tr></thead>
<tbody>
<a href='<c:url value="/FirstServlet?param=2" />'>Link </a>



<form action="<c:url value="/FirstServlet"/>">

</form>

<a href=''>asdads</a>

<c:forEach items="${products}" var="product" varStatus="loopStatus">
<tr>
<td>${loopStatus.count }</td>
<td>${product.name }</td>
<td>${product.description }</td>
<td>${product.price }</td>
<td>
<a href='<c:url value="/product-details?param=${product.id}" />'>Link </a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>