


package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.ScreenWallPage;
import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




/*
 * Created by Administrator on 2017/11/9.
 * 外窗与幕墙新增和删除
 * */






public class CreateScreenWallTest {
    @BeforeMethod
    public static void before(){
        LoginTest.loginManager();

    }
    @Test
    public static void createScreenWallTest(){
        DeleteService.deleteDraft();//删除所有草稿
        ScreenWallService.createWallServer(1,"\\json\\screenwall.json");
    }
    @Test
    public static void createWindow(){

        DeleteService.deleteDraft();//删除所有草稿

        CreatScreenWall.createWindow(2,"\\json\\window.json");

    }

    @Test
    public static void checkScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.screenWallCheck();

    }




@AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }

}




