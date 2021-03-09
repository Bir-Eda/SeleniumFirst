package junitclass;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitPoPAlert {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUP() {
        baseUrl="https://learn.letskodeit.com/p/practice";
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@beforeAll-navigate browser");
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @Test
    public void test1() throws InterruptedException {
        Alert alrt;  //create Alert class object
        Thread.sleep(5000);

        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
        WebElement nameEle = driver.findElement(By.id("name"));

        nameEle.sendKeys("NABOOT");
        alertBtn.click();
        Thread.sleep(5000);

        alrt = driver.switchTo().alert(); // switches to a javascript alert that opens at browser level
        System.out.println("alert text is:"+alrt.getText()); // alert box text retrieved
        alrt.accept();
        Thread.sleep(5000);

        nameEle.sendKeys("NABOOT");
        confirmBtn.click();
        Thread.sleep(5000);

        alrt = driver.switchTo().alert(); // switches to a javascript alert that opens at browser level
        System.out.println("alert text is:"+alrt.getText()); // alert box text retrieved for confirm popup
        alrt.dismiss();
        Thread.sleep(5000);
    }
}
