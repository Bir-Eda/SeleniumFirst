package studypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetProperty {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver=  new ChromeDriver();

        driver.get("https://nau.edu");
        Thread.sleep(5000);
        driver.quit();

    }
}
