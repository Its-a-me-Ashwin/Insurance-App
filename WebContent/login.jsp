<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grocers Application System - Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>

	<div class="container"
		style="border: 2px solid black; padding: 30px; margin: 30px;">
		<form action="loginCheck.spring" method="post">
			<div class="form-group">
				<label for="email">Email address</label> <input type="email"
					class="form-control" id="email" name="email"
					aria-describedby="emailHelp"> <small id="emailHelp"
					class="form-text text-muted">We'll never share your email
					with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input name="password"
					type="password" class="form-control" id="password">
			</div>

			<div class="form-group">
				<label class="form-check-label" for="flexRadioDefault1">Type
					Of User</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="typeOfUser"
						id="typeOfUser1" value="admin" checked> <label
						class="form-check-label" for="typeOfUser1"> Admin </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="typeOfUser"
						id="typeOfUser2" value="customer"> <label
						class="form-check-label" for="typeOfUser2"> Customer</label>
				</div>
			</div>
			<input type="submit" class="btn btn-primary " value="Sign In" /> <input
				type="reset" class="btn btn-secondary" value="Reset" />
				<a href="customerSignUp.spring" class="btn btn-primary " >Sign Up</a>
		</form>
		<div>
			<span style="color: red">${requestScope.msg}</span>
		</div>

	</div>

</body>
</html>