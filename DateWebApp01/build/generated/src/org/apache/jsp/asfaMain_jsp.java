package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.UserObj;

public final class asfaMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta httpe-quiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Main page</title>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");
        List<ServiceObj> CList = 
                (List<ServiceObj>)request.getSession().getAttribute("services");
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Store Main</h1>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("            <label>Bienvenido, ");
      out.print( CUser.getUser() );
      out.write("</label><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        \r\n");
      out.write("        <table style=\"width:50%\" border=\"1\">\r\n");
      out.write("            \r\n");
      out.write("          ");

              if(CList!=null)
              {
                  Iterator<ServiceObj> ite = CList.iterator();
                  ServiceObj CTemp;
                  while(ite.hasNext())
                  {
                      CTemp = ite.next();
          
      out.write("  \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><img src=\"images/");
      out.print( CTemp.getImage() );
      out.write("\" width=\"64\" height=\"128\" /></td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <p>");
      out.print( CTemp.getName() );
      out.write("</p>\r\n");
      out.write("                      \r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <p>");
      out.print( CTemp.getDescription() );
      out.write("</p>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("          ");

                    }
              }
          
      out.write("\r\n");
      out.write("          \r\n");
      out.write("        </table>\r\n");
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