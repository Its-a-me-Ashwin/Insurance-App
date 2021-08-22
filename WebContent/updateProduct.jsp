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
    <a class="nav-link" href="adminDashboard.spring">Dashboard</a>
  </li>
 </ul>
<form action="updateSelectedProduct.spring" method="get">
<div class="form-outline mb-2">
    <label class="form-label">Please enter the product id to search product</label>
    <input type="text" name="pid" class="form-control" required/>    
</div>
<input type="submit" class="btn btn-outline-primary" value="Update Product"/>
<input type="reset" class ="btn btn-outline-light" value="Reset"/>

</form>

<br/>

<span style="color:red">${sessionScope.pmsg}</span>

<core:if test="${sessionScope.productInfo != null}">
	<form action="updateProdcut.spring" method="post">
	<div class="form-outline mb-2">
    <label class="form-label">Product Id</label>
    <input type="text" name="pid" class="form-control" value="${sessionScope.productInfo.pid}" readonly/>    
	</div>
	
	<div class="form-outline mb-2">
    <label class="form-label">Product Name</label>
    <input type="text" name="productName" class="form-control" value="${sessionScope.productInfo.productName}" readonly/>    
	</div>
	
	<div class="form-outline mb-2">
    <label class="form-label">Product Price</label>
    <input type="text" name="productPrice" class="form-control" value="${sessionScope.productInfo.productPrice}"/>    
	</div>
	
	<div class="form-outline mb-2">
    <label class="form-label">Product Quantity</label>
    <input type="text" name="productQuantity" class="form-control" value="${sessionScope.productInfo.productQuantity}"/>    
	</div>
	<input type="submit" class="btn btn-outline-primary" value="Update Product"/>
	<input type="reset" class ="btn btn-outline-light" value="Reset"/>
	</form>
</core:if>
<span style="color:red">${sessionScope.productUpdateMsg}</span>
</div>
</body>
</html>