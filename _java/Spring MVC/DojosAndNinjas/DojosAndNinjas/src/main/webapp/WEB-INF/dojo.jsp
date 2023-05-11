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
<title>Dojos</title>
</head>
<body>	
	<div class='card m-5 p-5'>
	<h1 class="mb-5" style="color: blue">New Dojo</h1>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors style="color:red" path="name"/>
	        <form:input path="name" class="form-control"/>
	    </p>
	   	<div class="d-grid gap-2 col-6 mx-auto">
	   	    <input class="btn btn-outline-primary" type="submit" value="Create"/>
	   	</div>
	</form:form> 
	</div>
</body>
</html>