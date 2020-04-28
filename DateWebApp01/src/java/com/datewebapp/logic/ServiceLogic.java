
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
            {
                int iId;
                String strName;
                String strDescription;
                String strType;
                String strImage;
                
                ServiceObj CTemp;
                CList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strName = CResult.getString("name");
                    strDescription = CResult.getString("description");
                    strType = CResult.getString("type");
                    strImage = CResult.getString("image");
                    
                    CTemp = new ServiceObj(iId, strName, strDescription, strType, strImage);
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

    public List<ServiceObj> getEsmaltes() {
        
         List<ServiceObj> EsmaltesList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "	SELECT * FROM usuariosweb.servicios\n" +
"	where usuariosweb.servicios.type=\"MaquillajePermanente\";";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iId;
                String strName;
                String strDescription;
                String srtType;
                String strImage;
                
                ServiceObj CTemp;
                EsmaltesList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strName = CResult.getString("name");
                    strDescription = CResult.getString("description");
                    srtType = CResult.getString("type");
                    strImage = CResult.getString("image");
                    
                    CTemp = new ServiceObj(iId, strName, strDescription, srtType, strImage);
                    EsmaltesList.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return EsmaltesList;
    }

    public List<ServiceObj> getTonosNude() {
        List<ServiceObj> TonosNudeList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "	SELECT * FROM usuariosweb.servicios\n" +
"	where usuariosweb.servicios.type=\"TonosNude\";";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iId;
                String strName;
                String strDescription;
                String srtType;
                String strImage;
                
                ServiceObj CTemp;
                TonosNudeList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strName = CResult.getString("name");
                    strDescription = CResult.getString("description");
                    srtType = CResult.getString("type");
                    strImage = CResult.getString("image");
                    
                    CTemp = new ServiceObj(iId, strName, strDescription, srtType, strImage);
                    TonosNudeList.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return TonosNudeList;
    }

    public List<ServiceObj> getAcrilicos() {
        
                List<ServiceObj> AcrilicosList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "SELECT * FROM usuariosweb.servicios\n" +
"	where usuariosweb.servicios.type=\"Acrilicos\";";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iId;
                String strName;
                String strDescription;
                String srtType;
                String strImage;
                
                ServiceObj CTemp;
                AcrilicosList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strName = CResult.getString("name");
                    strDescription = CResult.getString("description");
                    srtType = CResult.getString("type");
                    strImage = CResult.getString("image");
                    
                    CTemp = new ServiceObj(iId, strName, strDescription, srtType, strImage);
                    AcrilicosList.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return AcrilicosList;
    }
    
}
