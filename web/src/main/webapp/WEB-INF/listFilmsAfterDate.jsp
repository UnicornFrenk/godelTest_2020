<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>After Date</title>
</head>
<body>


<table border="2">

    <tr>
        <td>FirstName</td>
        <td>LastName</td>
        <td>BirthDate</td>
        <td width="150" align="center">filmName</td>
        <td width="150" align="center">releaseDate</td>
        <td width="150" align="center">genre</td>
    </tr>
    <c:forEach items="${films}" var="film">

        <tr>
            <td>${film.firstName}</td>
            <td>${film.lastName}</td>
            <td>${film.birthDate}</td>
            <td width="150" align="center">${film.filmName}</td>
            <td width="150" align="center">${film.releaseDate}</td>
            <td width="150" align="center">${film.genre}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
