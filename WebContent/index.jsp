<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Hello World</title>

<spring:url value="/resources/css/bootstrap.css" var="bootstrapcss" />
<spring:url value="/resources/scripts/bootstrap.js" var="bootstrapjs" />
<spring:url value="/resources/scripts/jquery-2.1.4.js" var="jqueryjs" />

<link rel="stylesheet" href="${bootstrapcss}" />

</head>
<body>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">SpringMVCHelloWorld</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
	</div>
	</nav>

    <div class="container">
        <div class="jumbotron">
            <h1>Spring MVC Hello World</h1>
        </div>
    </div>

	<br>
	<div style="text-align:center">
		<h2>
			First Spring MCV Web Application, with added Bootstrap!<br> <br>
		</h2>
		<h3>
			<a href="welcome.html">Click here to See Welcome Message... </a>(to
			check Spring MVC Controller... @RequestMapping("/welcome"))
		</h3>
	</div>
	
	<script src="${jqueryjs}"></script>
	<script src="${bootstrapjs}"></script>
	
</body>
</html>