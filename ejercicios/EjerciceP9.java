package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class EjerciceP9 {
    WebDriver driver;

    private void inicializarDriver(String URL){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:/dchrome/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(URL);
    }
    @Test
    public void primerTest(){
        //iniciar salesforce y mostrar el titulo de la pagina y la url usada
        inicializarDriver("http://www.salesforce.com");
        //gettitle te muestra en pantalla cual es el nombre de titulo , seguro se debe de guiar con el id de tittle o alho asi
        System.out.println(" page title is: " + driver.getTitle());
        //el getcurrenturl muestra la url donde estas oahora y te la escribe
        System.out.println(driver.getCurrentUrl());
        //driver.close(); normalemente es muy rapido
    }
    @Test
    public void segundoTest(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:/dchrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.salesforce.com");
        List<WebElement> listH1 = driver.findElements(By.tagName("h1"));
        //el system de abajo es apayudar a leer bien lo que pasa en el test
        System.out.println("se mostraran los h1");
        for(WebElement h1 : listH1){
            System.out.println(h1.getText());
        }
        List<WebElement> listH2 = driver.findElements(By.tagName("h2"));
        //el system de abajo es apayudar a leer bien lo que pasa en el test
        System.out.println(" se mostraran los h2 ");
        for(WebElement h2 : listH2){
            if(h2.getText().isEmpty() ==false){
                System.out.println("*** " + h2.getText());
            }

        }
        driver.close();
    }

    @Test
    //abrir google
    public void tercerTest(){
        inicializarDriver("http://www.google.com");

    }
    @Test
    public void fourTest(){
        inicializarDriver("http://wwwbooking.com");

    }
}
