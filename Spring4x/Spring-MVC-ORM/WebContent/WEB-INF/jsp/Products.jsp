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
<jsp:include page="/index.jsp"/>
<h2 align="center">Products</h2> <hr/>
<table border="1" align="center" cellpadding="5" cellspacing="5">

	<tr>
		<th>Sno</th>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Price</th>
	</tr>
	
	
	
		<c:forEach items="${products}" var="prod" varStatus="mc">
			<tr>
				<td>${mc.count}</td>
				<td>${prod.prodId}</td>
				<td>${prod.prodName}</td>
				<td>${prod.price}</td>	
			</tr>
	
			
		</c:forEach>
	

</table>

</body>
</html>