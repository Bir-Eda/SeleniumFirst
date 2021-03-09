package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JunitCalendar {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUp(){
        baseUrl="https://www.expedia.com/";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }
    @AfterAll
    public static void tearDown() {
        driver.quit();

    }
    @Test
    public void test1() {
WebElement myWeb=driver.findElement(By.xpath("//*[@id='hotel-checkin-hlp']"));
    }




}
