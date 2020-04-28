<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
            response.setHeader("Pragma","no-cache");
            response.addHeader("Cache-control","must-revalidate");
            response.addHeader("Cache-control","no-cache");
            response.addHeader("Cache-control","no-store");
            response.setDateHeader("Expires",0);
%>
<html>
    <head>
        <title>Login Main</title>
        <link rel="shortcut icon" href="imagenes/Logo_2.png">
        <link rel="stylesheet" href="CSS/estilosCatalogo.css">
        <link rel="stylesheet" href="CSS/estilosFormularios.css">
        <script defer src="http://use.fontawesome.com/releases/v5.12.1/js//all.js"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body>
        
    <section class="perfil">
        <br>
        <div align="center"> <img src="imagenes/logo.jpeg" alt="logo" id="logo"></div>
        
        <div class="izquierda">
            <img src="imagenes/1_A.jpeg" alt="prueba1">
            <img src="imagenes/1_MP.jpeg" alt="prueba2">
            <img src="imagenes/1_TN.jpeg" alt="prueba3">
            <img src="imagenes/2_A.jpeg" alt="prueba4">
            <img src="imagenes/2_MP.jpeg" alt="prueba5">
            <img src="imagenes/2_TN.jpeg" alt="prueba6">
        </div>
     
        
        
        <div class="inicio">
        <form action="UserServlet" class="formulario" id="logIn" method="post">
            
            <h3>Usuario:</h3> 
            <input type="text" name="user" class="datos" required />
            <br><br>
            <h3>Contraseña:</h3>
            <input type="password" name="password" class="datos" required />
            <br><br>
            <input type="submit" class="boton" value="Ingresar" />
            <input type="hidden" name="formid" value="1" />
            
            <br>
            <p>¿No tienes cuenta? <a href="register.jsp">Regístrate</a></p>
            
        </form>
        <br><br>
        
        </div>
    
    </section> 
        
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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
        
        <script src="Scripts/validate/jquery-1.8.3.js" type="text/javascript"></script>
        <script src="Scripts/validate/jquery.validate.js" type="text/javascript"></script>
        <script src="Scripts/indexValidate.js" type="text/javascript"></script>

        
    </body>
        

</html>
