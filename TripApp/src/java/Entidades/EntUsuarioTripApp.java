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
public class EntUsuarioTripApp {

    private int id_usuario;
    private String email;
    private String contrasena;
    private int id_rol;

    public EntUsuarioTripApp() {
    }

    public EntUsuarioTripApp(int id_usuario, String email, String contrasena, int id_rol) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.contrasena = contrasena;
        this.id_rol = id_rol;
    }

    public EntUsuarioTripApp(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
}
