import base.BaseTest;
import config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import static config.ConfigReader.prop;

public class LoginPageTest extends BaseTest {

    @Test
    public void verifyLoginPage() {

        try{
            String username = ConfigReader.getProperty("username");
            String pass = ConfigReader.getProperty("passw");

            LoginPage loginPage = new LoginPage(driver, prop);
            loginPage.login(username, pass);

            String expectedUrl = ConfigReader.getProperty("url");
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl, actualUrl, "User is not navigate to dashboard after login");
        }
        catch (Exception e){
            Assert.fail("Login test fail due to exception"+ e.getMessage());
        }

    }
}
