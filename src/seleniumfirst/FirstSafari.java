package seleniumfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSafari {
    public static void main(String[] args) {
        System.out.println("driver location is:"+System.getProperty("webdriver.safari.driver"));
        WebDriver driver1=new SafariDriver();
        driver1.get("https://facebook.com");
    }
}
