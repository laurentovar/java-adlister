
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log out</title>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="You logged out" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>You logged out</h1>
    <form action="logout.jsp" method="POST">

        <input type="submit" class="btn btn-primary btn-block" value="Back">
    </form>
</div>
</body>
</html>