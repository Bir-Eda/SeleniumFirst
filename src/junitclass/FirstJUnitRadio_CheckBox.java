package junitclass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitRadio_CheckBox {
    static WebDriver driver;
    static String baseUrl;

    boolean benzSelected;
    boolean bmwSelected;
    boolean hondaSelected;

    @BeforeAll
    public static void setUP(){
        baseUrl="https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
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
       // driver.navigate().refresh();
        System.out.println("@BeforeEach-refreshed the page");
    }
    @AfterEach
    public void done(){
       // driver.navigate().refresh();
        System.out.println("@AfterEach-refreshed the page");
    }

    @Test
    public void radiotest() throws InterruptedException{

        benzSelected=driver.findElement(By.xpath("//input[@id='benzradio']")).isSelected();
        bmwSelected=driver.findElement(By.xpath("//input[@id='bmwradio']")).isSelected();
        hondaSelected=driver.findElement(By.xpath("//input[@id='hondaradio']")).isSelected();
        System.out.println("Radio benzSelected:"+benzSelected);
        System.out.println("Radio bmwSelected:"+bmwSelected);
        System.out.println("Radio hondaSelected:"+hondaSelected);


        driver.findElement(By.xpath("//input[@id='benzradio']")).click();
        System.out.println("@Test1-clicked on benz radio");
        Thread.sleep(3000);
        //benzSelected=driver.findElement(By.xpath("//input[@id='benzradio']")).isSelected();
        //System.out.println("Radio benzSelected:"+benzSelected);


        driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
        System.out.println("@Test1-clicked on bmw radio");
        //bmwSelected=driver.findElement(By.xpath("//input[@id='bmwradio']")).isSelected();
        //System.out.println("Radio bmwSelected:"+bmwSelected);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='hondaradio']")).click();
        System.out.println("@Test1-clicked on honda radio");
        Thread.sleep(3000);
        hondaSelected=driver.findElement(By.xpath("//input[@id='hondaradio']")).isSelected();

        System.out.println("Radio benzSelected:"+benzSelected);
        System.out.println("Radio bmwSelected:"+bmwSelected);
        System.out.println("Radio hondaSelected:"+hondaSelected);   // buttonlarda sonuncu true olur


    }
    @Test
    public void checkboxtest() throws InterruptedException {

        WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
        WebElement benzCheck = driver.findElement(By.id("benzcheck"));
        WebElement hondaCheck = driver.findElement(By.id("hondacheck"));
        hondaCheck.click();
        Thread.sleep(5000);
        bmwCheck.click();
        Thread.sleep(5000);
        benzCheck.click();
        Thread.sleep(5000);

        benzSelected=driver.findElement(By.xpath("//input[@id='benzradio']")).isSelected();
        bmwSelected=driver.findElement(By.xpath("//input[@id='bmwradio']")).isSelected();
        hondaSelected=driver.findElement(By.xpath("//input[@id='hondaradio']")).isSelected();

        System.out.println("check benzSelected:"+benzSelected);
        System.out.println("check bmwSelected:"+bmwSelected);
        System.out.println("check hondaSelected:"+hondaSelected);

        hondaCheck.click();
        Thread.sleep(5000);
        bmwCheck.click();
        Thread.sleep(5000);
        benzCheck.click();
        Thread.sleep(5000);

        benzSelected=driver.findElement(By.xpath("//input[@id='benzradio']")).isSelected(); // isSelected boolean de kullanilir
        bmwSelected=driver.findElement(By.xpath("//input[@id='bmwradio']")).isSelected(); // return type boolean
        hondaSelected=driver.findElement(By.xpath("//input[@id='hondaradio']")).isSelected();

        System.out.println("check benzSelected:"+benzSelected);
        System.out.println("check bmwSelected:"+bmwSelected);
        System.out.println("check hondaSelected:"+hondaSelected);
    }
}
