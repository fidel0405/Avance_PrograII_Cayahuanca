

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendar cita</title>
    </head>
    <body>
        <h1>Completa el formulario</h1>
        
        <form id="form-reservation" name="form" action="DateServlet" method="get">
           
            Nombre: <input type="text" id="name" name="name"/>
            Apellido: <input type="text" id="apellido" name="apellido"/>
            <br><br>
            Teléfono: <input type="text" id="telefono" name="telefono"/>
            <br><br>
            DUI: <input type="text" id="dui" name="dui"/>
            <br><br>
            Día
            <select id="dia" name="dia">
            <option id="lunes" name="lunes" value="lunes">Lunes</option>
            <option id="martes" name="martes" value="martes">Martes</option>
            <option id="miercoles" name="miercoles" value="miercoles">Miercoles</option>
            <option id="jueves" name="jueves" value="jueves">Jueves</option>
            <option id="viernes" name="viernes" value="viernes">Viernes</option>
            </select>
            <br><br>
            Servicio
              <select id="servicio" name="servicio">
            <option id="maquillaje" name="maquillaje" value="maquillaje">Maquillaje permanente</option>
            <option id="acrilico" name="acrilico" value="acrilico">Set de uñas acrilicas</option>
            <option id="baño" name="baño" value="baño">Baño de acrilico</option>
            <option id="retiroa" name="retiroa" value="retiroa">Retiro de uñas acrilicas</option>
            <option id="retirom" name="retirom" value="retirom">Retiro de esmalte</option>
            <option>Other</option>
              </select>
            <br><br>
            
             Lugar: <br>
            <input type="radio" id="ESEN" name="lugar" value="ESEN" checked="checked">
            <label for="female">ESEN</label><br>
            <input type="radio" id="SM" name="lugar" value="SM">
            <label for="male">San Miguel</label><br>
            <input type="radio" id="domicilio" name="lugar" value="domicilio">
            <label for="other"> A domicilio</label>
            <br><br>
            
            <input type="submit" id="mysubmit" name="mysubmit" value="send"/>
            <input type="hidden" name="formid" value="1" />
            
        </form>
    </body>
</html>
