package com.test.DriverSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Open_Chrome_Browser {

    public static WebDriver driver;
   // public static ExtentReports extent;

    @BeforeTest
    public void openChromeBrowser()
    {
        WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver","/Users/swarupamkumar/IdeaProjects/SwagLabs_DemoTest/Driver/chromedriver");

        driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        String fileName = "test-report.html";
//        extent=ExtentReporterUtil.createInstance(fileName);
//        extent.createTest("first test","able to login browser");

    }


    @AfterTest
    public void close(){
        //extent.flush();
        driver.close();


    }
}
