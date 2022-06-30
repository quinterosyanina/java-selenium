package tests.practico13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class spofyTestRefactoring {

    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:/dchrome/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void test1(){
        System.out.println("this is a test1");
        driver.get("https://www.vital.com.ar/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Supermayorista Vital - Encontrá más.");
    }

    @Test
    public void verifySignup(){
        driver.get("https://www.vital.com.ar/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button")).click();

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//*[@id=\"login_menu\"]/li[2]/a")).click();

        WebElement aname = (WebElement)driver.findElement(By.xpath("//input[@name=\"nombre\"]"));
        WebElement bname = (WebElement)driver.findElement(By.xpath("//input[@name=\"apellido\"]"));
        WebElement cname = (WebElement)driver.findElement(By.xpath("//input[@name=\"email\"]"));

        aname.sendKeys("guillermo");
        bname.sendKeys("quinteros");
        cname.sendKeys("guillermo@gghtomail.com");




    }

    @AfterMethod
    public void tearDown(){

    //    driver.close();
    }
}
