package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class AddTeam {

    WebDriver driver;
    Properties prop;
    public AddTeam(WebDriver driver, Properties prop) {
        this.driver = driver;
        this.prop= prop;
    }

    public void clickAddTeamButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addTeamButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addteam.menu.xpath"))));
        addTeamButton.click();
        System.out.println("Add Team button clicked");
    }

    public void clickCreateTeamButton() {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement createteambutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addteam.createteam.xpath"))));
        createteambutton.click();
    }
    public void teamName(String team){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        WebElement teamname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addteam.enterteamname.xpath"))));
        teamname.sendKeys(team);
    }

    public void clickSwitchToTrainer() {
        driver.findElement(By.xpath(prop.getProperty("switchtotrainer.xpath"))).click();
    }

    public void clickOnSubmitButton() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement submit=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addteam.submitbutton.xpath"))));
        submit.click();
    }

    public void handleConfirmationPopup() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert popup = wait.until(ExpectedConditions.alertIsPresent());
        popup.accept();
    }

    public void deleteteam(String teamName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        List<WebElement> teamlist = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(prop.getProperty("addteam.deleteteam.xpath"))));
        int i = 0;
        for (WebElement team : teamlist) {
            i++;
            if (team.getText().equalsIgnoreCase(teamName)) {
                WebElement t = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((prop.getProperty("addteam.selectoneteam.xpath")) + "[" + i + "]")));
               // t.click();
                break;
            }
        }
    }

}
