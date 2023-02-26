<%-- 
    Document   : register
    Created on : Jan 15, 2023, 4:57:17 PM
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
        <c:url var="u" value="asdfsdf" scope="application"/>
        <h1>Create account</h1>
        <c:set var="error" value="${requestScope.error}"/>   
        <c:set var="u" value=""/>
        <form action="register" method="POST">
            Account: <input type="text" name="accName" value="${param.accName}">${error.maTK}<br>
            Fullname: <input type="text" name="name" value="${param.name}">${error.tenKH}<br>
            Password: <input type="password" name="password" value="${param.password}">${error.matKhau}<br>
            ID card number: <input type="text" name="ID" value="${param.ID}">${error.soCMND}<br>
            Email: <input type="email" name="email" value="${param.email}">${error.email}<br>
            Gender:<br>${error.gioiTinh}
            <input type="radio" name="gender" value="nam"> nam<br>
            <input type="radio" name="gender" value="nu"> nu<br>
            Birthdate: <input type="date" name="birth_date" value="${param.birth_date}">${error.ngaySinh} + <br>
            Region: 
            <select name="region">${error.maTK}
                <c:forEach var="region" items="${requestScope.list}">
                    <option value="${region.maVung}">${region.tenVung}</option>
                </c:forEach>
            </select><br>
            <button type="submit" name="button" value="submitRegis">Sign up</button>
            ${requestScope.megg}
        </form>
    </body>
</html>
