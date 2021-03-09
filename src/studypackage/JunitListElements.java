package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JunitListElements {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUp(){
        baseUrl="https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();


    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void listElement(){
            List<WebElement> author=driver.findElements(By.xpath("//table[@class='table-display']//td[1]"));
            List<WebElement> course=driver.findElements(By.xpath("//table[@class='table-display']//td[2]"));
            List<WebElement> price=driver.findElements(By.xpath("//table[@class='table-display']//td[3]"));
            System.out.println("----Authors----");
            for(WebElement a:author){
                System.out.println(a.getText());
            }
            System.out.println("---Cources-----");
            for(WebElement b: course){
                System.out.println(b.getText());
            }
            System.out.println("---Prices-----");
            for(WebElement c:price){
                System.out.println(c.getText());
            }
            System.out.println();
            for(int i=0; i<author.size(); i++){
                System.out.println("author: "+author.get(i).getText()+
                        "course: "+course.get(i).getText()+
                        "price: "+price.get(i).getText());
                System.out.println("--------");
            }


        System.out.println("------------");
        for(int i=0; i<author.size(); i++){
            System.out.println("author : "+author.get(i).getText());
        }
        System.out.println("------------");
        for(int i=0; i<course.size(); i++){
            System.out.println("course : "+course.get(i).getText());
        }
        System.out.println("------------");
        for(int i=0; i<price.size(); i++){
            System.out.println("price : "+price.get(i).getText());
        }

    }

}
