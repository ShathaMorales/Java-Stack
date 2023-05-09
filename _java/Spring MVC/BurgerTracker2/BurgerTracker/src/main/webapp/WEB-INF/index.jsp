<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Burger Tracker</title>
</head>
<body>

	<div class='card p-5 m-5'>
		<h1>Burger Tracker</h1>
	<table class="table table-hover">
		<thead>
			<td style="font-weight:bold">Burger Name</td>
			<td style="font-weight:bold">Restaurant Name</td>
			<td style="font-weight:bold">Rating (out of 5)</td>
			<td style="font-weight:bold">Action</td>
		</thead>
		<c:forEach var="burger" items="${allburgers}">
			<tr>
				<td><c:out value="${burger.name}"/></td>
				<td><c:out value="${burger.restaurantName}"/></td>
				<td><c:out value="${burger.rating}"/></td>
				<td><a href="/burgers/edit/${burger.id}">edit</a></td>
			</tr>
		 </c:forEach>
	</table>
	</div>
	
	<div class='card m-5 p-5'>
	<h1>New Burger</h1>
	<form:form action="/burger" method="post" modelAttribute="burger">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name" class="form-control"/>
	    </p>
	    <p>
	        <form:label path="restaurantName">Restaurant Name</form:label>
	        <form:errors path="restaurantName"/>
	        <form:input path="restaurantName" class="form-control"/>
	    </p>
	    <p>
	        <form:label path="rating">Rating</form:label>
	        <form:errors path="rating"/>     
	        <form:input type="number" path="rating" class="form-control"/>
	    </p> 
	    <p>
	        <form:label path="notes">Notes</form:label>
	        <form:errors path="notes"/>
	        <form:textarea path="notes" class="form-control"/>
	    </p>
	   	<div class="d-grid gap-2 col-6 mx-auto">
	   	    <input class="btn btn-outline-primary" type="submit" value="Submit"/>
	   	</div>
	</form:form> 
	</div>
   
</body>
</html>