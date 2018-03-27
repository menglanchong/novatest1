package com.hymake.nova.test;

import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.SafetyService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/3/21.
 */
public class ClearSafetyManager {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test(description = "项目月自评项目清空")
    public static void monthCheckRegist(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"龙岩");
    }
    @Test(description = "项目月自评状态清空")
    public static void monthCheckState(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        ClearService.clearSelectChangeValue(SafetyPage.STATE,"未登记");
    }
    @Test(description = "项目月自评清空")
    public static void doneCheckRegist(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONECHECK);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"龙岩");
    }
    @Test(description = "项目月自评清空")
    public static void doneCheckState(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONECHECK);
        ClearService.clearSelectChangeValue(SafetyPage.OPSTATE,"未登记");
    }
    @Test(description = "项目月自评查询项目清空")
    public static void monthQueryCheckRegist(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"龙岩");
    }
    @Test(description = "项目月自评查询逾期清空")
    public static void monthQueryCheckOver(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECKQUERY);
        ClearService.clearSelectChangeValue(SafetyPage.OVERDUE,"未逾期");
    }
    @Test(description = "项目考评结果公示书项目清空")
    public static void resultCheckProj(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"厦门");
    }
    @Test(description = "项目考评结果公示书考评结果清空")
    public static void resultCheckResult(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULT);
        ClearService.clearSelectChangeValue(SafetyPage.RESULT,"合格");
    }
    @Test(description = "项目考评结果告知书项目清空")
    public static void resultInformCheckProj(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"厦门");
    }
    @Test(description = "项目考评结果告知书考评结果清空")
    public static void resultInformCheckResult(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.DONERESULTINFORM);
        ClearService.clearSelectChangeValue(SafetyPage.RESULT,"合格");
    }
    @Test(description = "项目考评异议核实项目名称清空")
    public static void objectCheckProj(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTCHECK);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"项目");
    }
    @Test(description = "项目考评异议复核项目名称清空")
    public static void objectReCheckProj(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.OBJECTRECHECK);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"项目");
    }
    @Test(description = "撤销项目考评结果公示书项目名称清空")
    public static void revokeReCheckProj(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECK);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"项目");
    }
    @Test(description = "撤销项目考评结果公示书状态清空")
    public static void revokeReCheckState(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECK);
        ClearService.clearSelectChangeValue(SafetyPage.AUDITSTATUS,"核实中");
    }
    @Test(description = "撤销项目考评结果告知书项目名称清空")
    public static void revokeCheckQueryProj(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECKRESQUERY);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"项目");
    }
    @Test(description = "撤销项目考评结果告知书状态清空")
    public static void revokeCheckQuery(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.REVOKECHECKRESQUERY);
        ClearService.clearSelectChangeValue(SafetyPage.AUDITSTATUS,"复核中");
    }
    @Test(description = "撤销项目考评结果告知书项目名称清空")
    public static void goodCheckProj(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"项目");
    }
    @Test(description = "撤销项目考评结果告知书状态清空")
    public static void goodCheck(){
        SafetyService.commonMethod3(SafetyPage.GOODPROJECT,SafetyPage.PROVINCE,SafetyPage.GOODSUM);
        ClearService.clearSelectChangeValue(SafetyPage.ISQX,"已取消");
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }

}
