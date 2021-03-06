    
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

    public List<HistorialObj> getHistorialList(int p_intUser) {
        List<HistorialObj> HistorialList = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "SELECT usuariosweb.citas.idReservacion, usuariosweb.usuarios.idUsuario, usuariosweb.servicios.idService, usuariosweb.citas.fecha, \n" +
"usuariosweb.citas.hora, usuariosweb.citas.lugar, usuariosweb.citas.telefono, usuariosweb.servicios.service_name, usuariosweb.usuarios.usuario_name\n" +
" FROM usuariosweb.usuarios inner join usuariosweb.citas on usuariosweb.usuarios.idUsuario=usuariosweb.citas.idUser\n" +
"inner join usuariosweb.servicios on usuariosweb.citas.idProduct=usuariosweb.servicios.IdService\n" +
"where usuariosweb.usuarios.idUsuario="+p_intUser+";";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iId;
                int iUserId;
                int iServiceId;
                String strFecha;
                String strTime;
                String strPlace;
                String srtTelefono;
                String strProductoName;
                String strUserName;
                
                HistorialObj CTemp;
                HistorialList = new ArrayList<>();
                
                while(CResult.next())
                {
                    iId = CResult.getInt("idReservacion");
                    iUserId = CResult.getInt("idUsuario");
                    iServiceId = CResult.getInt("idService");
                    strFecha= CResult.getString("fecha");
                    strTime = CResult.getString("hora");
                    strPlace = CResult.getString("lugar");
                    srtTelefono= CResult.getString("telefono");
                    strProductoName = CResult.getString("service_name");
                    strUserName = CResult.getString("usuario_name");
                    
                    CTemp = new HistorialObj(iId, iUserId,iServiceId, strFecha, strTime, strPlace, srtTelefono ,strProductoName, strUserName);
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

    public boolean insertDate(int iId, int iServiceId, int iUserId, String strFecha, String strTime, String strPlace, String srtTelefono) {
        boolean hasFailed;
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO `usuariosweb`.`citas` (`idReservacion`, `idProduct`, `idUser`, `fecha`, `hora`, `lugar`, `telefono`) VALUES ('"+iId+"', '"+iServiceId+"', '"+iUserId+"', '"+strFecha+"', '"+strTime+"', '"+strPlace+"', '"+srtTelefono+"');";
        hasFailed = database.executeNonQueryBool(strSql);
        return hasFailed;
    }
    
    public HistorialObj getHistorialMsg(int p_intUser) {
        
        HistorialObj HistorialMsg = null;
        DatabaseX CDatabase = getDatabase();
        String strSql = "SELECT usuariosweb.citas.idReservacion, usuariosweb.usuarios.idUsuario, usuariosweb.servicios.idService, usuariosweb.citas.fecha, \n" +
"usuariosweb.citas.hora, usuariosweb.citas.lugar, usuariosweb.citas.telefono, usuariosweb.servicios.service_name, usuariosweb.usuarios.usuario_name\n" +
" FROM usuariosweb.usuarios inner join usuariosweb.citas on usuariosweb.usuarios.idUsuario=usuariosweb.citas.idUser\n" +
"inner join usuariosweb.servicios on usuariosweb.citas.idProduct=usuariosweb.servicios.IdService\n" +
"where usuariosweb.usuarios.idUsuario=\""+p_intUser+"\"\n" +
"order by usuariosweb.citas.idReservacion desc\n" +
"limit 1;";

        ResultSet CResult = CDatabase.executeQuery(strSql);
        
        if(CResult!=null)
        {
            try 
            {
                int iId;
                int iUserId;
                int iServiceId;
                String strFecha;
                String strTime;
                String strPlace;
                String srtTelefono;
                String strProductoName;
                String strUserName;
                
                while(CResult.next())
                {
                    iId = CResult.getInt("idReservacion");
                    iUserId = CResult.getInt("idUsuario");
                    iServiceId = CResult.getInt("idService");
                    strFecha= CResult.getString("fecha");
                    strTime = CResult.getString("hora");
                    strPlace = CResult.getString("lugar");
                    srtTelefono= CResult.getString("telefono");
                    strProductoName = CResult.getString("service_name");
                    strUserName = CResult.getString("usuario_name");
                    
                    HistorialMsg = new HistorialObj(iId, iUserId,iServiceId, strFecha, strTime, strPlace, srtTelefono ,strProductoName, strUserName);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UserLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return HistorialMsg;
    }

}
