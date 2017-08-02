<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<h1>Welcome to Spring MVC</h1> <hr/>

<h3>Product : ${requestScope.prodName} </h3>
<h3>Cities</h3>
<c:forEach var="city" items="${mycities}">
<li>${city}</li>
</c:forEach>
<hr/>
<h3>Cities with java Code (Scriplets)</h3>
<%
   String[] cities= (String[]) request.getAttribute("mycities");

	for(String city:cities){
		out.println("<li>"+city+"</li>");
	}
%>