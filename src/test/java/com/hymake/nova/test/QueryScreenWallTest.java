/*
package com.hymake.nova.test;

import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.page.ScreenWallPage;
import com.hymake.nova.service.QueryService;
import com.hymake.nova.service.ScreenWallService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

*/
/**
 * Created by Administrator on 2017/11/15.
 *//*

public class QueryScreenWallTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void queryProjectScreenWall(){
        ScreenWallService.clickScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.PROJECTNAME,QueryScreenWallPage.QUERY,"第一医院",0);

    }
    @Test
    public static void queryProjectINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.INPROJECTNAME,QueryScreenWallPage.INQUERY,"第一医院",0);

    }
    @Test
    public static void queryProjectDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.DONEPROJECTNAME,QueryScreenWallPage.DONEQUERY,"第一医院",0);

    }
    @Test
    public static void queryProjectAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.ALLPROJECTNAME,QueryScreenWallPage.ALLQUERY,"第一医院",0);

    }
    @Test
    public static void queryCodeScreenWall(){
        ScreenWallService.clickScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.PROJECTCODE,QueryScreenWallPage.QUERY,"05977120120067",1);

    }
    @Test
    public static void queryCodeINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.INPROJECTCODE,QueryScreenWallPage.INQUERY,"05977120120067",1);

    }
    @Test
    public static void queryCodeDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.DONEPROJECTCODE,QueryScreenWallPage.DONEQUERY,"05977120120067",1);

    }
    @Test
    public static void queryCodeAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.ALLPROJECTCODE,QueryScreenWallPage.ALLQUERY,"05977120120067",1);

    }
    @Test
    public static void queryTypeScreenWall(){
        ScreenWallService.clickScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.PROJECTTYPE,"房建工程",QueryScreenWallPage.QUERY,4);


    }
    @Test
    public static void queryTypeINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.INPROJECTTYPE,"房建工程",QueryScreenWallPage.INQUERY,2);

    }
    @Test
    public static void queryTypeDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.DONEPROJECTTYPE,"房建工程",QueryScreenWallPage.DONEQUERY,2);

    }
    @Test
    public static void queryTypeAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.ALLPROJECTTYPE,"房建工程",QueryScreenWallPage.ALLQUERY,2);

    }
    @Test
    public static void queryBuildINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.INCONDEP,QueryScreenWallPage.INQUERY,"龙岩市",3);

    }
    @Test
    public static void queryBuildDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.DONECONDEP,QueryScreenWallPage.DONEQUERY,"龙岩市",3);

    }
    @Test
    public static void queryBuildAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        QueryService.lookUpText(QueryScreenWallPage.ALLCONDEP,QueryScreenWallPage.ALLQUERY,"龙岩市",3);

    }
    @Test
    public static void queryChangeINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.INCHANGESTATUS,"草稿",QueryScreenWallPage.INQUERY,8);

    }
    @Test
    public static void queryChangeDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.DONECHANGESTATUS,"审核通过",QueryScreenWallPage.DONEQUERY,8);

    }
    @Test
    public static void queryChangeAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        QueryService.lookUpSelectText(QueryScreenWallPage.ALLCHANGESTATUS,"草稿",QueryScreenWallPage.ALLQUERY,8);

    }
    @Test
    public static void queryStartINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        try {
            QueryService.lookUpSelectTime(QueryScreenWallPage.PROCESSSTARTTIME1,QueryScreenWallPage.PROCESSSTARTTIME2,
                    QueryScreenWallPage.INPROJECTNAME,QueryScreenWallPage.INQUERY,"2017-11-15","2017-11-25",6);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    @Test
    public static void queryStartDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        try {
            QueryService.lookUpSelectTime(QueryScreenWallPage.DONEPROCESSSTARTTIME1,QueryScreenWallPage.DONEPROCESSSTARTTIME2,
                    QueryScreenWallPage.DONEPROJECTNAME,QueryScreenWallPage.DONEQUERY,"2017-11-15","2017-11-25",6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void queryStartAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        try {
            QueryService.lookUpSelectTime(QueryScreenWallPage.ALLPROCESSSTARTTIME1,QueryScreenWallPage.ALLPROCESSSTARTTIME2,
                    QueryScreenWallPage.ALLPROJECTNAME,QueryScreenWallPage.ALLQUERY,"2017-11-15","2017-11-25",6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void queryEndINScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        try {
            QueryService.lookUpSelectTime(QueryScreenWallPage.PROCESSENDTIME1,QueryScreenWallPage.PROCESSENDTIME2,
                    QueryScreenWallPage.INPROJECTNAME,QueryScreenWallPage.INQUERY,"2017-11-15","2017-11-25",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    @Test
    public static void queryEndDoneScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickDoneScreenWall();
        try {
            QueryService.lookUpSelectTime(QueryScreenWallPage.DONEPROCESSENDTIME1,QueryScreenWallPage.DONEPROCESSENDTIME2,
                    QueryScreenWallPage.DONEPROJECTNAME,QueryScreenWallPage.DONEQUERY,"2017-11-15","2017-11-25",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void queryEndAllScreenWall(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickAllScreenWall();
        try {
            QueryService.lookUpSelectTime(QueryScreenWallPage.ALLPROCESSENDTIME1,QueryScreenWallPage.ALLPROCESSENDTIME2,
                    QueryScreenWallPage.ALLPROJECTNAME,QueryScreenWallPage.ALLQUERY,"2017-11-15","2017-11-25",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
*/
