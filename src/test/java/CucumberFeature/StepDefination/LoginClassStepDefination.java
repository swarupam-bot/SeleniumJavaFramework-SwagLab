package CucumberFeature.StepDefination;

import CucumberFeature.Runner.BDDRunner;
import com.test.TestRunner.TC_Runner_LoginPage;
import com.test.WebPages.SwagLabsLoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

import static com.test.DriverSetup.Open_Chrome_Browser.config;

public class LoginClassStepDefination {



    TC_Runner_LoginPage loginPage;
    @Given("launch the application and navigate to login page.")
    public void launch_the_application_and_navigate_to_login_page() throws IOException {
        loginPage =new TC_Runner_LoginPage();
        loginPage.readData();
        loginPage.openChromeBrowser();
        loginPage.testSetup();
        System.out.println("this is given");

    }
    @When("Give the wrong credentials for login.")
    public void give_the_wrong_credentials_for_login() {
        loginPage.TC_Check_LoginFunctionality_With_UnvailedUserName_And_VailedPassword();
        System.out.println("this is when");
    }
    @Then("Verify the error message.")
    public void verify_the_error_message() {
        String ActualErrorText = SwagLabsLoginPage.LoginPageErrorMessage();
        Assert.assertEquals(ActualErrorText, config.getProperty("errorMsg"));
        loginPage.close();
        System.out.println("this is thena");

    }
}
