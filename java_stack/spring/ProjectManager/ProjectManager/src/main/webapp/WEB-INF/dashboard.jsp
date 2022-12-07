<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
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
			<h1>Welcome, ${thisUser.userName}!</h1>
			<br>

		</div>

		<div>
			<p>
				<a href="/logout">Logout</a>
			</p>
			<p>
				<form:form action="project/new" method="post"
					class="mx-auto w-50 mt-5">

					<input type="submit" value="+ new Project"
						class="btn btn-primary mt-3" />
				</form:form>
			</p>
		</div>
	</div>

	<div class=" mx-auto mt-5 w-50">
		<table class="table table-striped mx-auto mt-2">
			<h6>All Projects</h6>
			<thead>
				<tr>
					<th scope="col">Project</th>
					<th scope="col">Team Lead</th>
					<th scope="col">Due Date</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="var" items="${allProjectsNot}">
					<c:if test="${user_id != var.user.id}">
						<tr>
							<td><a href="/show/project/${var.id}">${var.title}</a></td>
							<td>${var.user.userName}</td>
							<td>${var.date}</td>
							<td><a href="/join/${var.id}">Join Team</a></td>
						</tr>
					</c:if>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class=" mx-auto mt-5 w-50">
		<table class="table table-striped mx-auto mt-2">
			<h6>Your Projects</h6>
			<thead>
				<tr>
					<th scope="col">Project</th>
					<th scope="col">Team Lead</th>
					<th scope="col">Due Date</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="var" items="${myProjects}">
					
						<tr>
							<td><a href="/books/${var.id}">${var.title}</a></td>
							<td>${var.user.userName}</td>
							<td>${var.date}</td>
							<td>
							<c:choose>
      							<c:when test = "${user_id == var.user.id}">
      								<a href="/projects/edit/${var.id}">Edit</a>
         						</c:when>
         						<c:otherwise>
            						<a href="/leave/team/${var.id}">Leave Team</a>
         						</c:otherwise>
         					</c:choose>
							</td>
						</tr>
					
				</c:forEach>
			</tbody>
		</table>
	</div>	
</body>
</html>