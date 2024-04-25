package com.test.TestRunner;

import com.test.DriverSetup.*;
import com.test.WebPages.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.test.WebElements.HomePageWebElements.HPageAddToCartElement;
import static com.test.WebElements.HomePageWebElements.HPageProductPriceElement;
import static com.test.WebElements.CheckOutPageWebElements.CPageVerifyTextElement;


public class TestRunnerWeb extends Open_Chrome_Browser {



    @Test(priority = 1,enabled = true)
    public void TC_Check_LoginFunctionality_With_vailedUserName_And_UnVailedPassword() {
        System.out.println("Try to login with vailed username and invailed password");
        SwagLabsLoginPage.LoginPageEnterUserName(config.getProperty("username"));
        SwagLabsLoginPage.LoginPageEnterPassword(config.getProperty("wrongPassword"));
        SwagLabsLoginPage.LoginPageClickOnLoginButton();
        String ActualErrorText=SwagLabsLoginPage.LoginPageErrorMessage();
        Assert.assertEquals(ActualErrorText,config.getProperty("errorMsg"));


    }
    @Test(priority = 2,enabled = true)
    public void TC_Check_LoginFunctionality_With_UnvailedUserName_And_VailedPassword() {
        SwagLabsLoginPage.LoginPageEnterUserName(config.getProperty("wrongUsername"));
        SwagLabsLoginPage.LoginPageEnterPassword(config.getProperty("password"));
        SwagLabsLoginPage.LoginPageClickOnLoginButton();
        String ActualErrorText=SwagLabsLoginPage.LoginPageErrorMessage();
        Assert.assertEquals(ActualErrorText,config.getProperty("errorMsg"));
    }

    @Test(priority = 3)
    public void TC_Buy_A_Higest_Price_Item_And_CheckOut() {
        SwagLabsLoginPage.LoginHomeWithCredentials(config.getProperty("username"), config.getProperty("password"));
        List<Float> AllPrice = new ArrayList<>();
        Float temp = 0.0F;
        int i = 0;
        List<WebElement> AddToCartList = HPageAddToCartElement;
        for (WebElement ProductEle : HPageProductPriceElement) {
            String str = ProductEle.getText().replace("$", "").trim();
            AllPrice.add(Float.parseFloat(str));
        }
        for (Float a : AllPrice) {
            if (a > temp) {
                temp = a;
                i = AllPrice.indexOf(temp);

            }
        }
        AddToCartList.get(i).click();

        SwagLabsHomePage.clickOnCartBtn();
        SwagLabsHomePage.clickOnCheckOutBtn();
        CheckOutPage.fillFirstName(config.getProperty("Fname"));
        CheckOutPage.fillLastName(config.getProperty("Lname"));
        CheckOutPage.fillZipCodeName("ZCode");
        CheckOutPage.clickOnContinueBtn();
        CheckOutPage.clickOnFinishBtn();
        Assert.assertEquals(CPageVerifyTextElement.getText(), config.getProperty("ExpectedVerifyStr"));


    }
    @Test(priority = 4)
    public void TC_Buy_All_Items_And_CheckOut() {
        SwagLabsLoginPage.LoginHomeWithCredentials(config.getProperty("username"), config.getProperty("password"));
        int i=0;
        List<WebElement> AddToCartList = HPageAddToCartElement;
        for (WebElement ele:AddToCartList)
        {
            i++;
            ele.click();
            System.out.println("Added "+i+" item to the cart");
            Reporter.log("Added "+i+" item to the cart");
        }
        System.out.println();
        Reporter.log("Total items added in cart = "+i);

        SwagLabsHomePage.clickOnCartBtn();
        SwagLabsHomePage.clickOnCheckOutBtn();
        CheckOutPage.fillFirstName(config.getProperty("Fname"));
        CheckOutPage.fillLastName(config.getProperty("Lname"));
        CheckOutPage.fillZipCodeName("ZCode");
        CheckOutPage.clickOnContinueBtn();
        CheckOutPage.clickOnFinishBtn();
        Assert.assertEquals(CPageVerifyTextElement.getText(), config.getProperty("ExpectedVerifyStr"));


    }


}
