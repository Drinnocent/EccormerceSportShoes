<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	background-image: url("/images/shoes.jpg");
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #04AA6D;
	color: white;
}

.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

.button2 {
	background-color: red;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}

.mydiv {
	margin: 0 auto;
	padding: 20px;
	width: 33%;
	float: left;
}
</style>
</head>
<body>
	<div class="topnav">
		<a class="active" href="#home">Home</a> <a href="#news">News</a> <a
			href="#contact">Contact</a> <a href="#about">About</a>
	</div>
	<div class="mydiv">
		<form action="orderByBrand" style="float: left">
			<button class="button">SORT BY BRAND</button>
		</form>
		<form action="orderByDate" style="float: left">
			<button class="button">SORT BY DATE</button>
		</form>
	</div>
	<div class="w3-container" style="padding-left: 16px">
		<h2>Users Page</h2>
		<table class="w3-table-all">
			<thead>
				<tr class="w3-light-grey w3-hover-red">
					<th>ID</th>
					<th>FIRSTNAME</th>
					<th>LASTNAME</th>
					<th>GENDER</th>
					<th>PHONE</th>
					<th>CATEGORY</th>
					<th>BRAND</th>
					<th>DATE</th>
				</tr>
			</thead>
			<c:forEach var="user" items="${userslist}">
				<tr class="w3-hover-blue">
					<td>${user.id}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.gender}</td>
					<td>${user.phone}</td>
					<td>${user.category}</td>
					<td>${user.brand}</td>
					<td>${user.buyingDate}</td>

				</tr>
			</c:forEach>
		</table>
	</div>
	<h2>Search User</h2>
	<div class="container">
		<form action="searchUser">
			<div class="row">
				<div class="col-25">
					<label for="fname">Delete By ID</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="name" placeholder="Your id">
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
	<h2>Delete Products</h2>
	<div class="container">
		<form action="deleteUser">
			<div class="row">
				<div class="col-25">
					<label for="fname">Delete By ID</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="id" placeholder="Your id">
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
</body>
</html>
