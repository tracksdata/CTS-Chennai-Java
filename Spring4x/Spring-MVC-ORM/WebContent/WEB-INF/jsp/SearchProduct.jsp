<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="/index.jsp" />

	<h2 align="center">Search Form</h2>
	<hr />
	<form action="findProd.htm">
		<table align="center">

			<tr>
				<th>Product Id</th>
				<td><input name="prodId" /></td>
				<td><input type="hidden" name="page" value="search" /></td>
			</tr>
			<tr>
				<th colspan="2">${msg}</th>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Search"></th>
			</tr>
			

		</table>


	</form>

	<c:if test="${product ne null }">
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Price</th>
		</tr>
		
		<tr>
			<td>${product.prodId}</td>
			<td>${product.prodName}</td>
			<td>${product.price}</td>
		</tr>

	</table>
	</c:if>
	

</body>
</html>