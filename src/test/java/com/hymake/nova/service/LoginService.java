package com.hymake.nova.service;

import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.LoginPage;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Administrator on 2017/10/16.
 */
public class LoginService extends CommonMethod {
    private static Logger logger = Logger.getLogger(ScreenWallService.class);
    // public static WebDriver driver=DriverManager.getDriver();
    public static String browser;

    public static void openLogin(String user,String pwd) {


            CommonMethod.browserMethod("chrome");
            driver.get("http://118.178.114.134/login");
            CommonMethod.sleep(4000);
            driver.findElement(LoginPage.user).sendKeys(user);
            driver.findElement(LoginPage.pwd).clear();
            driver.findElement(LoginPage.pwd).sendKeys(pwd);
            CommonMethod.sleep(2000);
             driver.findElement(LoginPage.login).click();
             driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                //System.out.println("获取cookies："+driver.manage().getCookies());
            /* List<WebElement> button=driver.findElements(By.className("el-button"));
             button.get(1).click();
             System.out.println("角色："+ceshi.roleJudge(LoginPage.ROLE));*/






            }

        /*CommonMethod.browserMethod("chrome");
        driver.get("http://192.168.102.146");
        //driver.findElement(LoginPage.user).click();
        System.out.println("登录" + driver.getTitle());
        driver.findElement(LoginPage.user).sendKeys(user);
        // new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(LoginPage.xz));
        // driver.findElement(LoginPage.xz).click();
        driver.findElement(LoginPage.pwd).clear();
        driver.findElement(LoginPage.qt).click();
        driver.findElement(LoginPage.pwd).sendKeys(pwd);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(LoginPage.login).click();
*/




    public static void create() {

        ExcelDataProvider excel_driver = new ExcelDataProvider("login");

        while(excel_driver.hasNext() == true) {
            CommonMethod.browserMethod("chrome");
            driver.get("http://192.168.102.146/login");
            System.out.println("登录" + driver.getTitle());
            /*driver.findElement(LoginPage.pwd).clear();
            driver.findElement(LoginPage.qt).click();*/
            List<String> info_list = excel_driver.getdata_list();
            int info_size = info_list.size();


            System.out.println("user:" + info_list.get(0));
            System.out.println("pwd:" + info_list.get(1));
            driver.findElement(LoginPage.user).sendKeys(info_list.get(0));
            driver.findElement(LoginPage.pwd).sendKeys(info_list.get(1));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(LoginPage.login).click();
            DangerSourceService.addDangerSource("\\json\\jkgcdj.json", CreatDangerSourcePage.HOLEUNIT);

        }
        }

    public static void setBrowser(String browser) {
        LoginService.browser = browser;

    }





}
