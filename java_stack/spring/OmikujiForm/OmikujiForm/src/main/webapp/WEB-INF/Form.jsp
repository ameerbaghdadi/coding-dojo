<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
<title>Omikuji Form</title>
</head>
<body>
<h2>Send an Omikuji!</h2> 
    <form class="w-50 mx-auto" action="/form" method="post"> 
    
     <div class="form-group mt-3">
    <label for="formGroupExampleInput">Pick any number from 5 to 25</label>
    <input type="number" class="form-control w-25" id="formGroupExampleInput" name="number">
  </div>
    
    <div class="form-group mt-3">
    <label for="formGroupExampleInput">Enter the name of any city:</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="city">
  </div>
  
    <div class="form-group mt-3">
    <label for="formGroupExampleInput">Enter the name of any real person:</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="person">
  </div>
  
   <div class="form-group mt-3">
    <label for="formGroupExampleInput">Enter professional endeavor or hobby:</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="hoppy">
  </div>
  
  <div class="form-group mt-3">
    <label for="formGroupExampleInput">Enter any type of living thing.</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="living">
  </div>
 
  <div class="form-group mt-3">
    <label for="exampleFormControlTextarea1">Say something nice to someone:</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="nice"></textarea>
  </div>
  	<label for="exampleFormControlTextarea1" class="mt-2">Send and show a friend</label><br>
    <button type="submit" class="btn btn-primary mb-2 mt-4">Send</button>
</form>
</body>
</html>