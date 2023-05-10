<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Dojos and Ninjas</title>
</head>
<body>
	<div class="container-md-fluid p5 m5">
		<div class = "row justify-content-center mb-5">
			<div class = "col-9 align-self-center ">
				<h1 class = "mb-4">${dojo.name} Location Ninjas</h1>
				<table class="table border col-5 mb-5">
				  <thead>
				    <tr>
				      <th scope="col">First Name</th>
				      <th scope="col">Last Name</th>
				      <th scope="col">Age</th>
				    </tr>
				  </thead>
				  <tbody>
				  <c:forEach var="ninja" items="${allDojoNinjas}">
				    <tr>
				      <th scope="row"><c:out value="${ninja.firstName}"></c:out></th>
				      <td><c:out value="${ninja.lastName}"></c:out></td>
				      <td><c:out value="${ninja.age}"></c:out></td>
				    </tr>
				    </c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>