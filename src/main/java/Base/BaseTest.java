package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.velocity.tools.config.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary {


    @BeforeMethod
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://coderspace.io/");
        driver.findElement(By.cssSelector("[href='/giris']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
