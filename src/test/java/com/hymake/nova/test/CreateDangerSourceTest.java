

package com.hymake.nova.test;

import com.hymake.nova.page.CreatDangerSourcePage;

import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.*;

import org.testng.annotations.*;

import java.util.List;


/** Created by Administrator on 2017/11/1.
 * 危险源新增
 * */


public class CreateDangerSourceTest {
   @BeforeMethod
    public static void before(){

        LoginTest.login();
    }
    @Test(description = "新增基坑工程")
    public static void addHoleTest(){

        DangerSourceService.addDangerSource("\\json\\jkgcdj.json", CreatDangerSourcePage.HOLEUNIT);
        //DangerSourceService.dangerDetail("\\json\\jkgcdj.json");


    }
    @Test(description = "新增起重吊装工程")
    public static void addHoistTest(){

        DangerSourceService.addDangerSource("\\json\\qzdz.json", CreatDangerSourcePage.HOLEUNIT);
        DangerSourceService.dangerDetail("\\json\\qzdz.json");



    }
    @Test(description = "新增模版工程")
    public static void addTmpTest(){


        DangerSourceService.addDangerSource("\\json\\mbgc.json", CreatDangerSourcePage.TMPUNIT);
        DangerSourceService.dangerDetail("\\json\\mbgc.json");


    }
    @Test(description = "新增脚手架工程")
    public static void addScfTest(){
        DangerSourceService.addDangerSource("\\json\\jsj.json", CreatDangerSourcePage.SCFUNIT);
        DangerSourceService.dangerDetail("\\json\\jsj.json");


    }
    @Test(description = "新增爆破工程")
    public static void addBlstTest(){

        DangerSourceService.addDangerSource("\\json\\bpgc.json", CreatDangerSourcePage.BLSTUNIT);
        DangerSourceService.dangerDetail("\\json\\bpgc.json");


    }
    @Test(description = "新增地下暗挖工程")
    public static void addDigTest(){

        DangerSourceService.addDangerSource("\\json\\awgc.json", CreatDangerSourcePage.HOLEUNIT);
        DangerSourceService.dangerDetail("\\json\\awgc.json");


    }
 @Test(description = "删除危险源")
    public static void deleteTest(){

        DangerSourceService.deleteDanger();

    }
    @Test(description = "危险源清空类型校验")
    public static void clearTest(){
        DangerSourceService.dangerSourceMenu(1);
        DangerSourceService.clearServer(DangerSourcePage.DANGERSOURCETYPE,"模板工程及支撑体系");


    }
    @Test(description = "危险源查询校验")
    public static void lookTest(){

        DangerSourceService.dangerSourceMenu(1);
        QueryService.lookUpSelectText(DangerSourcePage.DANGERSOURCETYPE,"基坑工程", DangerSourcePage.INQUERYBOX,1);


    }

    @Test(description = "危险源撤回校验")
    public static void recallTest(){

        DangerSourceService.dangerSourceMenu(1);
        DangerSourceService.recallServer();

    }
    @Test(description = "危险源按钮选择校验")
    public static void buttonAssert(){

        DangerSourceService.buttonServer();


    }

    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }




}


