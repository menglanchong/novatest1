
package com.hymake.nova.test;

import com.hymake.nova.page.*;
import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2017/12/6.
 * 施工企业自评删除，建材报验删除，外窗幕墙删除
 */

public class DeleteTest {

    @Test
    public static void deleteCompany(){
        LoginTest.loginBuilder();
        CommonMethod.sleep(5000);
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.ETPEVALUE);
        CommonMethod.sleep(2000);
        DeleteService.deleteState(6,SafetyPage.TR,3);
    }
    @Test
    public static void deleteMaterial(){
        LoginTest.login();
        CommonMethod.sleep(5000);
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU, CreatMaterialReviewPage.MATERIALCHECK);
        CommonMethod.sleep(2000);
        DeleteService.deleteState(8, QueryMaterialPage.TR,4);


    }
    @Test
    public static void deleteWindow(){
        LoginTest.login();
        DeleteService.deleteDraft();
    }

   /* @Test
    public static void delete(){
       LoginTest.loginManager();
       DeleteService.deleteDraft();
    }
}*/
/*@Test
    public static void  creatTest(){
        LoginService.create();
    }*//*

   */
/* @Test
    public static void recursion(){
        TestService.digui_Test1();
    }*//*

   */
/* @Test
    public static void delete(){
        LoginTest.login();
        DeleteService.deleteSafety();
    }*//*

   */
 /* @Test
    public static void price(){
        ceshi.avgMonkey();
    }*/



   /* @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }*/

}

