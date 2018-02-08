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
    public static void createProject(String a,String b,String c,String d,String h){

        CommonMethod.selectMethod(CreatDangerSourcePage.DANGERTYPE,"1");
        CommonMethod.selectMethod(CreatDangerSourcePage.DANGERSOURCETYPE,"10");
        driver.findElement(CreatDangerSourcePage.HOLEUNIT).click();
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(CreatDangerSourcePage.PROJECTUNIT));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(CreatDangerSourcePage.PROJECTUNIT).click();
        driver.findElement(CreatDangerSourcePage.UNITSELECT).click();
        driver.findElement(CreatDangerSourcePage.HOLEPERSON).sendKeys(a);
        driver.findElement(CreatDangerSourcePage.EXAMORG).sendKeys(b);
        driver.findElement(CreatDangerSourcePage.HOLEDIGDEPTH).sendKeys(c);
        driver.findElement(CreatDangerSourcePage.BASENUM).sendKeys(d);
        driver.findElement(CreatDangerSourcePage.REALBEGDATE).sendKeys(h);
        driver.findElement(CreatDangerSourcePage.HOLESAVE).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // String text =driver.findElement(CreatDangerSourcePage.dwgcjy).getText();
        //driver.findElement(CreatDangerSourcePage.PROMPT).click();
       // Assert.assertEquals(text,"必填项，请输入");




    }
    public static void createProject1(String jcdw,String wxy,String sj,String qk){
        CommonMethod.selectMethod(CreatDangerSourcePage.DANGERTYPE,"1");
        CommonMethod.selectMethod(CreatDangerSourcePage.DANGERSOURCETYPE,"30");
        driver.findElement(CreatDangerSourcePage.TMPUNIT).click();
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(CreatDangerSourcePage.PROJECTUNIT));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(CreatDangerSourcePage.PROJECTUNIT).click();
        driver.findElement(CreatDangerSourcePage.UNITSELECT).click();
        driver.findElement(CreatDangerSourcePage.TMPFASTEXAMUNIT).sendKeys(jcdw);
        driver.findElement(CreatDangerSourcePage.TMPDANGER).sendKeys(wxy);
        driver.findElement(CreatDangerSourcePage.TMPREALBEGDATE).sendKeys(sj);
        driver.findElement(CreatDangerSourcePage.TMPTYPE).click();
        driver.findElement(CreatDangerSourcePage.TMPDANGERDESC).sendKeys(qk);
        CommonMethodService.listData(CommonPage.BUTTON,4);

       // driver.findElement(CreatDangerSourcePage.PROMPT).click();
       // String  text =driver.findElement(CreatDangerSourcePage.TMPPROMPT).getText();
       // System.out.print(text);
        //Assert.assertEquals(text,"必填项，请输入");
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

   public static void createProject2(String jc,String gd,String sj,String bw){
       driver.findElement(DangerSourcePage.DANGERRECORD).click();
       CommonMethod.selectMethod(CreatDangerSourcePage.DANGERTYPE,"1");
       CommonMethod.selectMethod(CreatDangerSourcePage.DANGERSOURCETYPE,"50");
       driver.findElement(CreatDangerSourcePage.SCFFASTEXAMUNIT).sendKeys(jc);
       driver.findElement(CreatDangerSourcePage.SCFHEIGHT).sendKeys(gd);
       driver.findElement(CreatDangerSourcePage.SCFREALBEGDATE).sendKeys(sj);
       driver.findElement(CreatDangerSourcePage.SCFDANGERSITE).sendKeys(bw);
       driver.findElement(CreatDangerSourcePage.SCFSAVE).click();
       String  text =driver.findElement(CreatDangerSourcePage.SCFPROMPT).getText();
       Assert.assertEquals(text,"必填项，请输入");

   }
    public static void createProject3(String fzr,String dw,String sj,String bw,String fw){

        CommonMethod.selectMethod(CreatDangerSourcePage.DANGERTYPE,"1");
        CommonMethod.selectMethod(CreatDangerSourcePage.DANGERSOURCETYPE,"70");
        driver.findElement(CreatDangerSourcePage.BLSTUNIT).click();
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(CreatDangerSourcePage.PROJECTUNIT));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(CreatDangerSourcePage.PROJECTUNIT).click();
        driver.findElement(CreatDangerSourcePage.UNITSELECT).click();
        driver.findElement(CreatDangerSourcePage.BLSTPERSON).sendKeys(fzr);
        driver.findElement(CreatDangerSourcePage.BLSTPROJECTUNIT).sendKeys(dw);
        driver.findElement(CreatDangerSourcePage.BLSTREALBEGDATE).sendKeys(sj);
        driver.findElement(CreatDangerSourcePage.BLSTSITE).sendKeys(bw);
        driver.findElement(CreatDangerSourcePage.BLSTRANGE).sendKeys(fw);
        CommonMethodService.listData(CommonPage.BUTTON,4);
        //driver.findElement(CreatDangerSourcePage.PROMPT).click();
        // String  text =driver.findElement(CreatDangerSourcePage.TMPPROMPT).getText();
        // System.out.print(text);
        //Assert.assertEquals(text,"必填项，请输入");
    }

   /* public static void findWxy(){
        driver.findElement(DangerSourcePage.PROJECTLEADER).sendKeys("fds");
        //String text1=driver.findElement(CreatDangerSourcePage.EXAMORG).getText();
        driver.findElement(DangerSourcePage.INQUERYBOX).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }*/

    /*public static void zbsxFind(String gc){

        driver.findElement(DangerSourcePage.QUERYBOX).sendKeys(gc);
    }*/
    //清空条件方法（文本框定位，清空定位，输入字符）
    public static void clearTextService(By wb, String qktj){
        CommonMethod.sleep(2000);
        //定位到文本框并输入字符
        WebElement element=driver.findElement(wb);
        element.sendKeys(qktj);

        CommonMethod.sleep(3000);
        //定位清空按钮并点击
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        //CommonMethodService.listData(CommonPage.BUTTON,num);
        //校验文本框的值是否为空
        try {
              Assert.assertEquals(element.getText(),"");
              System.out.println("测试"+element.getText());
        } catch (Error e) {

            CreateElementScreenshot.takeScreenshotByName(driver);

            throw e;


        }

        //Assert.assertEquals(element.getText(),EMPTY);



    }
    public static void clearSelectIndex(By xl, String vl){

        CommonMethod.sleep(2000);
        CommonMethod.selectMethod(xl,vl);
        driver.findElement(DangerSourcePage.PROJECT).click();
        CommonMethod.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        /*String value=(String)js.executeScript("var select=document.getElementsByTagName(\"select\")[0];var index = " +
                "select.selectedIndex;var value = select.options[index].text; return value;");*/
        String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
                "('select.form-control')[0].selectedIndex].text");
        System.out.println("打印结果："+value);
        driver.findElement(DangerSourcePage.INEMPTY).click();
        Assert.assertEquals(value,"全部");
    }
    public static void clearSelectValue(By select, String text) {
        CommonMethod.sleep(2000);
        CommonMethod.selectValueMethod(select, text);
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        CommonMethod.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       /* String value=(String)js.executeScript("var select=document.getElementsByTagName(\"select\")[0];var index = " +
                "select.selectedIndex;var value = select.options[index].text; return value;");//获取当前下拉框显示值*/
        String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
                "('select.form-control')[0].selectedIndex].text");
        System.out.println(value);
        Assert.assertEquals(value, "全部");

    }
    public static void clearSelectChangeValue(By select, String text) {
        CommonMethod.sleep(2000);
        CommonMethod.selectValueMethod(select, text);
        driver.findElement(QueryScreenWallPage.SHOWCLEAR).click();
        CommonMethod.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       String value=(String)js.executeScript("var select=document.getElementsByName(\"seek_wfStatus\");" +
               "var index = select.selectedIndex;var value = select.options[index].text; return value;");//获取当前下拉框显示值
        /*String value=(String)js.executeScript("document.querySelectorAll('select.form-control')[0]. options[document.querySelectorAll" +
                "('select.form-control')[0].selectedIndex].text");*/
        Assert.assertEquals(value, "全部");

    }
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
