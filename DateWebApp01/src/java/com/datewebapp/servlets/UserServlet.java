package com.datewebapp.servlets;

import com.datewebapp.logic.HistorialLogic;
import com.datewebapp.logic.UserLogic;
import com.datewebapp.logic.ServiceLogic;
import com.datewebapp.objects.UserObj;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.HistorialObj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, 
                                    HttpServletResponse response)
            throws ServletException, IOException 
    {
        //conexion a la bd en la compu de carlos asfabd
        String connString = "jdbc:mysql://localhost:3306/usuariosweb?"
                                + "user=root&password=12345678B-"+
                                "&autoReconnect=true&useSSL=false&serverTimezone=UTC";
        
        UserLogic CLogic = new UserLogic(connString);
        ServiceLogic CServiceLogic = new ServiceLogic(connString);
        HistorialLogic CHistorialLogic = new HistorialLogic(connString);
        
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
                List<ServiceObj> CList = CServiceLogic.getAllServices();
                List<ServiceObj> EsmaltesList= CServiceLogic.getEsmaltes();
                List<ServiceObj> TonosNudeList= CServiceLogic.getTonosNude();
                List<ServiceObj> AcrilicosList= CServiceLogic.getAcrilicos();
                List<HistorialObj> HistorialList= CHistorialLogic.getHistorialList(CLoginUser.getId());

                //log the user
                request.getSession().setAttribute("logged_user", CLoginUser);
                request.getSession().setAttribute("services", CList);
                request.getSession().setAttribute("esmaltes", EsmaltesList);
                request.getSession().setAttribute("tonosnude", TonosNudeList);
                request.getSession().setAttribute("acrilicos", AcrilicosList);
                request.getSession().setAttribute("historial", HistorialList);
                
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
        
        //ahora trabajaremos la parte de register
        
        if (strFormId.equals("2"))
        {
            //registrar usuario
            //necesito todos los datos del form de registro
            String strName = request.getParameter("name");
            String strLastname = request.getParameter("lastname");
            String strAge = request.getParameter("age");
            int iAge = Integer.parseInt(strAge);
            String strEmail = request.getParameter("email");
            String strUser = request.getParameter("user");
            String strPassword = request.getParameter("password");
            
            boolean hasFailed = CLogic.insertUser(strName, strLastname, iAge, strEmail, strUser, strPassword);
            
            request.getRequestDispatcher("index.jsp")
                   .forward(request, response);
            
        }
        
        Part fotoPerfil = request.getPart("fotoPerfil");
        String strFoto;
            //Guarda la imagen en el proyecto
            if (fotoPerfil.getSubmittedFileName().equals("")){
                strFoto = "user.png";
            } else {
                ServletContext context = request.getServletContext();
                String absolutePathToIndexJSP = context.getRealPath("/imagenes");
                InputStream is = fotoPerfil.getInputStream();
                strFoto = fotoPerfil.getSubmittedFileName();
                File f = new File(absolutePathToIndexJSP+"/"+strFoto);
                FileOutputStream ous = new FileOutputStream(f);
                int dato = is.read();
                while(dato!=-1)
                {
                    ous.write(dato);
                    dato = is.read();
                }
                ous.close();
                is.close();
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