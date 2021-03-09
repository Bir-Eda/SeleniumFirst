package studypackage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JunitJavaScriptExecute {
    static WebDriver driver;
    static JavascriptExecutor jse;
    static String baseUrl;
}

//@BeforeAll
//public void static setUp() throws Exception {
//    System.setProperty("webdriver.gecko.driver", "/Users/Eda//Users/Eda/Desktop/LocatorsFinding/Selenium Dependencies/Drivers/geckodriver");
//    driver=new FirefoxDriver();
//    jse=(JavascriptExecutor)driver;
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//}
//@Test
//    public void test()throws  Exception{
//    jse.executeScript("window.location = 'https://learn.letskodeit.com/p/practice'");
//    long heigth=(long) jse.executeScript("return window.innerHeigth");
//    long weigth=(long) jse.executeScript("return window.innerWeigth");
//    System.out.println("Heigth"+ heigth);
//    System.out.println("Weigth"+ weigth);
//
//
//
//}
//}


