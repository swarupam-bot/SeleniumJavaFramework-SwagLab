package com.test.WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageWebElements extends CheckOutPageWebElements {

    @FindBy(xpath = "//*[text()=\"Open Menu\"]")
    public static WebElement HPageOpenMenuElement;

    @FindBy(xpath = "//div[@class=\"pricebar\"]//div")
    public static List<WebElement> HPageProductPriceElement;

    @FindBy(xpath = "//div[@class=\"inventory_item_price\"]/parent::*/child::*[@class=\"btn_primary btn_inventory\"]")
    public static List<WebElement> HPageAddToCartElement;

    @FindBy(xpath = "//*[@data-icon=\"shopping-cart\"]/child::*")
    public static WebElement HPageCartElement;






}
