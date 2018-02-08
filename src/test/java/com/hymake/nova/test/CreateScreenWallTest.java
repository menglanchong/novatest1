/*

package com.hymake.nova.test;

import com.hymake.nova.service.CheckService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.ScreenWallService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


*/
/*
 * Created by Administrator on 2017/11/9.
 * *//*





public class CreateScreenWallTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();

    }
    @Test
    public static void createScreenWallTest(){
        ScreenWallService.clickScreenWall();

        ScreenWallService.createWallServer("\\json\\screenwall.json");
    }
    @Test
    public static void deleteScreenWall(){

        ScreenWallService.clickScreenWall();
        ScreenWallService.clickFirstScreenWall();
        ScreenWallService.deleteService();



    }
    @Test
    public static void checkScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.screenWallCheck();

    }
    @Test
    public static void  closeWindow(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickFirstScreenWall();
        ScreenWallService.closeWindowService();
    }

@AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }

}


*/
