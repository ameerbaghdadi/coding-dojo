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
<title>Queries</title>
</head>
<body>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Country Name</th>
      <th scope="col">Language</th>
      <th scope="col">Percentage</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${one}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
            <td>${row[2]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Country Name</th>
      <th scope="col">Count</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${tow}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">City Name</th>
      <th scope="col">Population</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="row" items="${three}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
            
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Country Name</th>
      <th scope="col">Language</th>
      <th scope="col">Percentage</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${four}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
            <td>${row[2]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Country Name</th>
      <th scope="col">Surface Area</th>
      <th scope="col">Population</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${five}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
            <td>${row[2]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Country Name</th>
      <th scope="col">Government Form</th>
      <th scope="col">Surface Area</th>
      <th scope="col">Life Expectancy</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${six}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
            <td>${row[2]}</td>
            <td>${row[3]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Country Name</th>
      <th scope="col">City Name</th>
      <th scope="col">District</th>
      <th scope="col">Population</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${seven}">                
        <tr>
        
        	<td>Argentina</td>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
            <td>${row[2]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>
<hr>
<table class="table table-striped w-50 mx-auto mt-5">
  <thead>
    <tr>
      <th scope="col">Region</th>
      <th scope="col">Count</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="row" items="${eight}">                
        <tr>
            <td>${row[0]}</td>
            <td>${row[1]}</td>
        </tr>
        </c:forEach>
  </tbody>
</table>

</body>
</html>

