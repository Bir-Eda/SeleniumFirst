package junitclass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FirstJUnitSelectDrop {

    static WebDriver driver;
    static String baseUrl;


    @BeforeAll
    public static void setUP() {
        baseUrl = "https://learn.letskodeit.com/p/practice";
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@BeforeAll-initiated and navigated to web page");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@BeforeAll-executed once after all test methods in this class");
    }

    @BeforeEach
    public void init() {
        System.out.println("@BeforeAll-executed once before every test methods in this class");
    }

    @AfterEach
    public void done() {
        System.out.println("@BeforeAll-executed once after every test methods in this class");
    }
    @Test
    public void multiSelectEach() throws InterruptedException {
        System.out.println("@multiSelectEach executed test");
        WebElement multiEle = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(multiEle);
        sel.selectByValue("apple");//selects using the valur attribute of the option tag element
        Thread.sleep(5000);
        sel.selectByVisibleText("Orange");
        Thread.sleep(5000);
        sel.selectByIndex(2);//index for bmw
        Thread.sleep(5000);
        List<WebElement> opts = sel.getOptions();//returns a list of webElements of all the option tag
        for (WebElement ele : opts) {
            System.out.println("Option is: " + ele.getText());
        }
    }
    @Test
    public void multiSelectAll() throws InterruptedException {
        System.out.println("@multiSelectAll executed test");
        WebElement multiEle = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(multiEle);
        sel.deselectByIndex(0);//selects using the valur attribute of the option tag element
        Thread.sleep(5000);
        sel.deselectByIndex(1);
        Thread.sleep(5000);
        sel.deselectByIndex(2);//index for bmw
        Thread.sleep(5000);
    }
    @Test
    public void multiac_SelectAll() throws InterruptedException {
        System.out.println("@multiSelectAll executed test");
        WebElement multiEle = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(multiEle);
        List<WebElement> opts = sel.getOptions();//returns a list of webElements of all the option tag
        for (WebElement ele : opts) {
            System.out.println("Option is: " + ele.getText());
            sel.selectByVisibleText(ele.getText());
            Thread.sleep(5000);
        }
        for (WebElement ele : opts) {
            System.out.println("Option is: " + ele.getText());
            sel.deselectByVisibleText(ele.getText());
            Thread.sleep(5000);
        }
    }
    @Test
    public void multiac_GetSelected() throws InterruptedException {
        System.out.println("@dropSelectAll executed test");
        WebElement multiEle = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(multiEle);
        List<WebElement> opts = sel.getOptions();//returns a list of webElements of all the option tag
        for (WebElement ele : opts) {
            System.out.println("Option is: " + ele.getText());
            sel.selectByVisibleText(ele.getText());
            Thread.sleep(5000);
        }
        sel.deselectByIndex(1);
        Thread.sleep(5000);
        List<WebElement>selOpts=sel.getAllSelectedOptions();
        for (WebElement ele : selOpts) {
            System.out.println("Option is: " + ele.getText());
        }
        sel.deselectAll();
        Thread.sleep(5000);
        selOpts=sel.getAllSelectedOptions();
        System.out.println("Selected options count: "+selOpts.size());
        Thread.sleep(5000);
        System.out.println("is multiple= "+sel.isMultiple());
    }
}


