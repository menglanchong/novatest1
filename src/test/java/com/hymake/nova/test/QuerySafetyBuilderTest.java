

package com.hymake.nova.test;

import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import com.hymake.nova.service.SafetyService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.text.ParseException;


  /*Created by Administrator on 2018/1/9.
  *施工单位施工安全考评查询
   */


public class QuerySafetyBuilderTest {
    @BeforeMethod
    public static void before(){
        LoginTest.loginBuilder();
    }
    @Test
    public static void QuarterCheck(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.QUARTERCHECK);
        QueryService.QuerySelectText(SafetyPage.QUARTER,"一季度",3);

    }
    @Test
    public static void QuarterProjectTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.QUARTERCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"厦门",0);
    }
    @Test
    public static void QuarterYearTest() {
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.QUARTERCHECK);
        QueryService.QueryText(SafetyPage.CURYEAR, "2015", 2);
    }
    @Test
    public static void QuarterStateTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.QUARTERCHECK);
        QueryService.QueryText(SafetyPage.OPSTATE,"未登记",8);
    }
    @Test
    public static void MonthQueryTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.MONTHCHECKQUERY);
        QueryService.QueryText(SafetyPage.CURYEAR,"2016",4);
    }
    @Test
    public static void ProjectNameTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"龙岩",0);
    }
    @Test
    public static void StateTest(){

        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.STATE,"已登记",8);
    }
    @Test
    public static void OverdueTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.OVERDUE,"已逾期",9);

    }
    @Test
    public static void YearTest() {
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.MONTHCHECKQUERY);
        QueryService.QueryText(SafetyPage.CURYEAR, "2015", 4);
    }
    @Test
    public static void ResultTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT, SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.EVALRESULT,"合格",7);

    }
    @Test
    public static void MonthTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        QueryService.QuerySelectText(SafetyPage.CURMONTH,"6",5);

    }
    @Test
    public static void buildTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.CHECKPROJECT);
        QueryService.QueryText(SafetyPage.BUILDUNIT,"华侨大学",12);
    }
    @Test
    public static void SuperTest(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.CHECKPROJECT);
        QueryService.QueryText(SafetyPage.SUPERVISOR,"协诚工程",10);
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
    public static void ProjectResultTest(){

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
    public static void DoneResult(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTCHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);
    }
    @Test
    public static void DissResult(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTRECHECK);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"工程",0);
    }
    @Test
    public static void companyCheckTest(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATION);
        QueryService.QuerySelectText(SafetyPage.CERSTATE,"已登记",6);
    }
    @Test
    public static void companyCheckQueryTest(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QueryText(SafetyPage.UNITNAME,"厦门",0);
    }
    @Test
    public static void unitQueryTest(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.UNITSTATE,"省外入闽企业",5);
    }
    @Test
    public static void areaQueryTest(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",6);
    }
    @Test
    public static void compCheckTest(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.CERSTATE,"已登记",7);
    }
    @Test
    public static void finalResult(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.EVALUATIONQUERY);
        QueryService.QuerySelectText(SafetyPage.FINALRESULT,"合格",10);
    }
    @Test
    public static void countNotice(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",1);
    }
    @Test
    public static void noticeArea(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",3);
    }
    @Test
    public static void noticeNum(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QueryText(SafetyPage.PUBLICKNUM,"18",0);
    }
    @Test
    public static  void noticeSaftyLicens(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.PUBLICKNOTICE);
        QueryService.QueryText(SafetyPage.LICENSENNUMBER,"34",0);
    }
    @Test
    public static void informCount(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",1);
    }
    @Test
    public static void informArea(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QuerySelectText(SafetyPage.AREA,"厦门市",3);
    }
    @Test
    public static void informNum(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QueryText(SafetyPage.LICENSENNUMBER,"18",0);
    }
    @Test
    public static void informSaftyLicens(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.RESULENOTICE);
        QueryService.QueryText(SafetyPage.LICENSENNUMBER,"34",0);
    }
    @Test
    public static void dissCount(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.DISSENTREVIEW);
        QueryService.QueryText(SafetyPage.CONUNIT,"工程",0);
    }
    @Test
    public static void revokeCount(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REVOKERESULT);
        QueryService.QueryText(SafetyPage.CONUNIT,"六建",0);
    }
    @Test
    public static void revokeState(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REVOKEPUBLIC);
        QueryService.QuerySelectText(SafetyPage.AUDITSTATUS,"核实中",4);
    }
    @Test
    public static void realpplyCount(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REAPPLYQUERY);
        QueryService.QueryText(SafetyPage.CONUNIT,"厦门",0);
    }
    @Test
    public static void realpplyArea(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REAPPLYQUERY);
        QueryService.QuerySelectText(SafetyPage.AREA,"福州市",4);
    }
    @Test
    public static void realpplyLicens(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.REAPPLYQUERY);
        QueryService.QueryText(SafetyPage.LICENSENUM,"000",1);
    }
    @Test
    public static void applicationUndeclared(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODDECLARE);
        QueryService.QueryText(SafetyPage.PROJECTNAME2,"厦门",0);


    }
    @Test
    public static void applicationSum(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);
        QueryService.QueryText(SafetyPage.PROJECTNAME,"稀土",0);

    }
    @Test
    public static void applicationPrpjstate(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);


    }
@AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


