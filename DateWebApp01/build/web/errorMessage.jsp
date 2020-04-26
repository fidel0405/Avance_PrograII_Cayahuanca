<%-- 
    Document   : errorMessage
    Created on : abr 24, 2020, 11:00:40 a.m.
    Author     : cvill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>
        <style>
            body{
                background-image: url("imagenes/error.jpg");
                background-repeat: no-repeat;
            }
        </style>
    </head>
    <%
        String strMessage = 
                (String)request.getSession().getAttribute("message");
    %>
    
    <body>
       
        <p> <%= strMessage %></p>
        <a href="index.html">Regresar</a>
        
    </body>
</html>
