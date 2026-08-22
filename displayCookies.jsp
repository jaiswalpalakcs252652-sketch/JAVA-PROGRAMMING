<%@ page import="jakarta.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Cookies</title>
</head>
<body>

    <h2>Cookies Stored on Client</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null && cookies.length > 0) {
%>

    <table border="1" cellpadding="10">
        <tr>
            <th>Cookie Name</th>
            <th>Cookie Value</th>
        </tr>

<%
        for (Cookie cookie : cookies) {
%>

        <tr>
            <td><%= cookie.getName() %></td>
            <td><%= cookie.getValue() %></td>
        </tr>

<%
        }
%>

    </table>

<%
    } else {
%>

    <h3>No cookies found.</h3>

<%
    }
%>

</body>
</html>