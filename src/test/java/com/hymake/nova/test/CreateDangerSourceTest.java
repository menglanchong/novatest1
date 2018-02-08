
package com.hymake.nova.test;

import com.hymake.nova.page.CreatDangerSourcePage;

import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.*;
import org.testng.annotations.*;

import java.util.List;

/** Created by Administrator on 2017/11/1.
 * */



public class CreateDangerSourceTest {
   @BeforeMethod
    public static void before(){

        LoginTest.login();
    }
    @Test
    public static void addHoleTest(){

        DangerSourceService.addDangerSource("\\json\\jkgcdj.json", CreatDangerSourcePage.HOLEUNIT);
        DangerSourceService.dangerDetail("\\json\\jkgcdj.json");


    }
    @Test
    public static void addTmpTest(){


        DangerSourceService.addDangerSource("\\json\\mbgc.json", CreatDangerSourcePage.TMPUNIT);
        DangerSourceService.dangerDetail("\\json\\mbgc.json");


    }
    @Test
    public static void addScfTest(){
        DangerSourceService.addDangerSource("\\json\\jsj.json", CreatDangerSourcePage.SCFUNIT);
        DangerSourceService.dangerDetail("\\json\\jsj.json");


    }
    @Test
    public static void addBlstTest(){

        DangerSourceService.addDangerSource("\\json\\bpgc.json", CreatDangerSourcePage.BLSTUNIT);
        DangerSourceService.dangerDetail("\\json\\bpgc.json");


    }
    @Test
    public static void addDigTest(){

        DangerSourceService.addDangerSource("\\json\\awgc.json", CreatDangerSourcePage.HOLEUNIT);
        DangerSourceService.dangerDetail("\\json\\awgc.json");


    }
 @Test
    public static void deleteTest(){

        DangerSourceService.deleteDanger();

    }
    @Test
    public static void clearTest(){
        DangerSourceService.dangerSourceMenu(1);
        DangerSourceService.clearServer("模板工程及支撑体系");


    }
    @Test
    public static void lookTest(){

        DangerSourceService.dangerSourceMenu(1);
        QueryService.lookUpSelectText(DangerSourcePage.DANGERSOURCETYPE,"基坑工程", DangerSourcePage.INQUERYBOX,1);


    }

    @Test
    public static void recallTest(){

        DangerSourceService.dangerSourceMenu(1);
        DangerSourceService.recallServer();

    }
    @Test
    public static void buttonAssert(){

        DangerSourceService.buttonServer();


    }

    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }




}

