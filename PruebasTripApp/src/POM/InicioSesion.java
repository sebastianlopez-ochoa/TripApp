/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author SEBASTIAN
 */
public class InicioSesion {
    //defino un objeto tipo webdriver
    WebDriver driver;
    /*defino los objetos, los objetos hacen la operacion según la primera operación que encuentren,
    por ejemplo si un objetio tienen el mismo id va a coger el primer objeto con el id seleccionado*/
    By email = By.name("txtCorreo");
    By contrasena = By.name("txtContrasena");
    By login = By.id("login");
    //creo el construtor y inicializo el driver
    public InicioSesion(WebDriver driver) {
        this.driver = driver;
    }
    //defino las acciones
    public void setEmail(String correo) {
        //la página está inicializada en el objeto driver
        //finElement me dice, busqueme el elemento y cuando lo encuentre haga la accion, en este caso rellenar el campo email
        driver.findElement(email).sendKeys(correo);
    }

    public void setContrasena(String password) {
        driver.findElement(contrasena).sendKeys(password);
    }
    //esta acción es dar clic al boton login
    public void clickLogin() {
        driver.findElement(login).click();
    }
    //invoco las acciones que cree anteriormente
    public void iniciarSecion(String correo, String password) {
        this.setEmail(correo);
        this.setContrasena(password);
        this.clickLogin();
    }
}
