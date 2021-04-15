<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

    <h1>The film with the most actors(<c:out value="${requestScope.theBiggestFilm.actors.size()}"/>): </h1>
    <c:out value="${requestScope.theBiggestFilm.name}"/>
    <h1>Actors of this film:</h1>
    <c:forEach var="actor" items="${requestScope.theBiggestFilm.actors}">
        <c:out value="${actor.name}"/><br>
    </c:forEach>
    <br>
    <form action="index.jsp">
        <input type="submit" value="Main Menu" />
    </form>
</body>
</html>