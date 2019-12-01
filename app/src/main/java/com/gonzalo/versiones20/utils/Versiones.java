package com.gonzalo.versiones20.utils;

import java.io.Serializable;

public class Versiones implements Serializable {

    String nombre,descripcion;
    int logo,logoGrande,version,fecha;

    public Versiones(String nombre, int logo,int logoGrande,int version,int fecha,String descripcion){
        this.nombre = nombre;
        this.logo = logo;
        this.fecha = fecha;
        this.logoGrande = logoGrande;
        this.version = version;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getFecha() {
        return fecha;
    }

    public int getLogo() {
        return logo;
    }

    public int getLogoGrande() {
        return logoGrande;
    }

    public int getVersion() {
        return version;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setLogoGrande(int logoGrande) {
        this.logoGrande = logoGrande;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


}
