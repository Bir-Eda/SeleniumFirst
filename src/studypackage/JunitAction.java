package studypackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JunitAction {

    static WebDriver driver;
    static String baseUrl;
    static Actions actionNew;

    @BeforeAll
    public static void setUp(){
        baseUrl="https://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver","/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get(baseUrl);
       actionNew=new Actions(driver);
    }
    @AfterAll
 public static void end(){
        driver.quit();
    }

    @Test
    public void endClick()throws InterruptedException{
        Thread.sleep(3000);
        WebElement myWeb=driver.findElement(By.xpath("//i[@class='fb_logo img sp_Gm5ra99xcN4 sx_b66964']"));
        actionNew.moveToElement(myWeb).click().perform();
    }
    @Test
    public void doubleClick()throws InterruptedException{
        driver.navigate().to("https://www.cnn.com/");
        Thread.sleep(5000);
        WebElement doubleClick=driver.findElement(By.xpath("(//a[@name='us'])[position()=1]"));
        Thread.sleep(5000);
        actionNew.doubleClick(doubleClick).perform();
        Thread.sleep(5000);
actionNew.contextClick(doubleClick).perform();
Thread.sleep(5000);
    }
   /* @Test
    public void drogDrop()throws InterruptedException{
        driver.navigate().to("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
        WebElement myElement=driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(myElement);
        Thread.sleep(2000);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));
        actionNew.dragAndDrop(draggable,droppable).build().perform();
        Thread.sleep(2000);

        String actText=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();

        Assertions.assertEquals("Dropped!", actText);

    }
    @Test
    public void dClickHoldRelease() throws InterruptedException {
        driver.navigate().to("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frame);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // use actions class clickAndHold and release methods to drag from one element to another element
        actionNew.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        Thread.sleep(3000);
        String actualTxt = driver.findElement(By.tagName("p")).getText();

        Assertions.assertEquals("Drag me to my target", actualTxt);
        System.out.println("@Test3 - executed test");
        driver.switchTo().defaultContent(); // switch out of all iframes
    }
    @Test
    public void eSlider() throws InterruptedException {
        driver.navigate().to("https://www.kayak.com/cars/PHL-a1458/2020-06-27/2020-07-22?sort=rank_a");
        Thread.sleep(10000);
        WebElement totPrice = driver.findElement(By.xpath("//div[text()='Total price']"));
        totPrice.click(); // webelementine object olusturdu gorunur kilmak
        Thread.sleep(5000);
        WebElement minPrice = driver.findElement(By.className("cars-results-filters-PriceFilterSection__Header__Min"));
        WebElement maxPrice = driver.findElement(By.className("cars-results-filters-PriceFilterSection__Header__Max"));
        System.out.println("Min price before slide:"+minPrice.getText());
        System.out.println("Max price before slide:"+maxPrice.getText());

        WebElement startingSlider = driver.findElement(By.xpath("//div[@aria-label='Minimum price' and @role='slider']"));
        WebElement endSlider = driver.findElement(By.xpath("//div[@aria-label='Maximum price' and @role='slider']"));
        actionNew.dragAndDropBy(startingSlider, 100, 0).perform(); // drags and drops a slider element by offset given
        Thread.sleep(5000);
        actionNew.dragAndDropBy(endSlider, -50, 0).perform(); // drags and drops a slider element by offset given
        System.out.println("Min price after slide:"+minPrice.getText());
        System.out.println("Max price after slide:"+maxPrice.getText());
        // Note to student - Add Assertions.assertNotEquals as an exercise for the test case assertions part!
        Thread.sleep(10000);



    }  */




}