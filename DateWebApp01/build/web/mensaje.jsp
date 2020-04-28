<%@page import="com.datewebapp.objects.HistorialObj"%>
<%@page import="com.datewebapp.logic.HistorialLogic"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.datewebapp.objects.ServiceObj"%>
<%@page import="com.datewebapp.objects.UserObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.datewebapp.objects.ServiceObj"%>
<%@page import="com.datewebapp.objects.UserObj"%>
<%@page import="com.datewebapp.logic.UserLogic"%>
<%@page import="com.datewebapp.logic.ServiceLogic"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmación</title>
         <link rel="shortcut icon" href="imagenes/Logo_2.png">
        <link rel="stylesheet" href="CSS/estilosCatalogo.css">
        <script defer src="http://use.fontawesome.com/releases/v5.12.1/js//all.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.0.min.js"></script>
        <script src="scripts.js"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <%
        String connString = "jdbc:mysql://localhost:3306/usuariosweb?"
                                + "user=root&password=root"+
                                "&autoReconnect=true&useSSL=false&serverTimezone=UTC";
        
        UserLogic CLogic = new UserLogic(connString);
        ServiceLogic CServiceLogic = new ServiceLogic(connString);
        HistorialLogic CHistorialLogic = new HistorialLogic(connString);
        
        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        
                HistorialObj HistorialMsg = CHistorialLogic.getHistorialMsg(CUser.getId());              
           %>
    <%
        
       String strServicio = HistorialMsg.getProductoName();
       String strFecha = HistorialMsg.getFecha();
       String strHora = HistorialMsg.getTime();
       String strPlace = HistorialMsg.getPlace();
       String strTelefono = HistorialMsg.getTelefono();
       

    %>
    <body class="men">
     
        <main>    
        <div class="form">
        
        <h1>Tu reservación ha sido hecha correctamente</h1>
        <br>
        <br>
        <h3>¿Desear enviar un mensaje de confirmación, por medio de Whatsapp con los siguientes datos?</h3>
        <br>
        <br>
        <form action="HistorialServlet">
            
            <p>Servicio:</p>
            <input id="servicio" type="text" value="<%=strServicio%>" readonly="true"/>
            
            <p>Fecha:</p>
            <input id="datepicker" name="datepicker" type="text" value="<%=strFecha%>" readonly="true"/>
            
            <p>Hora:</p>
            <input id="timepicker" name="timepicker" type="text" value="<%=strHora%>" readonly="true"/>
            
            <p>Lugar:</p>
                <input id="lugar" name="lugar" type="text" value="<%=strPlace%>" readonly="true"/>
            <br><br>
                        
            <div id="respuesta"></div>

                <input type="submit" id="mandar" class="button" value="Enviar">
                <a href="asfaMain.jsp"><input type="button" class="button" name="mysubmit" value="Cancelar"/></a>
        </form>
            <script src="Scripts/form.js"></script>
        </div>
            
            </main>
    </body>
</html>
