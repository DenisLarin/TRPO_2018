<%--
  Created by IntelliJ IDEA.
  User: denis__larin
  Date: 29.05.2018
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Удаление пользователя</title><link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="style/main.css">
</head>
<body>
<div class="center">
    <div class="wrapper">
        <h1>Удаления пользователя по номеру телефона: </h1>
        <form method="post" action="/deleteUser">
            <div class="form-group">
                <label for="phoneUS">Телефон пользователя, которого надо удалить</label>
                <input type="text" class="form-control" id="phoneUS" placeholder="Enter phone edited user" name="phoneUS">
            </div>
            <button type="submit" class="btn btn-primary">delete</button>
        </form>
    </div>
</div>
</body>
</html>
