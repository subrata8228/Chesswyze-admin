package pages;

import config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver, Properties prop) {
        this.driver = driver;
    }

    private By username =By.xpath(ConfigReader.getProperty("login.email.xpath"));
    private By password = By.xpath(ConfigReader.getProperty("login.password.xpath"));
    private By submit= By.xpath(ConfigReader.getProperty("login.submit.xpath"));


    public void enterEmail(String user) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(username).sendKeys(user);
    }

    public void enterpassw(String pass) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSubmit(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(submit).click();
    }

    public void login(String user,String pass){
        enterEmail(user);
        enterpassw(pass);
        clickSubmit();
    }

}
