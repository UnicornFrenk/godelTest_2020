<%--
  Created by IntelliJ IDEA.
  User: tanya_melgui
  Date: 20.02.20
  Time: 0:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>After Date</title>
</head>
<body>

<p>Input date</p>
<form method="post" action="${pageContext.request.contextPath}/filmAfterDate">
    <p>Date:
        <input type="date" name="date" value="1901-12-12"
               max="2012-11-11" min="1900-12-12">
        <input type="submit" value="Отправить"></p>
</form>


</body>
</html>
