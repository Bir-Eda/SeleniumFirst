package seleniumfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstFireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/geckodriver");

        //System.setProperty("webdriver.gecko.driver","/Users/Eda//Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/geckodriver");

        System.out.println("driver location is:"+System.getProperty("webdriver.gecko.driver"));
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

    }
}
