<%-- 
    Document   : navbar_part_page
    Created on : Jan 16, 2023, 9:15:18 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header style="background-color: aqua">

            <form action="navbar" method="POST">
                <c:if test="${sessionScope.account != null}">
                    <h1 style="display: inline-block">Welcome ${sessionScope.user.tenKH} and ${sessionScope.account.ngayTao}-</h1>
                    <button type="submit" name="button" value="logout">Logout</button>
                    <c:set var="isLogin" value="${true}" scope="session"/>
                </c:if>
                <c:if test="${sessionScope.account == null}">
                    <button type="submit" name="button" value="login">Login</button>
                    <button type="submit" name="button" value="register">Register</button>
                    <c:set var="isLogin" value="${false}" scope="session"/>
                </c:if>
            </form>
            <c:if test="${sessionScope.account != null}">
            </c:if>
        </header>
    </body>
</html>
