package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.page.ScreenWallPage;
import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
Created by Administrator on 2017/11/15.
 */




public class ClearScreenWallTest {
    @BeforeMethod
    public static void before(){

        LoginTest.login();
        CommonMethodService.Manage( ScreenWallPage.WALLREGISTER);
    }
    @Test
    public static void clearProjectText(){

        ClearService.clearTextService(QueryScreenWallPage.PROJECTNAME,"第一一样");
    }
    @Test
    public static void clearCodeText(){

        ClearService.clearTextService(QueryScreenWallPage.PROJECTCODE,"563214");
    }
    @Test
    public static void clearTypeText(){

        ClearService.clearSelectValue(QueryScreenWallPage.PROJECTTYPE,"房建工程");
    }
    @Test
    public static void clearInProjectText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearTextService(QueryScreenWallPage.INPROJECTNAME,"第一一样");
    }
    @Test
    public static void clearInCodeText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearTextService(QueryScreenWallPage.INPROJECTCODE,"563214");
    }
    @Test
    public static void clearInTypeText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearSelectValue(QueryScreenWallPage.INPROJECTTYPE,"房建工程");
    }
    @Test
    public static void clearInBuildText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearTextService(QueryScreenWallPage.INCONDEP,"第一医院");

    }
    @Test
    public static void clearInChangeSelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearSelectChangeValue(QueryScreenWallPage.INCHANGESTATUS,"草稿");

    }
    @Test
    public static void clearInProcessSSelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);

        ClearService.clearTimeService(0,1,3,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearInProcessESelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearTimeService(2,3,3,
                "2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearDoneProjectText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearTextService(QueryScreenWallPage.DONEPROJECTNAME,"第一一样");
    }
    @Test
    public static void clearDoneCodeText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearTextService(QueryScreenWallPage.DONEPROJECTCODE,"563214");
    }
    @Test
    public static void clearDoneTypeText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearSelectValue(QueryScreenWallPage.DONEPROJECTTYPE,"房建工程");
    }
    @Test
    public static void clearDoneBuildText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearTextService(QueryScreenWallPage.DONECONDEP,"第一医院");

    }
    @Test
    public static void clearDoneChangeSelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearSelectChangeValue(QueryScreenWallPage.DONECHANGESTATUS,"审核通过");

    }
    @Test
    public static void clearDoneProcessSSelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearTimeService(0,1,5,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearDoneProcessESelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearTimeService(2,3,5, "2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearAllProjectText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);
        ClearService.clearTextService(QueryScreenWallPage.ALLPROJECTNAME,"第一一样");
    }
    @Test
    public static void clearAllCodeText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);
        ClearService.clearTextService(QueryScreenWallPage.ALLPROJECTCODE,"563214");
    }
    @Test
    public static void clearAllTypeText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);
        ClearService.clearSelectValue(QueryScreenWallPage.ALLPROJECTTYPE,"房建工程");
    }
    @Test
    public static void clearAllBuildText(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);
        ClearService.clearTextService(QueryScreenWallPage.ALLCONDEP,"第一医院");

    }
    @Test
    public static void clearAllChangeSelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);
        ClearService.clearSelectChangeValue(QueryScreenWallPage.ALLCHANGESTATUS,"草稿");

    }
    @Test
    public static void clearAllProcessSSelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);

        ClearService.clearTimeService(0,1,4,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearAllProcessESelect(){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,3);
        ClearService.clearTimeService(2,3,4,"2017-11-15",
                "2017-11-19");

    }
    @AfterMethod
    public static void after(){

            OtherService.closeWindow();
    }


}
