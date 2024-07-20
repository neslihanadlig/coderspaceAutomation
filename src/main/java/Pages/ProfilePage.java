package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BaseLibrary {

    public ProfilePage accountCheck(String email) {
        String emailGetValue = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div[1]/div/div[2]/p")).getText();
        Assert.assertEquals(email,emailGetValue);
       return this;
    }
}
