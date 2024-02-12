package com.test.WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageWebElements extends HomePageWebElements{

    @FindBy(xpath = "//*[@name=\"user-name\"]")
    public static WebElement LPageUsernameElement;

    @FindBy(name ="password" )
    public static WebElement LPagePasswordElement;

    @FindBy(id="login-button")
    public static WebElement LPageLoginBtnElement;

    @FindBy(xpath="//*[@data-test=\"error\"]")
    public static WebElement LPageErrorTextElement;

}
