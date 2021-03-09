package testingclasses;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TNG_Extent {
    WebDriver driver;
    String baseUrl;
    ExtentReports report;
    ExtentTest eTest;

    @BeforeClass
    public void setUp(){
        baseUrl="https://jqueryui.com/";
        report=new ExtentReports("/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");

       eTest=report.startTest("Reporter Demo") ;
       eTest.log(LogStatus.INFO, "Test started...");
       System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver= new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        eTest.log(LogStatus.INFO, "Opened browser, maximized...");

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        report.endTest(eTest);
        report.flush();

    }
   // @AfterTest
    public void navBack() {
        driver.navigate().back();
    }
    @Parameters({"linknm"})
    @Test
    public void eventsTest(String linknm) {
        WebElement desiredLink = driver.findElement(By.linkText(linknm));
        desiredLink.click();
        String currUrl = driver.getCurrentUrl();
        if (linknm.equals("Events"))
            Assert.assertEquals(currUrl, "https://openjsf.org/");
        else
            Assert.assertEquals(currUrl, "https://plugins.jquery.com/");
    }
    @Parameters({"linknm"})
    @Test
    public void insideValidations(String clickLink) {
        WebElement logo, headerText;
        if (clickLink.equals("Events")) {
            logo = driver.findElement(By.xpath("//img[@alt='OpenJS Foundation']/parent::a"));
        } else {
            logo = driver.findElement(By.linkText("jQuery Plugin Registry"));
        }
        logo.click();
        if (clickLink.equals("Events")) {
            headerText = driver.findElement(By.xpath("//div[contains(@class, 'instance-1')]//div[@class='nectar-gradient-text']/h3"));
            Assert.assertTrue(headerText.getText().equals("Welcome Electron!"));
        } else {
            headerText = driver.findElement(By.cssSelector("#banner-secondary>h1"));
            Assert.assertTrue(headerText.getText().equals("The jQuery Plugin Registry"));
        }
    }
}

    //  //a[contains(@href,'events')]
//   #banner-secondary>h1
