<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="styles.css"/>
</head>
<body>
<div class="container">
<ul class="nav">
  <li class="nav-item">
    <a class="nav-link" href="customerDashboard.spring">Dashboard</a>
  </li>
 </ul>
<h3>Order Summary</h3>
<table border="1" class="table">
	<tr>
		<th>Quote ID</th>
		<th>MonthlyPremium</th>
		<th>DwellingCoverage</th>
		<th>PersonalProperty</th>
		<th>Medicalexpense</th>
	</tr>
	<core:forEach items="${sessionScope.quoteDetails}" var="orders">
 		<tr>
			<td>${orders.Id}</td>
			<td>${orders.MonthlyPremium}</td>
			<td>${orders.DwellingCoverage}</td>
			<td>${orders.PersonalProperty}</td>
			<td>${orders.amount}</td>
		</tr>
</core:forEach>
</table>
</div>
</body>
</html>