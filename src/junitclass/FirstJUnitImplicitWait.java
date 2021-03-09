package junitclass;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
@TestMethodOrder(MethodOrderer.Alphanumeric.class)


public class FirstJUnitImplicitWait {
    static WebDriver driver;
    static String baseUrl;
    static JavascriptExecutor jse;


        @BeforeAll
        public static void setUP() {
            baseUrl = "https://www.bankofamerica.com/";

            System.setProperty("webdriver.gecko.driver","/Users/Eda//Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/geckodriver");

            System.out.println("driver location is:"+System.getProperty("webdriver.gecko.driver"));
            WebDriver driver=new FirefoxDriver();

            driver.get(baseUrl);
            System.out.println("@BeforeAll - initiated and navigated to web page");





        //waits for 10 seconds at driver level for webelements before throwing exceptions
        //waits for 10 seconds at driver level for webelements before throwing exceptions
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @Test
    public void test1() {

        WebElement academy = driver.findElement(By.xpath("//a[contains(@href, 'khanacademy')]"));
        academy.click();
        System.out.println("@Test1 - executed test");
    }
}

























