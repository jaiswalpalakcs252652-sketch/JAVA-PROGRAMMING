<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Display Records</title>
</head>
<body>

<h2>All User Records</h2>

<table border="1" cellpadding="10">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Username</th>
    <th>Password</th>
    <th>Email</th>
</tr>

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/student_db",
        "root",
        "root"
    );

    Statement st = con.createStatement();

    ResultSet rs = st.executeQuery("SELECT * FROM users");

    while (rs.next()) {
%>

<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("username") %></td>
    <td><%= rs.getString("password") %></td>
    <td><%= rs.getString("email") %></td>
</tr>

<%
    }

    con.close();

} catch (Exception e) {
    out.println(e);
}
%>

</table>

</body>
</html>