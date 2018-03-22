

package com.hymake.nova.test;

import com.hymake.nova.page.*;
import com.hymake.nova.service.CommonMethod;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;



/**
 * Created by Administrator on 2018/1/25.
 *校验材料报验报审记录查询
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
            QueryService.QueryMaterSelectTime(0,1,"2017-12-17","2017-12-18",QueryMaterialPage.PROJECTNAME,4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void querySubTime(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        try {
            QueryService.QueryMaterSelectTime(2,3,"2018-02-07","2018-02-08",QueryMaterialPage.PROJECTNAME,9);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void checkQuerySgUnit(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QueryText(QueryMaterialPage.SGUNITNAME,"厦门",3);

    }
    @Test
    public static void checkQueryProject(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QueryText(QueryMaterialPage.RECOREPRONAME,"龙岩",0);

    }
    @Test
    public static void checkQueryStytle(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QuerySelectText(QueryMaterialPage.REPORTTYPE,"建设工程主要材料报审表",1);
    }
    @Test
    public static void checkQueryJsUnit(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QueryText(QueryMaterialPage.JSUNIT,"第一",2);

    }
    @Test
    public static void checkQueryJlUnit(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        QueryService.QueryText(QueryMaterialPage.JLUNIT,"杏林",4);

    }
    @Test
    public static void checkQuerySub(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        try {
            QueryService.QueryMaterSelectTime(0,1,"2018-01-25","2018-01-26",QueryMaterialPage.RECOREPRONAME,5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void checkQueryBs(){
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALRECORD);
        try {
            QueryService.QueryMaterSelectTime(2,3,"2018-01-25","2018-01-29",QueryMaterialPage.RECOREPRONAME,6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


