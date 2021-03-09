package junitclass;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstJUnitAttribute {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUP() {
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@BeforeAll - initiated and navigated to web page");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }
    @Test
    public void test1(){
        WebElement openTab=driver.findElement(By.xpath("//legend[text()='Switch Tab Example']//following-sibling::a"));
        System.out.println("@test1 class name is"+openTab.getAttribute("class"));
        System.out.println("@test1 id name is"+openTab.getAttribute("id"));
        System.out.println("@test1 href name is"+openTab.getAttribute("href"));
        System.out.println("@test1 target name is"+openTab.getAttribute("target"));
    }
    @Test
    public  void test2(){
        // getTagName method retunrs the tag name of the element in use.
        WebElement tagExample=driver.findElement(By.xpath("//*[text()='Switch Tab Example']"));
        System.out.println("@test2 tagExample test"+tagExample.getTagName());
    }
    @Test
    public void test3() throws InterruptedException{
        List<WebElement> listEle=driver.findElements(By.xpath("//div[@id='radio-btn-example']//input"));
        for(WebElement ele:listEle){
            ele.click();
            System.out.println("Radio button selected is:"+ele.getAttribute("value"));
            System.out.println("Radio button isSelected:"+ele.isSelected());
            Thread.sleep(5000);
        }
    }
}


