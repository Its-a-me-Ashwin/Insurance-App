<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
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
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="container">

		<ul class="nav">
			<li class="nav-item"><a class="nav-link"
				href="shoppingcart/shopping.spring">Processed for Cart</a></li>
			<li class="nav-item"><a class="nav-link"
				href="customerDashboard.spring">Dashboard</a></li>
		</ul>

		<core:forEach items="${sessionScope.allProductToCustomer}"
			var="product">
			<div class="imageClass">
				<form action="shoppingcart/ordernow.spring">
					<img src="${product.productUrl}" width="100px" height="100px"
						class="img-responsive" /><br />

					<div>
						<input type="text" name="pid" value="${product.pid}" hidden="true" />
					</div>
					<h3>
						Name <span class="badge bg-info">${product.productName}</span>
					</h3>
					<h3>
						Price <span class="badge bg-info">${product.productPrice}</span>
					</h3>

					<div class="form-outline mb-2">
						<label class="form-label">Product Quantity</label> <input
							type="number" name="quantity" min="1" value="1"
							class="form-control" />
					</div>
					<input type="submit" class="btn btn-outline-danger"
						value="Add to Cart" />
				</form>
			</div>
		</core:forEach>
	</div>
</body>
</html>