package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryScreenWallPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/10/16.
 */
public class ClearService extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    //public static WebDriver driver=DriverManager.getDriver();

    public static void checkSelect(String wb){

        CommonMethod.selectMethod(DangerSourcePage.INDANGERTYPE,wb);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
      /* String value=(String)js.executeScript("var select=document.getElementsByTagName(\"select\")[0];var index = " +
               "select.selectedIndex;var value = select.options[index].text; return value;");获取当前选择的文本值*/
       String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
               "('select.form-control')[0].selectedIndex].text");//获取当前选择的文本值另一种写法,在谷歌可以打印出来结果
        System.out.print(value);
        //Assert.assertNotEquals(wb,a);
    }

    public static void selectServer(By wxx,String value1,By wxy ,String value2){
        CommonMethod.selectMethod(wxx,value1);
        CommonMethod.selectMethod(wxy,value2);
    }

   /* public static void creatMap(Map map){
        for (String s : map) {
            driver.findElement(CreatDangerSourcePage.REALBEGDATE).sendKeys(map.get(s));
        }
        Map map = new HashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        creat(map)
    }

    }*/


    //清空条件方法（文本框定位，清空定位，输入字符）
    public static void clearTextService(By wb, String qktj) {
        CommonMethod.sleep(2000);
        //定位到文本框并输入字符
        WebElement element = driver.findElement(wb);
        element.sendKeys(qktj);

        CommonMethod.sleep(3000);
        //定位清空按钮并点击
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        //CommonMethodService.listData(CommonPage.BUTTON,num);
        //校验文本框的值是否为空
        try {
            Assert.assertEquals(element.getText(), "");
            System.out.println("测试" + element.getText());
        } catch (Error e) {

            CreateElementScreenshot.takeScreenshotByName(driver);

            throw e;


        }
    }

        //Assert.assertEquals(element.getText(),EMPTY);


    public static void clearCommonText(int num,String name){
        //定位到文本框并输入字符
        List<WebElement> text = driver.findElements(By.className("form-control"));
        text.get(num).sendKeys(name);

        CommonMethod.sleep(3000);
        //定位清空按钮并点击
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        CommonMethod.sleep(2000);
        String textbox=text.get(num).getText();
        //CommonMethodService.listData(CommonPage.BUTTON,num);
        //校验文本框的值是否为空
        try {
            Assert.assertEquals(textbox,"");
            System.out.println("测试"+textbox);
        } catch (Error e) {

            CreateElementScreenshot.takeScreenshotByName(driver);

            throw e;


        }

    }
    /*
    * 下拉框下标清空
    * */
    public static void clearSelectIndex(By xl, String vl){

        CommonMethod.sleep(2000);
        CommonMethod.selectMethod(xl,vl);
        /*driver.findElement(DangerSourcePage.PROJECT).click();
        CommonMethod.sleep(2000);*/
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        *//*String value=(String)js.executeScript("var select=document.getElementsByTagName(\"select\")[0];var index = " +
                "select.selectedIndex;var value = select.options[index].text; return value;");*//*
        String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
                "('select.form-control')[0].selectedIndex].text");
        System.out.println("打印结果："+value);*/
        driver.findElement(DangerSourcePage.INEMPTY).click();
        CommonMethod.sleep(2000);
        String value=CommonMethodService.selectGetValue(xl);
        Assert.assertEquals(value,"全部");
    }
    /*
    * 下拉框下拉值清空
    * */
    public static void clearSelectValue(By select, String text) {
        CommonMethod.sleep(2000);
        CommonMethod.selectValueMethod(select, text);
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        CommonMethod.sleep(2000);
        String value=CommonMethodService.selectGetValue(select);
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
       *//* String value=(String)js.executeScript("var select=document.getElementsByTagName(\"select\")[0];var index = " +
                "select.selectedIndex;var value = select.options[index].text; return value;");//获取当前下拉框显示值*//*
        String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
                "('select.form-control')[0].selectedIndex].text");
        System.out.println(value);*/
        Assert.assertEquals(value, "全部");

    }/*
    * 下拉框下拉值清空
    * */
    public static void clearSelectChangeValue(By select, String text) {
        CommonMethod.sleep(2000);
        CommonMethod.selectValueMethod(select, text);
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
       /* CommonMethod.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       String value=(String)js.executeScript("var select=document.getElementsByName(\"seek_wfStatus\");" +
               "var index = select.selectedIndex;var value = select.options[index].text; return value;");//获取当前下拉框显示值
        *//*String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
                "('select.form-control')[0].selectedIndex].text");*/
        CommonMethod.sleep(2000);
        String value=CommonMethodService.selectGetValue(select);
        Assert.assertEquals(value, "全部");

    }
    /*
    * 下拉框日期清空
    * */
    public static void clearTimeService(int start,int end,int index,String starttime,String endtime){
        CommonMethod.sleep(2000);
        List<WebElement> time =driver.findElements(By.className("el-input__inner"));
        time.get(start).sendKeys(starttime);
        time.get(end).sendKeys(endtime);
        CommonMethodService.listData(CommonPage.TEXT,0);
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        //driver.findElement(clear).click();
       String actualstart= time.get(start).getText();
       String sctualend=time.get(end).getText();
        Assert.assertEquals(actualstart,"");
        Assert.assertEquals(sctualend,"");

    }


}
