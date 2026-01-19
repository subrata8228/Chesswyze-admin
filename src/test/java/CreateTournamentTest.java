import base.BaseTest;
import org.testng.annotations.Test;
import pages.CreateTournament;
import pages.LoginPage;

import static config.ConfigReader.prop;


public class CreateTournamentTest extends BaseTest {

    @Test
    public void verifyCreateTournament() {

        LoginPage loginPage = new LoginPage(driver,prop);
        CreateTournament createTournament = new CreateTournament(driver,prop);


        //login
        loginPage.login(
                prop.getProperty("username"),
                prop.getProperty("passw")
        );

        //switch to trainer
        createTournament.clickSwitchToTrainer();

        //navigate
        createTournament.clickCreateTournamentMenu();

        //fill from

        createTournament.enterStartTime();
        createTournament.enterSelectFormat(prop.getProperty("selectformat"));
        createTournament.enterMatchDuration(prop.getProperty("duration"));
        createTournament.selectTeam(prop.getProperty("selectteam"));
        createTournament.enterMaxplayers(prop.getProperty("maxplayers"));

        //submit
        createTournament.clickOnSubmit();

        //click on alert

        createTournament.handleConfirmationPopup();





    }

}
