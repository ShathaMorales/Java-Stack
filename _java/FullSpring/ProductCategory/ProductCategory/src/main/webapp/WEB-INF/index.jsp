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
<title>Home</title>
</head>
<body>
		<div class = "container-md-fluid m-5 p-5">
			<div class = "row justify-content-center">
				<div class = "col-5 align-self-center">
				<h1 class="text-center m-5">Home Page</h1>
					<p><a href="/products/new">New Product</a></p>
					<p><a href="/categories/new">New Category</a></p>
					<hr>
	    <div class="row">
	        <div class="col col-6">
	            <div class="card">
	                <div class="card-header text-center">Products</div>
	                <div class="card-body">
	                    <ul>
	                    <c:forEach var="product" items="${products}">
	                    <li class="list-group-item">
	                        <a href="/products/${product.id}" class="">${product.name}</a>
	                    </li>
	                    </c:forEach>
	                    </ul>
	                </div>
	            </div>
	        </div>
	        <div class="col col-6">
	            <div class="card">
	                <div class="card-header text-center">Categories</div>
	                <div class="card-body">
	                    <ul>
	                    <c:forEach var="category" items="${categories}">
	                        <li class="list-group-item">
	                            <a href="/categories/${category.id}" class="">${category.name}</a>
	                        </li>
	                    </c:forEach>
	                    </ul>
	                </div>
	        </div>
    
				</div>
			</div>
		</div>
</body>
</html>