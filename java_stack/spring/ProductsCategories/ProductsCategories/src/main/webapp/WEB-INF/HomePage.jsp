<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1 class="text-center mt-3">Home Page</h1>

<h6 class="text-center mt-5"><a href="/products/new">New Product</a></h6>
<h6 class="text-center mt-3"><a href="/categories/new">New Category</a></h6>
<hr class="w-25 mx-auto">
<table class="table table-bordered w-25 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Products</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="p" items="${products}">
    	<tr>
      		<td>
      		<ul>
      		<li><a href="products/${p.id}">${p.name}</a></li>
      		</ul>
      		</td>
       </tr>
       </c:forEach>  
  </tbody>
</table>
<table class="table table-bordered w-25 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Categories</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="c" items="${categories}">
    	<tr>
      		<td>
      		<ul>
      		<li><a href="categories/${c.id}">${c.name}</a></li>
      		</ul>
      		</td>
       </tr>
       </c:forEach>
  </tbody>
</table>
</body>
</html>