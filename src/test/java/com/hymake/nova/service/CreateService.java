package com.hymake.nova.service;


import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.SafetyPage;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
            CommonMethodService.listData(CommonPage.BUTTON,5);

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
    public static void createSafetyMethod(String pathfile){
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
            }
        }
        CommonMethodService.listData(CommonPage.BUTTON,6);
        //driver.findElement(by).click();
        CommonMethodService.listData(CommonPage.PROMPT,1);
    }
    public static void creatFactory(){
        CommonMethodService.listData(CommonPage.BUTTON,1);
    }

}
