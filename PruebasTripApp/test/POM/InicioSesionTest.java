/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POM;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author SEBASTIAN
 */
public class InicioSesionTest {

    private static WebDriver driver = null;
    //creo objetos de la clase de objetos
    InicioSesion inicioSesion;
    CuentaInicioSesion cuentaInicioSesion;

    public InicioSesionTest() {
    }
    /*las instrucciones que estan en este metodo de BeforeClass se van a 
    ejecutar una vez antes de ejecutar todo lo que hay en este archivo de codigo
    Me sirve para hacer una preparación general de las pruebas*/   
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
    }
    /*Las instruccions que estan aca en el AfterClass se ejecutaran una vez despues de que todo lo que esta aca se 
    haya ejecutado ya*/
    @AfterClass
    public static void tearDownClass() {
    }
    /*Las instrucciones que esten en el Before se va a ejecutar antes de ejecutar un caso de prueba*/
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/TripApp/TripAppMiCuenta.jsp");
        inicioSesion = new InicioSesion(driver);
        cuentaInicioSesion = new CuentaInicioSesion(driver);
    }
    /*El After se ejecuta cuando finaliza la ejecucion del caso del prueba, en este caso se ejecita
    2 veces*/
    @After
    public void tearDown() {
        driver.quit();
    }

    /**
     * Test of setEmail method, of class InicioSesion.
     */
    /*El @test es para identificar que esto es un caso de prueba*/
    @Test
    public void inicioSesion1() {
        //esto hace parte de la preparacion
        String correo = "sebas@gmail.com";
        String password = "123";
        //esto hace parte de la ejecucion
        inicioSesion.iniciarSecion(correo, password);
        String texto = cuentaInicioSesion.getTipoCuenta();
        //esto hace parte de la verificacion
        assertEquals("No se ingreso a la pantalla del cliente, se inicio a " + texto, "MI CUENTA", texto);
    }

   @Test
    public void inicioSesion2() {
        String correo = "admon@tripapp.com";
        String password = "123";
        inicioSesion.iniciarSecion(correo, password);
        String texto = cuentaInicioSesion.getTipoCuenta();
        assertEquals("No se ingreso a la pantalla del cliente, se inicio a " + texto, "MI CUENTA", texto);
    }

}
