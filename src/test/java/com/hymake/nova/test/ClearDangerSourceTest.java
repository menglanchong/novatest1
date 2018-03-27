

package com.hymake.nova.test;

import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.*;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 * Created by Administrator on 2017/10/23.
 * 危险源校验清空按钮
 */


public class ClearDangerSourceTest {


/*
    * 用户已登录
    * 进入危险源项目列表，在工程项目名称输入字符
    * 点击清除按钮，文本框清空
    * */

    @BeforeMethod
    public static void before(){
        //调用登录方法
        LoginTest.login();
    }
    @Test(description = "项目管理页面项目名称清空")
    public static void clearProject(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(1);
       // DangerSourceService.clickDangerSource();

        //调用清空方法
        ClearService.clearTextService(DangerSourcePage.JNAME, "可以");


    }
    @Test (description = "在办事项项目负责人清空")
    public static void clearInTest(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(1);
        //调用清空方法
        ClearService.clearTextService(DangerSourcePage.PROJECTLEADER,"小张");
    }

    @Test(description = "在办事项危险性类型清空")
    public static void clearInDangerSource(){
        //调用进入危险源登记页面
        //DangerSourceService.clickInDangerSource();
        DangerSourceService.dangerSourceMenu(1);
        //ClearService.clearSelectValue(DangerSourcePage.INDANGERTYPE,"危险性较大",);

        ClearService.clearSelectIndex(DangerSourcePage.INDANGERTYPE,"1");

    }

    @Test (description = "已办事项项目清空")
    public static void clearDoneProj(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(2);
        //调用清空方法
        ClearService.clearTextService(DangerSourcePage.JNAME,"龙岩");
    }
    @Test (description = "已办事项状态清空")
    public static void clearDoneState(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(2);
        //调用清空方法
        ClearService.clearSelectValue(DangerSourcePage.STATU,"草稿");
    }
    @Test (description = "所有事项项目名称清空")
    public static void clearAllProj(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(3);
        //调用清空方法
        ClearService.clearTextService(DangerSourcePage.JNAME,"龙岩");
    }
    @Test (description = "所有事项状态清空")
    public static void clearAllState(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(3);
        //调用清空方法
        ClearService.clearSelectValue(DangerSourcePage.STATU,"草稿");
    }
    /*@Test
    public static void clearS() {

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(1);
        CommonMethod.selectIndex(By.name("seek_dangerLevel"),2);
        String s=CommonMethodService.selectGetValue(By.name("seek_dangerLevel"));
        System.out.println(s);
    }
*/


@AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }



}


