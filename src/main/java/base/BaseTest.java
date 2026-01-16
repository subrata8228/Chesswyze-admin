package base;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        String browser= ConfigReader.getProperty("browser");
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
        }
        else if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(ConfigReader.getProperty("url"));


    }

    @AfterMethod
    public void tearDown(){

        if(driver!=null){
            driver.quit();
        }
    }
}
