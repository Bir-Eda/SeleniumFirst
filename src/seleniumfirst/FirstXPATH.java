package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstXPATH {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/Users/Eda/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        System.out.println("driver location" + System.getProperty("webdriver.chrome.driver"));

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();

        driver1.get("https://www.bankofamerica.com/");
        //span[contains(text(),'Better Money Habits')]//parent::a//parent::li//preceding-sibling::li[7]

        driver1.findElement(By.xpath("//a[@aria-controls='navCheckingContent']")).click();

            // parent-child for find uniq element
       //   /html/body/div/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[1]/a/span[3]

        //  /html/body/div[1]/div/div/section[2]/div/div/div[2]/div/div[3]/div[1]/div/div/form/div[1]/div/div[1]/div[3]/div/input
             //   with tagname ile de asagidaki gibi buluyoruz
        // //tagname[text()='value']
        // div[text()='Get checking with the right features']



    }
}