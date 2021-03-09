package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPartialLinkText {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "/Users/Eda/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        System.out.println("driver location" + System.getProperty("webdriver.chrome.driver"));

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();

        driver1.get("https://www.bankofamerica.com/");

        driver1.findElement(By.partialLinkText("Management")).click();

    }
}