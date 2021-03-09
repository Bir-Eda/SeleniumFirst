package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class JunitElementText {
    static WebDriver driver;
    static String baseUrl;
    @BeforeAll
    public static void setUp(){
        baseUrl="https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void listElementText(){
        WebElement myElementText= driver.findElement(By.xpath("//a[text()='Customer service']"));
        myElementText.click();
        System.out.println("Test1-test accomplished");
        String a=driver.findElement(By.xpath("//a[text()='Customer service']")).getText();
      //  Assert.assertEquals("not equals", "Custome service", a);


    }

}
