<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task1</title>
</head>
<body>
    <c:choose>
        <c:when test="${requestScope.isAnyUnemployedActor}">
            <c:out value="Yes, there is an actor who hasn't played a role in any film"/>
        </c:when>
        <c:otherwise>
            <c:out value="No, there isn't any actor who hasn't played a role in any film"/>
        </c:otherwise>
    </c:choose>
    <br>
    <br>
    <form action="index.jsp">
        <input type="submit" value="Main Menu" />
    </form>
</body>
</html>