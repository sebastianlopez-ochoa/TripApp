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
public class EntRolUsuarioTripApp {

    private int id_rol;
    private String rol_usuario;

    public EntRolUsuarioTripApp() {
    }

    public EntRolUsuarioTripApp(int id_rol, String rol_usuario) {
        this.id_rol = id_rol;
        this.rol_usuario = rol_usuario;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol_usuario() {
        return rol_usuario;
    }

    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }
}
