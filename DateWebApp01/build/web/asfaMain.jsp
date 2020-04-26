<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.datewebapp.objects.ServiceObj"%>
<%@page import="com.datewebapp.objects.UserObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta httpe-quiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main page</title>
        
    </head>
    <%
        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        List<ServiceObj> CList = 
                (List<ServiceObj>)request.getSession().getAttribute("services");
    %>
    <body>
        <h1>Store Main</h1>
        <br><br>
        
        <div>
            <label>Bienvenido, <%= CUser.getUser() %></label><br>
        </div>
        <br><br>
        <a href="cataEsmaltes.html">prueba</a>
        
        <table style="width:50%" border="1">
            
          <%
              if(CList!=null)
              {
                  Iterator<ServiceObj> ite = CList.iterator();
                  ServiceObj CTemp;
                  while(ite.hasNext())
                  {
                      CTemp = ite.next();
          %>  
                <tr>
                    <td><img src="images/<%= CTemp.getImage() %>" width="64" height="128" /></td>
                  <td>
                      <p><%= CTemp.getName() %></p>
                      
                  </td>
                  <td>
                      <p><%= CTemp.getDescription() %></p>
                  </td>
                </tr>
          <%
                    }
              }
          %>
          
        </table>
    </body>
</html>
