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

public class MemberManagement {

    WebDriver driver;
    Properties prop;

    public MemberManagement(WebDriver driver, Properties prop) {
        this.driver = driver;
        this.prop = prop;
    }

    public void clickOnMemberManagement() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement membermanagement =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("membermanagement.menu.xpath"))));
        membermanagement.click();
    }

    public void clickOnAddnewUser() {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addnewuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("membermanagement.addnewuser.xpath"))));
        addnewuser.click();
    }

    public void enterName(String username) {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement name= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("membermanagement.addnewuser.name.xpath"))));
        name.sendKeys(username);
    }

    public void enterPhone(String userphone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("membermanagement.addnewuser.phone.xpath"))));
        phone.sendKeys(userphone);
    }

    public void clickOnSelectteam() {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement selectteam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("membermanagement.selectteam.xpath"))));
        selectteam.click();
    }

    public void chooseTeam(String team) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> teamlist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(prop.getProperty("membermanagement.teamlist.xpath"))));
       // System.out.println("teamlist.size(): " + teamlist.size());
        for(WebElement teamlistele:teamlist){

            if(teamlistele.getText().equalsIgnoreCase(team)){
                teamlistele.click();
                break;
            }
        }
    }

    public void clickOnSubmit() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submit= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("membermanagement.addnewuser.submit.xpath"))));
        submit.click();
    }

    public void clickSwitchToTrainer() {
        driver.findElement(By.xpath(prop.getProperty("switchtotrainer.xpath"))).click();
    }

    public void handleConfirmationPopup() {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }






}
