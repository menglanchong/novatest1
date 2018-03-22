package com.hymake.nova.service;


import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/11/6.
 * 修改部分文本并校验
 */
public class AlterService extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    //public static WebDriver driver=DriverManager.getDriver();
    public static void alterDangerSource(String xmfzr, String kw){
        CommonMethod.selectMethod(DangerSourcePage.INDANGERTYPE,"10");
        driver.findElement(DangerSourcePage.INQUERYBOX).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.FIRSTPROJECT).click();
        driver.findElement(DangerSourcePage.INALTER).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CommonMethod.sendText(CreatDangerSourcePage.HOLEPERSON,xmfzr);
        CommonMethod.sendText(CreatDangerSourcePage.HOLEDIGDEPTH,kw);
        //定位到保存按钮并点击
        driver.findElement(CreatDangerSourcePage.HOLESAVE).click();
        //弹出提示框点击确定
        driver.findElement(DangerSourcePage.zbwxyqd).click();

       /* JavascriptExecutor j=(JavascriptExecutor)driver;

        j.executeScript("document.getElementsByClassName('el-loading-mask')[0].style.display='none';");
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(WxyPage.dy));*/
        //Boolean xs=driver.findElement(WxyPage.lb).isDisplayed();
        CommonMethod.sleep(2000);
        driver.findElement(DangerSourcePage.FIRSTPROJECT).click();//调用定位到某一行方法
        driver.findElement(DangerSourcePage.INSEE).click();//点击查看
        CommonMethod.sleep(2000);
        //获取修改行的文本值
        String text=driver.findElement(CreatDangerSourcePage.HOLEPERSON).getText();
        String text1=driver.findElement(CreatDangerSourcePage.HOLEDIGDEPTH).getText();
        //校验获取的文本和输入的文本值是否一致（单个校验）
        Assert.assertEquals(text,xmfzr);
        Assert.assertEquals(text1,kw);


    }
    public static void clickAlterButton(String text){

        CommonMethod.selectValueMethod(DangerSourcePage.DANGERSOURCETYPE,text);
        driver.findElement(DangerSourcePage.INQUERYBOX).click();
        CommonMethod.sleep(3000);
        CommonMethodService.listData(CommonPage.TR,0);
        //driver.findElement(DangerSourcePage.FIRSTPROJECT).click();//点击第一条项目工程
        CommonMethodService.listData(CommonPage.BUTTON,1);

       // driver.findElement(alter).click();//点击在办事项修改



    }
    public static void alterProject(By place,By place2,String text1,String text2,By save) {

        //定位到修改按钮并点击
        //driver.findElement(DangerSourcePage.INALTER).click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.getElementsByName(\"proResPerson\")[0].set");
        //定位要修改的元素
        CommonMethod.sleep(3000);
        CommonMethod.sendText(place,text1);
        CommonMethod.sendText(place2,text2);
        //定位到保存按钮并点击
        CommonMethodService.listData(CommonPage.BUTTON,6);
        //调用定位到某一行方法
        CommonMethod.sleep(3000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        //点击查看
        CommonMethodService.listData(CommonPage.BUTTON,3);
        //driver.findElement(DangerSourcePage.INSEE).click();
        CommonMethod.sleep(2000);
        //获取修改行的文本值
        String value=driver.findElement(place).getText();
        String value1=driver.findElement(place2).getText();
        //校验获取的文本和输入的文本值是否一致（单个校验）
        Assert.assertEquals(value,text1);
        Assert.assertEquals(value1,text2);

    }
    public static void alterSafety(int i,By by,String s,int num){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // int count=rows.size();//获取tr个数即页面统计个数
        //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
        // 然后再次使用for循环把每行的单元格文本遍历输出
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(6).getText();
            CommonMethod.sleep(2000);
            if(colsText.contains("未")){
                row.findElement(By.xpath("//div[contains(text(),'未')]")).click();
                //CommonMethod.sleep(1000);
                CommonMethodService.listData(CommonPage.BUTTON,i);
               // CommonMethod.sleep(2000);
                driver.findElement(by).clear();
                driver.findElement(by).sendKeys(s);
                CommonMethodService.listData(CommonPage.BUTTON,num);
                CommonMethodService.listData(CommonPage.TR,0);
                //CommonMethod.sleep(1000);
                CommonMethodService.listData(CommonPage.BUTTON,i);
               // CommonMethod.sleep(4000);
                String newtext=driver.findElement(by).getText();
                //CommonMethod.sleep(2000);
                Assert.assertEquals(newtext,s);

            }

        }
    }


}
