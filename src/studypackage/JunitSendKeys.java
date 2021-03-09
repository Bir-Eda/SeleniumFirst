package studypackage;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSendKeys {

    static String baseUrl;
    static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        baseUrl="https://www.amazon.com/";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


    }
    @AfterAll
    public static void  tearDown(){
        driver.quit();

    }
    @BeforeEach
    public void doIt(){
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();  // her defasinda temizlesin bos biraksin
        System.out.println("@BeforeEach-clear the inputbox");

    }
    @AfterEach
    public void refresh(){
        driver.navigate().refresh(); // her testte sayfayi yenilemesi icin
        System.out.println("@AfterEach- refreshed the page");
    }
    @Test
    public void Test1() throws InterruptedException{
        WebElement myWeb= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        myWeb.sendKeys("Hello world");
        Thread.sleep(5000);

    }
}
