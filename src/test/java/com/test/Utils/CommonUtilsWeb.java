package com.test.Utils;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CommonUtilsWeb {

    public static void sendTextToTextBox(WebElement ele, String str) {
        if (ele.isEnabled()) {
            ele.clear();
            System.out.println("TextBox is Enabled " + ele + " Send Text : " + str);

            Reporter.log("TextBox is Enabled " + ele + " Send Text : " + str);
            ele.sendKeys(str);
        } else {
            System.out.println("TextBox is not Enabled " + ele);
            Reporter.log("TextBox is not Enabled " + ele);
        }
    }

    public static void ClickOnButton(WebElement ele) {
        if (ele.isEnabled()) {
            System.out.println("Button is Enabled " + ele);
            Reporter.log("Button is Enabled " + ele);
            ele.click();
        } else {
            System.out.println("Button is not Enabled " + ele);
            Reporter.log("Button is not Enabled " + ele);

        }
    }

}
