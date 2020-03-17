<%@page import="com.datewebapp.objects.DateObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ASFA Nailed it! Citas</title>
    </head>
    
    <%
        //código java
        //tengo acceso al request y al response
        DateObj date = (DateObj)request.getSession().getAttribute("dateobj");
    %>
    
    <body>
        <h1>Cita agendada</h1>
        <br>
        Enhora buena <%= date.getNombre()%><br><br>
        Has agendado una cita para el dia <%= date.getDia()%> 
        <br><br>
        Pronto uno de nuestros coloboradores se pondrá en contacto contigo
        <br><br>
        Gracias por usar ASFA Nailed It!
    </body>
</html>
