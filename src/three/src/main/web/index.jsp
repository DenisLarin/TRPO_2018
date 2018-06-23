<%--
  Created by IntelliJ IDEA.
  User: denis__larin
  Date: 28.05.2018
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="style/main.css">
</head>
<body>
<div class="center">
    <div class="wrapper">
        <h1>Лабораторная работа №3</h1>
        <h2>Работу выполнил студент группы ИКБО-05-15 <span>Ларин Денис</span></h2>
        <div class="links">
            <a href="/showAllUsers" class="btn btn-primary">Показать всех пользователей</a>
            <a href="/adduser.jsp" class="btn btn-primary">Добавить нового пользователя</a>
            <a href="/editUser.jsp" class="btn btn-primary">Редактировать пользователя</a>
            <a href="/delete.jsp" class="btn btn-primary">Удалить пользователя</a>
            <a href="/ShowOne.jsp" class="btn btn-primary">Показать одного пользователя</a>

        </div>
    </div>
</div>
</body>
</html>
