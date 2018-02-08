package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.DangerSourcePage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/14.
 */
public class CreateMaterialService extends CommonMethod{
    public static void createMaterial(){

       /* new WebDriverWait(driver, 20, 300).until(ExpectedConditions.attributeToBe(CreatMaterialReviewPage.dis
                , "style", "display: none;"));//20秒内每隔300毫秒判断一次：当这个元素的style属性的值变成了display: none*/


       /* String b=driver.findElement(CreatMaterialReviewPage.dis).getCssValue("style");
        System.out.println("测试结果"+b);*/
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("");*/
        /*js.executeScript("document.getElementsByName(\"项目管理\").click");*/

        CommonMethodService.listData(CommonPage.BUTTON,2);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,7);
        CommonMethod.sleep(2000);
        CommonMethod.findElement(CreatMaterialReviewPage.MAINUNIT).click();
        //String a=driver.findElement(QueryMaterialPage.PROJECTNAME).getAttribute("input");
        //System.out.println("测试"+a);
       // CommonMethod.sleep(2000);
        //driver.findElement(QueryMaterialPage.SEARCH).click();

        CommonMethod.findElement(CreatMaterialReviewPage.CONFIRM).click();
        CommonMethod.findElement(CreatMaterialReviewPage.REAFFIRM).click();
        createMaterialServer("\\json\\NewMaterial .json");
       /* CommonMethod.sleep(2000);
        CommonMethod.findElement(CreatMaterialReviewPage.ADD).click();
        CommonMethod.sleep(2000);
        CommonMethod.actionMethod(driver.findElement(CreatMaterialReviewPage.MOVE));
        CommonMethod.sleep(2000);
        driver.findElement(CreatMaterialReviewPage.YES).click();*/
    }
    public static void  createMaterialServer(String pathfile) {
        String path = System.getProperty("user.dir");//获取当前路径
        String JsonContext = new CommonMethod().ReadFile(path + pathfile);
        JSONObject jsons = new JSONObject(JsonContext);
        JSONArray features = jsons.getJSONArray("yongl");// 找到features的json数组
        for (int i = 0; i < features.length(); i++) {
            JSONObject info = features.getJSONObject(i);// 获取features数组的第i个json对象
            //JSONObject properties = info.getJSONObject("properties");// 找到properties的json对象
            String name = info.getString("name");// 读取properties对象里的name字段值
            String type = info.getString("type");
            String value = info.getString("value");
            if ("text".equals(type)) {
                driver.findElement(By.xpath(name)).sendKeys(value);
            } else if ("add".equals(type)) {
                driver.findElement(By.xpath(name)).click();
                CreateMaterialService.creatProject("\\json\\project.json");
            } else if ("check".equals(type) || "radio".equals(type)) {
                driver.findElement(By.id(name)).click();

            } else {
                CommonMethod.sleep(2000);
                driver.findElement(By.xpath(name)).click();
            }
        }
       /* CommonMethod.sleep(3000);
        driver.findElement(CreatMaterialReviewPage.QD).click();*/

    }
    public static void creatProject(String pathfile){
        String path = System.getProperty("user.dir");//获取当前路径
        String JsonContext = new CommonMethod().ReadFile(path + pathfile);
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


            } else if ("check".equals(type)) {
                CommonMethod.sleep(1000);
                driver.findElement(By.id(name)).click();
                CommonMethod.actionMethod(driver.findElement(CreatMaterialReviewPage.MOVE));
               //JavascriptExecutor js = (JavascriptExecutor) driver;
                //js.executeScript("document.getElementById(\"materialsAdd\").scrollHeight=5000");

            }else if("radio".equals(type)){
                new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.id(name)));
                driver.findElement(By.id(name)).click();
            }
            else {
                driver.findElement(By.xpath(name)).click();
            }

        }
    }
}
