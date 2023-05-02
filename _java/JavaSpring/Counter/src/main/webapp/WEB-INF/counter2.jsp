<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Counter by Two</title>
</head>
<body>
	<p>You have visited <a href="/">Counter</a>  <c:out value="${count}"/> times</p>
	<a href="/">Test another visit</a>
	<p><a href="/reset">Reset</a></p>
</body>
</html>