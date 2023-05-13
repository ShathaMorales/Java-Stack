<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Display</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class = "container-md-fluid m-5 p-5">
		<div class = "row justify-content-center">
			<div class = "col-7">
				<h1><c:out value="${book.title}"></c:out></h1>
			</div>
			<div class = "col-3 align-self-center">
				<a href="/books">Back to the shelves</a>
			</div>
		</div>
		<div class = "row justify-content-start">
			<div class = "col-7">
				<h3><span style="color:red;"><c:out value="${name1}"></c:out></span> read <span style="color:purple;"><c:out value="${book.title}">
				</c:out></span> by <span style="color:green;"><c:out value="${book.author}"></c:out></span></h3>
				<h5>Here are <c:out value="${name2}"></c:out> thoughts</h5>
				<p><c:out value="${book.thoughts}"></c:out></p>
				<c:if test = "${user_id == book.user.id}">
					<div class="d-flex gap-3">
						<a class="btn btn-outline-primary" href="/books/${book.id}/edit">Edit</a>
							<form action="/books/${book.id}/delete" method="post">
						 	<input type="hidden" name="_method" value="delete">
							<input class="btn btn-outline-primary" type="submit" value="Delete">
						</form>
					</div>	
				</c:if>
			</div>
		</div>
		
	</div>
</body>
</html>