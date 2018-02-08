package com.hymake.nova.service;

import com.hymake.nova.page.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/10/19.
 * 校验新增危险源页面必填项
 */
public class CheckService extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
   // public static WebDriver driver=DriverManager.getDriver();
    //基坑工程必填项校验
    public static void holeCheck(){
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERTYPE,"1");
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERSOURCETYPE,"10");
        CommonMethodService.listData(CommonPage.BUTTON,4);
        //driver.findElement(CreatDangerSourcePage.HOLESAVE).click();
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(IsDangerSourcePage.HOLEITEM,"UNITSELECT");
        map.put(IsDangerSourcePage.HOLEPERSON,"HOLEPERSON");
        map.put(IsDangerSourcePage.HOLEUNIT,"HOLEUNIT");
        map.put(IsDangerSourcePage.HOLEHEIGH,"HOLEHEIGH");
        map.put(IsDangerSourcePage.HOLEPLANDATE,"TMPREALDATE");
        map.put(IsDangerSourcePage.HOLEBASENUM,"TMPREALDATE");
        checkMethod(map);

    }
    //模版工程必填项校验
    public static void tmpCheck(){
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERTYPE,"1");
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERSOURCETYPE,"30");
        CommonMethodService.listData(CommonPage.BUTTON,4);
        //driver.findElement(CreatDangerSourcePage.TMPSAVE).click();
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(IsDangerSourcePage.TMPITEM,"");
        map.put(IsDangerSourcePage.TMPDANGER,"");
        map.put(IsDangerSourcePage.TMPREALDATE,"");
        map.put(IsDangerSourcePage.TMPTYPE,"");
        map.put(IsDangerSourcePage.TMPDANGERDESC,"");
        checkMethod(map);

    }
    //脚手架工程必填项校验
    public static void scfCheck(){
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERTYPE,"1");
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERSOURCETYPE,"50");
        CommonMethodService.listData(CommonPage.BUTTON,4);
        //driver.findElement(CreatDangerSourcePage.SCFSAVE).click();
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(IsDangerSourcePage.SCFUNIT,"");
        map.put(IsDangerSourcePage.SCFHEIGH,"");
        map.put(IsDangerSourcePage.SCFPLANDATE,"");
        map.put(IsDangerSourcePage.SCFDANGER,"");
        checkMethod(map);

    }
    //爆破工程必填项校验
    public static void blstCheck(){
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERTYPE,"1");
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERSOURCETYPE,"70");
        CommonMethodService.listData(CommonPage.BUTTON,4);
        //driver.findElement(CreatDangerSourcePage.BLSTSAVE).click();
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(IsDangerSourcePage.BLSTPROJECTUNIT,"");
        map.put(IsDangerSourcePage.BLSTPERSON,"");
        map.put(IsDangerSourcePage.BLSTUNIT,"");
        map.put(IsDangerSourcePage.BLSTPLANDATE,"");
        map.put(IsDangerSourcePage.BLSTSITE,"");
        map.put(IsDangerSourcePage.BLSTRANGE,"");
        checkMethod(map);

    }
    //暗挖工程必填项校验
    public static void digCheck(){
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERTYPE,"1");
        CommonMethod.selectMethod(DangerSourcePage.ADDDENGERSOURCETYPE,"80");
        CommonMethodService.listData(CommonPage.BUTTON,4);
        //driver.findElement(CreatDangerSourcePage.DIGSAVE).click();
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(IsDangerSourcePage.DIGUNIT,"");
        map.put(IsDangerSourcePage.DIGPERSON,"");
        map.put(IsDangerSourcePage.DIGEQUIP,"");
        map.put(IsDangerSourcePage.DIGTYPE,"");
        map.put(IsDangerSourcePage.DIGSITE,"");
        map.put(IsDangerSourcePage.DIGEXAMUNIT,"");
        map.put(IsDangerSourcePage.DIGHEIGH,"");
        map.put(IsDangerSourcePage.DIGLENGTH,"");
        checkMethod(map);


    }


    public static void checkMethod(HashMap<By,String> map){
        for (By by : map.keySet()) {

            String byText=driver.findElement(by).getText();
            Assert.assertEquals(byText,"必填项，请输入");
        }

    }

}
