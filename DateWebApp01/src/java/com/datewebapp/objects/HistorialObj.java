
package com.datewebapp.objects;

public class HistorialObj {
    private int m_iId;
    private int m_iUserId;
    private String m_strName;
    private String m_strUserName;
    private String m_strService;
    private String m_strFecha;
    private String m_strTime;
    private String m_strPlace;

    public HistorialObj(int p_iId, int p_iUserId, String p_strName, String p_strUserName, 
           String p_strService, String p_strFecha,String p_strTime, String p_strPlace) 
    {
        setId(p_iId);
        setUserId(p_iUserId);
        setName(p_strName);
        setUserName(p_strUserName);
        setService(p_strService);
        setFecha(p_strFecha);
        setTime(p_strTime);
        setPlace(p_strPlace);
    }
    
    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        this.m_iId = p_iId;
    }
    
    public int getUserId() {
        return m_iUserId;
    }

    private void setUserId(int p_iUserId) {
        this.m_iUserId = p_iUserId;
    }

    public String getName() {
        return m_strName;
    }

    private void setName(String p_strName) {
        this.m_strName = p_strName;
    }

    public String getUserName() {
        return m_strUserName;
    }

    private void setUserName(String p_strUserName) {
        this.m_strUserName = p_strUserName;
    }
    
     public String getService() {
        return m_strService;
    }
     
    private void setService(String p_strService) {
        this.m_strService = p_strService;
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

}

