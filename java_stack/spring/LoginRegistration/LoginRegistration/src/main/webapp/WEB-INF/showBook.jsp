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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="d-flex justify-content-around mt-5">
<div >
  <h1>${thisBook.title}</h1>
</div>
<div>
<p><a href="/bookmarket">back to the shelves</a></p>
</div>
</div>
<div class="w-50 mx-auto mt-5">
  <h6><span class="text-danger">${thisBook.user.userName} </span>read <span class="text-warning">${thisBook.title} </span>by <span class="text-success">${thisBook.author}</span>.</h6>
  <p>Here are ${thisBook.user.userName} thoughts:</p>
  <hr>
  <p>${thisBook.mythoughts}</p>
  <hr>
  <c:if test="${user_id == thisBook.user.id}">
  <div class="d-flex w-25">
  <form:form action="/books/${thisBook.id}/edit" method="post" modelAttribute="newBook" class="mx-auto w-50">
      
        <input type="submit" value="Edit" class="btn btn-primary mt-3" />
    </form:form>
    <form:form action="/delete/books/${thisBook.id}" method="post" modelAttribute="newBook" class="mx-auto w-50">
       
        <input type="submit" value="Delete" class="btn btn-danger mt-3" />
    </form:form>
    </div>
  </c:if>
</div>

</body>
</html>