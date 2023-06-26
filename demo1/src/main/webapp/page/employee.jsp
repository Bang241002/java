<%--
  Created by IntelliJ IDEA.
  User: Mr Bang
  Date: 6/19/2023
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
</head>
<script>
    function resetForm() {
        document.getElementById("fullName").value = "";
        document.getElementById("birthday").value = "";
        document.getElementById("address").value = "";
        document.getElementById("position").value = "";
        document.getElementById("department").value = "";
    }
</script>

<body>
<h1>Add Employee</h1>
<form action="addEmployee.jsp" method="post">
    <label for="fullName">Full Name:</label>
    <input type="text" name="fullName" id="fullName" required><br>

    <label for="birthday">Birthday:</label>
    <input type="date" name="birthday" id="birthday"><br>

    <label for="address">Address:</label>
    <input type="text" name="address" id="address"><br>

    <label for="position">Position:</label>
    <input type="text" name="position" id="position"><br>

    <label for="department">Department:</label>
    <input type="text" name="department" id="department"><br>

    <input type="submit" value="Submit">
    <input type="reset" value="Reset">

    <!-- ... form and input controls ... -->

    <input type="reset" value="Reset" onclick="resetForm()">

</form>
</body>
</html>

