<%-- 
    Document   : asfaMain
    Created on : Jue 16, 2020
    Author     : carlos
--%>

<%@page import="com.datewebapp.objects.UserObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta httpe-quiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main page</title>
        
    </head>
    <%
        UserObj CLoggedUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
    %>
    <body>
        <%
            if(CLoggedUser!=null)
            {
        %>
        <h1 class="title">Main system</h1>
        <p>you are logged in, welcome <%= CLoggedUser.getUser() %></p>
        
        <%//Mostrar informacion de la pagina principal%>
        
        
        <div>
            <table>
          <tr>
            <th>Esmalte permanente</th>
            <th>Set uñas acrílicas</th>
          </tr>
          <tr>
            <td>Retiro de acrílico</td>
            <td>Baño de uñas acrílicas</td>
          </tr>
          <tr>
            <td>Retiro de gel</td>
            <td>Contáctame</td> 
          </tr> 
                
          
         </table>

      </div>


    <div> 
        <br>
        
        <%//fin informacion pagina principal%>

        
        <%
            }
            else
            {
                request.getRequestDispatcher("errorMessage.jsp")
                       .forward(request, response);
            }
        %>
    </body>
</html>
