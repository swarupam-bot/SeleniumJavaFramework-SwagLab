package com.test.WebPages;

import com.test.Utils.swagLabsWebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;
import static com.test.TestCases.TestRunnerWeb.config;
import static com.test.WebElements.HomePageWebElements.*;


public class SwagLabsHomePage {
    public SwagLabsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void TC_SelectHighestPriceItemAndCheckOut() {
        swagLabsWebUtils.LoginHomePage(config.getProperty("username"), config.getProperty("password"));

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


        swagLabsWebUtils.checkOutPages(config.getProperty("Fname"), config.getProperty("Lname"), config.getProperty("ZCode"));

    }

    public static void TC_SelectAllItemsAndCheckOut()
    {
        swagLabsWebUtils.LoginHomePage(config.getProperty("username"), config.getProperty("password"));
        int i=0;
        List<WebElement> AddToCartList = HPageAddToCartElement;
        for (WebElement ele:AddToCartList)
        {
            i++;
            ele.click();
            System.out.println("Added "+i+" item to the cart");
        }
        System.out.println("Total items added in cart = "+i);

        swagLabsWebUtils.checkOutPages(config.getProperty("Fname"), config.getProperty("Lname"), config.getProperty("ZCode"));

    }





}
