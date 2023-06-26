<%--
  Created by IntelliJ IDEA.
  User: Mr Bang
  Date: 6/19/2023
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>

<%
    // Retrieve the form data
    String fullName = request.getParameter("fullName");
    String birthday = request.getParameter("birthday");
    String address = request.getParameter("address");
    String position = request.getParameter("position");
    String department = request.getParameter("department");

    // Save the employee information to the database
    try {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource ds = (DataSource) envCtx.lookup("jdbc/employee");

        Connection conn = ds.getConnection();

        String sql = "INSERT INTO Employee (FullName, Birthday, Address, Position, Department) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, fullName);
        statement.setString(2, birthday);
        statement.setString(3, address);
        statement.setString(4, position);
        statement.setString(5, department);

        statement.executeUpdate();

        statement.close();
        conn.close();

        response.sendRedirect("list.jsp"); // Redirect to the employees list page
    } catch (Exception e) {
        String.join("An error occurred: " + e.getMessage());
    }
%>
