package com.hymake.nova.service;


import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.SafetyPage;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Administrator on 2017/10/30.
 */
public class CreateService extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    //public static WebDriver driver= DriverManager.getDriver();
    public static void  createServer(String pathfile,By dwgc,By lb,By xz){
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
                    CommonMethod.selectButton(dwgc,lb,xz);
                }else if("select".equals(type)) {
                    CommonMethod.selectMethod(By.id(name),value);
                }else if("check".equals(type)) {
                    driver.findElement(By.id(name)).click();

                }

            }
            CommonMethodService.listData(CommonPage.BUTTON,4);

           /* new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(CreatDangerSourcePage.PROMPT));
            driver.findElement(CreatDangerSourcePage.PROMPT).click();*/


    }
    public static void creatJkMethod(String pathfile,By dwgc,By lb,By xz){
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
                CommonMethod.selectButton(dwgc,lb,xz);
            }else if("check".equals(type)) {
                driver.findElement(By.id(name)).click();

            }else {
                driver.findElement(By.xpath(name)).click();
            }

        }

        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(CreatDangerSourcePage.PROMPT));
        driver.findElement(CreatDangerSourcePage.PROMPT).click();
    }
    public static void createSafetyMethod(String pathfile,int index){
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
            CommonMethod.sleep(2000);
            if ("text".equals(type)) {
                driver.findElement(By.name(name)).sendKeys(value);
            }else if("radio".equals(type)){
                driver.findElement(By.id(name)).click();
            }else {
                CommonMethod.selectIndex(By.name(name),0);
            }
        }
        CommonMethodService.listData(CommonPage.BUTTON,index);
        //driver.findElement(by).click();
        //CommonMethodService.listData(CommonPage.PROMPT,1);
    }
    public static void addSafety(String pathfile,int i){
       /* CommonMethod.sleep(5000);
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.ETPEVALUE);*/
        CommonMethod.sleep(2000);
        int t= count(DangerSourcePage.COUNT);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,1);
        CreateService.createSafetyMethod(pathfile,i);
        CommonMethod.sleep(2000);
//        String total1=driver.findElement(WxyPage.t).getText();//获取底部总条数文本
//        System.out.println(total1);
//        total1=total1.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
        int t1= count(DangerSourcePage.COUNT);
        Assert.assertEquals(t1,t+1);

    }
    public static void addSafetyInformation(String pathfile,int i){
        CommonMethod.sleep(2000);
        int t= count(DangerSourcePage.COUNT);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.PROMPT,1);
        CreateService.createSafetyMethod(pathfile,i);
        CommonMethod.sleep(2000);
        int t1= count(DangerSourcePage.COUNT);
        Assert.assertEquals(t1,t+1);

    }
    public static void creatFactory(){
        CommonMethodService.listData(CommonPage.BUTTON,1);
    }

}
