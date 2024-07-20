package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BaseLibrary {

    @Step("Başarılı Login Kontrolü Yapılır")
    public ProfilePage accountCheck(String email) {
        String emailGetValue = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div[1]/div/div[2]/p")).getText();
        Assert.assertEquals(email,emailGetValue);
       return this;
    }
}
