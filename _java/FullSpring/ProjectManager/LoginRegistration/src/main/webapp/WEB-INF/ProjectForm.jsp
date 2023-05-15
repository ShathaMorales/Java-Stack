<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Project</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class = "container-md-fluid m-5 p-5">
		<div class = "row justify-content-center">
			<div class = "col-5 align-self-center">
			<h1>Create a Project</h1>
			<form:form action="/projects/new" method="post" modelAttribute="project">
				<div class="form-floating my-3">
				    <form:input path="title" class="form-control" name = "title" id="floatingInput" placeholder="name@example.com"/>
				    <form:label path="title" for="floatingInput">Project Title</form:label>
					<form:errors path="title" class = "my-3" style="color: blue;"/>
				</div>
				<div class="form-floating mb-3">
                    <form:textarea path="description" class="form-control" placeholder="Leave a comment here" name = "description" id="floatingTextarea2" style="height: 100px"></form:textarea>
                    <form:label path="description" for="floatingTextarea2">Project Description</form:label>
                    <form:errors path="description" class = "my-3" style="color: blue;"/>
                </div>
                <div class="form-floating mb-3">
                    <form:input path="dueDate" type="date" class="form-control" name = "dueDate" id="floatingInput" placeholder="name@example.com"/>
                    <form:label path="dueDate" for="floatingInput">Due Date:</form:label>
                    <form:errors path="dueDate" class = "my-3" style="color: blue;"/>
                </div>
                <div class="d-flex justify-content-center gap-3">
                	<form:input path="lead" class="form-control" type= "hidden" value="${userId}" id="floatingInput" placeholder="name@example.com"/>
					<button type="submit" class="btn btn-outline-primary align-self-center">Submit</button>
			</form:form>
					<a class="btn btn-outline-primary" href="/dashboard">Cancel</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>