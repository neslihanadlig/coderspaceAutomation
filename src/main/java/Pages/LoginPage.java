package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseLibrary {

    public LoginPage emailDoldur(String email) {
        driver.findElement(By.id("id_username")).sendKeys(email);
        return  this;
    }

    public LoginPage passwordDoldur(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
        return  this;
    }

    public LoginPage loginClick() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
        return  this;
    }

    public LoginPage errorMessageCheck(String message) {
        String failMessageValue = driver.findElement(By.cssSelector("[class='alert alert-danger']")).getText();
        Assert.assertEquals(message,failMessageValue);
        return  this;
    }

    public LoginPage emailFieldCheck(String message) {
        String failMessageValue = driver.findElement(By.xpath("/html/body/div/section/div/div/div/div/div/div[1]/form/div[1]/div/div[2]")).getText();
        Assert.assertEquals(message,failMessageValue);
        return  this;
    }

    public LoginPage passwordFieldCheck(String message) {
        String failMessageValue = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/form/div[2]/div[2]/div[3]")).getText();
        Assert.assertEquals(message,failMessageValue);
        return  this;
    }












}
