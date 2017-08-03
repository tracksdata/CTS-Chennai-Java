<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
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
	<form:form action="findProd.htm" commandName="ids">
		<table align="center">

			<tr>
				<th>Product Id</th>
				<td>
					<form:select path="prodId">
						<form:options items="${ids}"/>
					</form:select>
				
				  </td>
				<td><input type="hidden" name="page" value="search" /></td>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Search"></th>
			</tr>

		</table>


	</form:form>

</body>
</html>