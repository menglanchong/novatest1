package com.hymake.nova.service;


import com.hymake.nova.page.SafetyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/4.
 * 施工安全考评菜单公用方法
 */
public class SafetyService extends CommonMethod{
    public static void commonMethod(By menu,By by){

        CommonMethod.sleep(4000);
        CommonMethod.findElement(SafetyPage.SAFETY).click();
        CommonMethod.sleep(3000);
        driver.findElement(menu).click();//点击二级菜单
        CommonMethod.sleep(3000);
        driver.findElement(by).click();//点击三级菜单
        CommonMethod.sleep(2000);

    }
    public static void commonMethod3(By menu,By by,By four){
        CommonMethod.findElement(SafetyPage.SAFETY).click();
        CommonMethod.sleep(2000);
        driver.findElement(menu).click();//点击二级菜单
        CommonMethod.sleep(2000);
        driver.findElement(by).click();//点击三级菜单
        CommonMethod.sleep(2000);
        driver.findElement(four).click();//点击4级菜单
        CommonMethod.sleep(2000);

    }

}
