<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link rel="stylesheet" href="CSS/estilosCatalogo.css">
        <script defer src="http://use.fontawesome.com/releases/v5.12.1/js//all.js"></script>
        <link rel="stylesheet" href="CSS/estilosFormularios.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    <body>
        <br>
        <div align="center"> <img src="imagenes/logo.jpeg" alt="logo" id="logo"></div>
        
        <br>
        <div class="izquierda-register">
            <img src="imagenes/1_A.jpeg" alt="prueba1">
            <img src="imagenes/1_MP.jpeg" alt="prueba2">
            <img src="imagenes/1_TN.jpeg" alt="prueba3">
            <img src="imagenes/2_A.jpeg" alt="prueba4">
            <img src="imagenes/2_MP.jpeg" alt="prueba5">
            <img src="imagenes/2_TN.jpeg" alt="prueba6">
        </div>
        
        <div class="inicio">
            <form action="UserServlet" class="formulario" id="register" method="post">
                <legend align="center"><h2>Únete a nuestra gran familia</h2></legend><br>
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
            <input type="password" name="password" class="datos" id="password" required />
            <br><br>
            Confirmar contraseña: <br>
            <input type="password" name="confirm_password" class="datos" id="confirm_password" required />
            <br><br>
            
            
            <input type="submit" class="boton" value="Registrate" />
            <input type="hidden" name="formid" value="2" />
            
            <br><br>            
        </form>
        <br><br>
        
        </div>
        
        <br>
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
        <script src="Scripts/registerValidate.js" type="text/javascript"></script> 
        
    </body>
</html>
