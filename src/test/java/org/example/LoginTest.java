package org.example;

import Base.BaseLibrary;
import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.annotations.Test;

import static Base.Data.*;


public class LoginTest extends BaseTest
{
    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();

    @Test(description = "Başarılı Kullanıcı Login Kontrolü")
    public void validLogin() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password)
                .loginClick();

        sleep(2000);
        profilePage.accountCheck(email);
   }

    @Test(description = "Hatalı Kullanıcı Login Kontrolü")
    public void nonValidPasswordLogin() throws InterruptedException {

        String email = "tavome2989@modotso.com";
        String sifre = "123456Aesads";

        loginPage
                .emailDoldur(email)
                .passwordDoldur(sifre)
                .loginClick();

        sleep(1000);
        loginPage.errorMessageCheck(nonValidEmailOrPasswordMessage);
    }

    @Test(description = "Sistemde Kayıtlı Olmayan Kullanıcı Login Kontrolü")
    public void nonValidEmailLogin() throws InterruptedException {

        String email = "tavome2933@modotso.com";
        String sifre = "123456Ae";

        loginPage
                .emailDoldur(email)
                .passwordDoldur(sifre)
                .loginClick();

        sleep(1000);
        loginPage.errorMessageCheck(nonValidEmailOrPasswordMessage);
    }

    @Test(description = "Email Alanının Boş Bırakılması Login Kontrolü")
    public void nonValidEmptyEmailLogin() throws InterruptedException {

        String email = "";
        String sifre = "123456Ae";

        loginPage
                .emailDoldur(email)
                .passwordDoldur(sifre)
                .loginClick();

        sleep(1000);
        loginPage.emailFieldCheck(requiredFiledMessage);
    }

    @Test(description = "Şifre Alanının Boş Bırakılması Login Kontrolü")
    public void nonValidEmptyPasswordLogin() throws InterruptedException {

        String email = "tavome2989@modotso.com";
        String sifre = "";

        loginPage
                .emailDoldur(email)
                .passwordDoldur(sifre)
                .loginClick();

        sleep(1000);
        loginPage.passwordFieldCheck(requiredFiledMessage);
    }

    @Test(description = "Email ve Şifre Alanının Boş Bırakılması Login Kontrolü")
    public void nonValidEmptyEmailAndPasswordLogin() throws InterruptedException {

        String email = "";
        String sifre = "";

        loginPage
                .emailDoldur(email)
                .passwordDoldur(sifre)
                .loginClick();

        sleep(1000);
        loginPage.emailFieldCheck(requiredFiledMessage);
        loginPage.passwordFieldCheck(requiredFiledMessage);
    }

    @Test(description = "Geçersiz Email Login Kontrolü")
    public void nonValidEmailTypeLogin() throws InterruptedException {

        String email = "asdsad@asd";
        String sifre = "12345Ae";

        loginPage
                .emailDoldur(email)
                .passwordDoldur(sifre)
                .loginClick();

        sleep(1000);
        loginPage.emailFieldCheck(enterValidEmailMessage);
    }
}
