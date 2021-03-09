package testingclasses;

import appcode.AppforTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNGTestAsserts {

    AppforTest atest= new AppforTest();


    @Test
    public void test1(){
        int res;
        SoftAssert soft= new SoftAssert();
         res= atest.sumNbrs(2,2);
    Assert.assertEquals(res, 4, "sum mismatch");
        System.out.println("@Test1 method");

        soft.assertEquals(res, 4, "sum mismatch");
        System.out.println("@Test1: first assertion complete");

        soft.assertEquals(res, 5, "sum mismatch");
        System.out.println("@Test1: second assertion complete");

        soft.assertEquals(res, 6, "sum mismatch");
        System.out.println("@Test1: third assertion complete");
       // soft.assertAll("after all Assertions");    //    it gives assertions error




    }
    @Test
    public void test2(){ // write and practice for the addString to pass and fail
        System.out.println("@Test2 method");
    }
    @Test
    public void test3() {  // write and practice for the getArray to pass and fail
        System.out.println("@Test3 method");
    }
}
