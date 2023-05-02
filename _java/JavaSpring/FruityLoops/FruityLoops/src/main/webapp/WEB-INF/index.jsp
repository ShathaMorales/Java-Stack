<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Fruit Store</title>
</head>

<body>

	<h1>Fruit Store</h1>
    <table class="table table-striped">
        <c:forEach var="fruit" items="${fruits}">
        <tr>
            <td><c:out value="${fruit.name}"></c:out></td>
        	<td><c:out value="${fruit.price}"></c:out></td>
        </tr>
    	</c:forEach>
    </table>
    
</body>
</html>