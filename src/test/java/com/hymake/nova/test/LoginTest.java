package com.hymake.nova.test;

import com.hymake.nova.page.LoginPage;
import com.hymake.nova.service.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/10/16.
 */
public class LoginTest{
    @Test
    public static void login(){

        LoginService.openLogin("35050019770311301X","123456a");


    }
    @Test
    public static void loginBuilder(){

        LoginService.openLogin("260127438","123456a");


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
    }
    @Test
    public static void ceshi(){
        LoginService.create();
    }*/
    @Test
    public static void close(){

        OtherService.closeWindow();
    }
}
