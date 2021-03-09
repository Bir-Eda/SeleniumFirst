//package testingclasses;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import pageObjects.ButtonsPage;
//import pageObjects.JQueryHPage;
//
//public class TNG_PageObj1 {
//    WebDriver driver;
//    String baseUrl;
//
//    JQueryHPage jPage;
//    ButtonsPage bPage;
//
//    @BeforeClass
//    public void setUp() {
//        baseUrl = "https://jqueryui.com/";
//        //Create browser driver instance
//        System.setProperty("webdriver.chrome.driver", "/Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/chromedriver");
//        driver = new ChromeDriver();//instantiateing the driver instance here
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        bPage = new ButtonsPage(driver);
//        jPage = new JQueryHPage(driver);
//        bPage.switchFrame();
//    }
//
//    @AfterClass
//    public void quitter() {
//        driver.quit();
//    }
//
//
//    @Test
//    public void testButtonsPage() {
//        Assert.assertEquals(driver.getCurrentUrl(), "https://jqueryui.com/button/");
//    }
//
//    @Test
//    public void clickButtons() {
//        Assert.assertEquals(TabsPage.allTabs.size(), 3);
//        for (WebElement eachTab : TabsPage.allTabs) {
//            System.out.println("tab name:" + eachTab.getText());
//            eachTab.click();
//        }
//    }
//
//}
//
