

package com.hymake.nova.test;

import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import com.hymake.nova.service.SafetyService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.text.ParseException;


  /*Created by Administrator on 2018/1/9.
  *施工单位施工安全考评查询
   */


public class QuerySafetyBuilderTest {


    @Test(description = "项目季度自评季度查询")
    public static void QuarterCheck(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.QUARTERCHECK);
        QueryService.QuerySelectText(SafetyPage.QUARTER,"一季度",3);

    }
    @Test(description = "项目季度自评项目查询")
    public static void QuarterProjectTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.QUARTERCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"天马",0);
    }
    @Test(description = "项目季度自评年份查询")
    public static void QuarterYearTest() {
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.QUARTERCHECK);
        QueryService.QueryText(SafetyPage.CURYEAR, "2017", 2);
    }
    @Test(description = "项目季度自评状态查询")
    public static void QuarterStateTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.QUARTERCHECK);
        QueryService.QueryText(SafetyPage.OPSTATE,"未登记",8);
    }
    @Test(description = "项目月自评查询年份")
    public static void MonthQueryTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.MONTHCHECKQUERY);
        QueryService.QueryText(SafetyPage.CURYEAR,"2018",4);
    }
    @Test(description = "项目月自评查询项目名称")
    public static void ProjectNameTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"国贸",0);
    }
    @Test(description = "项目月自评查询状态")
    public static void StateTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.STATE,"已登记",8);
    }
    @Test(description = "项目月自评查询逾期状态")
    public static void OverdueTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.OVERDUE,"已逾期",9);

    }

    @Test(description = "项目月自评查询合格结果")
    public static void ResultTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.EVALRESULT,"不合格",7);

    }
    @Test(description = "项目月自评查询月份")
    public static void MonthTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.CURMONTH,"3",5);

    }
    @Test(description = "项目考评查询建设单位")
    public static void buildTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.CHECKPROJECT);
        QueryService.QueryText(SafetyPage.BUILDUNIT,"厦门国贸",12);
    }
    @Test(description = "项目考评查询监理单位")
    public static void SuperTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.CHECKPROJECT);
        QueryService.QueryText(SafetyPage.SUPERVISOR,"协诚工程",10);
    }
    @Test(description = "项目考评结果公示书公示期限查询")
    public static void TimeTest(){
        LoginTest.loginBuilder();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        try {
            QueryService.QuerySelectTime("2017-12-28","2017-12-29",SafetyPage.PROJECTNAME,5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test(description = "项目考评结果告知书地市查询")
    public static void AreaTest(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",2);
    }
    @Test(description = "项目考评结果告知书考评结果查询")
    public static void ProjectResultTest(){
        LoginTest.loginBuildProj();

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        QueryService.QuerySelectText(SafetyPage.RESULT,"合格",4);

    }
    @Test(description = "项目考评结果告知书施工单位查询")
    public static void CountTest(){
        LoginTest.loginBuildProj();

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",3);

    }
    @Test(description = "项目考评结果告知书编号查询")
    public static void NumTest(){
        LoginTest.loginBuildProj();

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        QueryService.QueryText(SafetyPage.PUBLICKNUM,"44",0);

    }
    @Test(description = "项目考评异议核实项目查询")
    public static void DoneResult(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);
    }
    @Test(description = "项目考评异议复核项目查询")
    public static void DissResult(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTRECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);
    }
    @Test(description = "施工企业考评申请状态查询")
    public static void companyCheckTest(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATION);
        QueryService.QuerySelectText(SafetyPage.CERSTATE,"审核通过",6);
    }
    @Test(description = "施工企业考评施工企业查询")
    public static void companyCheckQueryTest(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QueryText(SafetyPage.UNITNAME,"福建",0);
    }
    @Test(description = "施工企业考评企业类别查询")
    public static void unitQueryTest(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.UNITSTATE,"省内其他企业",5);
    }
    @Test(description = "施工企业考评地市查询")
    public static void areaQueryTest(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",6);
    }
    @Test(description = "施工企业考评状态查询")
    public static void compCheckTest(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.CERSTATE,"审核通过",7);
    }
    @Test(description = "施工企业考评结果查询")
    public static void finalResult(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.FINALRESULT,"合格",10);
    }
    @Test(description = "施工企业考评结果告知书施工企业查询")
    public static void countNotice(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QueryText(SafetyPage.CONUNIT,"福建",1);
    }
    @Test(description = "施工企业考评结果告知书地市查询")
    public static void noticeArea(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",3);
    }
    @Test(description = "施工企业考评结果告知书编号查询")
    public static void noticeNum(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QueryText(SafetyPage.PUBLICKNUM,"18",0);
    }
    @Test(description = "施工企业考评结果告知书许可证号查询")
    public static  void noticeSaftyLicens(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QueryText(SafetyPage.LICENSENNUMBER,"证字",4);
    }
    @Test(description = "施工企业考评结果公示书施工企业查询")
    public static void informCount(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",1);
    }
    @Test(description = "施工企业考评结果公示书地市查询")
    public static void informArea(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",3);
    }
    @Test(description = "施工企业考评结果公示书编号查询")
    public static void informNum(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QueryText(SafetyPage.PUBLICKNUM,"18",0);
    }
    @Test(description = "施工企业考评结果公示书许可证查询")
    public static void informSaftyLicens(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QueryText(SafetyPage.LICENSENNUMBER,"34",0);
    }
    @Test(description = "施工企业考评异议复核施工企业查询")
    public static void dissCount(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.DISSENTREVIEW);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",0);
    }
    @Test(description = "撤销企业考评结果查询施工企业查询")
    public static void revokeCount(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REVOKERESULT);
        QueryService.QueryText(SafetyPage.CONUNIT,"六建",0);
    }
    @Test(description = "撤销企业考评结果公示书审核状态查询")
    public static void revokeState(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REVOKEPUBLIC);
        QueryService.QuerySelectText(SafetyPage.AUDITSTATUS,"核实中",4);
    }
    @Test(description = "重新申请安全生产标准化考评企业考评查询")
    public static void realpplyCount(){
        LoginTest.loginBuildProj();
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REAPPLYQUERY);
        QueryService.QueryText(SafetyPage.CONUNIT,"厦门",0);
    }
    @Test(description = "重新申请安全生产标准化考评地市查询")
    public static void realpplyArea(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REAPPLYQUERY);
        QueryService.QuerySelectText(SafetyPage.AREA,"福州市",4);
    }
    @Test(description = "重新申请安全生产标准化考评许可证查询")
    public static void realpplyLicens(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REAPPLYQUERY);
        QueryService.QueryText(SafetyPage.LICENSENUM,"000",1);
    }
    @Test(description = "省级优良项目申报登记项目查询")
    public static void applicationUndeclared(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODDECLARE);
        QueryService.QueryText(SafetyPage.PROJECTNAME2,"厦门",0);


    }
    @Test(description = "省级优良项目创建工程汇总表项目查询")
    public static void applicationSum(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"稀土",0);

    }
    @Test(description = "省级优良项目创建工程汇总表项目查询")
    public static void applicationPrpjstate(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);


    }
    @AfterMethod
        public static void after(){
            OtherService.closeWindow();
        }


}


