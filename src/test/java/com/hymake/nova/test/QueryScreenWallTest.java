

package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.page.ScreenWallPage;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import com.hymake.nova.service.ScreenWallService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;



/**
 * Created by Administrator on 2017/11/15.
 * 幕墙和外窗查询
 */

public class QueryScreenWallTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test(description = "外窗幕墙项目查询")
    public static void queryProjectScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        QueryService.QueryText(QueryScreenWallPage.PROJECTNAME,"第一医院",0);

    }
    @Test(description = "外窗幕墙在办项目查询")
    public static void queryProjectINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QueryText(QueryScreenWallPage.INPROJECTNAME,"第一医院",0);

    }
    @Test(description = "外窗幕墙已办项目查询")
    public static void queryProjectDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QueryText(QueryScreenWallPage.DONEPROJECTNAME,"第一医院",0);

    }
    @Test(description = "外窗幕墙所有项目查询")
    public static void queryProjectAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QueryText(QueryScreenWallPage.ALLPROJECTNAME,"第一医院",0);

    }
    @Test(description = "外窗幕墙项目代码查询")
    public static void queryCodeScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        QueryService.QueryText(QueryScreenWallPage.PROJECTCODE,"05977120120067",1);

    }
    @Test(description = "外窗幕墙在办项目代码查询")
    public static void queryCodeINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QueryText(QueryScreenWallPage.INPROJECTCODE,"05977120120067",1);

    }
    @Test(description = "外窗幕墙已办项目代码查询")
    public static void queryCodeDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QueryText(QueryScreenWallPage.DONEPROJECTCODE,"05977120120067",1);

    }
    @Test(description = "外窗幕墙所有项目代码查询")
    public static void queryCodeAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QueryText(QueryScreenWallPage.ALLPROJECTCODE,"05977120120067",1);

    }
    @Test(description = "外窗幕墙工程项目类别查询")
    public static void queryTypeScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        QueryService.QuerySelectText(QueryScreenWallPage.PROJECTTYPE,"房建工程",4);


    }
    @Test(description = "外窗幕墙在办工程项目类别查询")
    public static void queryTypeINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QuerySelectText(QueryScreenWallPage.INPROJECTTYPE,"房建工程",2);

    }
    @Test(description = "外窗幕墙已办工程项目类别查询")
    public static void queryTypeDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QuerySelectText(QueryScreenWallPage.DONEPROJECTTYPE,"房建工程",2);

    }
    @Test(description = "外窗幕墙所有工程项目类别查询")
    public static void queryTypeAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QuerySelectText(QueryScreenWallPage.ALLPROJECTTYPE,"房建工程",2);

    }
    @Test(description = "外窗幕墙在办建设单位工程查询")
    public static void queryBuildINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QueryText(QueryScreenWallPage.INCONDEP,"龙岩市",3);

    }
    @Test(description = "外窗幕墙已办建设单位工程查询")
    public static void queryBuildDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QueryText(QueryScreenWallPage.DONECONDEP,"龙岩市",3);

    }
    @Test(description = "外窗幕墙所有建设单位工程查询")
    public static void queryBuildAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QueryText(QueryScreenWallPage.ALLCONDEP,"龙岩市",3);

    }
    @Test(description = "外窗幕墙在办审核状态查询")
    public static void queryChangeINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QuerySelectText(QueryScreenWallPage.INCHANGESTATUS,"草稿",8);

    }
    @Test(description = "外窗幕墙已办审核状态查询")
    public static void queryChangeDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QuerySelectText(QueryScreenWallPage.DONECHANGESTATUS,"审核通过",8);

    }
    @Test(description = "外窗幕墙所有审核状态查询")
    public static void queryChangeAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QuerySelectText(QueryScreenWallPage.ALLCHANGESTATUS,"草稿",8);

    }
    @Test(description = "外窗幕墙在办登记类型查询")
    public static void queryInUpdateType(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QuerySelectText(QueryScreenWallPage.UPDATETYPE,"幕墙登记",5);
    }
    @Test(description = "外窗幕墙已办登记类型查询")
    public static void queryDoneUpdateType(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QuerySelectText(QueryScreenWallPage.UPDATETYPE,"外窗登记",5);
    }
    @Test(description = "外窗幕墙所有登记类型查询")
    public static void queryAllUpdateType(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QuerySelectText(QueryScreenWallPage.UPDATETYPE,"幕墙登记",5);
    }
    @Test(description = "外窗幕墙在办流程开始查询")
    public static void queryStartINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        try {
            QueryService.QueryMaterSelectTime(0,1,
                    "2017-11-15","2017-11-25",QueryScreenWallPage.INPROJECTNAME,6);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    @Test(description = "外窗幕墙已办流程开始查询")
    public static void queryStartDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        try {
            QueryService.QueryMaterSelectTime(0,1,
                    "2017-11-15","2017-11-25",QueryScreenWallPage.INPROJECTNAME,6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test(description = "外窗幕墙所有流程开始查询")
    public static void queryStartAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        try {
            QueryService.QueryMaterSelectTime(0,1,
                    "2017-11-15","2017-11-25",QueryScreenWallPage.ALLPROJECTNAME,6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test(description = "外窗幕墙在办流程结束查询")
    public static void queryEndINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        try {
            QueryService.QueryMaterSelectTime(2,3,
                    "2017-11-15","2017-11-25",QueryScreenWallPage.INPROJECTNAME,7);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    @Test(description = "外窗幕墙已办流程结束查询")
    public static void queryEndDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        try {
            QueryService.QueryMaterSelectTime(2,3,
                    "2017-11-15","2017-11-25",QueryScreenWallPage.DONEPROJECTNAME,7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test(description = "外窗幕墙所有流程结束查询")
    public static void queryEndAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        try {
            QueryService.QueryMaterSelectTime(2,3,
                    "2017-11-15","2017-11-25",QueryScreenWallPage.ALLPROJECTNAME,7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


