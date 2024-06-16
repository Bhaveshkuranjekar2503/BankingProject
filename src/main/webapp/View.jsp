<%@ page import="banking.project.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Page</title>
<style>
    body {
        background-color: black;
        color: white;
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .table-container {
        background-color: #333;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        width: 60%;
        max-width: 800px;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        padding: 15px;
        text-align: left;
    }
    th {
        background-color: #444;
    }
    td {
        background-color: #555;
    }
    a {
        display: inline-block;
        margin-top: 20px;
        padding: 10px 15px;
        background-color: green;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        text-align: center;
    }
    a:hover {
        background-color: darkgreen;
    }
</style>
</head>
<body>
<% 
    UserBean ub = (UserBean) request.getAttribute("ub");
%>
<div class="table-container">
    <table>
        <tr>
            <th>Account Number</th>
            <td><%= ub.getAccountNumber() %></td>
        </tr>
        <tr>
            <th>User Name</th>
            <td><%= ub.getUname() %></td>
        </tr>
        <tr>
            <th>Amount</th>
            <td><%= ub.getAmount() %></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><%= ub.getAddress() %></td>
        </tr>
        <tr>
            <th>Phone</th>
            <td><%= ub.getPhone() %></td>
        </tr>
    </table>
    <a href="welcome.jsp">Go to login page</a>
</div>
</body>
</html>
