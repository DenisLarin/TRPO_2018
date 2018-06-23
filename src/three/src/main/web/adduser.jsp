<%--
  Created by IntelliJ IDEA.
  User: denis__larin
  Date: 29.05.2018
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить нового пользователя</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="style/main.css">
</head>
<body>
<div class="center">
    <div class="wrapper">
        <h1>Добавление нового пользователя: </h1>
        <form method="post" action="/AddNewUserServlet">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
            </div>
            <div class="form-group">
                <label for="surname">Surname</label>
                <input type="text" class="form-control" id="surname" placeholder="Enter Surname" name="surname">
            </div>
            <div class="form-group">
                <label for="phone">Phone</label>
                <input type="text" class="form-control" id="phone" placeholder="Enter phone" name="phone">
            </div>
            <button type="submit" class="btn btn-primary">add</button>
        </form>
    </div>
</div>

</body>
</html>
