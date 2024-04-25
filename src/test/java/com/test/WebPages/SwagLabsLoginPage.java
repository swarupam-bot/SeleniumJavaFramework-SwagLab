package com.test.WebPages;


import com.test.Utils.CommonUtilsWeb;
import com.test.WebElements.LoginPageWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SwagLabsLoginPage extends LoginPageWebElements {
    public SwagLabsLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void LoginPageEnterUserName(String username) {
        System.out.println(LPageUsernameElement);
        CommonUtilsWeb.sendTextToTextBox(LPageUsernameElement, username);
    }
    public static void LoginPageEnterPassword(String password) {
        System.out.println(LPagePasswordElement);
        CommonUtilsWeb.sendTextToTextBox(LPagePasswordElement, password);
    }

    public static void LoginPageClickOnLoginButton() {
        System.out.println(LPageLoginBtnElement);
        CommonUtilsWeb.ClickOnButton(LPageLoginBtnElement);

    }
    public static String LoginPageErrorMessage()
     {
         return LPageErrorTextElement.getText();
     }

    public static void LoginHomeWithCredentials(String username, String password) {
        System.out.println(LPageUsernameElement);
        CommonUtilsWeb.sendTextToTextBox(LPageUsernameElement, username);
        CommonUtilsWeb.sendTextToTextBox(LPagePasswordElement, password);
        CommonUtilsWeb.ClickOnButton(LPageLoginBtnElement);

    }

}
