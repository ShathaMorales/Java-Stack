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
	<div class="card p-5 m-5 lh-lg">
		<h1 class="mb-5" style="color:blue"><span style="font-weight:bold">Expense Details</span></h1>
		<p><span style="font-weight:bold">Expense Name: </span><c:out value="${expense.expenseName}"/></p>
		<p><span style="font-weight:bold">Expense Description: </span><c:out value="${expense.description}"/></p>
		<p><span style="font-weight:bold">Vendor: </span><c:out value="${expense.vendor}"/></p>
		<p><span style="font-weight:bold">Amount Spent: </span>$ <c:out value="${expense.amount}"/></p>
	</div>	
</body>
</html>