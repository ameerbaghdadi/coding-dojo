<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
    integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
    crossorigin="anonymous"></script>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center mt-3">New Product</h1>
<form:form action="/product" method="post" modelAttribute="product" class="mx-auto w-50 mt-5">
<h6><a href="/">Home</a></h6>
<hr>
    <div>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" class="form-control mt-3 mb-3"/>
    </div>
    <div>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:input path="description" class="form-control mt-3 mb-3"/>
    </div>
        <div>
        <form:label path="price">Price</form:label>
        <form:errors path="price"/>
        <form:input path="price" class="form-control mt-3 mb-3"/>
    </div>
    <input type="submit" value="Submit" class="btn btn-dark w-100"/>
</form:form>
</body>
</html>