

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
 * 项目经理施工安全考评查询
 * */


public class QuerySafetyManagerTest extends CommonMethod{

    @Test(description = "项目月自评项目查询")
    public static void ProjectNameTest(){
        LoginTest.login();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"龙岩",0);
    }
    @Test(description = "项目月自评状态查询")
    public static void StateTest(){
        LoginTest.login();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QuerySelectText(SafetyPage.STATE,"已登记",8);
    }
    @Test(description = "项目月自评年份查询")
    public static void YearTest(){
        LoginTest.login();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QueryText(SafetyPage.CURYEAR,"2015",2);

    }
    @Test(description = "项目月自评月份查询")
    public static void MonthTest(){
        LoginTest.login();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        QueryService.QuerySelectText(SafetyPage.CURMONTH,"6",3);

    }
    @Test(description = "项目考评申请填报项目查询")
    public static void ProjectReviewTest(){
        LoginTest.loginManagerSafety();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"建阳",0);

    }
    @Test(description = "项目考评申请填报状态查询")
    public static void OpStateTest(){
        LoginTest.loginManagerSafety();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONECHECK);
        QueryService.QuerySelectText(SafetyPage.OPSTATE,"终审通过",4);
    }
    @Test(description = "项目考评结果公示书期限查询")
    public static void TimeTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        try {
            QueryService.QuerySelectTime("2017-12-28","2017-12-29",SafetyPage.PROJECTNAME,5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test(description = "项目考评结果公示书地市查询")
    public static void AreaTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",2);
    }
    @Test(description = "项目考评结果公示书考评结果查询")
    public static void ResultTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QuerySelectText(SafetyPage.RESULT,"合格",4);

    }
    @Test(description = "项目考评结果公示书施工企业查询")
    public static void CountTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",3);

    }
    @Test(description = "项目考评结果公示书编号查询")
    public static void NumTest(){
        LoginTest.loginManagerNotice();

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        QueryService.QueryText(SafetyPage.PUBLICKNUM,"12",0);

    }
    @Test(description = "项目考评结果告知书项目查询")
    public static void ObjectTestProj(){
        LoginTest.loginManagerNotice();

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"高林",1);
    }
    @Test(description = "项目考评结果告知书考评结果查询")
    public static void ObjectTestResult(){
        LoginTest.loginManagerNotice();

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        QueryService.QuerySelectText(SafetyPage.RESULT,"合格",4);
    }
    @Test(description = "项目考评异议核实项目查询")
    public static void ObjectTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"项目",0);
    }
    @Test(description = "项目考评异议复核项目查询")
    public static void ObjectCheckTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage. OBJECTRECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"项目",0);
    }
    @Test(description = "撤销项目考评结果公示书项目查询")
    public static void RevokeTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);

    }
    @Test(description = "撤销项目考评结果公示书状态查询")
    public static void RevokeStateTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECK);
        QueryService.QuerySelectText(SafetyPage.AUDITSTATUS,"复核中",5);

    }
    @Test(description = "撤销项目考评结果告知书项目查询")
    public static void RevokeCheckTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECKRESQUERY);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);

    }
    @Test(description = "撤销项目考评结果告知书状态查询")
    public static void RevokeCheckStateTest(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECKRESQUERY);
        QueryService.QuerySelectText(SafetyPage.AUDITSTATUS,"复核中",5);

    }
    @Test(description = "省级优良项目创建工程汇总表项目查询")
    public static void goodCheckProj(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"东方",0);

    }
    @Test(description = "省级优良项目创建工程汇总表考评结果查询")
    public static void goodCheckState(){
        LoginTest.loginManagerNotice();
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);
        QueryService.QueryText(SafetyPage.FINALRESULT,"合格",14);

    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


