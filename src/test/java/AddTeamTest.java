import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AddTeam;
import pages.AddTrainer;
import pages.LoginPage;
import static config.ConfigReader.prop;

public class AddTeamTest extends BaseTest {


    @Test
    public void AddTeamTest() {

        LoginPage loginPage = new LoginPage(driver,prop);
        AddTeam addTrainer = new AddTeam(driver,prop);

        loginPage.login(prop.getProperty("username"), prop.getProperty("passw"));
        addTrainer.clickSwitchToTrainer();
        addTrainer.clickAddTeamButton();
        addTrainer.clickCreateTeamButton();
        addTrainer.teamName(prop.getProperty("addteam.teamName"));
        addTrainer.clickOnSubmitButton();
        addTrainer.handleConfirmationPopup();


    }
}
