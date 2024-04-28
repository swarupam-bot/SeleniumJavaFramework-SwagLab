package CucumberFeature.StepDefination;

import com.test.TestRunner.TC_Runner_LoginPage;
import com.test.WebPages.SwagLabsLoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.test.DriverSetup.Open_Chrome_Browser.config;

public class LoginClassStepDefination {
    TC_Runner_LoginPage loginPage;
    @Given("launch the application and navigate to login page.")
    public void launch_the_application_and_navigate_to_login_page() {
        loginPage =new TC_Runner_LoginPage();
        loginPage.openChromeBrowser();

    }
    @When("Give the wrong credentials for login.")
    public void give_the_wrong_credentials_for_login() {

        loginPage.TC_Check_LoginFunctionality_With_UnvailedUserName_And_VailedPassword();

    }
    @Then("Verify the error message.")
    public void verify_the_error_message() {

        String ActualErrorText = SwagLabsLoginPage.LoginPageErrorMessage();
        Assert.assertEquals(ActualErrorText, config.getProperty("errorMsg"));

    }
}
