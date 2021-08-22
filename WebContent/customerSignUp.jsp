<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>

	<div class="container" style="border: 2px solid black; padding: 30px; margin: 30px;">
		<form action="customerCreate.spring" method="post">
			<div class="form-outline mb-2">
				<label class="form-label">First Name</label> <input type="text"
					name="firstName" class="form-control" required />
			</div>

			<div class="form-outline mb-2">
				<label class="form-label">Last Name</label> <input type="text"
					name="lastName" class="form-control" required />
			</div>

			<label class="form-check-label" for="flexRadioDefault1">Type
				Of User</label>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					value="male" /> <label class="form-check-label">Male</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					value="female" /> <label class="form-check-label">Female</label>
			</div>
			<div class="form-outline mb-2">
				<label class="form-label">DOB</label> <input type="date" name="dob"
					class="form-control" />
			</div>

			<div class="form-outline mb-2">
				<label class="form-label">PhoneNumber</label> <input type="number"
					name="phoneNumber" class="form-control" required />
			</div>

			<div class="form-outline mb-2">
				<label class="form-label">Email</label> <input type="email"
					name="email" class="form-control" required />
			</div>

			<div class="form-outline mb-2">
				<label class="form-label">Password</label> <input type="password"
					name="password" class="form-control" required />
			</div>


			<input type="submit" class="btn btn-outline-primary"
				value="Account Create" /> <input type="reset"
				class="btn btn-outline-light" value="Reset" />
		</form>
		<span style="color: red">${requestScope.msg}</span>

		<div>
			<a href="login.spring" class="link-info">Login</a>
		</div>

	</div>

</body>
</html>