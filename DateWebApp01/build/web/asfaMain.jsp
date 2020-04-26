<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.datewebapp.objects.ServiceObj"%>
<%@page import="com.datewebapp.objects.UserObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ASFA Nailed it! | Inicio</title>
        <link rel="shortcut icon" href="imagenes/Logo_2.png">
        <link rel="stylesheet" href="CSS/estilosCatalogo.css">
        <script defer src="http://use.fontawesome.com/releases/v5.12.1/js//all.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.0.min.js"></script>
        <script src="scripts.js"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <%
        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        List<ServiceObj> CList = 
                (List<ServiceObj>)request.getSession().getAttribute("services");
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
        
        <main>

        <div class="message">Nuestros Servicios</div>

        <br><br>
         
        
         <div class="images">
             
             
             
                <!--Imagen 1-->
            <ul>
                
                <%
              if(CList!=null)
              {
                  Iterator<ServiceObj> ite = CList.iterator();
                  ServiceObj CTemp;
                  while(ite.hasNext())
                  {
                      CTemp = ite.next();
          %>
                
                
                <li>
   
                    <h1><%= CTemp.getName() %></h1>
                    <a href="<%= CTemp.getType() %>.jsp"> <img src="imagenes/<%= CTemp.getImage() %>"></a>
                    <table class="reserva" >
                        <tr>
                            <td>
                                <p><b><em><%= CTemp.getDescription() %></em></b></p>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <p class="button-reserva"><a href="" class="button">Reservar</a></p>
                            </td>
                        </tr>
                        
                    </table>
                    
                </li>
                
                <%
                    }
              }
          %>  
            </ul>
              
                      

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
