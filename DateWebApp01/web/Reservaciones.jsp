<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.datewebapp.objects.ServiceObj"%>
<%@page import="com.datewebapp.objects.UserObj"%>
<%@page import="com.datewebapp.logic.UserLogic"%>
<%@page import="com.datewebapp.logic.ServiceLogic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ASFA Nailed it! | Esmaltes</title>
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
        
        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        String strProductoId = request.getParameter("productoId");
        int intProductoId = Integer.parseInt(strProductoId);
        ServiceObj ServiceActual = CServiceLogic.getServicio(intProductoId);

    %>
    <body>
        <header class="header">
            <div class="container logo-nav-container">
                <a href="" class="logo"><img src="imagenes/logo.jpeg" WIDTH=200px HEIGHT=75px  ></a>
                <span class="menu-icon">Ver menú</span>
                <nav class="navigation">
                    <ul>
                        <li><a href="asfaMain.jsp">Inicio</a></li>
                        <li><a href="MaquillajePermanente.jsp">Esmaltes</a></li>
                        <li><a href="TonosNude.jsp">Acrílicos</a></li>
                        <li><a href="Acrilicos.jsp">Uñas Acrílicas</a></li>
                        <li><a href="">Cerrar sesión</a></li>
                    </ul>
                </nav>
            </div>
        </header>

        <h1>Reservas</h1>
        <br>
        
            Nombre Completo:<%=ServiceActual.getName()%>;
            Numero de Producto:<%=ServiceActual.getId()%>
            <br><br>
            <label for="Lugar">Escoge la fecha para tu reserva:</label>
            <select id="Fecha">
              <option value="Lunes1">Lunes: 10:00-12:00</option>
              <option value="Lunes2">Lunes: 2:30-4:40</option>
              <option value="Martes1">Martes: 8:00-10:00</option>
              <option value="Martes2">Martes: 10:00-12:00</option>
              <option value="Martes3">Martes: 1:00-2:30</option>
              <option value="Miercoles1">Miercoles: 1:00-2:30</option>
              <option value="Miercoles2">Martes: 2:30-4:40</option>
              <option value="Jueves1">Jueves: 8:00-10:00</option>
              <option value="Jueves2">Jueves: 10:00-12:00</option>
              <option value="Jueves3">Jueves: 1:00-2:30</option>
              <option value="Jueves4">Jueves:2:30-4:40</option>
              <option value="Sabado1">Sabado: 8:00-10:00</option>
              <option value="Sabado2">Sabado:10:00-12:00</option>
              <option value="Via del Mar">Via del Mar</option>
             </select>
            <br><br>
            <label for="Lugar">Escoge un lugar para tu reserva:</label>
            <select id="Lugar">
              <option value="ESEN">ESEN</option>
              <option value="San Miguel">San Miguel</option>
              <option value="Via del Mar">Via del Mar</option>
             </select>
            <br><br>
            <input type="submit" name="mysubmit" value="Reservar" />
            <br>
            <input type="submit" name="mysubmit" value="Reservar otros" />
                    
         <br><br><br><br><br><br><br><br><br><br>
         
        <footer>
            <div class="container-footer-all">
            
                <div class="container-body">
                    
                    <div class="column1">
                        <h1>ASFA Nailed it!</h1>

                        <div class="row">
                            <a><i class="fab fa-facebook"></i></a>
                            <label>Síguenos en Facebook</label>
                        </div>
                        
                        <div class="row">
                            <i class="fab fa-instagram" ></i>
                            <a href="https://www.instagram.com/asfa.nailedit/?hl=es-la"><label >Síguenos en Instagram</label></a>
                        </div>


                            <h3>Servicios en:</h3>
                            <p>ESEN</p>
                            <p>San Miguel</p>
                            <p>Vía del Mar</p>
                    </div>

                    

                    <div class="column2">
                        <h1>Servicios</h1>
                        <div class="row">
                            <label>Esmaltado Gel</label>
                        </div>
        
                        <div class="row">
                            <label>Acrílicos</label>
                        </div>
                        
                        <div class="row">
                            <label>Uñas Acrílicas</label>
                        </div>

                    </div>

                    <div class="column3">
                        <h1>Información</h1>
                        <div class="row">
                            <i class="fas fa-phone"></i>
                            <label>Número de teléfono</label>
                            <br>
                            <p>+503 1234-5678<p>
                        </div>
                        
                        <div class="row">
                            <i class="fas fa-envelope"></i>
                            <label>Correo Electrónico</label>
                            <br>
                            <a href="mailto:asfa.nailed@gmail.com"><p>asfa.nailed@gmail.com</p></a>
                        </div>


                    </div>

                </div>

              
               
                

            </div>

            <div class="container-footer">

                <div class="information">
                    <br>
                    <p>ASFA Nailed it! 2020 | Diseñado por Cayahuanca</p>
                    
            </div>
            </div>
        
        
        </footer>
    </body> 
</html>
