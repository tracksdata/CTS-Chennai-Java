<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<h1>Welcome to Spring MVC</h1> <hr/>

<h3>Welcome  ${requestScope.empName} </h3>
<h3>Cities</h3>
<c:forEach var="city" items="${mycities}">
<li>${city}</li>
</c:forEach>
<hr/>
