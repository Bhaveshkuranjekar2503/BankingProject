<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transfer Balance</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap');
        body {
            background: url('https://source.unsplash.com/featured/?nature,water') no-repeat center center fixed;
            background-size: cover;
            color: #ecf0f1;
            font-family: 'Roboto', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        form {
            background-color: rgba(44, 62, 80, 0.85);
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.6);
            width: 350px;
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #ecf0f1;
            font-weight: 500;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: 500;
            color: #ecf0f1;
        }

        input[type="number"],
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: none;
            border-radius: 5px;
            box-sizing: border-box;
            background-color: #bdc3c7;
            color: #2c3e50;
            font-size: 16px;
            transition: background-color 0.3s, box-shadow 0.3s;
        }

        input[type="number"]:focus,
        input[type="text"]:focus,
        input[type="password"]:focus {
            outline: none;
            background-color: #ecf0f1;
            color: #2c3e50;
            box-shadow: 0 0 8px rgba(236, 240, 241, 0.6);
        }

        input[type="submit"],
        input[type="reset"] {
            width: 48%;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
            background-color: #e74c3c;
            color: white;
            transition: background-color 0.3s, transform 0.2s;
            font-size: 16px;
        }

        input[type="reset"] {
            background-color: #95a5a6;
        }

        input[type="submit"]:hover {
            background-color: #c0392b;
            transform: translateY(-2px);
        }

        input[type="reset"]:hover {
            background-color: #7f8c8d;
            transform: translateY(-2px);
        }

        .button-group {
            display: flex;
            justify-content: space-between;
        }
    </style>
</head>
<body>
    <form action="transferServlet" method="post">
        <h2>Transfer Balance</h2>
        <label for="ano">Account Number</label>
        <input type="number" id="ano" name="ano" required>

        <label for="uname">User Name</label>
        <input type="text" id="uname" name="uname" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>

        <label for="tan">Target Account Number</label>
        <input type="number" id="tan" name="tan" required>

        <label for="amount">Amount</label>
        <input type="number" id="amount" name="amount" required>

        <div class="button-group">
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
        </div>
    </form>
</body>
</html>
