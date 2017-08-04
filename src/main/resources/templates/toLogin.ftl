<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>四皇煎饼铺-登录</title>
</head>
<body>

<form action="/login" method="post">
    <label for="username">Username</label>:
    <input type="text" id="username" name="username" autofocus="autofocus" /> <br />
    <label for="password">Password</label>:
    <input type="password" id="password" name="password" /> <br />
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <input type="submit" value="Log in" />
</form>
</body>
</html>