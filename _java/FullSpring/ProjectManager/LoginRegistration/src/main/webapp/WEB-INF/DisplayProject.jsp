<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project Display</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class = "container-md-fluid m-5 p-5">
    	<div class = "row justify-content-between ">
            <div class = "col-5 ">
                <h2>Project Details</h2>
            </div>
            <div class = "col-2">
                <a href="/dashboard">Back to Dashboard</a>
            </div>
        </div>
        <div class = "row justify-content-between mt-5">
         	<div class = "col-3 align-self-center p-3" style="border-top:1px solid black;border-bottom:1px solid black ">
           		<p>Project: <c:out value="${project.title}"></c:out></p>
            	<p>Description: <c:out value="${project.description}"></c:out></p>
            	<p>Date: <fmt:formatDate value="${project.dueDate}" pattern="MMMM dd"/></p>
        	</div>
    	</div>
    		<c:if test="${userId == project.lead.id}">
    		<form class="p-5" action="/projects/${project.id}/delete" method="post">
				<input type="hidden" name="_method" value="delete">
				<input class="btn btn-outline-primary" type="submit" value="Delete Project">
			</form>
			</c:if>
	</div>
</body>
</html>