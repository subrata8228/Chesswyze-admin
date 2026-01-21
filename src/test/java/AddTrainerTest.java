import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddTrainer;
import pages.LoginPage;

import static config.ConfigReader.prop;

public class AddTrainerTest extends BaseTest {

    @Test(enabled = false)
    public void verifyAddTrainer() {

        LoginPage loginPage = new LoginPage(driver,prop);
        AddTrainer addTrainer = new AddTrainer(driver,prop);

        //login
        loginPage.login(prop.getProperty("username"), prop.getProperty("passw"));

        //trainer management
        addTrainer.clickOnTrainerManagement();
        addTrainer.clickOnAddTrainer();
        addTrainer.enterName(prop.getProperty("addtrainer.name"));
        addTrainer.enterEmail(prop.getProperty("addtrainer.email"));
        addTrainer.enterPhoneNumber(prop.getProperty("addtrainer.phonenumber"));
        addTrainer.enterPassword(prop.getProperty("addtrainer.password"));
        addTrainer.clickOnAddButton();
        addTrainer.handleConfirmationPopup();


    }

    @Test (enabled = false)
    public void verifyDeleteTrainer(){

        LoginPage loginPage = new LoginPage(driver,prop);
        AddTrainer addTrainer = new AddTrainer(driver,prop);
        loginPage.login(prop.getProperty("username"), prop.getProperty("passw"));
        addTrainer.clickOnTrainerManagement();
        addTrainer.deleteTrainer();
        addTrainer.handleConfirmationPopup();

    }
}