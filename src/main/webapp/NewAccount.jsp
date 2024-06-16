<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create account form</title>
<style>
  body {
    background-color: #212121;
    color: white;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }
  h1 {
    text-align: center;
  }
  form {
    max-width: 400px;
    padding: 20px;
    background-color: #333;
    border-radius: 5px;
  }
  form label {
    display: block;
    margin-bottom: 5px;
  }
  form input[type="text"],
  form input[type="number"],
  form input[type="password"] {
    width: calc(100% - 20px); /* Adjusting for padding */
    padding: 10px;
    margin: 5px 0 10px;
    border: none;
    border-radius: 3px;
    box-sizing: border-box;
  }
  form input[type="submit"],
  form input[type="reset"] {
    width: 100%;
    padding: 10px;
    margin-top: 10px;
    border: none;
    border-radius: 3px;
    background-color: #4CAF50;
    color: white;
    cursor: pointer;
  }
  form input[type="submit"]:hover,
  form input[type="reset"]:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>
<h1>Open Account Form</h1>
<form action="register" method="post">
  <label for="uname">User name:</label>
  <input type="text" id="uname" name="uname" required>
  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required>
  <label for="repassword">Re-enter Password:</label>
  <input type="password" id="repassword" name="repassword" required>
  <label for="Amount">Amount:</label>
  <input type="number" id="Amount" name="Amount" required>
  <label for="Address">Address:</label>
  <input type="text" id="Address" name="Address" required>
  <label for="phone">Phone:</label>
  <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" required>
  <input type="submit" value="Submit">
  <input type="reset" value="Clear">
</form>
<script>
  // Add JavaScript functionality here if needed
</script>
</body>
</html>
