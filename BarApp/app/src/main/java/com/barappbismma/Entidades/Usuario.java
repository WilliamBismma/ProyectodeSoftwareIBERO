package com.barappbismma.Entidades;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class Usuario {

    private String id;
    private String nombre;
    private String perfil;
    private String dato;
    private Bitmap bitmap;
    private String entidad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDato() {
        return dato;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setDato(String dato) {
        this.dato = dato;

        try {

            byte[] bytecode = Base64.decode(dato, Base64.DEFAULT);
            this.bitmap = BitmapFactory.decodeByteArray(bytecode,0,bytecode.length);


        }catch (Exception e ){

            e.printStackTrace();
        }


    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

}
