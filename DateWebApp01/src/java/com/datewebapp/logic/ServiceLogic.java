
package com.datewebapp.logic;

import balcorpfw.database.DatabaseX;
import balcorpfw.logic.Logic;
import com.datewebapp.objects.ServiceObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServiceLogic extends Logic 
{
    public ServiceLogic(String connString) 
    {
        super(connString);
    }

    public List<ServiceObj> getAllServices() {
        List<ServiceObj> CList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "SELECT * FROM usuariosweb.servicios\n" +
"WHERE usuariosweb.servicios.home=1 ;;";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
                
                //`id`
  //`name` 
  //`description` 
  //`type` 
  //`image` 
  //`home` 
            {
                int iId;
                String strName;
                String strDescription;
                String srtType;
                String strImage;
                
                ServiceObj CTemp;
                CList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strName = CResult.getString("name");
                    strDescription = CResult.getString("description");
                    srtType = CResult.getString("type");
                    strImage = CResult.getString("image");
                    
                    CTemp = new ServiceObj(iId, strName, strDescription, srtType, strImage);
                    CList.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return CList;
    }
    
}
