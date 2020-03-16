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
        <h1>Date result</h1>
        <br>
        <p>Name: <%= date.getName()%></p><br>
        <p>Time: <%= date.getTime()%></p><br>
        <p>Activity: <%= date.getActivity()%></p><br>
        <p>Lugar: <%= date.getPlace()%></p><br>
    </body>
</html>
