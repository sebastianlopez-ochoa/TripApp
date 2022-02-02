/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.EntLugarTripApp;
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
public class LugarTripAppDaos extends ConexionBDA {

    public LugarTripAppDaos() {
    }
    String consulta;
    PreparedStatement ps = null;

    public String Registro(int id_lugar, String nombre_lugar, String punto_cardinal, String ubicacion, Object imagen, String descripcion) {
        String respuesta = null;

        try {
            consulta = "INSERT INTO lugar(id_lugar,nombre_lugar,punto_cardinal,ubicacion,imagen,descripcion) VALUES(?,?,?,?,?,?)";
            ps = getcon().prepareStatement(consulta);
            ps.setInt(1, id_lugar);
            ps.setString(2, nombre_lugar);
            ps.setString(3, punto_cardinal);
            ps.setString(4, ubicacion);
            ps.setObject(5, imagen);
            ps.setString(6, descripcion);

            int result = ps.executeUpdate();
            respuesta = "El lugar se ha registrado exitosamente";
        } catch (SQLException ex) {
            respuesta = "<b><font Color='#00ffab'>"
                    + "Registro: " + nombre_lugar + " " + "Fail"
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

    public String ActualizarLugar(int id_lugar, String nombre_lugar, String punto_cardinal, String ubicacion, Object imagen, String descripcion) {

        String respuesta = null;
        try {
            consulta = "UPDATE lugar SET nombre_lugar=?,punto_cardinal=?,"
                    + "ubicacion=?,imagen=?,descripcion=? Where id_lugar=? ";

            ps = getcon().prepareStatement(consulta);
            ps.setString(1, nombre_lugar);
            ps.setString(2, punto_cardinal);
            ps.setString(3, ubicacion);
            ps.setObject(4, imagen);
            ps.setString(5, descripcion);
            ps.setInt(6, id_lugar);

            if (ps.executeUpdate() > 0) {
                System.out.println("Datos Actualizados");
            }
            respuesta = "Se ha actualizado el lugar";
        } catch (SQLException ex) {
            respuesta = "<b><font Color='red'>"
                    + "id_producto: " + nombre_lugar + " " + "Fail"
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

    public List<EntLugarTripApp> ListaLugar() {
        List<EntLugarTripApp> lista = new ArrayList<>();
        try {
            consulta = "Select * From lugar";
            ResultSet resultado = getcon().prepareStatement(consulta).executeQuery();
            EntLugarTripApp aux = new EntLugarTripApp();
            while (resultado.next()) {

                aux.setId_lugar(resultado.getInt(1));
                aux.setNombre_lugar(resultado.getString(2));
                aux.setPunto_cardinal(resultado.getString(3));
                aux.setUbicacion(resultado.getString(4));
                aux.setImagen(resultado.getObject(5));
                aux.setDescripcion(resultado.getString(6));
                lista.add(aux);

            }//FIN WHILE
        } catch (SQLException ex) {

        } finally {
            try {
                if (getcon() != null) {
                    getcon().close();
                }
            } catch (SQLException e) {
            }
        }
        return lista;
    }

    public String EliminarLugar(int id_lugar) {
        String respuesta = null;
        consulta = "DELETE FROM lugar WHERE id_lugar =?";
        try {
            ps = getcon().prepareStatement(consulta);
            ps.setInt(1, id_lugar);
            ps.executeUpdate();
            respuesta = "Se ha borrado el lugar";
        } catch (SQLException ex) {
            respuesta = "<b><font Color='red'>"
                    + "producto: " + id_lugar + " " + "Fail"
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
            return respuesta;
        }
    }

}
