
<%--When a user visits /login.jsp, they should see a form for logging in
    -have 'username' and 'password' fields
    -form should submit a POST request to /login.jsp
    -Inside of login.jsp write some code to check the submmitted values.
    -If the username submitted is "admin", and the password is "password",
        redirect the user to the profile page; otherwise, redirect back to the login form.--%>

<%@page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>

</head>
<body>
<%--<%@ include file="partials/navbar.jsp"%>--%>
<jsp:include page="partials/navbar.jsp" />
Sample login Example: Try with username as "admin" and password as "password" <br> <br>

<form action="#" method="post">
    Enter username :<input type="text" name="username"> <br>
    Enter password :<input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
%>

<c:set var="nm" value="<%=username %>"/>
<c:set var="psw" value="<%=password %>"/>

<c:choose>
    <c:when test ="${!(nm == null) || !(psw == null)}">
        <c:choose>
            <c:when test="${(nm == 'admin') && (psw == 'password') }">

             session.setAttribute("loggedInUser", nm);

                <c:redirect url="/profile.jsp"/>
        <%--        <p>Welcome, <c:out value="${nm }"/></p>--%>

            </c:when>

            <c:otherwise>
                <c:redirect url="/login.jsp"/>
            </c:otherwise>
        </c:choose>
    </c:when>

</c:choose>


</body>
</html>

