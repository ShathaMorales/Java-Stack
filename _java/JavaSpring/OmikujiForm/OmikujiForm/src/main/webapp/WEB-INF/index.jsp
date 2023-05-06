<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Omikuji Form</title>
</head>
<body>
	<div class="card p-5 bg-light center m-auto mt-5" style="width: 30rem;">
		<h1>Send an Omikuji</h1>
		<form action="/omikuji/handle" method="POST">
			<p><label>Pick any number from 5 to 25</label>
			<input class="form-control" type="number" name="number"></p>
		
			<p><label>Enter the name of any city</label>
			<input class="form-control" type="text" name="city"></p>
		
			<p><label>Enter the name of any real person</label>
			<input class="form-control" type="text" name="name"></p>
		
			<p><label>Enter professional endeavor or hobby</label>
			<input class="form-control" type="text" name="hobby"></p>
		
			<p><label>Enter any type of living thing</label>
			<input class="form-control" type="text" name="thing"></p>
		
			<p><label>Say something nice to someone</label>
			<textarea class="form-control" id="textarea" name="textarea"></textarea></p>
			
			<p><label class="fst-italic">Send and show a friend</label>
			<div class="d-grid gap-2 col-6 mx-auto">
				<input class="btn btn-secondary" type="submit" value="Send">
			</div></p>
		</form>
	</div>

</body>
</html>