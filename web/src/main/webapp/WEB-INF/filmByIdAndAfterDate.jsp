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
    <title>Title</title>
</head>
<body>

<p>Input Director id and release date</p>
<form method="post"
      action="${pageContext.request.contextPath}/filmByIdAndAfterDate">
    <p>
        <input type="date" name="date" value="1901-12-12"
               max="2012-11-11" min="1900-12-12">
        <input type="submit" value="Отправить"></p>
    <p><input type="number" name="id" min="1" max="4"
              value="1"></p>
</form>


</body>
</html>
