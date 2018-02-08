package com.hymake.nova.test;

import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/12/6.
 */
public class DeleteTest {
    /*@Test
    public static void  creatTest(){
        LoginService.create();
    }*/
    @Test
    public static void recursion(){
        TestService.Digui_Test1();
    }
   /* @Test
    public static void delete(){
        LoginTest.login();
        DeleteService.deleteSafety();
    }*/
    @Test
    public static void price(){
        ceshi.avgMonkey();
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }
}
