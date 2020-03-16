package com.datewebapp.objects;

public class DateObj 
{
    //variables de instancia
    private String nombre;
    private String día;
    private String servicio;
    private String lugar;
    
    //contrusctor de la clase
    public DateObj(String nombre, String dia, String servicio, String lugar) {
        setName(nombre);
        setTime(dia);
        setActivity(servicio);
        setPlace(lugar);
    }
    
    //crear métodos get y set para cada variable de instancia
    public String getName() {
        return nombre;
    }

    private void setName(String Nombre) {
        this.nombre = Nombre;
    }

    public String getTime() {
        return día;
    }

    private void setTime(String día) {
        this.día = día;
    }

    public String getActivity() {
        return servicio;
    }

    private void setActivity(String servicio) {
        this.servicio = servicio;
    }

    public String getPlace() {
        return lugar;
    }

    private void setPlace(String lugar) {
        this.lugar = lugar;
    }
    
}
