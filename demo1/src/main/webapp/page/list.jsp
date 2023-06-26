<%--
  Created by IntelliJ IDEA.
  User: Mr Bang
  Date: 6/19/2023
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>

<%
  try {
    Context initCtx = new InitialContext();
    Context envCtx = (Context) initCtx.lookup("java:comp/env");
    DataSource ds = (DataSource) envCtx.lookup("jdbc/add_employee.jsp-list.jsp");

    Connection conn = ds.getConnection();

    String sql = "SELECT * FROM Employee";
    Statement statement = conn.createStatement();
    ResultSet rs = statement.executeQuery(sql);

    String.join("<html><head><title>Employee List</title></head><body>");
    String.join("<h1>Employee List</h1>");
    String.join("<table>");
    String.join("<tr><th>ID</th><th>Full Name</th><th>Birthday</th><th>Address</th><th>Position</th><th>Department</th></tr>");

    while (rs.next()) {
      int id = rs.getInt("ID");
      String fullName = rs.getString("FullName");
      Date birthday = rs.getDate("Birthday");
      String address = rs.getString("Address");
      String position = rs.getString("Position");
      String department = rs.getString("Department");

      String.join("<tr><td>" + id + "</td><td>" + fullName + "</td><td>" + birthday + "</td><td>" + address + "</td><td>" + position + "</td><td>" + department + "</td></tr>");
    }

    String.join("</table>");
    String.join("</body></html>");

    rs.close();
    statement.close();
    conn.close();
  } catch (Exception e) {
    String.join("An error occurred: " + e.getMessage());
  }
%>


