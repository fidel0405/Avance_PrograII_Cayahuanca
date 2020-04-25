package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Register Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosCatalogo.css\">\r\n");
      out.write("        <script defer src=\"http://use.fontawesome.com/releases/v5.12.1/js//all.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosFormularios.css\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("    <body>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div align=\"center\"> <img src=\"imagenes/Logo.png\" alt=\"logo\" id=\"logo\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"izquierda\">\r\n");
      out.write("            <img src=\"imagenes/1_A.jpeg\" alt=\"prueba1\">\r\n");
      out.write("            <img src=\"imagenes/1_MP.jpeg\" alt=\"prueba2\">\r\n");
      out.write("            <img src=\"imagenes/1_TN.jpeg\" alt=\"prueba3\">\r\n");
      out.write("            <img src=\"imagenes/2_A.jpeg\" alt=\"prueba4\">\r\n");
      out.write("            <img src=\"imagenes/2_MP.jpeg\" alt=\"prueba5\">\r\n");
      out.write("            <img src=\"imagenes/2_TN.jpeg\" alt=\"prueba6\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("        <form action=\"UserServlet\" class=\"formulario\" method=\"post\">\r\n");
      out.write("            \r\n");
      out.write("            Nombre:<br> \r\n");
      out.write("            <input type=\"text\" name=\"name\" class=\"datos\" required />\r\n");
      out.write("            <br>\r\n");
      out.write("            Apellido:<br> \r\n");
      out.write("            <input type=\"text\" name=\"lastname\" class=\"datos\" required />\r\n");
      out.write("            <br>\r\n");
      out.write("            Edad:<br> \r\n");
      out.write("            <input type=\"number\" name=\"age\" class=\"datos\" required />\r\n");
      out.write("            <br>\r\n");
      out.write("            Correo:<br> \r\n");
      out.write("            <input type=\"email\" name=\"email\" class=\"datos\" required />\r\n");
      out.write("            <br>\r\n");
      out.write("            user:<br> \r\n");
      out.write("            <input type=\"text\" name=\"user\" class=\"datos\" required />\r\n");
      out.write("            <br>\r\n");
      out.write("            Contraseña: <br>\r\n");
      out.write("            <input type=\"password\" name=\"password\" class=\"datos\" id=\"password\" required />\r\n");
      out.write("            <br>\r\n");
      out.write("            Confirmar contraseña: <br>\r\n");
      out.write("            <input type=\"password\" name=\"password\" class=\"datos\" id=\"confirm_password\" required />\r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <input type=\"submit\" class=\"boton\" value=\"Registrate\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"formid\" value=\"2\" />\r\n");
      out.write("            \r\n");
      out.write("            <br><br>            \r\n");
      out.write("        </form>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("                \r\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
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
      out.write("                            <a href=\"https://www.instagram.com/asfa.nailedit/?hl=es-la\"><i class=\"fab fa-instagram\" ></i></a>\r\n");
      out.write("                            <a href=\"https://www.instagram.com/asfa.nailedit/?hl=es-la\"><label >Síguenos en Instagram</label></a>\r\n");
      out.write("                        </div>\r\n");
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
      out.write("        \r\n");
      out.write("        <script src=\"Scripts/passwordConfirm.js\" type=\"text/javascript\"></script>        \r\n");
      out.write("        \r\n");
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
