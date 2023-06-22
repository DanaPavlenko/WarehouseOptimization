<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class = "row">
<div class="col-12 text-center">
<sec:authorize access="hasAuthority('ADMIN')">
<a href = "/admin">Admin</a>
</sec:authorize>

<sec:authorize access="hasAuthority('WORKER')">
<a href = "/worker">Worker</a>
</sec:authorize>
<sec:authorize access="isAnonymous()">
<a href = "/login">Login</a>
<a href = "/registration">Registration</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
<form:form action="/logout">
<button>Logout</button>
</form:form>
</sec:authorize>
</div>
</div>
</body>
</html>