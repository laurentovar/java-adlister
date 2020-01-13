<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />

<div class="container">
    <%--Say hello to whos logged in (admin ect..)--%>
    <h1>Welcome ${sessionScope["user"]}, nice to see you.</h1>
</div>

</body>
</html>