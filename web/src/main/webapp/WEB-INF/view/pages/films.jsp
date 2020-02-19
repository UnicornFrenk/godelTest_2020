<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hellolo!</title>
</head>
<body>
<form>
    <table border="2">
        <tr>
            <td>ID</td>
            <td>FirstName</td>
            <td>LastName</td>
            <td>FilmName</td>
            <td>Genre</td>
            <td>ReleaseDate</td>

        </tr>
        <c:forEach films="${films}" var="films">
            <tr>
                <td>${films.id}</td>
                <td>${films.firstName}</td>
                <td>${films.lastName}</td>
                <td>${films.filmName}</td>
                <td>${films.genre}</td>
                <td>${films.releaseDate}</td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>