<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location|Lists</title>
</head>
<body>
<h2>Location|Lists</h2>
<hr>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Code</th>
<th>Types</th>
<th>Delete</th>

</tr>

<c:forEach items="${locations}" var="location">

<tr>
   <td>${location.id  } </td>
<td>${ location.name}</td>
<td> ${location.code  }</td>
<td>${location.types}  </td>  
<td> <a href="delete?id=${location.id}">delete</a> </td>

</tr>






</c:forEach>
</table>
</body>
</html>