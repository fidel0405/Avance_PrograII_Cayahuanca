<%-- 
    Document   : register
    Created on : abr 16, 2020, 12:54:27 p.m.
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Registrate</h1>
        
        <form action="UserServlet" method="post">
            
            Nombre:<br> 
            <input type="text" name="name" required />
            <br><br>
            Apellido:<br> 
            <input type="text" name="lastname" required />
            <br><br>
            Edad:<br> 
            <input type="number" name="age" required />
            <br><br>
            Correo:<br> 
            <input type="email" name="email" required />
            <br><br>
            user:<br> 
            <input type="text" name="user" required />
            <br><br>
            password: <br>
            <input type="password" name="password" required />
            <br><br>
            
            
            <input type="submit" value="Register" />
            <input type="hidden" name="formid" value="2" />
            
            <br><br>            
        </form>
        
    </body>
</html>