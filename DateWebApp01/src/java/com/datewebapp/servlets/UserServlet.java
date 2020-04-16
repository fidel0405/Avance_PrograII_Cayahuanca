package com.asfaapp01.servlets;

import com.asfaapp01.logic.UserLogic;
import com.asfaapp01.objects.UserObj;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, 
                                    HttpServletResponse response)
            throws ServletException, IOException 
    {
        //conexion a la bd en la compu de carlos asfabd
        String connString = "jdbc:mysql://localhost:3306/sistemax?"
                                + "user=root&password=root"+
                                "&autoReconnect=true&useSSL=false&serverTimezone=UTC";
        
        UserLogic CLogic = new UserLogic(connString);
        
        //en este servlet vamos a manejar el log in y el register de los usuarios
        //primero veremos el log in
        
        String strFormId = request.getParameter("formid");
        
        if(strFormId.equals("1"))
        {
            //se trata de un form log in
            
            //estos dos parametros se capturan para el metodo
            String strUser = request.getParameter("user");
            String strPassword = request.getParameter("password");
            
            //metodo para ver si el usuario esta registrado o no
            UserObj CLoginUser = CLogic.getUserInDB(strUser, strPassword);
            
            //verificacion
            if(CLoginUser!=null)
            {
                //el metodo devolvio informacion 
                request.getSession().setAttribute("logged_user", CLoginUser);
                
                request.getRequestDispatcher("asfaMain.jsp")
                       .forward(request, response);
            }
            else
            {
                String strMessage = "El usuario o la contraseña son incorrectas, por favor intentalo de nuevo";
                request.getSession().setAttribute("message", strMessage);
                
                //usuario o password estan equivocados
                request.getRequestDispatcher("errorMessage.jsp")
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