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
        <link rel="stylesheet" href="CSS/estilosCatalogo.css">
        <link rel="stylesheet" href="CSS/estilosFormularios.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    <body>
        <br>
        <div align="center"> <img src="imagenes/Logo.png" alt="logo" id="logo"></div>
        
        <div class="izquierda">
            <img src="imagenes/1_A.jpeg" alt="prueba1">
            <img src="imagenes/1_MP.jpeg" alt="prueba2">
            <img src="imagenes/1_TN.jpeg" alt="prueba3">
            <img src="imagenes/2_A.jpeg" alt="prueba4">
            <img src="imagenes/2_MP.jpeg" alt="prueba5">
            <img src="imagenes/2_TN.jpeg" alt="prueba6">
        </div>
        
        <div>
        <form action="UserServlet" class="formulario" method="post">
            
            Nombre:<br> 
            <input type="text" name="name" class="datos" required />
            <br>
            Apellido:<br> 
            <input type="text" name="lastname" class="datos" required />
            <br>
            Edad:<br> 
            <input type="number" name="age" class="datos" required />
            <br>
            Correo:<br> 
            <input type="email" name="email" class="datos" required />
            <br>
            user:<br> 
            <input type="text" name="user" class="datos" required />
            <br>
            Contraseña: <br>
            <input type="password" name="password" class="datos" required />
            <br>
            Confirmar contraseña: <br>
            <input type="password" name="password" class="datos" required />
            <br><br>
            
            
            <input type="submit" class="boton" value="Registrate" />
            <input type="hidden" name="formid" value="2" />
            
            <br><br>            
        </form>
        <br><br>
        
        </div>
                
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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
                            <a href="https://www.instagram.com/asfa.nailedit/?hl=es-la"><i class="fab fa-instagram" ></i></a>
                            <a href="https://www.instagram.com/asfa.nailedit/?hl=es-la"><label >Síguenos en Instagram</label></a>
                        </div>
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
        
        
    </body>
</html>
