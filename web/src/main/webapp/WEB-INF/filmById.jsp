<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Film By Director Id</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/filmById" method="post">

    <p>Input Director Id from 1 to 4</p>
    <p><input type="number" name="id" min="1" max="4"
              value="1"></p>

    <button type="submit">submit</button>

</form>


</body>
</html>
