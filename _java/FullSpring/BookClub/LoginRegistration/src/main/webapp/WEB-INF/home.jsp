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
<title>Dashboard</title>
</head>
<body>
    <div class = "container-md-fluid m-5 p-5">
        <div class = "row justify-content-between">
            <div class = "col-5 ">
                <h1>Welcome, <c:out value="${userName}"></c:out>!</h1>
                <h5>Books from everyones' shelves:</h5>
                <a href="/logout">Logout</a>
            </div>
              <div class = "col-3 ">
              <!-- <a href="/logout">Logout</a> -->
              <a href="/books/new">+ Add to my shelf!</a>
            </div>
        </div>
           <div class = "row justify-content-center">
            <div class = "col-7 align-self-center ">
            	<table class="table border col-5 mb-5">
				  <thead>
				    <tr>
				      <th scope="col">ID</th>
				      <th scope="col">Title</th>
				      <th scope="col">Author Name</th>
				      <th scope="col">Posted By</th>
				    </tr>
				  </thead>
				  <tbody>
				  <c:forEach var="book" items="${books}">
				    <tr>
				      <th scope="row"><c:out value="${book.id}"></c:out></th>
				      <td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
				      <td><c:out value="${book.author}"></c:out></td>
				      <td><c:out value="${book.user.userName}"></c:out></td>
				    </tr>
				    </c:forEach>
				</table>
            </div>
        </div>
    </div>
</body>
</html>