package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.page.ScreenWallPage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/2/26.
 */
public class CreatScreenWall extends CommonMethod{

    public static void  creatScreenWall(int index){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethodService.listData(CommonPage.BUTTON,index);

    }
    public static void  createWindowServer(String pathfile){
        /*CommonMethodService.listData(CommonPage.MENU,1);
        int t= DangerSourceService.count(DangerSourcePage.COUNT);*/

            //Boolean dis=driver.findElement(By.className("el-message-box")).isDisplayed();
            CommonMethodService.listData(CommonPage.PROMPT, 1);
            CommonMethod.sleep(2000);
            Boolean sel=driver.findElement(By.name("jsName")).isSelected();
            if(sel.equals(false)){
                CreatScreenWall.commonWall(pathfile);
            }
            else {
                CommonMethodService.listData(CommonPage.BUTTON, 6);
                CommonMethodService.listData(CommonPage.MENU,1);
                CommonMethod.selectValueMethod(QueryScreenWallPage.UPDATETYPE,"外窗登记");
                CommonMethodService.listData(CommonPage.BUTTON,0);
                CommonMethodService.listData(CommonPage.TR,0);
                CommonMethodService.listData(CommonPage.BUTTON,1);
                CommonMethodService.listData(CommonPage.PROMPT,1);
                CommonMethodService.listData(CommonPage.MENU,0);
                CommonMethodService.listData(CommonPage.TR,0);
                CommonMethodService.listData(CommonPage.BUTTON,2);
                CommonMethodService.listData(CommonPage.PROMPT, 1);
                CommonMethod.sleep(2000);
                CreatScreenWall.commonWall(pathfile);

            }
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON, 4);
        CommonMethod.sleep(3000);
        CommonMethodService.listData(CommonPage.PROMPT,1);
    }
    public static void  createWindow(int i,String pathfile){
        CommonMethod.sleep(3000);
        int t=CommonMethod.count(DangerSourcePage.COUNT);
        System.out.println("打印条数:"+t);
        CommonMethodService.listData(CommonPage.MENU,0);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethodService.listData(CommonPage.BUTTON,i);
        CommonMethodService.listData(CommonPage.PROMPT, 1);
        CommonMethod.sleep(2000);
        CreatScreenWall.commonWall(pathfile);
        CommonMethodService.listData(CommonPage.MENU,1);
        CommonMethod.sleep(2000);
        int t1=CommonMethod.count(DangerSourcePage.COUNT);
        Assert.assertEquals(t1,t+1);
    }
    public static void commonWall(String pathfile){

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

                } else if ("radio".equals(type) || "check".equals(type)) {
                    driver.findElement(By.id(name)).click();

                } else if ("checkbox".equals(type)) {
                    driver.findElement(By.xpath(name)).click();
                } else {
                    driver.findElement(By.id(name)).click();
                }

            }
        CommonMethodService.listData(CommonPage.BUTTON, 4);
        CommonMethod.sleep(3000);
        CommonMethodService.listData(CommonPage.PROMPT,1);
    }
    public static void checkBox(){
        CommonMethodService.listData(CommonPage.CHECKBOX,0);
    }

}
