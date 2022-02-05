/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.EntComentarioTripApp;
import Entidades.EntLugarTripApp;
import Persistencia.ComentarioTripAppDaos;
import java.io.InputStream;

/**
 *
 * @author SEBASTIAN
 */
public class NegComentarioTripApp {
    public ComentarioTripAppDaos datos;

    public NegComentarioTripApp() {
        this.datos = new ComentarioTripAppDaos();
    }
    
    public void Registro(EntComentarioTripApp registro) throws Exception {

        String mensajeError = "";
        //defino las variables
        String nombre_persona = registro.getNombre_persona();
        String comentario = registro.getComentario();
        int id_lugar = registro.getId_lugar();
        //verificación de datos
        if (nombre_persona == null || "".equals(nombre_persona)) {
            mensajeError = mensajeError + "Nombre persona no valido";
        }
        if (comentario == null || "".equals(comentario)) {
            mensajeError = mensajeError + "Comentario no valido";
        }
        if ("".equals(id_lugar)) {
            mensajeError = mensajeError + "Id lugar no valido";
        }

        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }//fin mensaje de error
        mensajeError = datos.Registro(0, nombre_persona, comentario, id_lugar);
        //mensaje de error al admin
        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }//fin mensaje de error
    }
}
