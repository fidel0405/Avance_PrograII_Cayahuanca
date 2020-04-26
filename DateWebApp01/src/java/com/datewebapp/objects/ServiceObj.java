
package com.datewebapp.objects;

public class ServiceObj {
    
    private int m_iId;
    private String m_strName;
    private String m_strDescription;
    private String m_strType;
    private String m_strImage;

    public ServiceObj(int p_iId, String p_strName, 
            String p_strDescription,String p_strType, String p_strImage) 
    {
        setId(p_iId);
        setName(p_strName);
        setDescription(p_strDescription);
        setType(p_strType);
        setImage(p_strImage);
    }
    
    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        this.m_iId = p_iId;
    }

    public String getName() {
        return m_strName;
    }

    private void setName(String p_strName) {
        this.m_strName = p_strName;
    }

    public String getDescription() {
        return m_strDescription;
    }

    private void setDescription(String p_strDescription) {
        this.m_strDescription = p_strDescription;
    }
    
     public String getType() {
        return m_strType;
    }
     
    private void setType(String p_strType) {
        this.m_strType = p_strType;
    } 
    
     public String getImage() {
        return m_strImage;
    }
     
    private void setImage(String p_strImage) {
        this.m_strImage = p_strImage;
    }

}
