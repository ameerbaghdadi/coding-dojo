<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
    <div class="your-gold">
        <label>Your Gold</label>
        <input type="number" value= "${count}" id="yourGold">
    </div>
    <div class="container">
        <div class="farm" id="div-style">
            <h3>Farm</h3>
            <p>(earns 10-20 gold)</p>
            <form action = '/process_money' method="post">
                <input type="hidden" name = "place" value="farm">
                <input type="submit" name="find_gold" value="Find Gold!" class="submit">
            </form>
        </div>
        <div class="cave" id="div-style">
            <h3>Cave</h3>
            <p>(earns 10-20 gold)</p>
            <form action = '/process_money' method="post">
                <input type="hidden" name = "place" value="cave">
                <input type="submit" name="find_gold" value="Find Gold!" class="submit">
            </form>
        </div>
        <div class="house" id="div-style">
            <h3>House</h3>
            <p>(earns 10-20 gold)</p>
            <form action = '/process_money' method="post">
                <input type="hidden" name = "place" value="house">
                <input type="submit" name="find_gold" value="Find Gold!" class="submit">
            </form>
        </div>
        <div class="quest" id="div-style">
            <h3>Quest</h3>
            <p>(earns/takes 0-50 gold)</p>
            <form action = '/process_money' method="post">
                <input type="hidden" name = "place" value="quest">
                <input type="submit" name="find_gold" value="Find Gold!" class="submit">
            </form>
        </div>
    </div>
    <h2>Activities:</h2>
    <div class="activity">
        <p class="{{log.status}}">${message}</p>
    </div>
</body>
</html>