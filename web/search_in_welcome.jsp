<%-- 
    Document   : search_in_welcome
    Created on : Jan 15, 2023, 4:10:36 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          ${u}
        <jsp:include page="navbar_part_page.jsp"/>
        <form action="navigate_first_page">
            <input type="text" name="searchGame" value="${param.searchGame}" placeholder="Search game here">
            <button type="submit" name="button" value="search">Search</button>
        </form>
        <c:if test="${requestScope.listGame != null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Publisher</th>
                        <th>Collection</th>
                        <th>Price${isLogin}</th>
                        <th>Publish date
                        </th>
                        <c:if test="${isLogin}">
                            <th colspan="3">Action</th>                        

                        </c:if>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach var="game" items="${requestScope.listGame}">
                        <tr>
                            <td>${game.tenTC}</td>
                            <td>${game.loaiTC}</td>
                            <td>${game.maNPH}</td>
                            <td>${game.maBST}</td>
                            <td>${game.giaTien}</td>
                            <td>${game.ngayXuatBan}</td>
                            <c:if test="${isLogin}">
                                <td>
                                    <form action="order">
                                        <input type="hidden" name="search" value="${param.searchGame}">
                                        <input type="hidden" name="id" value="${game.maTC}">
                                        <button type="submit" name="button" value="+">Order</button> 
                                    </form>
                                </td>
                            </c:if>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>
        <c:if test="${isLogin}">
            <form action="cart">
                <button type="submit">View cart</button>
            </form>
        </c:if>
    </body>
</html>
