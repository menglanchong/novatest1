package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryMaterialPage;
import com.hymake.nova.page.SafetyPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 * 查询校验方法
 */

public class QueryService extends CommonMethod {
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
   // public static WebDriver driver= DriverManager.getDriver();
    public static void lookUpText(By element, By look, String text, int index) {
        CommonMethod.sleep(2000);
        driver.findElement(element).sendKeys(text);
        CommonMethod.sleep(2000);
        driver.findElement(look).click();

        //定位table位置
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
       // int count=rows.size();//获取tr个数即页面统计个数
        //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
        // 然后再次使用for循环把每行的单元格文本遍历输出
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(index).getText();
            Assert.assertTrue(colsText.contains(text));
        }

    }
    public static void lookUpSelectText(By element, String value,By lk , int index) {
        CommonMethod.sleep(2000);
        CommonMethod.selectValueMethod(element,value);
        CommonMethod.sleep(2000);
        driver.findElement(lk).click();//点击查询
        //定位table位置
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
        // 然后再次使用for循环把每行的单元格文本遍历输出
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(index).getText();
            Assert.assertTrue(colsText.equals(value));

        }
    }
    public static void lookUpSelectTime(By time1, By time2, By xm, By cx, String ks1, String ks2,int index) throws ParseException {
        CommonMethod.sleep(2000);
        driver.findElement(time1).sendKeys(ks1);
        driver.findElement(time2).sendKeys(ks2);
        CommonMethod.sleep(2000);
        driver.findElement(xm).click();
        driver.findElement(cx).click();
        CommonMethod.sleep(2000);

        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // 然后再次使用for循环把每行的单元格文本遍历输出
       /* if (rows.size() == 0 ) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AssertRewrite.assertTure(false);
        }*/
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String xtext = cols.get(index).getText();
            SimpleDateFormat simpl=new SimpleDateFormat("yyyy-MM-dd");
            Date x=simpl.parse(xtext);//string 类型转化为date类型
            Date k1=simpl.parse(ks1);
            Date k2=simpl.parse(ks2);
            Assert.assertTrue(k1.getTime()<=x.getTime()&&x.getTime()<=k2.getTime());//getTime()返回毫秒数

        }



    }

    public static void QueryText(By element, String text, int index) {
        driver.findElement(element).sendKeys(text);
        CommonMethod.sleep(2000);
        List<WebElement> button = driver.findElements(By.className("btn-primary"));
        button.get(0).click();
        //定位table位置
        CommonMethod.sleep(2000);
        int t =DangerSourceService.count(SafetyPage.DATA);
        if(t!=0){
            WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
            //得到表格中所有tr标签的集合
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            // int count=rows.size();//获取tr个数即页面统计个数
            //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
            // 然后再次使用for循环把每行的单元格文本遍历输出
            for(WebElement row:rows) {
                // 然后得到当前所有tr里td标签的集合
                List<WebElement> cols = row.findElements(By.tagName("td"));
                String colsText = cols.get(index).getText();
                Assert.assertTrue(colsText.contains(text));

            }

        }else {
            System.out.println("暂无数据，无法校验");
        }


    }
    public static void QuerySelectText(By element, String value, int index) {
        CommonMethod.sleep(2000);
        CommonMethod.selectValueMethod(element,value);
        CommonMethod.sleep(2000);
        List<WebElement> button = driver.findElements(By.className("btn-primary"));
        button.get(0).click();//点击查询
        CommonMethod.sleep(2000);
        int t =DangerSourceService.count(SafetyPage.DATA);
        if(t!=0){
        //定位table位置
            WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
            //得到表格中所有tr标签的集合
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
            // 然后再次使用for循环把每行的单元格文本遍历输出
            for(WebElement row:rows) {
                // 然后得到当前所有tr里td标签的集合
                List<WebElement> cols = row.findElements(By.tagName("td"));
                String colsText = cols.get(index).getText();
                Assert.assertTrue(colsText.equals(value));
                }
        }else {

            System.out.println("暂无数据，无法校验");
        }
    }
    public static void QuerySelectTime( String ks1, String ks2,By clicktext,int index) throws ParseException {
        List<WebElement> text = driver.findElements(By.className("el-input__inner"));
        text.get(0).sendKeys(ks1);
        text.get(1).sendKeys(ks2);
        CommonMethod.sleep(2000);
        driver.findElement(clicktext).click();
        List<WebElement> button = driver.findElements(By.className("btn-primary"));
        button.get(0).click();//点击查询
        CommonMethod.sleep(2000);
        int t =DangerSourceService.count(SafetyPage.DATA);
        if(t!=0){
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // 然后再次使用for循环把每行的单元格文本遍历输出
       /* if (rows.size() == 0 ) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AssertRewrite.assertTure(false);
        }*/
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String xtext = cols.get(index).getText();
            SimpleDateFormat simpl=new SimpleDateFormat("yyyy-MM-dd");
            Date x=simpl.parse(xtext);//string 类型转化为date类型
            Date k1=simpl.parse(ks1);
            Date k2=simpl.parse(ks2);
            //AssertRewrite.assertTure();
            Assert.assertTrue(k1.getTime()<=x.getTime()&&x.getTime()<=k2.getTime());//getTime()返回毫秒数

        }
        }else {

            System.out.println("暂无数据，无法校验");
        }

    }

    public static void QueryMaterSelectTime( int t1,int t2,String ks1, String ks2,By proj,int index) throws ParseException {
        List<WebElement> text = driver.findElements(By.className("el-input__inner"));
        text.get(t1).sendKeys(ks1);
        text.get(t2).sendKeys(ks2);
        CommonMethod.sleep(2000);
        driver.findElement(proj).click();
        List<WebElement> button = driver.findElements(By.className("btn-primary"));
        button.get(0).click();//点击查询
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // 然后再次使用for循环把每行的单元格文本遍历输出
       /* if (rows.size() == 0 ) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AssertRewrite.assertTure(false);
        }*/
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String xtext = cols.get(index).getText();
            SimpleDateFormat simpl=new SimpleDateFormat("yyyy-MM-dd");
            Date x=simpl.parse(xtext);//string 类型转化为date类型
            Date k1=simpl.parse(ks1);
            Date k2=simpl.parse(ks2);
            //AssertRewrite.assertTure();
            Assert.assertTrue(k1.getTime()<=x.getTime()&&x.getTime()<=k2.getTime());//getTime()返回毫秒数

        }

    }
    public static void  multipeService(String str1,int num ,String str2,int index){
        List<WebElement> text = driver.findElements(By.className("form-control"));
        System.out.println("长度："+text.size());
        text.get(0).sendKeys(str1);
        text.get(num).sendKeys(str2);

        CommonMethod.sleep(2000);

        List<WebElement> button = driver.findElements(By.className("btn-primary"));
        button.get(0).click();//点击查询
        CommonMethod.sleep(2000);
        int t =DangerSourceService.count(SafetyPage.DATA);
        if(t!=0){
            //定位table位置
            WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
            //得到表格中所有tr标签的集合
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
            // 然后再次使用for循环把每行的单元格文本遍历输出
            for(WebElement row:rows) {
                // 然后得到当前所有tr里td标签的集合
                List<WebElement> cols = row.findElements(By.tagName("td"));


                    String colsText = cols.get(index).getText();
                    System.out.println("打印："+colsText);
                    Assert.assertTrue(colsText.contains(str2));
                }


        }else {

            System.out.println("暂无数据，无法校验");
        }

    }
    public static void  multipeStytleService(String str,String value,int index){
        List<WebElement> text = driver.findElements(By.className("form-control"));
        text.get(0).sendKeys(str);
        Select select=new Select(text.get(1));
        select.selectByVisibleText(value);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,0);//点击查询
        //定位table位置
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
        // 然后再次使用for循环把每行的单元格文本遍历输出
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(index).getText();
            Assert.assertTrue(colsText.equals(value));

        }

    }


}
