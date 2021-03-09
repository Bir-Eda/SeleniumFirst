package junitclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Orhan_Exercise {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("WebDriverManeger.chromdriver", "chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");
    }

    // Interview sorusu listi store edersin
    //
    @Test
    public void amazonList(){
        driver.get("https://www.amazon.com/");
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option"));
        for(int i=0; i<list.size(); i++){
            String text=list.get(i).getText();   // optionlari liste depoluyoruz
            System.out.println(text);
            if(text.contains("Electronics")){     // listin icinde elektronicse tikla
                list.get(i).click();
                break; // electronicsi bulunca cik
            }
        }

    }

    @Test
    public void amazonSelect() {
        driver.get("https://www.amazon.com/");
        Select sel = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        sel.selectByVisibleText("Electronics");
    }






//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
    // cont+alt+L organize your code, codu hizalamak icin kullanilir








}
