package com.datewebapp.objects;

//creación del pojo

public class UserObj 
{
    //variables de instancia
    //campos bd (id, name, lastname, age, email, user, password)

    private int m_iId;
    private String m_strName;
    private String m_strLastname;
    private int m_iAge;
    private String m_strEmail;
    private String m_strUser;
    private String m_strPassword;
    private String m_strPicture;
    
    
    //constructor

    public UserObj(int p_iId, String p_strName, String p_strLastname, int p_iAge, 
                    String p_strEmail, String p_strUser, String p_strPassword, String p_strPicture) 
    {
        setId(p_iId);
        setName(p_strName);
        setLastname(p_strLastname);
        setAge(p_iAge);
        setEmail(p_strEmail);
        setUser(p_strUser);
        setPassword(p_strPassword);
        setPicture(p_strPicture);
    }

    //getters and setters
    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public String getName() {
        return m_strName;
    }

    private void setName(String p_strName) {
        m_strName = p_strName;
    }

    public String getLastname() {
        return m_strLastname;
    }

    private void setLastname(String p_strLastname) {
        m_strLastname = p_strLastname;
    }

    public int getAge() {
        return m_iAge;
    }

    private void setAge(int p_iAge) {
        m_iAge = p_iAge;
    }

    public String getEmail() {
        return m_strEmail;
    }

    private void setEmail(String p_strEmail) {
        m_strEmail = p_strEmail;
    }

    public String getUser() {
        return m_strUser;
    }

    private void setUser(String p_strUser) {
        m_strUser = p_strUser;
    }

    public String getPassword() {
        return m_strPassword;
    }

    private void setPassword(String p_strPassword) {
        m_strPassword = p_strPassword;
    }
    
    private void setPicture(String p_strPicture) {
        m_strPicture = p_strPicture;
    }

    public String getPicture() {
        return m_strPicture;
     
    }
}