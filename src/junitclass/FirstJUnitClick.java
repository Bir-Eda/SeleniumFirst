package junitclass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitClick {
    static WebDriver driver;   // global variableslar ile object creat etmis oluyoruz
    static String baseUrl;


    @BeforeAll
    public static void setUP(){
        baseUrl="https://letskodeit.teachable.com/";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize(); // bazi elementlere ulasmak icin buyutuyoruz
        driver.get(baseUrl);
        System.out.println("@BeforeAll-initiated and navigated to web page");
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
        System.out.println("@AfterAll-closed browser session");
    }
    @BeforeEach
    public void init(){
        driver.navigate().refresh(); //sayfaya git ve sayfayi yenile
        System.out.println("@BeforeEach-refreshed the page");
    }
    @AfterEach
    public void done(){
        driver.navigate().refresh();
        System.out.println("@AfterEach-refreshed the page");
    }
    @Test
    public void test1(){
        driver.findElement(By.cssSelector("a.navbar-brand.header-logo")).click();
        System.out.println("@Test1-clicking directly");
    }
    @Test
    public void test2() throws InterruptedException{
        Thread.sleep(5000);
        WebElement logo=driver.findElement(By.cssSelector("a.navbar-brand.header-logo")); // create a webElement
        logo.click(); // webElementin sonuna da yazabilirdik ama genellikle bu sekilde yazilir
        System.out.println("@Test2-clicking on WebElement logo");
    }

}
