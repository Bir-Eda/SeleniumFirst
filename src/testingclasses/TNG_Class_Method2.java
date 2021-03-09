package testingclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TNG_Class_Method2 extends TNG_Suite {

    @BeforeClass //similar to @BeforeAll in JUnit
    public void setUP(){
        System.out.println("Class 2- @BeforeClass");
    }
    @AfterClass // similar to @afterAll in Junit
    public void TearDown(){
        System.out.println("Class 2-@AfterClass");
    }
    @BeforeMethod // similar to beforeEach in junit
    public void init(){
        System.out.println("Class 2-@BeforeMethod");
    }
    @AfterMethod // similar to afterEach in junit
    public void quit(){
        System.out.println("Class 2-@AfterMethod");
    }
    @Test
    public void Test1(){
        System.out.println("Class 2-@Test1 method");
    }
    @Test
    public void Test2(){
        System.out.println("Class 2-@Test2 method");
    }
    @Test
    public void Test3(){
        System.out.println("Class 2-@Test3 method");
    }
}


/*@BeforeClass //similar to @BeforeAll in junit
    public void setUP() {
        System.out.println("Class2 - @BeforeClass method");
    }

    @AfterClass //similar to @AfterAll in junit
    public void TearDown() {
        System.out.println("Class2 - @AfterClass method");
    }

    @BeforeMethod //similar to @BeforeEach in junit
    public void init() {
        System.out.println("Class2 - @BeforeMethod method");
    }

    @AfterMethod //similar to @AfterEach in junit
    public void quit() {
        System.out.println("Class2 - @AfterMethod method");
    }

    @Test
    public void test1() {
        System.out.println("Class2 - @Test1 method");
    }

    @Test
    public void test2() {
        System.out.println("Class2 - @Test2 method");
    }

    @Test
    public void test3() {
        System.out.println("Class2 - @Test3 method");
    }*/