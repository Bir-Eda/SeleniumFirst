package SecondStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestS {

    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "resources/mac/chromDriver");

        // Tells the system where the chromedriver executable is located
       // System.setProperty("WebDriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");

        // Create a webdriver object
        WebDriver driver;
        driver = new ChromeDriver();

        //  open the Website / go to the URL given
        driver.get("https://the-internet.herokuapp.com/");
        driver.quit();
    }
}
