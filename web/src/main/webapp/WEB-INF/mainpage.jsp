<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добро пожаловать, JSP!</title>
</head>
<body>
<h1>Добро пожаловать!</h1>

<a href="${pageContext.request.contextPath}/filmById">Select films by director id</a>
<a href="${pageContext.request.contextPath}/filmAfterDate">Select films after
    date</a>
<a href="${pageContext.request.contextPath}/filmByIdAndAfterDAte">Select films
    by
    director id and after date</a>

</body>
</html>