<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Update Form</h2> <hr/>
	<form:form action="updateProduct.htm" commandName="p1">
		<table>

			<tr>
				<td>Product Id</td>
				<td><form:input path="prodId" /></td>
			</tr>
			
			
			<tr>
				<td>Product Name</td>
				<td><form:input path="prodName" /></td>
			</tr>
			
			
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Choose City</td>
				<td>
				
					<form:select path="cityName">
						<form:options items="${mycities}"/>
					
					</form:select>
					
				</td>
				
				<tr>
					<td>Choose Cities</td>
					<td>
					<form:checkboxes items="${mycities}" path="cityName"/>
					</td>
				</tr>
			
				<tr>
					<td>Choose City</td>
					
					<td>
					
						<form:radiobuttons path="cityName" items="${mycities}"/>
					</td>
				
				</tr>

		<tr>
			<th colspan="2">
				<input type="submit" value="Update"/>
			</th>
		</tr>

		</table>

	<hr/>

	</form:form>





</body>
</html>