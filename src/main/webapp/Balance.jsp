<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Balance Checking Form</title>
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
    .form-container {
        background-color: #333;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
    }
    .form-container h1 {
        text-align: center;
        margin-bottom: 20px;
    }
    .form-container label {
        display: block;
        margin-bottom: 10px;
        font-weight: bold;
    }
    .form-container input[type="text"],
    .form-container input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: none;
        border-radius: 5px;
        box-sizing: border-box;
    }
    .form-container input[type="submit"],
    .form-container input[type="reset"] {
        width: 48%;
        padding: 10px;
        margin: 5px 1%;
        border: none;
        border-radius: 5px;
        background-color: green;
        color: white;
        cursor: pointer;
        box-sizing: border-box;
    }
    .form-container input[type="submit"]:hover,
    .form-container input[type="reset"]:hover {
        background-color: darkgreen;
    }
</style>
</head>
<body>
<div class="form-container">
    <h1>Balance Checking Form</h1>
    <form action="Balance" method="post">
        <label for="accountNumber">Account Number</label>
        <input type="text" id="accountNumber" name="accountNumber">
        <label for="uname">User Name</label>
        <input type="text" id="uname" name="uname">
        <label for="password">Password</label>
        <input type="password" id="password" name="password">
        <input type="submit" value="Submit">
        <input type="reset" value="Clear">
    </form>
</div>
</body>
</html>
