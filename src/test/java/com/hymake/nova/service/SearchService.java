package com.hymake.nova.service;

import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryMaterialPage;
import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/12/20.
 */
public class SearchService extends CommonMethod{
    public static void  searchService(By by, By s,String text, int index){
     menuService();
     CommonMethodService.lookUpText(by,s,text,index);

    }
    public static void menuService(){
        CommonMethod.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮

        CommonMethod.findElement(CreatMaterialReviewPage.REPORTMENU).click();

        CommonMethod.findElement(CreatMaterialReviewPage.MATERIALCHECK).click();
    }
    public static void menuRecordService(){
        CommonMethod.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮

        CommonMethod.findElement(CreatMaterialReviewPage.REPORTMENU).click();

        CommonMethod.findElement(CreatMaterialReviewPage.MATERIALRECORD).click();
    }
    public static void HaveService(){
        CommonMethod.findElement(DangerSourcePage.PROJECT).click();//点击项目管理按钮

        CommonMethod.findElement(CreatMaterialReviewPage.REPORTMENU).click();

        CommonMethod.findElement(CreatMaterialReviewPage.MATERIALCHECK).click();
        CommonMethod.findElement(QueryMaterialPage.HAVEITEM).click();
    }
    public static void  clearService(){

    }
}
