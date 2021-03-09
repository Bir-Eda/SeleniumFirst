package testingclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.RandomString;

import java.io.File;
import java.io.IOException;

public class TNG_Parallel {

    WebDriver driver;


    @BeforeClass    //similar to @BeforeAll in JUnit
    public void setUP(String browser, String platform) {

        String baseUrl = "https://www.jqueryui.com/";
        // create browser driver instance
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


    }
        @AfterClass
        public void tearDown() {
        driver.quit();
        }




    @Test()
    public void test1()  {


    }
}
