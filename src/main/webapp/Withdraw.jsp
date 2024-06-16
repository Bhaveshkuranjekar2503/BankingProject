<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Withdraw Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #000;
        color: #fff;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .container {
        background-color: #222;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(255, 255, 255, 0.1);
        width: 300px;
        text-align: center;
    }
    h1 {
        color: #fff;
        margin-bottom: 20px;
    }
    label {
        display: block;
        text-align: left;
        margin: 10px 0 5px;
    }
    input[type="number"],
    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0 15px;
        border: none;
        border-radius: 5px;
        box-sizing: border-box;
    }
    input[type="submit"],
    input[type="reset"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: none;
        border-radius: 5px;
        background-color: #007bff;
        color: #fff;
        cursor: pointer;
    }
    input[type="submit"]:hover,
    input[type="reset"]:hover {
        background-color: #0056b3;
    }
    .error {
        color: red;
        margin: 10px 0;
    }
</style>
</head>
<body>
    <div class="container">
        <form action="withdraw" method="post">
            <h1>WITHDRAW FORM</h1>
            <label for="ano">Account No.</label>
            <input type="number" id="ano" name="ano" required>
            <label for="uname">User Name</label>
            <input type="text" id="uname" name="uname" required>
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
            <label for="amount">Amount</label>
            <input type="number" id="amount" name="amount" required>
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
            <%
                // Server-side validation logic
                String error = "";
                if ("POST".equalsIgnoreCase(request.getMethod())) {
                    String ano = request.getParameter("ano");
                    String uname = request.getParameter("uname");
                    String password = request.getParameter("password");
                    String amountStr = request.getParameter("amount");

                    if (ano == null || ano.isEmpty() || uname == null || uname.isEmpty() ||
                        password == null || password.isEmpty() || amountStr == null || amountStr.isEmpty()) {
                        error = "All fields are required.";
                    } else {
                        try {
                            int amount = Integer.parseInt(amountStr);
                            if (amount <= 0) {
                                error = "Amount must be greater than zero.";
                            }
                        } catch (NumberFormatException e) {
                            error = "Invalid amount.";
                        }
                    }
                    
                    if (!error.isEmpty()) {
                        out.println("<div class='error'>" + error + "</div>");
                    } else {
                        // Process the form (e.g., save to database)
                        out.println("<div class='success'>Form submitted successfully!</div>");
                        // Clear form inputs
                        request.getRequestDispatcher("welcome.jsp").forward(request, response);
                    }
                }
            %>
        </form>
    </div>
</body>
</html>
