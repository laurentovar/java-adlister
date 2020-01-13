<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session</title>
</head>
<body>
    <h1>This is the session JSP</h1>

    <%--Request/--%>
    <h2><c:out value="${requestScope.reqAt}"/> </h2>
    <h2><c:out value="${sessionScope.setAt}"/> </h2>
    <h2><c:out value="${applicationScope.conAt}"/> </h2>

    <h1></h1>
    <h2>This is how to get session date: <c:out value="${sessionScope.theName}"/> </h2>

    <h2>You have  <c:out value="${sessionScope.cart.numItems}"/> items in your cart </h2>

    <h3><% request.getSession().getMaxInactiveInterval(); %></h3>
    <p>Timeout in sec ${pageContext.session.maxInactiveInterval}</p>


</body>
</html>
