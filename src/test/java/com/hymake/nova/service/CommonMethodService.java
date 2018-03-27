package com.hymake.nova.service;

import com.hymake.nova.page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/20.
 * 公用方法
 */
public class CommonMethodService extends CommonMethod{
    public static int count(By a){
        String total=driver.findElement(a).getText();//获取底部总条数文本
        total=total.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
        int t=Integer.parseInt(total);
        return t;
    }
    public static void lookUpText(By element, By search,String text, int index) {
        driver.findElement(element).sendKeys(text);
        CommonMethod.sleep(2000);
        CommonMethod.findElement(search).click();
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
            System.out.println("测试："+colsText);
        }
    }
    public static void lookUpSelectTime(int t1, int t2, String ks1, String ks2,int index) throws ParseException {
        List<WebElement> times=driver.findElements(By.className("el-input__inner"));
        times.get(t1).sendKeys(ks1);
        times.get(t2).sendKeys(ks2);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,0);
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // 然后再次使用for循环把每行的单元格文本遍历输出
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
    public static void lookSelectType(By select,String value,By search,int index){
        CommonMethod.selectValueMethod(select,value);
        CommonMethod.findElement(search).click();
        new WebDriverWait(driver, 20, 300).until(ExpectedConditions.attributeToBe(CreatMaterialReviewPage.dis
                , "style", "display: none;"));
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(index).getText();
            System.out.println("测试："+colsText);
            Assert.assertTrue(colsText.equals(value));

        }
    }
    public static void listData(By elment,int index){
        CommonMethod.sleep(4000);
        List<WebElement> first= driver.findElements(elment);
        //driver.switchTo().frame(first.get(1)); 如果多个iframe id或者其他的定位方式相同，可以用这种方式定位
        first.get(index).click();
    }

    public static void listText(By elment,int index,String text){
        List<WebElement> first= driver.findElements(elment);
        first.get(index).sendKeys(text);
    }
    public static String getText(By elment,int index){
        List<WebElement> first= driver.findElements(elment);
        String text=first.get(index).getText();
        return text;
    }
    public static void trList(){
        List<WebElement> tr= driver.findElements(CommonPage.TR);
        for(int r=0;r<tr.size();r++){
            String trtext=tr.get(r).getText();
            if(trtext.contains("审核通过")){
                tr.get(r).click();
                CommonMethod.sleep(2000);
                CommonMethodService.listData(CommonPage.BUTTON,2);
                CommonMethod.sleep(2000);
                CommonMethodService.listData(CommonPage.BUTTON,5);


            }else {
                System.out.println("没有可以解除的危险源");

            }
            break;


        }

    }
    /**
     * 项目管理下的二级菜单
     */

    public static void  projectManage(By secondMenu,By threeMenu){
        CommonMethod.sleep(5000);
        CommonMethod.findElement(DangerSourcePage.PROJECT).click();
        CommonMethod.sleep(2000);
        driver.findElement(secondMenu).click();
        CommonMethod.sleep(2000);
        driver.findElement(threeMenu).click();
        CommonMethod.sleep(2000);


    }
    /**
     * 项目管理下的一级菜单
     */
    public static void  Manage(By secondMenu){
        CommonMethod.sleep(5000);
        CommonMethod.findElement(DangerSourcePage.PROJECT).click();
        CommonMethod.sleep(2000);
        driver.findElement(secondMenu).click();
        CommonMethod.sleep(2000);



    }
    /**
     * 施工安全考评下的二级菜单
     */
    public static void safetyProject2(By menu,By by){
        CommonMethod.findElement(SafetyPage.SAFETY).click();
        CommonMethod.sleep(2000);
        driver.findElement(menu).click();//点击二级菜单
        CommonMethod.sleep(2000);
        driver.findElement(by).click();//点击三级菜单
        CommonMethod.sleep(2000);

    }/**
     * 施工安全考评下的三级菜单
     */
    public static void safetyProject3(By menu,By by,By four){
        CommonMethod.findElement(SafetyPage.SAFETY).click();
        CommonMethod.sleep(2000);
        driver.findElement(menu).click();//点击二级菜单
        CommonMethod.sleep(2000);
        driver.findElement(by).click();//点击三级菜单
        CommonMethod.sleep(2000);
        driver.findElement(four).click();//点击4级菜单
        CommonMethod.sleep(2000);

    }
    /**
     * 下拉框获取选中值的方法
     */
    public static String selectGetValue(By by){
        WebElement element=driver.findElement(by);
        Select select=new Select(element);
        String value=select.getFirstSelectedOption().getText();
        return value;

    }




}
