package junitclass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;

public class FirstJunitHandle {

    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUP() {
        baseUrl="https://learn.letskodeit.com/p/practice";
        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@beforeAll-navigate browser");
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
        System.out.println("@AfterAll-close browser");
    }
    @Test    // her bir handle bir pencere
    public  void test1()throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        System.out.println("@test1 current before window handle-" + parentHandle);
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(5000);
////        driver.findElement(By.xpath("//input[@placeholder='Find a course']")).sendKeys("course");
//        Thread.sleep(5000);
//        currWindowHandle=driver.getWindowHandle();
//        System.out.println("@test1 current after window handle-"+currWindowHandle);
//        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();  // parenttan child a gittigimiz icin iki pencere aciliyor o yuzden set yaptik
        System.out.println("number of windows" + handles.size());
        for (String h : handles) {
            System.out.println("handle is:" + h);
            if (h.equals(parentHandle)) {
                System.out.println("parent hande" + h);
            } else {
                System.out.println("child" + h);
                driver.switchTo().window(h);

               // WebElement findDriver=



                List<WebElement> findCourse = driver.findElements(By.xpath("//input[@placeholder='Find a course']"));
                if (findCourse.size()== 1) {
                    findCourse.get(0).sendKeys("my favorite course");
                    Thread.sleep(5000);
                    System.out.println("found child window and send keys");
                    driver.close();
                    break;
                } else {
                    System.out.println("not the child window");
                }
            }
        }
        //driver.findElement(By.xpath("//input[@placeholder='Find a course']")).sendKeys("course");
        Thread.sleep(5000);
        driver.switchTo().window(parentHandle);//to return parent window//now can do
        driver.findElement(By.id("bmwradio")).click();//cant do this because now focus is in child window and radio is in parent window
        Thread.sleep(5000);
    }
    @Test
    public  void test2(){
        System.out.println("@test2 executed test");
    }

}
