<%--
  Created by IntelliJ IDEA.
  User: laurentovar
  Date: 1/7/20
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile page</title>
</head>
<body>
    <h2>
        <%
            String x = session.getAttribute("username").toString();
            System.out.println("Hello " + x);
        %>
    </h2>



</body>
</html>
