package com.datewebapp.servlets;

import com.datewebapp.objects.DateObj;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DateServlet", urlPatterns = {"/DateServlet"})
public class DateServlet extends HttpServlet 
{


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String name=request.getParameter("name");
        String dia=request.getParameter("dia");
        String servicio=request.getParameter("servicio");
        String lugar=request.getParameter("lugar");
        
        //crear clase POJO para guardar info para luego poder utilizarla
        DateObj date = new DateObj(name, dia, servicio, lugar);
        
        //vamos a guardar el objeto date en session de java
        request.getSession().setAttribute("dateobj", date);
        
        //redirigir la info guardada hacia una jsp
        response.sendRedirect("dateResult.jsp");
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
