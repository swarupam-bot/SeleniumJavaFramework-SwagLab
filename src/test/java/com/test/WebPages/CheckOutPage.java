package com.test.WebPages;

import com.test.Utils.CommonUtilsWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.test.TestRunner.TestRunnerWeb.config;
import static com.test.WebElements.CheckOutPageWebElements.*;
import static com.test.WebElements.CheckOutPageWebElements.CPageVerifyTextElement;

public class CheckOutPage {
    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void fillFirstName(String Fname) {
        CommonUtilsWeb.sendTextToTextBox(CPageInfoTextBoxesElement.get(0), Fname);
    }
    public static void fillLastName(String LName) {
        CommonUtilsWeb.sendTextToTextBox(CPageInfoTextBoxesElement.get(1), LName);
    }
    public static void fillZipCodeName(String ZipCode) {
        CommonUtilsWeb.sendTextToTextBox(CPageInfoTextBoxesElement.get(2), ZipCode);
    }

    public static void clickOnContinueBtn() {
        CommonUtilsWeb.ClickOnButton(CPageInfoContinueElement);

    }
    public static void clickOnFinishBtn() {
        CommonUtilsWeb.ClickOnButton(CPageFINISHBtnElement);
    }
}
