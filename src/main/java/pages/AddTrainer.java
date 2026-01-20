package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement trainerbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("trainermanagement.menu.xpath"))));
        trainerbutton.click();

    }

    public void clickOnAddTrainer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement  trainer= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.menu.xpath"))));
        trainer.click();
    }

    public void enterName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement name= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.name.xpath"))));
        name.sendKeys(prop.getProperty("addtrainer.name"));
    }

    public void enterEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.email.xpath"))));
        email.sendKeys(prop.getProperty("addtrainer.email"));
    }

    public void enterPhoneNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.phonenumber.xpath"))));
        phone.sendKeys(prop.getProperty("addtrainer.phonenumber"));
    }

    public void enterPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement password =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.password.xpath"))));
        password.sendKeys(prop.getProperty("addtrainer.password"));
    }

    public void clickOnAddButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickonadd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addtrainer.addbutton.xpath"))));
        clickonadd.click();
    }

    public void handleConfirmationPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }



}
