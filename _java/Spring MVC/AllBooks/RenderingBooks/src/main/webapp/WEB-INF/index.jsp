<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>All Books</title>
</head>
<body>
	<div class="card p-5 m-5">
		<h1>All Books</h1>
		<table class="table table-hover">
		    <thead>
		        <tr>
		            <th>ID</th>
		            <th>Title</th>
		            <th>Language</th>
		            <th>Number of Pages</th>
		        </tr>
		    </thead>
		    <tbody>
		         <c:forEach var="book" items="${books}">
		         	<tr>
		         		<td><c:out value="${book.id}"/></td>
		         		<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
		         		<td><c:out value="${book.language}"/></td>
		         		<td><c:out value="${book.numberOfPages}"/></td>
		         	</tr>
		         </c:forEach>
		    </tbody>
		</table>
	</div>
	
</body>
</html>