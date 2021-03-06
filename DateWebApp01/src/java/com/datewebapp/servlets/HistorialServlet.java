package com.datewebapp.servlets;

import com.datewebapp.logic.HistorialLogic;
import com.datewebapp.logic.ServiceLogic;
import com.datewebapp.logic.UserLogic;
import com.datewebapp.objects.HistorialObj;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.UserObj;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HistorialServlet", urlPatterns = {"/HistorialServlet"})
public class HistorialServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String connString = "jdbc:mysql://localhost:3306/usuariosweb?"
                                + "user=root&password=root"+
                                "&autoReconnect=true&useSSL=false&serverTimezone=UTC";
        
        UserLogic CLogic = new UserLogic(connString);
        ServiceLogic CServiceLogic = new ServiceLogic(connString);
        HistorialLogic CHistorialLogic = new HistorialLogic(connString);
        
        UserObj CUser = 
                (UserObj)request.getSession().getAttribute("logged_user");

            String strFormId = request.getParameter("formulario");
            
            if(strFormId.equals("3")){
                
                ServiceObj ServiceActual = 
                (ServiceObj)request.getSession().getAttribute("serviceacutal");
                
                int iId;
                int iUserId;
                int iServiceId;
                String strFecha;
                String strTime;
                String strPlace;
                String srtTelefono;
                
                iId=0;
                iUserId=CUser.getId();
                iServiceId=ServiceActual.getId();
                strFecha=request.getParameter("datepicker");
                strTime=request.getParameter("timepicker");
                strPlace=request.getParameter("lugar");
                srtTelefono=request.getParameter("telefono");
                
                String service = ServiceActual.getName();
                request.getSession().setAttribute("servicio", service);
                request.getSession().setAttribute("fecha", strFecha);
                request.getSession().setAttribute("hora", strTime);
                request.getSession().setAttribute("place", strPlace);   
                request.getSession().setAttribute("cell", srtTelefono);
                
                
                boolean hasFailed = CHistorialLogic.insertDate(iId, iServiceId, iUserId, strFecha, strTime, strPlace, srtTelefono);
                                
                 request.getRequestDispatcher("mensaje.jsp")
                       .forward(request, response);
            }
            
            else{
                            request.getRequestDispatcher("asfaMain.jsp")
                       .forward(request, response);
            }
            
            
            
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
