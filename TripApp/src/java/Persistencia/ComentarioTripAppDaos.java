/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Utilidades.ConexionBDA;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SEBASTIAN
 */
public class ComentarioTripAppDaos extends ConexionBDA{

    public ComentarioTripAppDaos() {
    }
    String consulta;
    PreparedStatement ps = null;
    Connection con;
    ConexionBDA cn = new ConexionBDA();  
    ResultSet rs;
    
    public String Registro(int id_comentario, String nombre_persona, String comentario, int id_lugar) {
        String respuesta = null;

        try {
            consulta = "INSERT INTO comentario(id_comentario,nombre_persona,comentario,id_lugar) VALUES(?,?,?,?)";
            ps = getcon().prepareStatement(consulta);
            ps.setInt(1, id_comentario);
            ps.setString(2, nombre_persona);
            ps.setString(3, comentario);
            ps.setInt(4, id_lugar);

            int result = ps.executeUpdate();
            respuesta = "El comentario se ha registrado exitosamente";
        } catch (SQLException ex) {
            respuesta = "<b><font Color='#00ffab'>"
                    + "Registro: " + id_comentario + " " + "Fail"
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
}
