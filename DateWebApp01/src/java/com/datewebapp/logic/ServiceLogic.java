
package com.datewebapp.logic;

import balcorpfw.database.DatabaseX;
import balcorpfw.logic.Logic;
import com.datewebapp.objects.ServiceObj;
import com.datewebapp.objects.UserObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServiceLogic extends Logic 
{

    public List<ServiceObj> getAllServices() {
        List<ServiceObj> CList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "SELECT * FROM gamestoredb.game;";
        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iId;
                String strName;
                String strGenres;
                String strImage;
                GameObj CTemp;
                CList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strName = CResult.getString("name");
                    strGenres = CResult.getString("genre");
                    strImage = CResult.getString("image");
                    
                    CTemp = new GameObj(iId, strName, strGenres, strImage);
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
