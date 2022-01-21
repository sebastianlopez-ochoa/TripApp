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
public class EntComentarioTripApp {

    private int id_comentario;
    private String nombre_persona;
    private String comentario;
    private int id_lugar;
    private int id_usuario;

    public EntComentarioTripApp() {
    }

    public EntComentarioTripApp(int id_comentario, String nombre_persona, String comentario, int id_lugar, int id_usuario) {
        this.id_comentario = id_comentario;
        this.nombre_persona = nombre_persona;
        this.comentario = comentario;
        this.id_lugar = id_lugar;
        this.id_usuario = id_usuario;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
