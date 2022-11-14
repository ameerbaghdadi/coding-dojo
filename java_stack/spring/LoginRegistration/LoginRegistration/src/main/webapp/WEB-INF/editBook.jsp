<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
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
<meta charset="UTF-8">
<title>Login Reg.</title>
</head>
<body>
<div class="d-flex justify-content-around mt-5">
<div >
 <h1 class="text-center">Change your Entry</h1>
</div>
<div>
<p><a href="/home">Book to the shelves</a></p>
</div>
</div>
    <form:form action="/update/book/${thisBook.id}" method="post" modelAttribute="thisBook" class="mx-auto w-50 mt-5">
        <div class="form-group mt-3">
            <label>Title</label>
            <form:input path="title" class="form-control" />
            <form:errors path="title" class="text-danger" />
        </div>
        <div class="form-group mt-3">
            <label>Author</label>
            <form:input path="author" class="form-control" />
            <form:errors path="author" class="text-danger" />
        </div>
        <div class="form-group mt-3">
            <label>My thoughts</label>
            <form:textarea path="mythoughts" class="form-control" />
            <form:errors path="mythoughts" class="text-danger" />
        </div>
       
        <input type="submit" value="Submit" class="btn btn-primary mt-3"/>
    </form:form>
    <form:form action="/delete/books/${thisBook.id}" method="post" modelAttribute="newBook" class="mx-auto w-50">
       
        <input type="submit" value="Delete Book" class="btn btn-danger mt-3" />
    </form:form>

</body>
</html>