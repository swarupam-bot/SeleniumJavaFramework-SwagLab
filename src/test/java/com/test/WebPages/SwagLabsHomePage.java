package com.test.WebPages;

import com.test.Utils.CommonUtilsWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.test.WebElements.HomePageWebElements.CPageCheckOutBtnElement;
import static com.test.WebElements.HomePageWebElements.HPageCartElement;


public class SwagLabsHomePage {
    public SwagLabsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void clickOnCartBtn() {
        CommonUtilsWeb.ClickOnButton(HPageCartElement);
    }

    public static void clickOnCheckOutBtn() {
        CommonUtilsWeb.ClickOnButton(CPageCheckOutBtnElement);
    }
}
