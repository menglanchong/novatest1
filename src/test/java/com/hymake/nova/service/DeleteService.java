package com.hymake.nova.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hymake.nova.page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Administrator on 2017/12/21.
 * 删除方法判断
 */
public class DeleteService extends CommonMethod{

    public static void deleteSafety(){
      SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.IMFORMATION);
      ceshi.isData();
    }
    /*
    删除方法
     */
    public static void deleteSources(int num,int num2){
        int t=CommonMethod.count(DangerSourcePage.COUNT);
        if(t!=0){
            CommonMethodService.listData(CommonPage.TR,0);
            CommonMethodService.listData(CommonPage.BUTTON,num);
            CommonMethodService.listData(CommonPage.PROMPT,num2);
            CommonMethod.sleep(2000);
            int t1=CommonMethod.count(DangerSourcePage.COUNT);
            Assert.assertEquals(t1,t-1);

        }else {
            System.out.println("没有可删除的数据！");
        }

    }
    public static void deleteDraft(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        CommonMethod.sleep(2000);
        int t=CommonMethod.count(DangerSourcePage.COUNT);
        for (int t1=0;t1<t;t1++){
                CommonMethodService.listData(CommonPage.TR,0);
                CommonMethodService.listData(CommonPage.BUTTON,1);
                CommonMethodService.listData(CommonPage.PROMPT,1);

        }
        CommonMethod.sleep(2000);
        int t2=CommonMethod.count(DangerSourcePage.COUNT);
        Assert.assertEquals(t2,0);

    }
    /*
    * 针对表格中某些状态一个循环检索，对其进行删除或者撤回操作
    * */
    public static void deleteState(int num,By by,int i){

           CommonMethod.sleep(2000);
           //定位table位置
            WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
            //得到表格中所有tr标签的集合
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            // int count=rows.size();//获取tr个数即页面统计个数
            //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
            // 然后再次使用for循环把每行的单元格文本遍历输出
            for(WebElement row:rows) {
                // 然后得到当前所有tr里td标签的集合
                CommonMethod.sleep(2000);
                int t=CommonMethod.count(DangerSourcePage.COUNT);
                List<WebElement> cols = row.findElements(By.tagName("td"));
                String colsText = cols.get(num).getText();
                if(colsText.contains("未")||colsText.contains("草稿")||colsText.contains("待")){
                    CommonMethod.sleep(2000);
                    row.findElement(by).click();
                    CommonMethod.sleep(2000);
                    CommonMethodService.listData(CommonPage.BUTTON,i);
                    CommonMethod.sleep(2000);
                    CommonMethodService.listData(CommonPage.PROMPT,1);
                    CommonMethod.sleep(2000);
                    int t1=CommonMethod.count(DangerSourcePage.COUNT);
                    Assert.assertEquals(t1,t-1);
                    CommonMethod.sleep(2000);



                }
            }


    }
}
