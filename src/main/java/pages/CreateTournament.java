package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CreateTournament {

        WebDriver driver;
        Properties prop;


        public CreateTournament(WebDriver driver, Properties prop) {
            this.driver = driver;
            this.prop = prop;
        }

        public void clickCreateTournamentMenu() {
            driver.findElement(By.xpath(prop.getProperty("createtournament.menu.xpath"))).click();
        }

        public void clickSwitchToTrainer() {
            driver.findElement(By.xpath(prop.getProperty("switchtotrainer.xpath"))).click();
        }
        //01/16/2026 5:30 PM
        public void enterStartTime() {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement startTime = driver.findElement(By.xpath(prop.getProperty("createtournament.starttime.xpath")));
            startTime.click();
            startTime.sendKeys(Keys.CONTROL + "a");
            startTime.sendKeys(Keys.DELETE);
            startTime.sendKeys(prop.getProperty("time.starttime"));
        }

        public void selectTeam(String SelectTeam) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath(prop.getProperty("createtournament.selectdd.xpath"))).click();

            List<WebElement> teamlist= driver.findElements(By.xpath(prop.getProperty("createtournament.teamlist.xpath")));

            for (WebElement option : teamlist) {;

                if (option.getText().equalsIgnoreCase(prop.getProperty("selectteam"))) {
                    option.click();
                    break;
                }
            }
        }

        public void handleConfirmationPopup() {
            WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();

        }

        public void enterMatchDuration(String duration) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           WebElement matchduration= driver.findElement(By.xpath(prop.getProperty("createtournament.matchduration.xpath")));
           matchduration.click();
           matchduration.sendKeys(Keys.CONTROL + "a");
           matchduration.sendKeys(Keys.DELETE);
           matchduration.sendKeys(duration);
        }

        public void enterSelectFormat(String format) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           WebElement selectformat= driver.findElement(By.xpath(prop.getProperty("createtournament.selectformat.xpath")));
           selectformat.click();
           selectformat.sendKeys(Keys.CONTROL + "a");
           selectformat.sendKeys(Keys.DELETE);
           selectformat.sendKeys(format);
        }

        public void enterMaxplayers(String maxplayers) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement maxplayer= driver.findElement(By.xpath(prop.getProperty("createtournament.maxplayers.xpath")));
            maxplayer.click();
            maxplayer.sendKeys(Keys.CONTROL + "a");
            maxplayer.sendKeys(Keys.DELETE);
            maxplayer.sendKeys(maxplayers);
        }

        public void clickOnSubmit() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath(prop.getProperty("createtournament.submit.xpath"))).click();
        }




}
