package com.hymake.nova.service;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by Administrator on 2017/11/16.
 */
public class AssertRewrite extends CommonMethod {
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    //public static WebDriver driver= DriverManager.getDriver();
    //重写assertEquals方法，断言失败就截图,然后再抛出error，以便系统能捕获该error
    public static void assertEquals(Object actual,Object expected ){
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){

                CreateElementScreenshot.takeScreenshotByName(driver);//这里写截图操作

            throw e;//这里故意抛出error
        }
    }

    //重写assertNotEquals方法
    public static void assertNotEquals(Object actual,Object expected){
        try{
            Assert.assertNotEquals(actual, expected);
        }catch(Error e){
            //这里写截图操作
            throw e;//这里故意抛出error
        }

    }

    //重写assertNull方法
    public static void assertNull(Object object){
        try{
            Assert.assertNull(object);
        }catch(Error e){
            //这里写截图操作
            throw e;//这里故意抛出error
        }

    }
    //重写assertTrue方法
    public static void assertTure(Boolean object) {
        try{
            Assert.assertTrue(object);
        }catch(Error e){

            CreateElementScreenshot.takeScreenshotByName(driver);//这里写截图操作
           //这里写截图操作
            throw e;//这里故意抛出error
        }


    }



}
