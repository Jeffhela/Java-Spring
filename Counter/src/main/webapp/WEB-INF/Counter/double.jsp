<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/main.css">
<title>Double Count</title>
</head>
<body>
	<h1>You have visited <a href="/">http://localhost:8080/</a> <c:out value="${count}"/> times.</h1>
	<a href="/"><h1>Take another visit?</h1></a>
	<a href="/reset"><button>RESET COUNT</button></a>

</body>
</html>