<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<title>Category</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form:form action="/registration" method="POST" modelAttribute="registration">
					<div class="form-group row">

						<label class="col-2 col-form-label" for="email">Email: </label>
						<div class="col-10">
							<form:input class="form-control" id="email" path="email"></form:input>
						</div>
					</div>
					<div class="form-group row">

						<label class="col-2 col-form-label" for="password">Password: </label>
						<div class="col-10">
							<form:password class="form-control" id="password" path="password"></form:password>
						</div>
					</div>
					<div class="form-group row">

						<label class="col-2 col-form-label" for="repeatPassword">Repeat password: </label>
						<div class="col-10">
							<form:password class="form-control" id="repeatPassword" path="repeatPassword"></form:password>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-10 ml-auto">
							<button class="btn btn-sm btn-outline-success">Register</button>
							<a href="/login" class="btn btn-sm btn-outline-primary">Login</a>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>