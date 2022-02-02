/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.EntLugarTripApp;
import Persistencia.LugarTripAppDaos;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBASTIAN
 */
public class NegLugarTripApp {

    public LugarTripAppDaos datos;

    public NegLugarTripApp() {
        this.datos = new LugarTripAppDaos();
    }

    public void Registro(EntLugarTripApp registro) throws Exception {

        String mensajeError = "";
        //defino las variables
        int id_lugar = registro.getId_lugar();
        String nombre_lugar = registro.getNombre_lugar();
        String punto_cardinal = registro.getPunto_cardinal();
        String ubicacion = registro.getUbicacion();
        Object imagen = registro.getImagen();
        String descripcion = registro.getDescripcion();
        //verificación de datos
        if ("".equals(id_lugar)) {
            mensajeError = mensajeError + "Id lugar no valido";
        }
        if (nombre_lugar == null || "".equals(nombre_lugar)) {
            mensajeError = mensajeError + "Nombre lugar no valido";
        }
        if (punto_cardinal == null || "".equals(punto_cardinal)) {
            mensajeError = mensajeError + "Punto cardinal no valido";
        }
        if (ubicacion == null || "".equals(ubicacion)) {
            mensajeError = mensajeError + "Ubicacion no valido";
        }
        if (imagen == null) {
            mensajeError = mensajeError + "imagen no valido";
        }
        if (descripcion == null || "".equals(descripcion)) {
            mensajeError = mensajeError + "Descripcion no valido";
        }

        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }//fin mensaje de error
        mensajeError = datos.Registro(id_lugar, nombre_lugar, punto_cardinal, ubicacion, imagen, descripcion);
        //mensaje de error al admin
        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }//fin mensaje de error
    }

    public void actualizarLugar(EntLugarTripApp actualizar) throws Exception {

        //variable de mensaje
        String mensajeError = "";
        //defino las variables
        int id_lugar = actualizar.getId_lugar();
        String nombre_lugar = actualizar.getNombre_lugar();
        String punto_cardinal = actualizar.getPunto_cardinal();
        String ubicacion = actualizar.getUbicacion();
        Object imagen = actualizar.getImagen();
        String descripcion = actualizar.getDescripcion();

        //verificación de datos
        if ("".equals(id_lugar)) {
            mensajeError = mensajeError + "Id lugar no valido";
        }
        if (nombre_lugar == null || "".equals(nombre_lugar)) {
            mensajeError = mensajeError + "Nombre lugar no valido";
        }
        if (punto_cardinal == null || "".equals(punto_cardinal)) {
            mensajeError = mensajeError + "Punto cardinal no valido";
        }
        if (ubicacion == null || "".equals(ubicacion)) {
            mensajeError = mensajeError + "Ubicacion no valido";
        }
        if (imagen == null) {
            mensajeError = mensajeError + "imagen no valido";
        }
        if (descripcion == null || "".equals(descripcion)) {
            mensajeError = mensajeError + "Descripcion no valido";
        }

        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }
        mensajeError = datos.ActualizarLugar(id_lugar, nombre_lugar, punto_cardinal, ubicacion, imagen, descripcion);
        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }
    }//fin actualizarAdmin

    public List<EntLugarTripApp> ListaLugar() {

        return datos.ListaLugar();
    }
    
    public String EliminarLugar(int id_lugar) {
        String respuesta = datos.EliminarLugar(id_lugar);
        return respuesta;
    }

}
