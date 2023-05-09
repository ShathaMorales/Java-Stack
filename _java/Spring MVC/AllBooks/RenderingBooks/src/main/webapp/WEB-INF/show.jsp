<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="card p-5 m-5">
		<h2><c:out value="${book.title}"/></h2>
		<p><span style="font-weight:bold">Description: </span><c:out value="${book.description}"/></p>
		<p><span style="font-weight:bold">Language: </span><c:out value="${book.language}"/></p>
		<p><span style="font-weight:bold">Number of Pages: </span><c:out value="${book.numberOfPages}"/></p>
	</div>	
</body>
</html>