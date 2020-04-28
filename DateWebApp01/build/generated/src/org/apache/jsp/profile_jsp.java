package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import com.datewebapp.objects.HistorialObj;
import com.datewebapp.objects.UserObj;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <title>ASFA Nailed it! | Perfil</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"imagenes/Logo_2.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosCatalogo.css\">\r\n");
      out.write("        <script defer src=\"http://use.fontawesome.com/releases/v5.12.1/js//all.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("        <script src=\"scripts.js\"></script>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    ");

        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        List<HistorialObj> CList = 
                (List<HistorialObj>)request.getSession().getAttribute("historial");
    
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"container logo-nav-container\">\r\n");
      out.write("                <a href=\"\" class=\"logo\"><img src=\"imagenes/logo.jpeg\" WIDTH=200px HEIGHT=75px></a>\r\n");
      out.write("                <span class=\"menu-icon\">Ver menú</span>\r\n");
      out.write("                <nav class=\"navigation\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"asfaMain.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"MaquillajePermanente.jsp\">Esmaltes</a></li>\r\n");
      out.write("                        <li><a href=\"TonosNude.jsp\">Acrílicos</a></li>\r\n");
      out.write("                        <li><a href=\"Acrilicos.jsp\">Uñas Acrílicas</a></li>\r\n");
      out.write("                        <li onclick=\"\"><a href=\"index.html\">Opciones</a>\r\n");
      out.write("                            <ul class=\"desplegable\">\r\n");
      out.write("                                <li onclick=\"\"><a href=\"profile.jsp\">Perfil</a>\r\n");
      out.write("                                <li onclick=\"\"><a href=\"index.html\">Cerrar sesión</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("    <main class=\"main-profile\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"datos\">\r\n");
      out.write("            \r\n");
      out.write("            <img src=\"imagenes/user.png\">\r\n");
      out.write("            <input type=\"file\" id=\"fotoPerfil\"/>\r\n");
      out.write("            <h1>Nombre</h1>\r\n");
      out.write("            <p>Username</p>\r\n");
      out.write("            <p>Cerrar sesión</p>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <div class=\"historial\">\r\n");
      out.write("            <h2>Historial</h2>\r\n");
      out.write("            <table cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><p><b>N°</b></p></td>\r\n");
      out.write("                    <td><p><b>Servicio</b></p></td>\r\n");
      out.write("                    <td><p><b>Fecha</b></p></td>\r\n");
      out.write("                    <td><p><b>Hora</b></p></td>\r\n");
      out.write("                    <td><p><b>Lugar</b></p></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                 ");

              int n = 1;
              
              if(CList!=null)
              {
                  Iterator<HistorialObj> ite = CList.iterator();
                  HistorialObj CTemp;
                  while(ite.hasNext())
                  {
                      CTemp = ite.next();
          
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><p>1</p></td>\r\n");
      out.write("                    <td><p>");
      out.print( CTemp.getService() );
      out.write("</p></td>\r\n");
      out.write("                    <td><p>");
      out.print( CTemp.getFecha() );
      out.write("</p></td>\r\n");
      out.write("                    <td><p>");
      out.print( CTemp.getTime() );
      out.write("</p></td>\r\n");
      out.write("                    <td><p>");
      out.print( CTemp.getPlace() );
      out.write("</p></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
      n = n+ 1;
                    }
              }
          
      out.write(" \r\n");
      out.write("                \r\n");
      out.write("            </table>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </main>\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("          <footer>\r\n");
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
      out.write("    </body>\r\n");
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
