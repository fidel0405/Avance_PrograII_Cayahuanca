
package com.datewebapp.logic;

import balcorpfw.database.DatabaseX;
import balcorpfw.logic.Logic;
import com.datewebapp.objects.HistorialObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HistorialLogic extends Logic
{
    public HistorialLogic(String connString) 
    {
        super(connString);
    }

    public List<HistorialObj> getHistorialList() {
        List<HistorialObj> HistorialList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "SELECT * FROM usuariosweb.citas\n";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iCitaId;
                String strUserName;
                String strServiceName;
                String strDate;
                String strTime;
                String strPlace;
                
                HistorialObj CTemp;
                HistorialList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iCitaId = CResult.getInt("idproduct");
                    strUserName = CResult.getString("username");
                    strServiceName = CResult.getString("servicio");
                    strDate = CResult.getString("fecha");
                    strTime = CResult.getString("hora");
                    strPlace = CResult.getString("lugar");
                    
                    CTemp = new HistorialObj(iId, iUserId, strName, strUserName, strService, strDate, strTime, strPlace);
                    HistorialList.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return HistorialList;
    }

}
