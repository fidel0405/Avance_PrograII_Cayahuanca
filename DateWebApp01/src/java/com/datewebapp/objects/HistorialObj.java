
package com.datewebapp.objects;

public class HistorialObj {
    private int m_iId;
    private int m_iUserId;
    private int m_iServiceId;
    private String m_strFecha;
    private String m_strTime;
    private String m_strPlace;
    private String m_srtTelefono;
    private String m_strProductoName;
    private String m_strUserName;

    public HistorialObj(int p_iId, int p_iUserId, int p_iServiceId, 
           String p_strFecha, String p_strTime, String p_strPlace, String p_srtTelefono, String p_strProductoName, String p_strUserName) 
    {
        setId(p_iId);
        setUserId(p_iUserId);
        setServiceId(p_iServiceId);
        setFecha(p_strFecha);
        setTime(p_strTime);
        setPlace(p_strPlace);
        setTelefono(p_srtTelefono);
        setProductoName(p_strProductoName);
        setUserName(p_strUserName);
    }
    
    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public int getUserId() {
        return m_iUserId;
    }

    private void setUserId(int p_iUserId) {
        m_iUserId = p_iUserId;
    }

    public int getServiceId() {
        return m_iServiceId;
    }

    private void setServiceId(int p_iServiceId) {
        m_iServiceId = p_iServiceId;
    }

    public String getFecha() {
        return m_strFecha;
    }

    private void setFecha(String p_strFecha) {
        this.m_strFecha = p_strFecha;
    }

    public String getTime() {
        return m_strTime;
    }

    private void setTime(String p_strTime) {
        this.m_strTime = p_strTime;
    }

    public String getPlace() {
        return m_strPlace;
    }

    private void setPlace(String p_strPlace) {
        this.m_strPlace = p_strPlace;
    }

    public String getTelefono() {
        return m_srtTelefono;
    }

    private void setTelefono(String p_srtTelefono) {
        this.m_srtTelefono = p_srtTelefono;
    }

    public String getProductoName() {
        return m_strProductoName;
    }

    private void setProductoName(String p_strProductoName) {
        this.m_strProductoName = p_strProductoName;
    }

    public String getUserName() {
        return m_strUserName;
    }

    private void setUserName(String p_strUserName) {
        this.m_strUserName = p_strUserName;
    }
    
}

