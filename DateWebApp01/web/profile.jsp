<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.datewebapp.objects.ServiceObj"%>
<%@page import="com.datewebapp.objects.UserObj"%>
<%@page import="com.datewebapp.objects.HistorialObj"%>
<%@page import="com.datewebapp.logic.UserLogic"%>
<%@page import="com.datewebapp.logic.ServiceLogic"%>
<%@page import="com.datewebapp.logic.HistorialLogic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
            response.setHeader("Pragma","no-cache");
            response.addHeader("Cache-control","must-revalidate");
            response.addHeader("Cache-control","no-cache");
            response.addHeader("Cache-control","no-store");
            response.setDateHeader("Expires",0);

            try
            {
                    if(session.getAttribute("logged_user")==null)
                            {
                                    request.getRequestDispatcher("index.jsp").forward(request, response);
                            }
            }
            catch(Exception e)
            {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
            }
                           
       
    %>

    <head>
        <title>ASFA Nailed it! | Perfil</title>
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
        
        List<HistorialObj> CList= CHistorialLogic.getHistorialList(CUser.getId());
    %>
  
    <body>
        <header class="header">
            <div class="container logo-nav-container">
                <a href="" class="logo"><img src="imagenes/logo.jpeg" WIDTH=200px HEIGHT=75px></a>
                <span class="menu-icon">Ver menú</span>
                <nav class="navigation">
                    <ul>
                        <li><a href="asfaMain.jsp">Inicio</a></li>
                        <li><a href="MaquillajePermanente.jsp">Esmaltes</a></li>
                        <li><a href="TonosNude.jsp">Acrílicos</a></li>
                        <li><a href="Acrilicos.jsp">Uñas Acrílicas</a></li>
                        <li onclick=""><a>Opciones</a>
                            <ul class="desplegable">
                                <li onclick=""><a href="HistorialServlet">Perfil</a>
                                <li onclick=""><a href="LogoutServlet">Cerrar sesión</a></li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
        </header>
        
    <main class="main-profile">

        <div class="datos">
            
            <img src="imagenes/<%=CUser.getPicture()%>">
            <form class="cmxform" id="signupForm" action="UserServlet" method="post" enctype="multipart/form-data">
                 
                <p class="hov"><b>Cambiar foto</b></p>
                <input type="hidden" name="idUser" value="<%=CUser.getId()%>"/>
                <input type="file" class="button-perfil" name="fotoPerfil" id="fotoPerfil" value="Foto"/>
                <input type="hidden" name="formid" value="4"/>
                <input type="submit" class="button-perfil" value="cambiar"/>
                                                  
            </form>
                <p class="hov"><b>Nombre:</b></p>
            <p><input type="text" class="per" value="<%=CUser.getName()%>" readonly="true"/></p>
            <p class="hov"><b>Username:</b></p>
            <p><input type="text" class="per" value="<%=CUser.getUser()%>" readonly="true"/></p>
            <p class="hov"><a class="hov" href="LogoutServlet"><b>Cerrar sesión</b></a></p>

        </div>
                
            <div class="historial">
            <h2>Historial</h2>
            <table cellspacing="0">
                <tr>
                    <td><p><b>N°</b></p></td>
                    <td><p><b>Servicio</b></p></td>
                    <td><p><b>Fecha</b></p></td>
                    <td><p><b>Hora</b></p></td>
                    <td><p><b>Lugar</b></p></td>
                </tr>
                
                 <%
                    int n = 1;
              
                    if(CList!=null)
                    {
                        Iterator<HistorialObj> ite = CList.iterator();
                        HistorialObj CTemp;
                        while(ite.hasNext())
                        {
                            CTemp = ite.next();
          %>
                
                <tr>
                    <td><p><%= n%></p></td>
                    <td><p><%= CTemp.getProductoName() %></p></td>
                    <td><p><%= CTemp.getFecha() %></p></td>
                    <td><p><%= CTemp.getTime() %></p></td>
                    <td><p><%= CTemp.getPlace() %></p></td>
                </tr>
                <%      n = n+ 1;
                    }
              }
          %> 
                
            </table>
        </div>
        
         
        
        
    </main>
               

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
