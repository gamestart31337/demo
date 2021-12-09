<html>
<head>
    <title>Admin</title>
</head>
<body>
<%
    if (session.getAttribute("email") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<h1>Welcome to the admin console!</h1>
</body>
</html>
