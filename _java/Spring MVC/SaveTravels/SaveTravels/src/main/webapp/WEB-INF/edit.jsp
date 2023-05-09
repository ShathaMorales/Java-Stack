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
<title>Save Travels</title>
</head>
<body>

	<p class="text-end m-5"><a href="/">Go Back</a></p>
	<div class='card m-5 p-5'>
	<h1 style="color: green">Edit Expense</h1>
	<form:form action="/expenses/edit/${expense.id}" method="post" modelAttribute="expense">
	<input type="hidden" name="_method" value="put">
		<p>
	        <form:label path="expenseName">Expense Name</form:label>
	        <form:errors style="color:red" path="expenseName"/>
	        <form:input path="expenseName" class="form-control"/>
	    </p>
	    <p>
	        <form:label path="vendor">Vendor</form:label>
	        <form:errors style="color:red" path="vendor"/>
	        <form:input path="vendor" class="form-control"/>
	    </p>
	    <p>
	        <form:label path="amount">Amount</form:label>
	        <form:errors style="color:red" path="amount"/>     
	        <form:input type="amount" path="amount" class="form-control"/>
	    </p> 
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors style="color:red" path="description"/>
	        <form:textarea path="description" class="form-control"/>
	    </p>
	   	<div class="d-grid gap-2 col-6 mx-auto">
	   	    <input class="btn btn-outline-primary" type="submit" value="Submit"/>
	   	</div>
	</form:form> 
	</div>
	
</body>
</html>