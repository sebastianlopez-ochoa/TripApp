/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.EntUsuarioTripApp;
import Utilidades.ConexionBDA;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBASTIAN
 */
public class UsuarioTripAppDaos extends ConexionBDA {

    public UsuarioTripAppDaos() {
    }
    String consulta;
    PreparedStatement ps = null;

    public String Registro(int id_usuario, String email, String contrasena, int id_rol) {
        String respuesta = null;

        try {
            consulta = "INSERT INTO usuario(id_usuario,email,contrasena,id_rol) VALUES(?,?,?,?)";
            ps = getcon().prepareStatement(consulta);
            ps.setInt(1, id_usuario);
            ps.setString(2, email);
            ps.setString(3, contrasena);
            ps.setInt(4, id_rol);

            int result = ps.executeUpdate();
            respuesta = "El usuario se ha registrado exitosamente";
        } catch (SQLException ex) {
            respuesta = "<b><font Color='#00ffab'>"
                    + "Registro: " + email + " " + "Fail"
                    + ex.getMessage() + "</font></b><br>";
        } finally {
            try {
                if (getcon() != null) {
                    getcon().close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
            }
        }
        return respuesta;
    }

    public EntUsuarioTripApp buscarRegistro(String id_usuario) {
        //objeto de tipo class
        EntUsuarioTripApp aux = new EntUsuarioTripApp();
        consulta = "SELECT * FROM usuario WHERE id_usuario=?";
        try {
            //preparamos la sentencia sql
            ps = getcon().prepareStatement(consulta);
            ps.setString(1, id_usuario);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                aux.setId_usuario(resultado.getInt(1));
                aux.setEmail(resultado.getString(2));
                aux.setContrasena(resultado.getString(3));
                aux.setId_rol(resultado.getInt(4));
            }//fin while

        } catch (SQLException e) {
        } finally {
            try {
                if (getcon() != null) {
                    getcon().close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
            }
        }
        return aux;
    }
}
