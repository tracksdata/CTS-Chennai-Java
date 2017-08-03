<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<jsp:include page="/index.jsp"/>
<h3 align="center">Product Form</h3><hr/>
	<form action="saveProduct_v1.htm">
		<table cellpadding="5" cellspacing="4" align="center">
		
		<tr>
			<td>Product Id</td>
			<td><input type="text" name="prodId"/>
		</tr>

		<tr>
			<td>Product Name</td>
			<td><input type="text" name="prodName"/>
		</tr>

		<tr>
			<td>Price</td>
			<td><input type="text" name="price"/>
		</tr>

		<tr>
			<th colspan="2">
				<input type="submit" value="Save"/>
			</th>
		</tr>

		</table>
	</form>

<hr/>




</body>
</html>