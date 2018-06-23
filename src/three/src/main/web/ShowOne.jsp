<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователь</title><link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="style/main.css">
</head>
<body>
<div class="center">
    <div class="wrapper">
        <h1>Вывод пользователя по номеру телефона: </h1>
        <form method="post" action="/showOneUser">
            <div class="form-group">
                <label for="phoneUS">Телефон пользователя, которого надо вывести</label>
                <input type="text" class="form-control" id="phoneUS" placeholder="Enter phone edited user" name="phoneUS">
            </div>
            <button type="submit" class="btn btn-primary">show</button>
        </form>
    </div>
</div>
</body>
</html>
