package tests.practico13;

import net.bytebuddy.asm.Advice;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifyFillingRegistrationForm {

    WebDriver driver;


    public SpotifyFillingRegistrationForm(WebDriver aDriver){
        this.driver = aDriver;
    }
    public void fillingForm(){
        WebElement aname = (WebElement)driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement bname = (WebElement)driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        WebElement cname = (WebElement)driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement dname = (WebElement)driver.findElement(By.xpath("//*[@id=\"displayname\"]"));
        aname.sendKeys("guillermo");
        bname.sendKeys("quinteros");
        cname.sendKeys("guillermo@gghtomail.com");
        dname.sendKeys("1154586112");
    }
}
