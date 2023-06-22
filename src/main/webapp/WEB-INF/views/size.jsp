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
<title>Size</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form:form action="/admin/size" method="POST" modelAttribute="size">
				 <div class="row">
						<div class="col-10 ml-auto" style="color: red;">
							<form:errors path="length"></form:errors>
						</div>
					</div> 
					<div class="row">
						<div class="col-10 ml-auto" style="color: red;">
							<form:errors path="width"></form:errors>
						</div>
					</div> 
					<div class="row">
						<div class="col-10 ml-auto" style="color: red;">
							<form:errors path="height"></form:errors>
						</div>
					</div> 
					<div class="form-group row">
						<label class="col-2 col-form-label" for="length">Length: </label>
						<div class="col-10">
							<form:input class="form-control" id="length" path="length"/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="width">Width: </label>
						<div class="col-10">
							<form:input class="form-control" id="width" path="width"/>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="height">Height: </label>
						<div class="col-10">
							<form:input class="form-control" id="height" path="height"/>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-10 mr-left">
							<button class="btn btn-sm btn-outline-success">Save</button>
							<a href="/admin/size/cancel" class="btn btn-sm btn-outline-warning">Cancel</a>
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<tr>
						<th class="text-center">Length</th>
						<th class="text-center">Width</th>
						<th class="text-center">Height</th>
						<th class="text-center">Options</th>
					</tr>
					<c:forEach var="size" items="${sizes}">
						<tr>
							<td>${size.length}</td>
							<td>${size.width}</td>
							<td>${size.height}</td>
							<td class="text-center">
							<a href="/admin/size/update/${size.id}" class="btn btn-outline-warning btn-sm">Update</a>
                            <a href="/admin/size/delete/${size.id}" class="btn btn-outline-danger btn-sm">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>