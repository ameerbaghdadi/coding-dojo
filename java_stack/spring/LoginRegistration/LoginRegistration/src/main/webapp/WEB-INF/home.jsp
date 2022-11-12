<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<div class="d-flex justify-content-between mt-5 w-50 mx-auto">
<div>
 	<h6>Hello, ${thisUser.userName}. Welcome to..</h6>
  	<h1>The Book Broker!</h1>
	<h6>Available Books to Borrow</h6>
</div>
<div>
	<p><a href="/logout">Logout</a></p>
	<p><a href="/books/new">+ Add a to my shelf!</a></p>
</div>
</div>

<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Title</th>
      <th scope="col">Author Name</th>
      <th scope="col">Owner</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="b" items="${withOutBorrow}">
    	<tr>
      		<td>${b.id}</td>
      		<td><a href="/books/${b.id}">${b.title}</a></td>
      		<td>${b.author}</td>
      		<td>${b.user.userName}</td>
      		<td>
      		<c:choose>
      			<c:when test = "${user_id == b.user.id}">
      				<a href="/books/${b.id}/edit">Edit</a>
      		 		<a href="/delete/books/${b.id}">Delete</a>
         		</c:when>
         		<c:otherwise>
            		<a href="/borrow/book/${b.id}">Borrow</a>
         		</c:otherwise>
         		</c:choose>
      		</td>
       </tr>
     </c:forEach>
  </tbody>
</table>

<div class=" mx-auto mt-5 w-50">
<h6>Books I'm Borrowing..</h6>

<table class="table table-striped mx-auto mt-2">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Title</th>
      <th scope="col">Author Name</th>
      <th scope="col">Owner</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="b" items="${books}">
    	<c:if test="${user_id == b.borrower.id}">
    	<tr>
      		<td>${b.id}</td>
      		<td><a href="/books/${b.id}">${b.title}</a></td>
      		<td>${b.author}</td>
      		<td>${b.user.userName}</td>
      		<td>
          		<a href="/return/book/${b.id}">Return</a>
      		</td>
       </tr>
       </c:if>
     </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>