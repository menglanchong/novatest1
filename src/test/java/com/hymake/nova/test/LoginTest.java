package com.hymake.nova.test;

import com.hymake.nova.page.LoginPage;
import com.hymake.nova.service.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/10/16.
 * 帐号登录
 */
public class LoginTest{
    @Test(description = "项目经理登录")
    public static void login(){

        LoginService.openLogin("35050019770311301X","123456a");


    }
    @Test(description = "施工单位登记登录")
    public static void loginBuilder(){

        LoginService.openLogin("260127438","123456a");


    }
    @Test(description = "可以新增外窗幕墙项目经理登录")
    public static void  loginManager(){
        LoginService.openLogin("11010419910501567x","123456a");
    }
  /*  @Test
    public static void ces(){
        ExcelDataProvider excel_driver = new ExcelDataProvider("login");

        while(excel_driver.hasNext() == true) {
            List<String> info_list = excel_driver.getdata_list();
            int info_size = info_list.size();


                System.out.println("user:" + info_list.get(0));
                System.out.println("pwd:" + info_list.get(1));

        }
    }*/
  @Test(description = "有施工项目月自评项目经理登录")
  public static void loginManagerSafety(){
      LoginService.openLogin("35212419771113353x","123456a");

  }
    @Test(description = "有项目考评结果告知书项目经理登录")
    public static void loginManagerNotice(){
        LoginService.openLogin("350625196912121030","123456a");

    }
    @Test
    public static void loginBuildProj(){
        LoginService.openLogin("776042099","123456a");
    }



   @AfterMethod
   public static void after(){
       OtherService.closeWindow();
   }
}
