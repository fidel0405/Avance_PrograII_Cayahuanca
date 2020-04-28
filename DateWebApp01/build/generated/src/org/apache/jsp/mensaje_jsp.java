package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.datewebapp.objects.HistorialObj;
import com.datewebapp.logic.HistorialLogic;
import java.util.Iterator;
import java.util.List;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.UserObj;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.UserObj;
import com.datewebapp.logic.UserLogic;
import com.datewebapp.logic.ServiceLogic;

public final class mensaje_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Confirmación</title>\r\n");
      out.write("         <link rel=\"shortcut icon\" href=\"imagenes/Logo_2.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosCatalogo.css\">\r\n");
      out.write("        <script defer src=\"http://use.fontawesome.com/releases/v5.12.1/js//all.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("        <script src=\"scripts.js\"></script>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    ");

        String connString = "jdbc:mysql://localhost:3306/usuariosweb?"
                                + "user=root&password=root"+
                                "&autoReconnect=true&useSSL=false&serverTimezone=UTC";
        
        UserLogic CLogic = new UserLogic(connString);
        ServiceLogic CServiceLogic = new ServiceLogic(connString);
        HistorialLogic CHistorialLogic = new HistorialLogic(connString);
        
        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        
                HistorialObj HistorialMsg = CHistorialLogic.getHistorialMsg(CUser.getId());              
           
      out.write("\r\n");
      out.write("    ");

        
       String strServicio = HistorialMsg.getProductoName();
       String strFecha = HistorialMsg.getFecha();
       String strHora = HistorialMsg.getTime();
       String strPlace = HistorialMsg.getPlace();
       String strTelefono = HistorialMsg.getTelefono();
       

    
      out.write("\r\n");
      out.write("    <body class=\"men\">\r\n");
      out.write("     \r\n");
      out.write("        <main>    \r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("        \r\n");
      out.write("        <h1>Tu reservación ha sido hecha correctamente</h1>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <h3>¿Desear enviar un mensaje de confirmación, por medio de Whatsapp con los siguientes datos?</h3>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form action=\"HistorialServlet\">\r\n");
      out.write("            \r\n");
      out.write("            <p>Servicio:</p>\r\n");
      out.write("            <input id=\"servicio\" type=\"text\" value=\"");
      out.print(strServicio);
      out.write("\" readonly=\"true\"/>\r\n");
      out.write("            \r\n");
      out.write("            <p>Fecha:</p>\r\n");
      out.write("            <input id=\"datepicker\" name=\"datepicker\" type=\"text\" value=\"");
      out.print(strFecha);
      out.write("\" readonly=\"true\"/>\r\n");
      out.write("            \r\n");
      out.write("            <p>Hora:</p>\r\n");
      out.write("            <input id=\"timepicker\" name=\"timepicker\" type=\"text\" value=\"");
      out.print(strHora);
      out.write("\" readonly=\"true\"/>\r\n");
      out.write("            \r\n");
      out.write("            <p>Lugar:</p>\r\n");
      out.write("                <input id=\"lugar\" name=\"lugar\" type=\"text\" value=\"");
      out.print(strPlace);
      out.write("\" readonly=\"true\"/>\r\n");
      out.write("            <br><br>\r\n");
      out.write("                        \r\n");
      out.write("            <div id=\"respuesta\"></div>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"submit\" id=\"mandar\" class=\"button\" value=\"Enviar\">\r\n");
      out.write("                <a href=\"asfaMain.jsp\"><input type=\"button\" class=\"button\" name=\"mysubmit\" value=\"Cancelar\"/></a>\r\n");
      out.write("        </form>\r\n");
      out.write("            <script src=\"Scripts/form.js\"></script>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("            </main>\r\n");
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
