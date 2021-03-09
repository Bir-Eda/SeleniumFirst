package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitClick {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUp(){
        baseUrl="https://www.amazon.com/";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException{
        WebElement best=driver.findElement(By.xpath("//a[text()='Customer Service']"));
        best.click();
        Thread.sleep(5000);
        System.out.println("Test1-");

    }
}
