<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account created</title>
<style>
body {
    background-color: #222;
    color: white;
    font-family: Arial, sans-serif;
    text-align: center;
}

h1, h3 {
    margin-bottom: 20px;
}

#accountNumber {
    font-size: 24px;
    font-weight: bold;
    color: #ffc107;
}
</style>
</head>
<body>
    <h1>Account created successfully</h1>
    <h3>
        Your account number is <span id="accountNumber">${accountNumber}</span>
    </h3>

    <a href="welcome.jsp">Welcome page</a>
</body>
</html>
