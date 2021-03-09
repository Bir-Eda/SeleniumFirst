package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitNavigate {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUp(){
        baseUrl="https://www.amazon.com/";
        System.setProperty("webdriver.gecko.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/geckodriver");
        driver=new FirefoxDriver();
       // System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
       // driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void Test1() {
        System.out.println("Current page title"+ driver.getTitle());
        System.out.println("Current url"+ driver.getCurrentUrl());
      //  Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com/");
        System.out.println("Current page title"+ driver.getTitle());
        System.out.println("Current url"+ driver.getCurrentUrl());
       // Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Current page title"+ driver.getTitle());
        System.out.println("Current url"+ driver.getCurrentUrl());
       // Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Current page title"+ driver.getTitle());
        System.out.println("Current url"+ driver.getCurrentUrl());
       // Thread.sleep(2000);

        driver.navigate().refresh();
        System.out.println("Current page title"+ driver.getTitle());
        System.out.println("Current url"+ driver.getCurrentUrl());

    }
}
