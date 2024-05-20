package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

   String baseUrl= "https://opensource-demo.orangehrmlive.com/";

   @Before
    public void setupTest(){openBrowser(baseUrl);}

    @Test
    public void Login() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//div/button")).click();

    }
    @After
    public void tearDown(){this.closeBrowser();}
}
