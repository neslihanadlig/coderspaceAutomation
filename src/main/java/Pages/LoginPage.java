package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseLibrary {

    @Step("Email Alanı Doldurulur")
    public LoginPage emailDoldur(String email) {
        driver.findElement(By.id("id_username")).sendKeys(email);
        return  this;
    }

    @Step("Şifre Alanı Doldurulur")
    public LoginPage passwordDoldur(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
        return  this;
    }

    @Step("Login Butonuna Tıklanır")
    public LoginPage loginClick() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
        return  this;
    }

    @Step("Hata alanı kontrol edilir")
    public LoginPage errorMessageCheck(String message) {
        String failMessageValue = driver.findElement(By.cssSelector("[class='alert alert-danger']")).getText();
        Assert.assertEquals(message,failMessageValue);
        return  this;
    }

    @Step("Email Hata alanı kontrol edilir")
    public LoginPage emailFieldCheck(String message) {
        String failMessageValue = driver.findElement(By.xpath("/html/body/div/section/div/div/div/div/div/div[1]/form/div[1]/div/div[2]")).getText();
        Assert.assertEquals(message,failMessageValue);
        return  this;
    }

    @Step("Password Hata alanı kontrol edilir")
    public LoginPage passwordFieldCheck(String message) {
        String failMessageValue = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/form/div[2]/div[2]/div[3]")).getText();
        Assert.assertEquals(message,failMessageValue);
        return  this;
    }












}
