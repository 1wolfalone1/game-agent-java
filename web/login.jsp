<%-- 
    Document   : login
    Created on : Jan 15, 2023, 4:32:12 PM
    Author     : ASUS
--%>
<%@taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LOGIN</h1>
            <form action="login" method="POST">
                Account: <input type="text" name="account" value="${param.account}" placeholder="Account name"><br>
                Password: <input type="password" name="password" value="${param.password}" placeholder="password"><br>
                <button type="submit" name="button" value="login">Login</button><br>
                <button type="submit" name="button" value="regiser">Sign up</button><br>
            </form>
                <h3>${requestScope.Invalid}</h3>
        
    </body>
</html>
