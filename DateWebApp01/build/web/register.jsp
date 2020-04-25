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
        <link rel="stylesheet" href="CSS/estilosFormularios.css">
    </head>
    <body>
        <br>
        <h1 class="titulo">Registrate</h1>
        
        <form action="UserServlet" class="formulario" method="post">
            
            Nombre:<br> 
            <input type="text" name="name" class="datos" required />
            <br><br>
            Apellido:<br> 
            <input type="text" name="lastname" class="datos" required />
            <br><br>
            Edad:<br> 
            <input type="number" name="age" class="datos" required />
            <br><br>
            Correo:<br> 
            <input type="email" name="email" class="datos" required />
            <br><br>
            user:<br> 
            <input type="text" name="user" class="datos" required />
            <br><br>
            Contraseña: <br>
            <input type="password" name="password" class="datos" required />
            <br><br>
            Confirmar contraseña: <br>
            <input type="password" name="password" class="datos" required />
            <br><br>
            
            
            <input type="submit" class="boton" value="Registrate" />
            <input type="hidden" name="formid" value="2" />
            
            <br><br>            
        </form>
        
    </body>
</html>
