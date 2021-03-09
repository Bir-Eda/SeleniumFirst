package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitClear {
    static WebDriver driver;
    static String baseUrl;


    @BeforeAll
    public static void setUp(){
        baseUrl="https://www.amazon.com/";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }
    @AfterAll
    public static void tearDown(){
        driver.quit();

    }

}
