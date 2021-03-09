package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TatilSepeti {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","/Users/Eda/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        System.out.println("driver location"+System.getProperty("webdriver.chrome.driver"));

        WebDriver driver1 =new ChromeDriver();
        driver1.manage().window().maximize();

        driver1.get("https://www.tatilsepeti.com/");

        driver1.findElement(By.id("bolge")).sendKeys("Alanya");
        try{
            driver1.findElement(By.id("searchBtn")).click();
        } catch(Exception e){
            driver1.findElement(By.cssSelector(".swal2-close")).click();
            driver1.findElement(By.id("bolge")).sendKeys(Keys.ENTER);
            System.out.println("workedxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            driver1.findElement(By.id("searchBtn")).click();
        }


    }

}


