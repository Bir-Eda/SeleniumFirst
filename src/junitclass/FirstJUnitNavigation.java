package junitclass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitNavigation {
    static WebDriver driver;
    static String baseUrl;
    static String currentUrl;
    static String pageTitle;


    @BeforeAll
    public static void setUP() {
        baseUrl = "https://letskodeit.teachable.com/";
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get(baseUrl); alttaki ile ayni anlama geliyor
       // driver.navigate().to(baseUrl);
        System.out.println("@BeforeAll-initiated and navigated to web page");
        //currentUrl=driver.getCurrentUrl();
        // System.out.println("@BeforeAll-Current url: "+currentUrl);
        //pageTitle=driver.getTitle();
        // System.out.println("@BeforeAll-page title: "+pageTitle);
        getTitleUrl("-BeforeAll :");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@AfterAll-closed browser session");
    }

    @BeforeEach
    public void init() throws InterruptedException{
        driver.navigate().refresh();
        System.out.println("@BeforeEach-refreshed the page");
        Thread.sleep(5000);
        //currentUrl=driver.getCurrentUrl();
        //System.out.println("@BeforeEach-Current url: "+currentUrl);
        // pageTitle=driver.getTitle();
        //System.out.println("@BeforeEach-page title: "+pageTitle);
        getTitleUrl("-BeforeEach :");
    }

    @AfterEach
    public void done() throws InterruptedException{
        driver.navigate().refresh();
        System.out.println("@AfterEach-refreshed the page");
        //currentUrl=driver.getCurrentUrl();
        Thread.sleep(5000);
//        System.out.println("@AfterEach-Current url: "+currentUrl);
//        pageTitle=driver.getTitle();
//        System.out.println("@AfterEach-page title: "+pageTitle);
        getTitleUrl("-AfterEach :");

    }

    @Test
    public void browserNavigation() throws InterruptedException {
        //currentUrl=driver.getCurrentUrl();
        // System.out.println("@browserNavigation-Current url before clicking practice: "+currentUrl);
        //pageTitle=driver.getTitle();
        getTitleUrl("-@browserNavigation-before clicking practice :");
        driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
        System.out.println("@Test1-clicking directly on Practice button");
        Thread.sleep(5000);
        getTitleUrl("-@browserNavigation-after clicking practice :");
        driver.navigate().back();
        System.out.println("@Test1-navigated back to home page");
        Thread.sleep(5000);
        getTitleUrl("-@browserNavigation-after navigation back :");
        driver.navigate().forward();
        System.out.println("@Test1-navigated forward from home page to practice page");
        Thread.sleep(5000);
        getTitleUrl("-@browserNavigation-after navigation forward :");
    }

    private static void getTitleUrl(String whereRU) {
        currentUrl = driver.getCurrentUrl();
        System.out.println("Currunt url " + whereRU + currentUrl);
        pageTitle = driver.getTitle();
        System.out.println("page title " + whereRU + pageTitle);
    }

}

//        currentUrl=driver.getCurrentUrl();
//        System.out.println("@browserNavigation-Current url after clicking practice: "+currentUrl);
//        pageTitle=driver.getTitle();
//        System.out.println("@browserNavigation-page title before clicking practice: "+pageTitle);
//        driver.navigate().back();
//        System.out.println("@Test1-navigated back to home page");
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        System.out.println("@Test1-navigated forward to home page");
//        Thread.sleep(5000);
//    }
//    @Test
//    public void browserNavigationGet() throws InterruptedException{
//        driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
//        System.out.println("@Test1-clicking directly on Practice button");
//        Thread.sleep(5000);
//        driver.navigate().back();
//        System.out.println("@Test1-navigated back to home page");
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        System.out.println("@Test1-navigated forward from home page to practice page");
//        Thread.sleep(5000);
//    }


