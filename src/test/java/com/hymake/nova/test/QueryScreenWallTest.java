

package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.page.ScreenWallPage;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.QueryService;
import com.hymake.nova.service.ScreenWallService;
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
    @Test
    public static void queryProjectScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        QueryService.QueryText(QueryScreenWallPage.PROJECTNAME,"第一医院",0);

    }
    @Test
    public static void queryProjectINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QueryText(QueryScreenWallPage.INPROJECTNAME,"第一医院",0);

    }
    @Test
    public static void queryProjectDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QueryText(QueryScreenWallPage.DONEPROJECTNAME,"第一医院",0);

    }
    @Test
    public static void queryProjectAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QueryText(QueryScreenWallPage.ALLPROJECTNAME,"第一医院",0);

    }
    @Test
    public static void queryCodeScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        QueryService.QueryText(QueryScreenWallPage.PROJECTCODE,"05977120120067",1);

    }
    @Test
    public static void queryCodeINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QueryText(QueryScreenWallPage.INPROJECTCODE,"05977120120067",1);

    }
    @Test
    public static void queryCodeDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QueryText(QueryScreenWallPage.DONEPROJECTCODE,"05977120120067",1);

    }
    @Test
    public static void queryCodeAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QueryText(QueryScreenWallPage.ALLPROJECTCODE,"05977120120067",1);

    }
    @Test
    public static void queryTypeScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        QueryService.QuerySelectText(QueryScreenWallPage.PROJECTTYPE,"房建工程",4);


    }
    @Test
    public static void queryTypeINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QuerySelectText(QueryScreenWallPage.INPROJECTTYPE,"房建工程",2);

    }
    @Test
    public static void queryTypeDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QuerySelectText(QueryScreenWallPage.DONEPROJECTTYPE,"房建工程",2);

    }
    @Test
    public static void queryTypeAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QuerySelectText(QueryScreenWallPage.ALLPROJECTTYPE,"房建工程",2);

    }
    @Test
    public static void queryBuildINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QueryText(QueryScreenWallPage.INCONDEP,"龙岩市",3);

    }
    @Test
    public static void queryBuildDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QueryText(QueryScreenWallPage.DONECONDEP,"龙岩市",3);

    }
    @Test
    public static void queryBuildAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QueryText(QueryScreenWallPage.ALLCONDEP,"龙岩市",3);

    }
    @Test
    public static void queryChangeINScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QuerySelectText(QueryScreenWallPage.INCHANGESTATUS,"草稿",8);

    }
    @Test
    public static void queryChangeDoneScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QuerySelectText(QueryScreenWallPage.DONECHANGESTATUS,"审核通过",8);

    }
    @Test
    public static void queryChangeAllScreenWall(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QuerySelectText(QueryScreenWallPage.ALLCHANGESTATUS,"草稿",8);

    }
    @Test
    public static void queryInUpdateType(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,1);
        QueryService.QuerySelectText(QueryScreenWallPage.UPDATETYPE,"幕墙登记",5);
    }
    @Test
    public static void queryDoneUpdateType(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,2);
        QueryService.QuerySelectText(QueryScreenWallPage.UPDATETYPE,"外窗登记",5);
    }
    @Test
    public static void queryAllUpdateType(){
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethodService.listData(CommonPage.MENU,3);
        QueryService.QuerySelectText(QueryScreenWallPage.UPDATETYPE,"幕墙登记",5);
    }
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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


}


