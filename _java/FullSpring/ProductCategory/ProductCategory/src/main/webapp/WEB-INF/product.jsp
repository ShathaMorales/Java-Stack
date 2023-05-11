<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>New Product</title>
</head>
<body>
	<div class = "container-md-fluid m-5 p-5">
		<div class = "row justify-content-center">
			<div class = "col-5 align-self-center">
			<h1>Add Product</h1>
			<form:form action="/products/new" method="post" modelAttribute="product">
				<div class="form-floating my-3">
				  <form:input path="name" class="form-control" name = "name" id="floatingInput"/>
				  <form:label path="name" for="floatingInput">Product Name</form:label>
					<form:errors path="name" class = "my-3" style="color: red;"/>
				</div>
				<div class="form-floating mb-4">
					  <form:textarea path="description" class="form-control" id="floatingTextarea2" style="height: 100px"></form:textarea>
					  <form:label path="description" for="floatingTextarea2">Description</form:label>
					<form:errors path="description" class = "my-3" style="color: red;"/>
					</div>
				<div class="form-floating my-3">
				  <form:input path="price" class="form-control" name = "name" id="floatingInput"/>
				  <form:label path="price" for="floatingInput">Price</form:label>
					<form:errors path="price" class = "my-3" style="color: red;"/>
				</div>
				<button type="submit" class="btn btn-outline-warning align-self-center">Submit</button>
			</form:form>
			</div>
		</div>
	</div>
</body>
</html>