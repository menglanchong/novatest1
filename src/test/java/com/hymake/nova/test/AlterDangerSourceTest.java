

package com.hymake.nova.test;

import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.AlterService;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.DangerSourceService;
import com.hymake.nova.service.OtherService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/*
 * Created by Administrator on 2017/10/23.
 * 修改危险源登记用例
 * */



public class AlterDangerSourceTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test(description = "地下暗挖修改")
    public static void alterDigTest(){

        DangerSourceService.dangerSourceMenu(1);
        AlterService.clickAlterButton("地下暗挖工程");
        AlterService.alterProject(CreatDangerSourcePage.DIGPERSON,CreatDangerSourcePage.DIGLENGTH,"审美好","650",CreatDangerSourcePage.DIGSAVE );
    }
    @Test(description = "基坑工程")
    public static void alterHoleTest(){
        DangerSourceService.dangerSourceMenu(1);
        AlterService.clickAlterButton("基坑工程");
        AlterService.alterProject(CreatDangerSourcePage.HOLEPERSON,CreatDangerSourcePage.BASENUM,"建筑","25",CreatDangerSourcePage.HOLESAVE );
    }
    @Test(description = "模板工程及支撑体系")
    public static void alterTmpTest(){

        DangerSourceService.dangerSourceMenu(1);
        AlterService.clickAlterButton("模板工程及支撑体系");
        AlterService.alterProject(CreatDangerSourcePage.TMPDANGER,CreatDangerSourcePage.TMPREALBEGDATE,"地板位置","2017-11-20" ,CreatDangerSourcePage.TMPSAVE);
    }
    @Test(description = "脚手架工程")
    public static void alterScfTest(){

        DangerSourceService.dangerSourceMenu(1);
        AlterService.clickAlterButton("脚手架工程");
        AlterService.alterProject(CreatDangerSourcePage.SCFFASTEXAMUNIT,CreatDangerSourcePage.SCFHEIGHT,"段减","550" ,CreatDangerSourcePage.SCFSAVE);
    }
    @Test(description = "爆破工程")
    public static void alterBlstTest(){

        DangerSourceService.dangerSourceMenu(1);
        AlterService.clickAlterButton("爆破工程");
        AlterService.alterProject(CreatDangerSourcePage.BLSTPROJECTUNIT,CreatDangerSourcePage.BLSTRANGE,"万平米",
                "两个极端方式" ,CreatDangerSourcePage.BLSTSAVE);
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }



}


