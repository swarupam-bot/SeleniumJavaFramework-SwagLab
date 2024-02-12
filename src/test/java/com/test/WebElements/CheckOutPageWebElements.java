package com.test.WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutPageWebElements {
    @FindBy(xpath = "//*[text()=\"CHECKOUT\"]")
    public static WebElement CPageCheckOutBtnElement;

    @FindBy(xpath = "//*[@type=\"text\"]")
    public static List<WebElement> CPageInfoTextBoxesElement;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public static WebElement CPageInfoContinueElement;

    @FindBy(xpath = "//*[@class=\"summary_subtotal_label\"]")
    public static WebElement CPageOverViewTotalPriceElement;

    @FindBy(xpath = "//*[text()=\"FINISH\"]")
    public static WebElement CPageFINISHBtnElement;

    @FindBy(css = "div[class=\"complete-text\"]")
    public static WebElement CPageVerifyTextElement;













}
