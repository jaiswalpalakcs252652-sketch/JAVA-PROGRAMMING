<%@ page import="jakarta.servlet.http.Cookie" %>

<%
    String username = request.getParameter("username");

    Cookie cookie = new Cookie("username", username);
    cookie.setMaxAge(60 * 60 * 24);   // Cookie valid for 1 day

    response.addCookie(cookie);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Created</title>
</head>
<body>

    <h2>Username stored in cookie successfully!</h2>

    <a href="getCookie.jsp">View Username</a>

</body>
</html>