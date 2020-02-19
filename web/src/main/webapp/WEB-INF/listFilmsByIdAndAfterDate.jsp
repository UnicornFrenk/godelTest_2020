<%--
  Created by IntelliJ IDEA.
  User: tanya_melgui
  Date: 20.02.20
  Time: 0:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
