<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Share</title>
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
			<div class = "col-5 align-self-center">
			<h1>Add a Book to your Shelf!</h1>
			<form:form action="/books/new" method="post" modelAttribute="book">
				<div class="form-floating my-3">
				  <form:input path="title" class="form-control" name = "title" id="floatingInput" placeholder="name@example.com"/>
				  <form:label path="title" for="floatingInput">Book Title</form:label>
					<form:errors path="title" class = "my-3" style="color: blue;"/>
				</div>
				<div class="form-floating my-3">
				  <form:input path="author" class="form-control" name = "author" id="floatingInput" placeholder="name@example.com"/>
				  <form:label path="author" for="floatingInput">Author Name</form:label>
					<form:errors path="author" class = "my-3" style="color: blue;"/>
				</div>
				<div class="form-floating mb-4">
                      <form:textarea path="thoughts" class="form-control" placeholder="Leave a comment here" name = "thought" id="floatingTextarea2" style="height: 100px"></form:textarea>
                      <form:label path="thoughts" for="floatingTextarea2">My thoughts</form:label>
                    <form:errors path="thoughts" class = "my-3" style="color: blue;"/>
                </div>
                <form:input path="user" class="form-control" type= "hidden" value="${user_id}" name = "user" id="floatingInput" placeholder="name@example.com"/>
				<button type="submit" class="btn btn-outline-primary align-self-center">Submit</button>
			</form:form>
			</div>
		</div>
	</div>
</body>
</html>