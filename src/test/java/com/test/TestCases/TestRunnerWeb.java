package com.test.TestCases;

import com.test.DriverSetup.*;
import com.test.WebPages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


public class TestRunnerWeb extends Open_Chrome_Browser {

    public static FileInputStream fis;
    public static Properties config = new Properties();

    @BeforeClass
    public void readData() throws IOException {
        fis = new FileInputStream("/Users/swarupamkumar/IdeaProjects/SwagLabs_DemoTest/src/test/java/com/test/Utils/testData.properties");
        config.load(fis);
        System.out.println("Test data loaded successfully.");
    }

    @BeforeMethod
    public void testSetup() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        SwagLabsLoginPage TestCase = new SwagLabsLoginPage(driver);

        System.out.println("relaunching the login page for next test");
    }

    @Test(priority = 1,enabled = true)
    public void TC_Check_LoginFunctionality_With_vailedUserName_And_UnVailedPassword() {
        SwagLabsLoginPage.Login_With_VailedUesrName_And_UnvailedPass();

    }
    @Test(priority = 2,enabled = true)
    public void TC_Check_LoginFunctionality_With_UnvailedUserName_And_VailedPassword() {
        SwagLabsLoginPage.Login_With_UnvailedUesrName_And_vailedPass();

    }

    @Test(priority = 3)
    public void TC_Buy_A_Higest_Price_Item_And_CheckOut() {
        SwagLabsHomePage.TC_SelectHighestPriceItemAndCheckOut();

    }
    @Test(priority = 4)
    public void TC_Buy_All_Items_And_CheckOut() {
        SwagLabsHomePage.TC_SelectAllItemsAndCheckOut();

    }


}
