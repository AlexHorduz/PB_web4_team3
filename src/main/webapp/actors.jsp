<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actors</title>
</head>
<body>
    <c:forEach var="actor" items="${sessionScope.actors}">
        <c:out value="${actor}"/>
    </c:forEach>
</body>
</html>
