package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.QueryMaterialPage;
import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.CommonMethod;
import com.hymake.nova.service.CommonMethodService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/3/20.
 * 建材报验清空校验
 */
public class ClearMaterialTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();

    }
    @Test//主要材料报审在办清空文本
    public static void clearInText(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        ClearService.clearTextService(QueryMaterialPage.PROJECTNAME,"龙岩");

    }
    @Test//主要材料报审已办清空文本
    public static void clearDoneText(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        CommonMethodService.listData(CommonPage.MENU,1);
        ClearService.clearTextService(QueryMaterialPage.SGUNIT,"西安");


    }
    @Test//主要材料报审所有事项清空文本
    public static void clearAllText(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        CommonMethodService.listData(CommonPage.MENU,2);
        ClearService.clearTimeService(2,3,9,"2017-11-15",
                "2017-11-19");


    }
    @Test//主要材料记录查询清空文本
    public static void clearRecordText(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        ClearService.clearTextService(QueryMaterialPage.RECOREPRONAME,"龙岩");
    }
    @Test//主要材料公示查询清空文本
    public static void clearPublicText(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.PLSTFORM);
        CommonMethod.winTest();
        ClearService.clearCommonText(0,"第一");

    }

}
