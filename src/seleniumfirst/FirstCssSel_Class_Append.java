package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCssSel_Class_Append {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        System.out.println("driver location" + System.getProperty("webdriver.chrome.driver"));

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();

        driver1.get("https://www.bankofamerica.com/");
        //tag.class1.class2.class3 and so on
        driver1.findElement(By.cssSelector("span.spa-btn spa-btn--primary.spa-btn--medium.masthead-cta-btn")).click();

       // driver1.findElement(By.cssSelector("a[aria-controls^='navChecking']")).click();
        //  a[aria-controls^='navCh']       ^ isareti ile kelimenin basindan itibaren basliyosun- starting character

        // starts-with and ^ doing same function
        // //span[starts-with(text(),'Better Monet Habits')]/parent

        //  a[aria-controls$='ckingContent']     $ isareti ile kelimenin sonundan basliyosun-ending character
        // a[aria-controls*='Checking']      *  isareti ile kelimenin ortasini aliyosun- containing character

        // cssSelector ( a[aria-controls*='Checking']>span[class='title'] )
        // cssSelector ( a[aria-controls*='Checking']>span.title )

//       Wild card characters in css selector -
//                a[aria-controls^='navCh']
//        a[aria-controls$='ckingContent']
//        a[aria- controls*='Checking']

//        child <--> parent
//        a[aria-controls*='Checking']>span[class='title']
//        a[aria-controls*='Checking']>span.title (edited)


    }
}