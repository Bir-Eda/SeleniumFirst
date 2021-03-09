package testingclasses;


// import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.RandomString;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TNG_Dependency extends TNG_Suite {

    static WebDriver driver;
    static String baseURL;
    static Actions action;
    @BeforeClass//similar to @BeforeAll in JUnit
    public void setUP(){
        baseURL = "https://www.jqueryui.com/";
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("@beforeAll-navigate browser");
        System.out.println("Class 1- @BeforeClass");
    }

    @AfterClass//@afterAll in Junit
    public void TearDown(){
        //driver.quit();
        System.out.println("Class 1- @AfterClass");
    }

    @Test
    public void test1()throws InterruptedException{
        Thread.sleep(5000);
        WebElement hovSupport=driver.findElement(By.xpath("//section//a[text()='Support']"));
        WebElement forums=driver.findElement(By.xpath("//a[text()='Forums']"));
        action.moveToElement(hovSupport).perform();
        Thread.sleep(5000);
        action.moveToElement(forums).click().perform();
        Thread.sleep(5000);
        String currUrl=driver.getCurrentUrl();
        Assert.assertEquals(currUrl, "https://forum.jquery.com/", "url mismatch!!!");
        System.out.println("@Test1 1- currUrl is:"+currUrl);
    }

    @Test(dependsOnMethods={"Test1"}, enabled =false)   // neden false= birinci test case gecmezse ikincisinde calistirma
    public void Test2(){
        WebElement getStart=driver.findElement(By.xpath("//a[text()='Getting Started')]"));
        getStart.click();
        System.out.println("@Test2 method");
        Assert.assertTrue(driver.getCurrentUrl().contains("getting-started1"));
    }
   @Test(dependsOnMethods={"test1"}, timeOut=1000)
    public void Test3()throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Class 1- @Test3 method");
    }
    }























