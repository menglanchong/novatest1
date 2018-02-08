package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.IsDangerSourcePage;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/11/1.
 */
public class DangerSourceService  extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    public static void addDangerSource(String path, By mc){
        CommonMethod.sleep(5000);
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(4000);
        CommonMethodService.listData(CommonPage.MENU,2);
        CommonMethod.sleep(2000);
        int t= count(DangerSourcePage.COUNT);
        CommonMethodService.listData(CommonPage.MENU,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,1);
        CreateService.createServer(path, mc, CreatDangerSourcePage.PROJECTUNIT, CreatDangerSourcePage.UNITSELECT);
        CommonMethod.sleep(3000);
        CommonMethodService.listData(CommonPage.MENU,2);
        CommonMethod.sleep(2000);
//        String total1=driver.findElement(WxyPage.t).getText();//获取底部总条数文本
//        System.out.println(total1);
//        total1=total1.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
         int t1= count(DangerSourcePage.COUNT);
        Assert.assertEquals(t1,t+1);

    }


    public static int count(By a){
        String total=driver.findElement(a).getText();//获取底部总条数文本
        total=total.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
        int t=Integer.parseInt(total);
        return t;
    }
    public static void deleteDanger(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
        driver.findElement(DangerSourcePage.INITEM).click();//点击在办事项
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int total= count(DangerSourcePage.COUNT);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.FIRSTPROJECT).click();//点击危险源第一行
        driver.findElement(DangerSourcePage.INDELETE).click();//点击删除按钮
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.PROMPT,1);
        CommonMethod.sleep(2000);
        int total1= count(DangerSourcePage.COUNT);
        Assert.assertEquals(total1,total-1);


    }
    public static void recallServer(){
        driver.findElement(DangerSourcePage.HAVEITEM).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int t= count(DangerSourcePage.COUNT);
        driver.findElement(DangerSourcePage.FIRSTPROJECT).click();
        driver.findElement(DangerSourcePage.HAVERECALL).click();
        driver.findElement(DangerSourcePage.HAVESURE).click();
        CommonMethod.sleep(4000);
        int t1= count(DangerSourcePage.COUNT);
        Assert.assertEquals(t1,t-1);


    }
    public static void clearServer(String text) {
        CommonMethod.selectValueMethod(DangerSourcePage.DANGERSOURCETYPE,text);//选择下拉值
        driver.findElement(DangerSourcePage.INEMPTY).click();//点击清空按钮
        JavascriptExecutor js = (JavascriptExecutor) driver;
       String value=(String)js.executeScript("var select=document.getElementsByTagName(\"select\")[1];var index = " +
                "select.selectedIndex;var value = select.options[index].text; return value;");//获取当前文本框
        Assert.assertEquals(value,"全部");



    }
    public static void dangerDetail(String pathfile){
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethodService.listData(CommonPage.BUTTON,2);
        //driver.findElement(DangerSourcePage.INFIRST).click();
        String path=System.getProperty("user.dir");//获取当前路径
        String JsonContext = new CommonMethod().ReadFile(path+pathfile);
        JSONObject jsons = new JSONObject(JsonContext);
        JSONArray features = jsons.getJSONArray("yongl");// 找到features的json数组
        for (int i = 0; i < features.length(); i++) {
            JSONObject info = features.getJSONObject(i);// 获取features数组的第i个json对象
            //JSONObject properties = info.getJSONObject("properties");// 找到properties的json对象
            String name = info.getString("name");// 读取properties对象里的name字段值
            String type = info.getString("type");
            String value = info.getString("value");
            if("text".equals(type)||"input".equals(type)){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String newValue=driver.findElement(By.name(name)).getText();
                //Assert.assertEquals(newValue,value);
                if(newValue.equals(value)){
                    System.out.println("测试通过");
                }else {
                    System.out.println("实际结果："+newValue+"预期结果："+value);
                }

            }

        }
        CommonMethodService.listData(CommonPage.BUTTON,4);

    }
    public static void buttonServer(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
        driver.findElement(DangerSourcePage.DANGERRECORD).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // Boolean ts=driver.findElement(WxyPage.ts).isDisplayed();
        //Assert.assertTrue(ts);
        String ts1=driver.findElement(IsDangerSourcePage.CHECKBUTTON).getText();
        Assert.assertEquals(ts1,"请选择一条记录");
        driver.findElement(IsDangerSourcePage.CHECKBUTTONCLICK).click();

    }
    public static void clickProjectName(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.FIRSTPROJECT).click();//点击第一条项目工程
        driver.findElement(DangerSourcePage.DANGERRECORD).click();//点击危险源登记



    }
  /*  public static void clickDangerSource() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
    }*/
   /* public static void clickInDangerSource(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
        driver.findElement(DangerSourcePage.INITEM).click();//点击在办事项
    }*/
   /* public static void clickHaveDangerSource(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
        driver.findElement(DangerSourcePage.HAVEITEM).click();//点击已办事项

    }*/
  /*  public static void clickAllDangerSource(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
        driver.findElement(DangerSourcePage.ALLITEM).click();//点击所有事项
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));

    }*/
    public static void dangerSourceMenu(int index){
        CommonMethod.sleep(4000);
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(3000);
        CommonMethodService.listData(CommonPage.MENU,index);
    }
    public static void dangerSourceToProject(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(DangerSourcePage.DANGERM).click();//点击危险源管理按钮
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(DangerSourcePage.DANGERREGISTER));
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();//点击危险源登记
        driver.findElement(DangerSourcePage.DANGERREGISTER).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.FIRSTPROJECT).click();
        driver.findElement(DangerSourcePage.DANGERRECORD).click();

    }

}
