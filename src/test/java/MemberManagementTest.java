import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MemberManagement;

import static config.ConfigReader.prop;

public class MemberManagementTest extends BaseTest {

    @Test
    public void verifyMemberManagementTest() {

        LoginPage loginPage = new LoginPage(driver,prop);
        MemberManagement membermanagement = new MemberManagement(driver, prop);

        loginPage.login(prop.getProperty("username"), prop.getProperty("passw"));

        membermanagement.clickSwitchToTrainer();
        membermanagement.clickOnMemberManagement();
        membermanagement.clickOnAddnewUser();
        //membermanagement.enterName(prop.getProperty("membermanagement.addnewuser.name"));

        membermanagement.enterName(prop.getProperty("membermanagement.addnewuser.name"));
        membermanagement.enterPhone(prop.getProperty("membermanagement.addnewuser.phone"));
        membermanagement.clickOnSelectteam();
        membermanagement.chooseTeam(prop.getProperty("membermanagement.addnewuser.teamName"));
        membermanagement.clickOnSubmit();
        membermanagement.handleConfirmationPopup();



    }

    @Test
    public void verifyDeleteUser() {
        LoginPage loginPage = new LoginPage(driver,prop);
        MemberManagement membermanagement = new MemberManagement(driver, prop);
        loginPage.login(prop.getProperty("username"), prop.getProperty("passw"));
        membermanagement.clickSwitchToTrainer();
        membermanagement.clickOnMemberManagement();
        membermanagement.deleteUser();

    }
}
