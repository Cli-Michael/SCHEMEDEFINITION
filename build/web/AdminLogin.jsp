<%-- 
    Document   : AdminLogin
    Created on : 18 May, 2023, 6:46:07 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Log-in</title>
    <link rel="stylesheet" href="login.css">
    <link href=”https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css” rel=”stylesheet” integrity=”sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU” crossorigin=”anonymous”>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
</head>

<body>  
    <div class="container">
        <div class="wrapper">
            <div class="title"><span>Admin Login</span></div>
            <form action="AdminLogger" method="post">
                <div class="row">
                    <i class="fas fa-user"></i>
                    <input type="text" placeholder="Username" name="username" required>
                </div>
                <div class="row">
                    <i class="fas fa-lock"></i>
                    <input id="password-field" type="password" class="form-control" name="password" placeholder="Password" required>
                    
                </div>
                <div class="row button">
                    <a href="Home.html">
                        <input type="submit" value="Login">
                    </a>
                </div>
                <div class="signup-link"><a href="AgentLogin.jsp">Agent Log-in </a></div>
            </form>
        </div>
    </div>
</body>
</html>