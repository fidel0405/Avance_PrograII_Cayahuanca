package com.datewebapp.objects;

public final class DateObj 
{
    //variables de instancia
    private String nombre;
    private String dia;
    private String servicio;
    private String lugar;
    private String apellido;
    private String telefono;
    private String dui;
    
    public DateObj(String name, String dia, String servicio, String lugar, String telefono, String apellido, String dui) {
        setNombre(name);
        setDia(dia);
        setServicio(servicio);
        setLugar(lugar);
        setApellido(apellido);
        setTelefono(telefono);
        setDui(dui);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    
}
