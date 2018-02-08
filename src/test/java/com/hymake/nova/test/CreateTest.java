package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Created by Administrator on 2017/10/23.
 * */


public class CreateTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void createTest(){

        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(5000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,1);
        //DangerSourceService.clickProjectName();
        ClearService.createProject("fds","4545","43652","4556","2017-10-25");

    }
    @Test
    public static void createTest1(){

        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(5000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,1);
        ClearService.createProject1("fds","4545","2017-10-25","4556");

    }
    @Test
    public static void createTest3(){

        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(5000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,1);
        ClearService.createProject3("fds","4545","2017-10-25","4556","反对数据库");

    }
    /*@Test
    public static void createSafety(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.ETPEVALUE);
        CreateService.creatFactory();
        CreateService.createSafetyMethod("\\json\\safety.json");
    }*/
   /* @Test
    public static  void dangerRelieve(){
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERQR);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,2);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,5);
    }*/
    @Test
    public static void  getTrText(){
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERQR);
        CommonMethod.sleep(2000);
        CommonMethodService.trList();
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }
}
