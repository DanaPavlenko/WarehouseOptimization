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
<title>Block</title>
</head>
<body>
	<div class="container">
		<div class="col-12">
			<form:form action="/admin/block" method="POST" modelAttribute="block">
				<div class="row">
					<div class="col-10 ml-auto" style="color: red;">
						<form:errors path="name"></form:errors>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-2 col-form-label" for="name">Name: </label>
					<div class="col-10">
						<form:input class="form-control" id="name" path="name"></form:input>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-2 col-form-label" for="size">Size: </label>
					<div class="col-10">
						<form:select path="size" id="size" class="form-control">
							<form:options items="${sizes}" itemLabel="fullSize"
								itemValue="id" />
						</form:select>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-2 col-form-label" for="zone">Zone: </label>
					<div class="col-10">
						<form:select path="zone" id="zone" class="form-control">
							<form:options items="${zones}"></form:options>
						</form:select>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-2 col-form-label" for="commodity">Commodity:
					</label>
					<div class="col-10">
						<form:select path="commodity" items="${commodities}"
							class="form-control" />
					</div>
				</div>

				<div class="form-group row">
					<div class="col-10 mr-left">
						<button class="btn btn-sm btn-outline-success">Save</button>
						<a href="/admin/block/cancel"
							class="btn btn-sm btn-outline-warning">Cancel</a>
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<div class="row">
		<div class="col-12">
			<table class="table table-bordered">
				<tr>
					<th class="text-center">Name</th>
					<th class="text-center">Length</th>
					<th class="text-center">Width</th>
					<th class="text-center">Height</th>
					<th class="text-center">Zone</th>
					<th class="text-center">Commodity</th>
					<th class="text-center">Options</th>
				</tr>
				<c:forEach var="block" items="${blocks}">
					<tr>
						<td>${block.name}</td>
						<td>${block.length}</td>
						<td>${block.width}</td>
						<td>${block.height}</td>
						<td>${block.zone}</td>
						<td>${block.commodity}</td>
						<td class="text-center"><a
							href="/admin/block/update/${block.id}"
							class="btn btn-outline-warning btn-sm">Update</a> <a
							href="/admin/block/delete/${block.id}"
							class="btn btn-outline-danger btn-sm">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	</div>
</body>
</html>