<%
    String username = request.getParameter("username");

    session.setAttribute("username", username);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Session Created</title>
</head>
<body>

    <h2>Username stored in session successfully!</h2>

    <a href="getSession.jsp">View Username</a>

</body>
</html>