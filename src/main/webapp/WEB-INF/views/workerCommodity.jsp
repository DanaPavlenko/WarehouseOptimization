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
<title>Commodity</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form:form action="/worker/commodity" method="POST"
					modelAttribute="commodity">
					<div class="row">
						<div class="col-10 ml-auto" style="color: red;">
							<form:errors path="name"></form:errors>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="name">Name: </label>
						<div class="col-10">
							<form:input class="form-control" id="name" path="name" />
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="weight">Weight: </label>
						<div class="col-10">
							<form:input class="form-control" id="weight" path="weight" />
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="count">Count: </label>
						<div class="col-10">
							<form:input class="form-control" id="count" path="count" />
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="sales">Sales: </label>
						<div class="col-10">
							<form:input class="form-control" id="sales" path="sales" />
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
						<div class="col-10 mr-left">
							<button class="btn btn-sm btn-outline-success">Save</button>
							<a href="/worker/commodity/cancel"
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
						<th class="text-center">Weight</th>
						<th class="text-center">Count</th>
						<th class="text-center">Sales</th>
						<th class="text-center">Category</th>
						<th class="text-center">Length</th>
						<th class="text-center">Width</th>
						<th class="text-center">Height</th>
						<th class="text-center">Options</th>
					</tr>
					<c:forEach var="commodity" items="${commodities}">
						<tr>
							<td>${commodity.name}</td>
							<td>${commodity.weight}</td>
							<td>${commodity.count}</td>
							<td>${commodity.sales}</td>
							<td>${commodity.category}</td>
							<td>${commodity.size.length}</td>
							<td>${commodity.size.width}</td>
							<td>${commodity.size.height}</td>
							<td class="text-center"><a
								href="/worker/commodity/update/${commodity.id}"
								class="btn btn-outline-warning btn-sm">Update</a>
								</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>