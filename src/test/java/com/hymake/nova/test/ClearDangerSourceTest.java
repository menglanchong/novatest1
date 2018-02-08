
package com.hymake.nova.test;

import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.DangerSourceService;
import com.hymake.nova.service.OtherService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2017/10/23.
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
    @Test //项目管理页面清空
    public static void clearProject(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(1);
       // DangerSourceService.clickDangerSource();

        //调用清空方法
        ClearService.clearTextService(DangerSourcePage.JNAME, "可以");


    }
    @Test //在办事项清空
    public static void clearTest1(){

        //调用进入危险源登记页面
        DangerSourceService.dangerSourceMenu(1);
        //调用清空方法
        ClearService.clearTextService(DangerSourcePage.PROJECTLEADER,"小张");
    }

@Test
    public static void clearInDangerSource(){
        //调用进入危险源登记页面
        //DangerSourceService.clickInDangerSource();
        DangerSourceService.dangerSourceMenu(1);
        //ClearService.clearSelectValue(DangerSourcePage.INDANGERTYPE,"危险性较大",);

        ClearService.clearSelectIndex(DangerSourcePage.INDANGERTYPE,"1");

    }

   @Test
   public static void relive(){

   }



@AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }



}

