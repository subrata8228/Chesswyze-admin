package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class AddTrainer {

    WebDriver driver;
    Properties prop;

    public  AddTrainer(WebDriver driver, Properties prop) {
        this.driver = driver;
        this.prop = prop;
    }

    public void clickOnTrainerManagement() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement trainerbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.trainermanagement.xpath"))));
        trainerbutton.click();

    }

    public void clickOnAddTrainer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement  trainer= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.trainer.xpath"))));
        trainer.click();
    }

    public void enterName(String trainerfullname) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement name= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.name.xpath"))));
        name.sendKeys(trainerfullname);
    }

    public void enterEmail(String traineremail) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.email.xpath"))));
        email.sendKeys(traineremail);
    }

    public void enterPhoneNumber(String trainerphonenumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.phonenumber.xpath"))));
        phone.sendKeys(trainerphonenumber);
    }

    public void enterPassword(String trainerpassword) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement password =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.password.xpath"))));
        password.sendKeys(trainerpassword);
    }

    public void clickOnAddButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickonadd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.addbutton.xpath"))));
        clickonadd.click();
    }

    public void deleteTrainer() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.delete.xpath"))));
        delete.click();
    }

    public void handleConfirmationPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }



}
