<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Closing Account Page</title>
<style>
    body {
        background-color: #121212;
        color: #ffffff;
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .container {
        background-color: #1e1e1e;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        width: 300px;
    }
    h1 {
        text-align: center;
        color: #f0a500;
        margin-bottom: 20px;
    }
    label {
        display: block;
        margin: 10px 0 5px;
    }
    input[type="number"],
    input[type="text"],
    input[type="password"] {
        width: calc(100% - 20px);
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #333;
        border-radius: 5px;
        background-color: #333;
        color: #fff;
    }
    input[type="submit"],
    input[type="reset"] {
        width: calc(50% - 10px);
        padding: 10px;
        border: none;
        border-radius: 5px;
        background-color: #f0a500;
        color: #000;
        font-weight: bold;
        cursor: pointer;
        margin: 5px 0;
    }
    input[type="submit"]:hover,
    input[type="reset"]:hover {
        background-color: #d18d00;
    }
</style>
</head>
<body>
<%// response.setContentType("text/html"); %>
<div class="container">
    <h1>Close Account</h1>
    <form action="close" method="post">
        <label for="ano">Account Number</label>
        <input type="number" id="ano" name="ano" required>
        
        <label for="uname">Username</label>
        <input type="text" id="uname" name="uname" required>
        
        <label for="pword">Password</label>
        <input type="password" id="pword" name="pword" required>
        
        <input type="submit" value="Submit">
        <input type="reset" value="Clear">
    </form>
</div>
</body>
</html>
