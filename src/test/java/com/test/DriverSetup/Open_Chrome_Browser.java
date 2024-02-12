package com.test.DriverSetup;

import com.aventstack.extentreports.ExtentReports;
import com.test.Utils.ExtentReporterUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Open_Chrome_Browser {

    public static WebDriver driver;
    public static ExtentReports extent;

    @BeforeTest
    public void openChromeBrowser()
    {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String fileName = "test-report.html";
        extent=ExtentReporterUtil.createInstance(fileName);

        extent.createTest("first test","able to login browser");
        Reporter.log("hello ");
    }


    //this is the feature



    @AfterTest
    public void close(){
        extent.flush();
        driver.close();


    }
}
