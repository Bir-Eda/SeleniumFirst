package testingclasses;

import org.testng.annotations.*;

public class TNG_Priority {
    @BeforeClass//similar to @BeforeAll in JUnit
    public void setUP(){
        System.out.println("Class 2- @BeforeClass");
    }
    @AfterClass//@afterAll in Junit
    public void TearDown(){
        System.out.println("Class1-@AfterClass");
    }
    @BeforeMethod   // similar to  beforeEach in junit
    public void init(){
        System.out.println("Class1-@BeforeMethod");
    }
    @AfterMethod   // similar to afterEach in junit
    public void quit(){
        System.out.println("Class1-@AfterMethod");
    }
    @Test (priority = 1)
    public void Test1(){
        System.out.println("Class1-@Test1 method");
    }
    @Test (priority = 2)
    public void Test2(){
        System.out.println("Class1-@Test2 method");
    }
    @Test (priority = 3)
    public void Test3(){
        System.out.println("Class1-@Test3 method");
    }
}
