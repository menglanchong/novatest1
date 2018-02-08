package com.hymake.nova.service;

import com.hymake.nova.page.*;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/10/25.
 */
public class ScreenWallService extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    //public static WebDriver driver=DriverManager.getDriver();
    public static  void  curtainServer(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.FIRSTPROJECT).click();
        driver.findElement(ScreenWallPage.ADD).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.UNITSELECT).click();


        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.WALLUNIT).click();
        driver.findElement(ScreenWallPage.CHOICE).click();
        /*driver.findElement(ScreenWallPage.JOBDEP).sendKeys(zcb);
        driver.findElement(ScreenWallPage.JOBLINKMAN).sendKeys(lxr);
        driver.findElement(ScreenWallPage.JOBTEL).sendKeys(lxdh);*/
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(ScreenWallPage.JOBDEP,"元");
        map.put(ScreenWallPage.JOBLINKMAN,"张三");
        map.put(ScreenWallPage.JOBTEL,"05923632112");
        map.put(ScreenWallPage.DESIGNDEP,"立方米");
        map.put(ScreenWallPage.DESIGNLINKMAN,"李四");
        map.put(ScreenWallPage.DESIGNTEL,"05921112223");
        map.put(ScreenWallPage.CONSTRUCTDEP,"平方米");
        map.put(ScreenWallPage.CONSTRUCTLINKMAN,"王武");
        map.put(ScreenWallPage.CONSTRUCTEL,"059223659");
        map.put(ScreenWallPage.STARTDATE,"2017-10-26");
        map.put(ScreenWallPage.COMPLETEDATE,"2017-10-28");
        map.put(ScreenWallPage.BUILDHEIGHT,"556");
        map.put(ScreenWallPage.LEAVEFLOORHEIGHT,"1392");


        for (By by : map.keySet()) {
            String value = map.get(by);
            driver.findElement(by).sendKeys(value);
        }
        driver.findElement(ScreenWallPage.SAVE).click();
        CommonMethod.promptMethod();


    }
    public static void curtainServer1(){
        driver.findElement(DangerSourcePage.PROJECT).click();
        driver.findElement(ScreenWallPage.WALLREGISTER).click();
        driver.findElement(ScreenWallPage.WALLREGISTER).click();
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(ScreenWallPage.FIRSTPROJECT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.FIRSTPROJECT).click();
        driver.findElement(ScreenWallPage.ADD).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.UNITSELECT).click();

        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(ScreenWallPage.WALLUNIT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.WALLUNIT).click();
        driver.findElement(ScreenWallPage.CHOICE).click();

    }
    //点击到幕墙登记
    public static void clickScreenWall() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮
        driver.findElement(ScreenWallPage.WALLREGISTER).click();//点击幕墙登记






    }
    //点击项目列表
    public static void clickScreenWallList(){

        driver.findElement(QueryScreenWallPage.PROJECTLIST).click();
    }
    //点击在办事项
    public static void clickInScreenWall() {
        driver.findElement(QueryScreenWallPage.INITEMLIST).click();


    }
    //点击到已办事项
    public static void clickDoneScreenWall() {

        driver.findElement(QueryScreenWallPage.DONEITEMLIST).click();

    }
    //点击到所有事项
    public static void clickAllScreenWall() {
       driver.findElement(QueryScreenWallPage.ALLITEMLIST).click();

    }

    //幕墙登记必填项校验

    public static void screenWallCheck(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.FIRSTPROJECT).click();
        driver.findElement(ScreenWallPage.ADD).click();
        driver.findElement(ScreenWallPage.SAVE).click();
        HashMap<By,String> map=new HashMap<By, String>();
        map.put(IsScreenWallPage.UNIT,"");
        map.put(IsScreenWallPage.JOBDEP,"");
        map.put(IsScreenWallPage.JOBLINKMAN,"");
        map.put(IsScreenWallPage.JOBTEL,"");
        map.put(IsScreenWallPage.DESIGNDEP,"");
        map.put(IsScreenWallPage.DESIGNLINKMAN,"");
        map.put(IsScreenWallPage.DESIGNTEL,"");
        map.put(IsScreenWallPage.CONSTRUCTDEP,"");
        map.put(IsScreenWallPage.CONSTRUCTLINKMAN,"");
        map.put(IsScreenWallPage.CONSTRUCTEL,"");
        map.put(IsScreenWallPage.STARTDATE,"");
        map.put(IsScreenWallPage.COMPLETEDATE,"");
        map.put(IsScreenWallPage.BUILDHEIGHT,"");
        map.put(IsScreenWallPage.LEAVEFLOORHEIGHT,"");
        for (By by : map.keySet()) {

            String byText=driver.findElement(by).getText();
            Assert.assertEquals(byText,"必填项，请输入");

        }
    }
    public static void  createWallServer(String pathfile){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.FIRSTPROJECT).click();
        driver.findElement(ScreenWallPage.ADD).click();
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
            if ("text".equals(type)) {
                driver.findElement(By.name(name)).sendKeys(value);
            }else if("input".equals(type)){
                CommonMethod.selectButton(ScreenWallPage.UNITSELECT,ScreenWallPage.WALLUNIT,ScreenWallPage.CHOICE);
            }else if("radio".equals(type)||"check".equals(type)) {
                driver.findElement(By.id(name)).click();
            }else {
                driver.findElement(By.id(name)).click();
            }

        }

    }
    public static void clickFirstScreenWall(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.FIRSTPROJECT).click();

    }
    public static int countService() {

        //定位table位置
        WebElement table = driver.findElement(ScreenWallPage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int count = rows.size();//获取tr个数即页面统计个数
        //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
        // 然后再次使用for循环把每行的单元格文本遍历输出
        /*for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(0).getText();
            Assert.assertTrue(colsText.contains(text));
        }*/
        return count;
    }
    public static void deleteService() {
        int total = countService();
        System.out.println(total);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.CHECKBOX).click();
        driver.findElement(ScreenWallPage.DELETE).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.CONFIRM).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int deletetotal=countService();
        Assert.assertEquals(deletetotal,total-1);
    }
    public static void closeWindowService(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(ScreenWallPage.CLOSEWINDOW).click();
        Boolean wall=driver.findElement(ScreenWallPage.WALLWINDOW).isDisplayed();
        Assert.assertFalse(wall);
    }



}
