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
		<h2>
			Welcome to Customer Home Page <span class="badge bg-danger ms-2">${sessionScope.user}</span>
		</h2>
		<ul class="nav">
			<li class="nav-item"><a class="nav-link"
				href="displayAllProductToCustomer.spring">Shopping</a></li>
			<li class="nav-item"><a class="nav-link"
				href="orderDetails/${sessionScope.user}.spring">View Order
					Details</a></li>
			<li class="nav-item"><a class="nav-link"
				href="balanceCheck/${sessionScope.user}.spring">Account Details</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="getQuotes/${sessionScope.user}.spring">Get Quote</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="viewQuotes/${sessionScope.user}.spring">View all Quotes</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="balanceCheck/${sessionScope.user}.spring">Get Balance</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="logout.spring">Logout</a>
			</li>
		</ul>
		<span style="color: red">${sessionScope.orderMsg} </span>
	</div>
</body>
</html>