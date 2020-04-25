
package com.datewebapp.objects;

public class ServicioObj {
    
    private int m_iId;
    private String m_strName;
    private String m_strTipo;
    private String m_strImage;

    public ServicioObj(int p_iId, String p_strName, String p_strTipo, String p_strImage) {
        setId(p_iId);
        setName(p_strName);
        setTipo(p_strTipo);
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

    public String getTipo() {
        return m_strTipo;
    }

    private void setTipo(String p_strTipo) {
        this.m_strTipo = p_strTipo;
    }

    public String getImage() {
        return m_strImage;
    }

    private void setImage(String p_strImage) {
        this.m_strImage = p_strImage;
    }
    
    
}
