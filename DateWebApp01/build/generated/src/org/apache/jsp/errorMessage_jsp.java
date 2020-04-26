package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class errorMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login Main</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"imagenes/Logo_2.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosCatalogo.css\">\n");
      out.write("        <script defer src=\"http://use.fontawesome.com/releases/v5.12.1/js//all.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosFormularios.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div align=\"center\"> <img src=\"imagenes/logo.jpeg\" alt=\"logo\" id=\"logo\"></div>\n");
      out.write("        \n");
      out.write("        ");
 String strMessage = (String)request.getSession().getAttribute("message"); 
      out.write("\n");
      out.write("        <p align=\"center\" style=\"color: red\">");
      out.print( strMessage );
      out.write("</p>\n");
      out.write("        <div class=\"izquierda\">\n");
      out.write("            <img src=\"imagenes/1_A.jpeg\" alt=\"prueba1\">\n");
      out.write("            <img src=\"imagenes/1_MP.jpeg\" alt=\"prueba2\">\n");
      out.write("            <img src=\"imagenes/1_TN.jpeg\" alt=\"prueba3\">\n");
      out.write("            <img src=\"imagenes/2_A.jpeg\" alt=\"prueba4\">\n");
      out.write("            <img src=\"imagenes/2_MP.jpeg\" alt=\"prueba5\">\n");
      out.write("            <img src=\"imagenes/2_TN.jpeg\" alt=\"prueba6\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("        <form action=\"UserServlet\" class=\"formulario\" id=\"logIn\" method=\"post\">\n");
      out.write("            \n");
      out.write("            Usuario:<br> \n");
      out.write("            <input type=\"text\" name=\"user\" class=\"datos\" required />\n");
      out.write("            <br><br>\n");
      out.write("            Contraseña: <br>\n");
      out.write("            <input type=\"password\" name=\"password\" class=\"datos\" required />\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" class=\"boton\" value=\"Ingresar\" />\n");
      out.write("            <input type=\"hidden\" name=\"formid\" value=\"1\" />\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <p>¿No tienes cuenta? <a href=\"register.jsp\">Regístrate</a></p>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container-footer-all\">\n");
      out.write("            \n");
      out.write("                <div class=\"container-body\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"column1\">\n");
      out.write("                        <h1>ASFA Nailed it!</h1>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <a><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                            <label>Síguenos en Facebook</label>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <i class=\"fab fa-instagram\" ></i>\n");
      out.write("                            <a href=\"https://www.instagram.com/asfa.nailedit/?hl=es-la\"><label >Síguenos en Instagram</label></a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <h3>Servicios en:</h3>\n");
      out.write("                            <p>ESEN</p>\n");
      out.write("                            <p>San Miguel</p>\n");
      out.write("                            <p>Vía del Mar</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <div class=\"column2\">\n");
      out.write("                        <h1>Servicios</h1>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label>Esmaltado Gel</label>\n");
      out.write("                        </div>\n");
      out.write("        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label>Acrílicos</label>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label>Uñas Acrílicas</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"column3\">\n");
      out.write("                        <h1>Información</h1>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <i class=\"fas fa-phone\"></i>\n");
      out.write("                            <label>Número de teléfono</label>\n");
      out.write("                            <br>\n");
      out.write("                            <p>+503 1234-5678<p>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <i class=\"fas fa-envelope\"></i>\n");
      out.write("                            <label>Correo Electrónico</label>\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"mailto:asfa.nailed@gmail.com\"><p>asfa.nailed@gmail.com</p></a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              \n");
      out.write("               \n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container-footer\">\n");
      out.write("\n");
      out.write("                <div class=\"information\">\n");
      out.write("                    <br>\n");
      out.write("                    <p>ASFA Nailed it! 2020 | Diseñado por Cayahuanca</p>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        <script src=\"Scripts/validate/jquery-1.8.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/validate/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Scripts/indexValidate.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("</html>");
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
