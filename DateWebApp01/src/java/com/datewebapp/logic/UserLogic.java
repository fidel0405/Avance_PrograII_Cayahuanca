package com.datewebapp.logic;

import balcorpfw.database.DatabaseX;
import balcorpfw.logic.Logic;
import com.datewebapp.objects.UserObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserLogic extends Logic
{

   public UserLogic(String connString) 
    {
        super(connString);
    }
   
   public UserObj getUserInDB(String p_strUser, String p_strPassword)
   {
       //1. obtener el resultado con los parametros de usuario y contraseña
       UserObj CUserInDB = null;
       DatabaseX CDatabase = getDatabase();
       String strSQL = "select * "
                + "from usuariosweb.usuarios "
                + "where user like '"+p_strUser+"' "
                + "and password like '"+p_strPassword+"';";
        ResultSet CResult = CDatabase.executeQuery(strSQL);
        
        //2. ver si el usuario esta y capturar los datos
        if(CResult!=null)
        {
          
           try 
           {
               //ahora creamos las variables locales para el userobj
               //campos bd son (id, name, lastname, age, email, user, password)
               int iId;
               String strName;
               String strLastname;
               int iAge;
               String strEmail;
               String strUser;
               String strPassword;
               String strPicture;
               
               
               while(CResult.next())
               {
                   iId = CResult.getInt("idUsuario");
                   strName = CResult.getString("usuario_name");
                   strLastname = CResult.getString("lastname");
                   iAge = CResult.getInt("age");
                   strEmail = CResult.getString("email");
                   strUser = CResult.getString("user");
                   strPassword = CResult.getString("password");
                   strPicture = CResult.getString("picture");
                   
                   //ahora que hemos capturado los datos solo necesitamos crear el objeto
                   CUserInDB = new UserObj(iId, strName, strLastname, iAge, strEmail, strUser, strPassword, strPicture);
                   
               }
           } 
           catch (SQLException ex) 
           {
               Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
      
      //3. devolver la informacion del usuario si esta
      return CUserInDB; 
   }
   
   public boolean insertUser(String p_strName, String p_strLastname, int p_iAge, 
                            String p_strEmail, String p_strUser, String p_strPassword, String p_strPicture)  
    {
        boolean hasFailed;
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO usuariosweb.usuarios"
                + "(idUsuario, usuario_name, lastname, age, email, user, password, picture)"
                + "VALUES(0,'"+p_strName+"','"+p_strLastname+"','"+p_iAge+"','"+p_strEmail+"','"+p_strUser+"','"+p_strPassword+"','"+p_strPicture+"');";
        hasFailed = database.executeNonQueryBool(strSql);
        return hasFailed;
    }
   
   public boolean updatePicture(String strPicture, int p_iId)  
    {
        boolean hasFailed;
        DatabaseX database = getDatabase();
        String strSql = "UPDATE usuariosweb.usuarios SET picture = '"+strPicture+"' WHERE (idUsuario = '"+p_iId+"');";
        hasFailed = database.executeNonQueryBool(strSql);
        return hasFailed;
    }
           
}