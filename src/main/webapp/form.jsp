<html>
<head>
    <title>CSRF</title>
</head>
<body>
    <h1>CSRF demo</h1>
    <form action="/sastTest/csrf" method="post">
        <input placeholder="Enter your first name" type="text" name="firstName" value=""><br>
        <input placeholder="Enter your last name" type="text" name="lastName" value=""><br>
        <input type="submit">
    </form>
    <h2>You have entered</h2>
    <b>${firstName} & ${lastName}</b>
</body>
</html>
