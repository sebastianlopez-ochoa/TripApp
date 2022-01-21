/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SEBASTIAN
 */
public class EntLugarTripApp {

    private int id_lugar;
    private String nombre_lugar;
    private String punto_cardinal;
    private String ubicacion;
    private Object imagen;
    private String descripcion;

    public EntLugarTripApp() {
    }

    public EntLugarTripApp(int id_lugar, String nombre_lugar, String punto_cardinal, String ubicacion, Object imagen, String descripcion) {
        this.id_lugar = id_lugar;
        this.nombre_lugar = nombre_lugar;
        this.punto_cardinal = punto_cardinal;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getNombre_lugar() {
        return nombre_lugar;
    }

    public void setNombre_lugar(String nombre_lugar) {
        this.nombre_lugar = nombre_lugar;
    }

    public String getPunto_cardinal() {
        return punto_cardinal;
    }

    public void setPunto_cardinal(String punto_cardinal) {
        this.punto_cardinal = punto_cardinal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Object getImagen() {
        return imagen;
    }

    public void setImagen(Object imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
