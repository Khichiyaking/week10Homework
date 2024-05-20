package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest() {openBrowser(baseUrl); }

    @Test
    public void Forgotyourpassword(){
    driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

    }

}
