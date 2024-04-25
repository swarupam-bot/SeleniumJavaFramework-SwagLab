package com.test.TestRunner;

import com.test.DriverSetup.Open_Chrome_Browser;
import com.test.WebPages.SwagLabsLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_Runner_LoginPage extends Open_Chrome_Browser {


    @Test(priority = 1, enabled = true)
    public void TC_Check_LoginFunctionality_With_vailedUserName_And_UnVailedPassword() {
        System.out.println("Try to login with vailed username and invailed password");
        SwagLabsLoginPage.LoginPageEnterUserName(config.getProperty("username"));
        SwagLabsLoginPage.LoginPageEnterPassword(config.getProperty("wrongPassword"));
        SwagLabsLoginPage.LoginPageClickOnLoginButton();
        String ActualErrorText = SwagLabsLoginPage.LoginPageErrorMessage();
        Assert.assertEquals(ActualErrorText, config.getProperty("errorMsg"));


    }

    @Test(priority = 2, enabled = true)
    public void TC_Check_LoginFunctionality_With_UnvailedUserName_And_VailedPassword() {
        SwagLabsLoginPage.LoginPageEnterUserName(config.getProperty("wrongUsername"));
        SwagLabsLoginPage.LoginPageEnterPassword(config.getProperty("password"));
        SwagLabsLoginPage.LoginPageClickOnLoginButton();
        String ActualErrorText = SwagLabsLoginPage.LoginPageErrorMessage();
        Assert.assertEquals(ActualErrorText, config.getProperty("errorMsg"));
    }


}
