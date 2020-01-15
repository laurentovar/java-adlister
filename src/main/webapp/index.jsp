<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Landing Page" %></title>
    <style type="text/css">
        <%@include file="./resources/static/css/general.css" %>
    </style>
</head>
<body>
    <%@ include file="partials/side_nav.jsp" %>
    <%@ include file="partials/banner.jsp" %>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
