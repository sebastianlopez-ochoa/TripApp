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
public class CuentaInicioSesion {
    //identifico objetos
    WebDriver driver;
    By mensaje = By.name("cuenta");

    public CuentaInicioSesion(WebDriver driver) {
        this.driver = driver;
    }
    //creo la accion, en este que me lea el tipo de cuenta
    public String getTipoCuenta() {
        String texto = driver.findElement(mensaje).getText();
        System.out.println("Iniciaste sesion con: " + texto);
        return texto;
    }
}
