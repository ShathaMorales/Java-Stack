<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <div class = "row justify-content-center">
            <div class = "col-7 ">
                <h1>Welcome, <c:out value="${userName}"></c:out>!</h1>
                <h5 class="pb-3">All Projects</h5>
            </div>
            <div class = "col-2 ">
                <p><a href="/logout">Logout</a></p>
                <p><a href="/projects/new">+ New Project</a></p>
            </div>
            </div>
            <div class = "row justify-content-center">
            <div class = "col-9 ">
                    <table class="table border col-5">
                  <thead>
                    <tr>
                         <th scope="col">Project</th>
                         <th scope="col">Team Lead</th>
                         <th scope="col">Due Date</th>
                         <th scope="col">Actions</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="project" items="${unassignedProjects}">
                    	<c:if test="${userId != project.lead.id}">
                    <tr>
                        <td><a href="/projects/${project.id}"><c:out value="${project.title}"></c:out></a></td>
                        <td><c:out value="${project.lead.firstName}"></c:out> <c:out value="${project.lead.lastName}"></c:out></td>
                        <td><fmt:formatDate value="${project.dueDate}" pattern="MMMM dd"/></td>
                            <c:set var="id1" value="${project.lead.id}"/>
                            <c:set var="id2" value="${project.id}"/>
                            <c:choose>
                                <c:when test="${userId == project.lead.id}">
                                <div class="d-flex gap-3">
                                    <td><a class="btn btn-outline-primary" href="/project/${project.id}/edit">edit</a> | 
										<form action="/projects/${project.id}/delete" method="post">
											<input type="hidden" name="_method" value="delete">
											<input class="btn btn-outline-primary" type="submit" value="Delete">
										</form>
								</div>
                                </c:when>    
                                <c:otherwise>
                                    <td><a class="btn btn-outline-primary" href="/projects/${project.id}/join">Join Team</a></td>
                                </c:otherwise>
                            </c:choose>
                    </tr>
                    	</c:if>
                    </c:forEach>
                  </tbody>
                </table>
                
                    <table class="table border col-5">
                  <thead>
                    <tr>
                         <th scope="col">Project</th>
                         <th scope="col">Team Lead</th>
                         <th scope="col">Due Date</th>
                         <th scope="col">Actions</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="project" items="${assignedProjects}">
                    <tr>
                        <td><a href="/projects/${project.id}"><c:out value="${project.title}"></c:out></a></td>
                        <td><c:out value="${project.lead.firstName}"></c:out> <c:out value="${project.lead.lastName}"></c:out></td>
                        <td><fmt:formatDate value="${project.dueDate}" pattern="MMMM dd"/></td>
                        <c:if test="${userId != project.lead.id}">
                        	<td><a class="btn btn-outline-primary" href="/projects/${project.id}/leave">Leave Team</a></td>
                        </c:if>	
                        <c:if test="${userId == project.lead.id}">
                        	<td><a class="btn btn-outline-primary" href="/projects/edit/${project.id}">Edit</a></td>
                        </c:if>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
            </div>
            </div>
    </div>
    </div>
</body>
</html>