<%-- 
    Document   : view_cart
    Created on : Jan 17, 2023, 5:33:27 PM
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
        <jsp:include page="navbar_part_page.jsp"/>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Publisher</th>
                    <th>Collection</th>
                    <th>Price${isLogin}</th>
                    <th>Publish date</th>
                    <th>Quantity</th>
                    <th>Action</th>
                </tr>
            </thead>
            <c:set var="listItems" value="${requestScope.cart}"/>
            <c:if test="${listItems == null}">
                <h2>No items in cart</h2>
            </c:if>
            <c:if test="${listItems != null}">
                <tbody>
                    <c:forEach var="item" items="${listItems}">
                    <form action="order">
                        <input type="hidden" name="id" value="${item.key.maTC}">
                        <input type="hidden" name="status" value="true">
                        <tr>
                            <td>${item.key.tenTC}</td>
                            <td>${item.key.loaiTC}</td>
                            <td>${item.key.maNPH}</td>
                            <td>${item.key.maBST}</td>
                            <td>${item.key.giaTien}</td>
                            <td>${item.key.ngayXuatBan}</td>
                            <td>${item.value}</td>
                            <td><button type="submit" name="button" value="-">-</button></td>                    
                            <td><button type="submit" name="button" value="+">+</button></td>                    
                            <td><button type="submit" name="button" value="remove">Remove</button></td>   

                        </tr>
                    </form>

                </c:forEach>
            </tbody>
        </c:if>
        
    </table>
    <form action="search_game">
        <button type="submit">Back to search</button>
    </form>
</body>
</html>
