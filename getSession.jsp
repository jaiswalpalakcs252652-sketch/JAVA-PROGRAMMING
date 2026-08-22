<!DOCTYPE html>
<html>
<head>
    <title>Display Session</title>
</head>
<body>

<%
    String username = (String) session.getAttribute("username");

    if (username != null) {
%>

        <h2>Welcome, <%= username %>!</h2>

<%
    } else {
%>

        <h2>Username session variable not found.</h2>

<%
    }
%>

</body>
</html>