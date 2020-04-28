package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.UserObj;
import com.datewebapp.logic.UserLogic;
import com.datewebapp.logic.ServiceLogic;

public final class Reservaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>ASFA Nailed it! | Esmaltes</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"imagenes/Logo_2.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosCatalogo.css\">\r\n");
      out.write("        <script defer src=\"http://use.fontawesome.com/releases/v5.12.1/js//all.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("        <script src=\"scripts.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!--Fuente del datepicker -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--Fuente del timepicker -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.css\">\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!--Para date and time picker -->\r\n");
      out.write("        <script src=\"Scripts/datetime.js\"></script>\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

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

    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"container logo-nav-container\">\r\n");
      out.write("                <a href=\"\" class=\"logo\"><img src=\"imagenes/logo.jpeg\" WIDTH=200px HEIGHT=75px  ></a>\r\n");
      out.write("                <span class=\"menu-icon\">Ver menú</span>\r\n");
      out.write("                <nav class=\"navigation\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"asfaMain.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"MaquillajePermanente.jsp\">Esmaltes</a></li>\r\n");
      out.write("                        <li><a href=\"TonosNude.jsp\">Acrílicos</a></li>\r\n");
      out.write("                        <li><a href=\"Acrilicos.jsp\">Uñas Acrílicas</a></li>\r\n");
      out.write("                        <li><a href=\"LogoutServlet\">Cerrar sesión</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <h1>Reservas</h1>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <form>\r\n");
      out.write("        \r\n");
      out.write("            <!-- Nombre Completo:");
      out.print(ServiceActual.getName());
      out.write(";\r\n");
      out.write("            Numero de Producto:");
      out.print(ServiceActual.getId());
      out.write("-->\r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            <p>Servicio:</p>\r\n");
      out.write("            <input id=\"servicio\" type=\"text\" value=\"");
      out.print(ServiceActual.getName());
      out.write("\"/>\r\n");
      out.write("            \r\n");
      out.write("            <p>Indica la fecha de tu reserva</p>\r\n");
      out.write("            <input id=\"datepicker\" type=\"text\"/>\r\n");
      out.write("            \r\n");
      out.write("            <p>Indica la hora de tu reserva</p>\r\n");
      out.write("            <input id=\"timepicker\" type=\"text\"/>\r\n");
      out.write("            \r\n");
      out.write("            <p>Lugar</p>\r\n");
      out.write("                <select id=\"lugar\">\r\n");
      out.write("                        <option value=\"ESEN\">ESEN</option>\r\n");
      out.write("                        <option value=\"San Miguel\">San Miguel</option>\r\n");
      out.write("                        <option value=\"Via del Mar\">Via del Mar</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"respuesta\"></div>\r\n");
      out.write("\r\n");
      out.write("                <button id=\"submit\">Enviar a WhatsApp</button>\r\n");
      out.write("                <input type=\"submit\" name=\"mysubmit\" value=\"Reservar otros\" />\r\n");
      out.write("              </form>\r\n");
      out.write("            <script src=\"Scripts/form.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("         <br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("         \r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"container-footer-all\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"container-body\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"column1\">\r\n");
      out.write("                        <h1>ASFA Nailed it!</h1>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <a><i class=\"fab fa-facebook\"></i></a>\r\n");
      out.write("                            <label>Síguenos en Facebook</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <i class=\"fab fa-instagram\" ></i>\r\n");
      out.write("                            <a href=\"https://www.instagram.com/asfa.nailedit/?hl=es-la\"><label >Síguenos en Instagram</label></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <h3>Servicios en:</h3>\r\n");
      out.write("                            <p>ESEN</p>\r\n");
      out.write("                            <p>San Miguel</p>\r\n");
      out.write("                            <p>Vía del Mar</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"column2\">\r\n");
      out.write("                        <h1>Servicios</h1>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <label>Esmaltado Gel</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <label>Acrílicos</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <label>Uñas Acrílicas</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"column3\">\r\n");
      out.write("                        <h1>Información</h1>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <i class=\"fas fa-phone\"></i>\r\n");
      out.write("                            <label>Número de teléfono</label>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p>+503 1234-5678<p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <i class=\"fas fa-envelope\"></i>\r\n");
      out.write("                            <label>Correo Electrónico</label>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a href=\"mailto:asfa.nailed@gmail.com\"><p>asfa.nailed@gmail.com</p></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-footer\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"information\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <p>ASFA Nailed it! 2020 | Diseñado por Cayahuanca</p>\r\n");
      out.write("                    \r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </footer>\r\n");
      out.write("    </body> \r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
