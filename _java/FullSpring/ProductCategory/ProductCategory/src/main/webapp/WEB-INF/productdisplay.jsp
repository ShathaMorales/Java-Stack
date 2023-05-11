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
<title>Product Page</title>
</head>
<body>
	<div class = "container-md-fluid m-5 p-5">
		<p><a href="/">Home</a></p>
		<div class = "row justify-content-between">
			<div class="col-5">
				<h1>Product: <c:out value="${products.name}"></c:out></h1>
				<h2>Categories</h2>
				<ul>
					<c:forEach var="category" items="${products.categories}">
						<li class="list-group-item"><c:out value="${category.name}"></c:out></li>
					</c:forEach>
				</ul>
			</div>
			<div class = "col-2">
				<form action="/products/${products.id}" method="post">
					<select name="category" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
					  <c:forEach var="category" items="${categories}">
					  	<option value="${category.id}"><c:out value="${category.name}"></c:out></option>
					  </c:forEach>
					</select>
					<button type="submit" class="btn btn-outline-warning align-self-center">Add</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>