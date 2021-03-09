package junitclass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class FirstJUnitClear {
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

    @BeforeEach
    public void init() {
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).clear();
        System.out.println("@BeforeEach - refreshed the page");
    }

    @AfterEach
    public void done() {
        driver.navigate().refresh();
        System.out.println("@AfterEach - refreshed the page");
    }

    @Test
    public void test1() {
       // driver.findElement(By.xpath("input[@placeholder='Enter Your Name']")).clear();
        //driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        // System.out.println("@Tes1- execudeed test");
        driver.findElement(By.name("enter-name")).sendKeys("byildirim1@na.edu");
        // driver.findElement(By.xpath("//label[text()='password']//following-sibling::div/input")).sendKeys("userPassword");
        // driver.findElement(By.xpath("//input[@value='Log In']")).click();
        // System.out.println("@Test1-clicked directly on log in button");
        System.out.println("@Test1- entered text directly on Email Address");
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement nameField = driver.findElement(By.name("name='enter-name"));
        // WebElement password = driver.findElement(By.xpath("//label[text()='password']//following-sibling::div/input"));
         WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        nameField.sendKeys("userPass");
        // password.sendKeys("userPassword");
        // loginBtn.click();
        System.out.println("@Test2 - performed operation with objects ");
        Thread.sleep(5000);
    }
}