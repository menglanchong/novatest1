
package com.hymake.nova.test;

import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryMaterialPage;
import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;


/**
 * Created by Administrator on 2018/1/25.
 */

public class QueryMaterialTest {

 @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void queryProject(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        QueryService.QueryText(QueryMaterialPage.PROJECTNAME,"龙岩",1);

    }
    @Test
    public static void queryNum(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        QueryService.QueryText(QueryMaterialPage.MATERIALSNUM,"99",0);
    }
    @Test
    public static void querySgUnit(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        QueryService.QueryText(QueryMaterialPage.SGUNIT,"隆",2);
    }
    @Test
    public static void queryScUnit(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        QueryService.QueryText(QueryMaterialPage.SCUNIT,"杏林",6);
    }
    @Test
    public static void queryManage(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        QueryService.QueryText(QueryMaterialPage.PMNAME,"黄",3);
    }
    @Test
    public static void queryPerson(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        QueryService.QueryText(QueryMaterialPage.SCPERSON,"赖",7);
    }
    @Test
    public static void queryEntryTime(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        try {
            QueryService.QueryMaterSelectTime("2017-12-17","2017-12-18",4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void checkQuerySgUnit(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QueryText(QueryMaterialPage.SGUNITNAME,"龙岩",0);

    }
    @Test
    public static void checkQueryProject(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QueryText(QueryMaterialPage.RECOREPRONAME,"龙岩",0);

    }

    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}

