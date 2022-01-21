/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
 import Entidades.EntUsuarioTripApp;
import Persistencia.UsuarioTripAppDaos;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author SEBASTIAN
 */
public class NegUsuarioTripApp {
    public UsuarioTripAppDaos datos;

    public NegUsuarioTripApp() {
        this.datos = new UsuarioTripAppDaos();
    }
    
    public void Registro(EntUsuarioTripApp registro) throws Exception {

        String mensajeError = "";
        //defino las variables
        String email_registro = registro.getEmail();
        String contra_registro = registro.getContrasena();
        
        //verificación de datos
        if (email_registro == null || "".equals(email_registro)) {
            mensajeError = mensajeError + "Email no valido";
        }
        if (contra_registro == null || "".equals(contra_registro)) {
            mensajeError = mensajeError + "Contraseña no valido";
        }
       
        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }//fin mensaje de error
        mensajeError = datos.Registro(0, email_registro, contra_registro, 1);
        //mensaje de error al admin
        if (!"".equals(mensajeError)) {
            throw new Exception(mensajeError);
        }//fin mensaje de error
    }
}
