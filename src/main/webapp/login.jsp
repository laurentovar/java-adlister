
<%--When a user visits /login.jsp, they should see a form for logging in
    -have 'username' and 'password' fields
    -form should submit a POST request to /login.jsp
    -Inside of login.jsp write some code to check the submmitted values.
    -If the username submitted is "admin", and the password is "password",
        redirect the user to the profile page; otherwise, redirect back to the login form.--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
Sample login Example (try with username as "admin" and password as "admin" without quart ) <br> <br>
<form action="LoginContriller" method="post">
    Enter username :<input type="text" name="username"> <br>
    Enter password :<input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>

</body>
</html>




















<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP Login</title>--%>
<%--    <style type="text/css">--%>
<%--        <%@include file="./resources/static/css/general.css" %>--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<%@ include file="partials/banner.jsp" %>--%>
<%--<%@ include file="partials/side_nav.jsp" %>--%>
<%--<c:choose>--%>
<%--    <c:when test="${param.username == 'admin' && param.password == 'password'}">--%>
<%--        <c:redirect url="./profile.jsp">--%>
<%--            <c:param name="username" value="${param.username}"></c:param>--%>
<%--            <c:param name="password" value="${param.password}"></c:param>--%>
<%--        </c:redirect>--%>
<%--        &lt;%&ndash;             A FORWARD IS BETTER: <jsp:forward page="./profile.jsp"/>&ndash;%&gt;--%>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--        <h1>User Login</h1>--%>
<%--        <h2>Username: ${param.username}</h2>--%>
<%--        <h2>Password: ${param.password}</h2>--%>
<%--        <form method="post" action="./login.jsp">--%>
<%--            <label for="uname"><b>Username</b></label>--%>
<%--            <input type="text" placeholder="Enter Username" id="uname" name="username" required><br><br>--%>
<%--            <label for="pwd"><b>Password</b></label>--%>
<%--            <input type="password" placeholder="Enter Password" id="pwd" name="password" required>--%>
<%--            <br><br>--%>
<%--            <button type="submit">Login</button>--%>
<%--        </form>--%>
<%--    </c:otherwise>--%>
<%--</c:choose>--%>
<%--</body>--%>
<%--</html>--%>