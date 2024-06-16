<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Swiss Bank Corporation</title>
<style>
  body {
    background-color: #0a0a0a;
    color: #ffffff;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
  }
  .container {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
    padding: 20px;
  }
  h1, h3 {
    text-align: center;
    font-weight: normal;
  }
  hr {
    border: 1px solid #fff;
    margin: 20px auto;
    width: 50%;
  }
  .menu {
    text-align: center;
    margin-top: 30px;
  }
  .menu a {
    color: #ffffff;
    text-decoration: none;
    padding: 10px 20px;
    margin: 0 10px;
    border: 1px solid transparent;
    border-radius: 3px;
    transition: all 0.3s ease;
    background-color: #212121;
  }
  .menu a:hover {
    background-color: #333;
    border-color: #ffffff;
  }
  .logo {
    width: 300px; /* Adjusted width */
    height: auto; /* Maintain aspect ratio */
    margin-bottom: 20px;
  }
  .date {
    text-align: center;
    margin-top: 20px;
    font-size: 18px;
  }
</style>
</head>
<body>
  <div class="container">
    <img src="bank_logo.jpeg" alt="Swiss Bank Corporation Logo" class="logo">
    <h1>Welcome to Swiss Bank Corporation</h1>
    <h3>Extraordinary Service</h3>
    <hr>
    <div class="menu">
      <a href="NewAccount.jsp">New Account</a>
      <a href="Balance.jsp">Balance</a>
      <a href="Deposit.jsp">Deposit</a>
      <a href="Withdraw.jsp">Withdraw</a>
      <a href="Transfer.jsp">Transfer</a>
      <a href="Close.jsp">Close Account</a>
      <a href="About.jsp">About Us</a>
    </div>
    <hr>
    <div class="date">
      <h3>Current date is <%=new Date().toString() %></h3>
    </div>
  </div>
</body>
</html>
