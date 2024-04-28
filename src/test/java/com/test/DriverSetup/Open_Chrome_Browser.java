package com.test.DriverSetup;

import com.test.WebPages.SwagLabsLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Open_Chrome_Browser {

    public static WebDriver driver;
   // public static ExtentReports extent;

    public static FileInputStream fis;
    public static Properties config = new Properties();

    @BeforeClass
    public void readData() throws IOException {
        fis = new FileInputStream("/Users/swarupamkumar/IdeaProjects/SwagLabs_DemoTest/src/test/java/com/test/Utils/testData.properties");
        config.load(fis);
        System.out.println("Test data loaded successfully.");
    }

    @BeforeMethod
    public void testSetup() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        SwagLabsLoginPage TestCase = new SwagLabsLoginPage(driver);

        System.out.println("relaunching the login page for next test");
    }

    @BeforeTest
    public  void openChromeBrowser()
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
