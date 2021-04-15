<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task2</title>
</head>
<body>

    <h1>The actors who played a role in a film with the chosen actor</h1>
    <table width="100%" border="1">
        <tr>
            <td>Actor</td>
            <td>Films</td>
        </tr>
        <c:forEach var="actor" items="${requestScope.commonActors}">
            <tr>
                <td><c:out value="${actor.name}"/></td>
                <td>
                    <c:forEach var="film" items="${actor.films}">
                        <c:out value="${film.name}, "/>
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <form action="index.jsp">
        <input type="submit" value="Main Menu" />
    </form>
</body>
</html>