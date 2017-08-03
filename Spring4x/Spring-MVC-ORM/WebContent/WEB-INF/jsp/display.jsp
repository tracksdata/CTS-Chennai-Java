<jsp:include page="/index.jsp"/> <br/>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<h1>Product Saved to DB Successfully</h1> <hr/>

<h3>Product Id: ${product.prodId} </h3>
<h3>Product Name: ${product.prodName} </h3>
<h3>Price: ${product.price} </h3>

<hr/>