package com.test.Utils;

import com.test.WebElements.LoginPageWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class swagLabsWebUtils extends LoginPageWebElements {

    public static void LoginHomePage(String username, String password) {
        System.out.println(LPageUsernameElement);
        CommonUtilsWeb.sendTextToTextBox(LPageUsernameElement, username);
        CommonUtilsWeb.sendTextToTextBox(LPagePasswordElement, password);
        CommonUtilsWeb.ClickOnButton(LPageLoginBtnElement);
    }

    public static void checkOutPages(String Fname, String LName, String ZipCode) {
        String ExpectedVerifyStr = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        CommonUtilsWeb.ClickOnButton(HPageCartElement);
        CommonUtilsWeb.ClickOnButton(CPageCheckOutBtnElement);
        CommonUtilsWeb.sendTextToTextBox(CPageInfoTextBoxesElement.get(0), Fname);
        CommonUtilsWeb.sendTextToTextBox(CPageInfoTextBoxesElement.get(1), LName);
        CommonUtilsWeb.sendTextToTextBox(CPageInfoTextBoxesElement.get(2), ZipCode);
        CommonUtilsWeb.ClickOnButton(CPageInfoContinueElement);
        CommonUtilsWeb.ClickOnButton(CPageFINISHBtnElement);
        Assert.assertEquals(CPageVerifyTextElement.getText(), ExpectedVerifyStr);
    }


}
