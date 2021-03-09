package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JunitRadioButton {
    static WebDriver driver;
    static String baseUrl;
    @BeforeAll
    public static void setUp(){
        baseUrl="https://letskodeit.teachable.com/p/practice";
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
    public void Test1()throws InterruptedException{
        WebElement bmw=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        bmw.click();
        Thread.sleep(3000);

        System.out.println(bmw.isSelected()+"bmw is selected"); // sectigimiz web element secildimi secilmedi mi onu gosteriyo

    }

}
