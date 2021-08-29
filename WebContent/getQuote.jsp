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

	<div class="container">
		<ul class="nav">
			<li class="nav-item"><a class="nav-link"
				href="customerDashboard.spring">Dashboard</a></li>
		</ul>
		<h2>Add Product Details</h2>
		<form action="postQuotes.spring" method="post">
		
			<h2 id="part1">Your Address </h2>
			<a href="#part2"> Go to part 2 </a>
			<a href="#part3"> Go to part 3 </a>
			<div class="form-outline mb-2">
				<label class="form-label">Address 1</label> <input type="text"
					name="address1" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">Address 2</label> <input type="text"
					name="address2" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">State </label> <input type="text"
					name="state" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">city</label> <input type="text"
					name="city" class="form-control" required />
			</div>

			<div class="form-outline mb-2">
				<label class="form-label">zip</label> <input type="text"
					name="zip" class="form-control" required />
			</div>
			
			
			<!-- End of first -->
			
			<h2 id="part2"> About you </h2>
			<a href="#part1"> Go to part 1 </a>
			<a href="#part3"> Go to part 3 </a>
			
			<div class="form-outline mb-2">
				<label class="form-label">First Name</label> <input type="text"
					name="firstName" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">Last Name</label> <input type="text"
					name="lastName" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">Date of Birth</label> <input type="date"
					name="dob" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">SSID</label> <input type="text"
					name="ssid" class="form-control" required />
			</div>
			
			<!--  PART 3 here -->
			
			<h2 id="part3"> About your house </h2>
			<a href="#part1"> Go to part 1 </a>
			<a href="#part2"> Go to part 2 </a>
			
			<div class="form-outline mb-2">
				<label class="form-label">Value</label> <input type="number"
					name="value" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">Area</label> <input type="number"
					name="area" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">Roof</label> <input type="number"
					name="roof" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">No. of full baths</label> <input type="number"
					name="fullBaths" class="form-control" required />
			</div>
			
			<div class="form-outline mb-2">
				<label class="form-label">No. of half baths</label> <input type="number"
					name="halfBaths" class="form-control" required />
			</div>
			
			
			
			
			
			
			<input type="submit" class="btn btn-outline-primary"
				value="Store Product" /> <input type="reset"
				class="btn btn-outline-light" value="Reset" />
		</form>
		<span style="color: red">${requestScope.msg}</span>
	</div>
</body>
</html>