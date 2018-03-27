package com.hymake.nova.test;

import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.DangerSourceService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

/**
 * Created by Administrator on 2018/3/20.
 * 项目经理校验危险源查询功能
 */
public class QueryDangerSource {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }


    @Test(description = "危险源在办项目负责人查询")
    public static void inDangerSource(){

        DangerSourceService.dangerSourceMenu(1);

        QueryService.lookUpText(DangerSourcePage.PROJECTLEADER, DangerSourcePage.INQUERYBOX,"fds",5);
    }


    @Test(description = "在办事项流程开始时间查询")
    public static void timeInTest(){

        DangerSourceService.dangerSourceMenu(1);
        try {
            QueryService.QuerySelectTime("2018-03-05","2018-03-08",DangerSourcePage.JNAME,7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

/*try {
            QueryService.lookUpSelectTime(IsDangerSourcePage.DIGPLANTIME, IsDangerSourcePage.DIGREALTIME, DangerSourcePage.HAVEPROJECT,
                    DangerSourcePage.HAVEQUERYBOX,"2017-11-06","2017-11-08",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

    }
    @Test(description = "危险源在办事项危险性查询")
    public static void dangerInTest(){

        DangerSourceService.dangerSourceMenu(1);
        QueryService.lookUpSelectText(DangerSourcePage.DANGERTYPE,"危险性较大", DangerSourcePage.INQUERYBOX,2);
    }
    @Test(description = "危险源项目列表项目名称查询")
    public static void queryProjectListTest(){

        DangerSourceService.dangerSourceMenu(0);
        QueryService.lookUpText(DangerSourcePage.QUERYBOX, DangerSourcePage.PROJECTQUERY,"龙岩市",0);
    }

    @Test(description = "危险源已办事项项目名称查询")
    public static void alreadyProjectTest(){

        DangerSourceService.dangerSourceMenu(2);
        QueryService.lookUpText(DangerSourcePage.HAVEPROJECT, DangerSourcePage.HAVEQUERYBOX,"第一医院",0);
    }
    @Test(description = "危险源已办变更状态查询")
    public static void lookChangeTest(){

        DangerSourceService.dangerSourceMenu(2);
        QueryService.lookUpSelectText(DangerSourcePage.HAVECHANGE,"审核中", DangerSourcePage.HAVEQUERYBOX,9);
    }
    @Test(description = "危险源已办项目负责人查询")
    public static void lookPersonTest(){

        DangerSourceService.dangerSourceMenu(2);
        QueryService.lookUpText(DangerSourcePage.HAVEPROJECTLEADER, DangerSourcePage.HAVEQUERYBOX,"欧阳",6);
    }
    @Test(description = "危险源已办事项危险性查询")
    public static void lookDangerTest(){

        DangerSourceService.dangerSourceMenu(2);
        QueryService.lookUpSelectText(DangerSourcePage.HAVEDANGER,"危险性较大", DangerSourcePage.HAVEQUERYBOX,3);
    }
    @Test(description = "危险源已办事项危险源查询")
    public static void lookDangerSourceTest(){

        DangerSourceService.dangerSourceMenu(2);
        QueryService.lookUpSelectText(DangerSourcePage.HAVEDANGERSOURCE,"爆破工程", DangerSourcePage.HAVEQUERYBOX,2);
    }
    @Test(description = "危险源所有事项流程开始时间查询")
    public static void timeAllTest(){

        DangerSourceService.dangerSourceMenu(3);
        try {
            QueryService.lookUpSelectTime(DangerSourcePage.ALLSTARTTIME, DangerSourcePage.ALLSTARTIME2, DangerSourcePage.ALLPROJECTNAME,
                    DangerSourcePage.ALLQUERYBOX,"2018-03-06","2018-03-08",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test(description = "危险源所有事项项目名称查询")
    public static void lookAllProjectTest(){

        DangerSourceService.dangerSourceMenu(3);
        QueryService.lookUpText(DangerSourcePage.ALLPROJECTNAME, DangerSourcePage.ALLQUERYBOX,"龙岩市",0);
    }
    @Test(description = "危险源所有事项变更状态查询")
    public static void lookAllChangeTest(){

        DangerSourceService.dangerSourceMenu(3);
        QueryService.lookUpSelectText(DangerSourcePage.ALLCHANGE,"审核中", DangerSourcePage.ALLQUERYBOX,9);
    }
    @Test(description = "危险源所有事项项目负责人查询")
    public static void lookAllPersonTest(){

        DangerSourceService.dangerSourceMenu(3);
        QueryService.lookUpText(DangerSourcePage.ALLPROJECTLEADER, DangerSourcePage.ALLQUERYBOX,"负责人",6);
    }
    @Test(description = "危险源所有事项危险性查询")
    public static void lookAllDangerTest(){

        DangerSourceService.dangerSourceMenu(3);
        QueryService.lookUpSelectText(DangerSourcePage.ALLDANGER, "危险性较大",DangerSourcePage.ALLQUERYBOX,3);
    }
    @Test(description = "危险源所有事项危险源查询")
    public static void lookAllDangerSourceTest(){

        DangerSourceService.dangerSourceMenu(3);
        QueryService.lookUpSelectText(DangerSourcePage.ALLDANGERSOURCE,"爆破工程", DangerSourcePage.ALLQUERYBOX,2);
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }
}
