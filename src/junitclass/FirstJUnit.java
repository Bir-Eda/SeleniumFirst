package junitclass;

import org.junit.jupiter.api.*;

public class FirstJUnit {


    @BeforeAll  // herseyden once bir defa
    public static void setUP(){
        System.out.println("@BeforeAll-executed once before all test methods in this class");
    }
    @AfterAll //herseyden sonra bir defa, browseri kapat demek
    public static void tearDown(){
        System.out.println("@BeforeAll-executed once after all test methods in this class");
    }
    @BeforeEach  //
    public void init(){
        System.out.println("@BeforeAll-executed once before every test methods in this class");
    }
    @AfterEach
    public void done(){
        System.out.println("@BeforeAll-executed once after every test methods in this class");
    }
    @Test
    public void test1(){
        System.out.println("@Test1-executed test");
    }
    @Test
    public void test2(){
        System.out.println("@Test2-executed test");
    }
    @Test
    public void test3(){
        System.out.println("@Test3-executed test");
    }
}
