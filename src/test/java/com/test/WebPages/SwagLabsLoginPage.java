package com.test.WebPages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.test.Utils.swagLabsWebUtils;
import com.test.WebElements.LoginPageWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import static com.test.TestCases.TestRunnerWeb.*;

public class SwagLabsLoginPage extends LoginPageWebElements {
    public SwagLabsLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    public static void Login_With_VailedUesrName_And_UnvailedPass() {
        System.out.println("Try to login with vailed username and invailed password");
        swagLabsWebUtils.LoginHomePage(config.getProperty("username"), config.getProperty("wrongPassword"));
        Assert.assertEquals(config.getProperty("errorMsg"), LPageErrorTextElement.getText());
        ExtentTest test=extent.createTest("Try to login with vailed username and invailed password");
        test.pass("test is pass");
    }

    public static void Login_With_UnvailedUesrName_And_vailedPass() {
        System.out.println("Try to login with vailed username and invailed password");
        swagLabsWebUtils.LoginHomePage(config.getProperty("wrongUsername"), config.getProperty("password"));
        System.out.println(LPageErrorTextElement.getText());
        Assert.assertEquals(config.getProperty("errorMsg"), LPageErrorTextElement.getText());
    }
}
