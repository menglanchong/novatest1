
package com.hymake.nova.test;


import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.CommonMethod;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import com.hymake.nova.service.SafetyService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.List;


/*
 * Created by Administrator on 2018/1/4.
 * */



public class SafetyManagerTest extends CommonMethod{
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void ProjectNameTest(){


        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"龙岩",0);
    }
    @Test
    public static void StateTest(){


        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QuerySelectText(SafetyPage.STATE,"已登记",8);
    }
    @Test
    public static void YearTest(){


        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QueryText(SafetyPage.CURYEAR,"2015",2);

    }
    @Test
    public static void MonthTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QuerySelectText(SafetyPage.CURMONTH,"6",3);

    }
    @Test
    public static void ProjectReviewTest(){


        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"龙岩",0);

    }
    @Test
    public static void OpStateTest(){


        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONECHECK);
        QueryService.QuerySelectText(SafetyPage.OPSTATE,"未登记",4);
    }
    @Test
    public static void TimeTest(){


        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        try {
            QueryService.QuerySelectTime("2017-12-28","2017-12-29",SafetyPage.PROJECTNAME,5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void AreaTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",2);
    }
    @Test
    public static void ResultTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QuerySelectText(SafetyPage.RESULT,"合格",2);

    }
    @Test
    public static void CountTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",3);

    }
    @Test
    public static void NumTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QueryText(SafetyPage.PUBLICKNUM,"12",0);

    }
    @Test
    public static void ObjectTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"项目",0);
    }
    @Test
    public static void ObjectCheckTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage. OBJECTRECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"项目",0);
    }
    @Test
    public static void RevokeTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);

    }
    @Test
    public static void RevokeStateTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECK);
        QueryService.QuerySelectText(SafetyPage.AUDITSTATUS,"复核中",5);

    }
    @Test
    public static void RevokeCheckTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECKRESQUERY);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);

    }
    @Test
    public static void RevokeCheckStateTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECKRESQUERY);
        QueryService.QuerySelectText(SafetyPage.AUDITSTATUS,"复核中",5);

    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}

