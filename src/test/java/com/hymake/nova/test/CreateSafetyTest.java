

package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/*
 * Created by Administrator on 2017/10/23.
 * */





public class CreateSafetyTest {
    @BeforeMethod
    public static void before(){
        LoginTest.loginBuilder();

    }

   @Test
    public static void createSafety(){
       SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.ETPEVALUE);
       CommonMethod.sleep(2000);
       DeleteService.deleteState(6,SafetyPage.TR,3);
       CreateService.addSafety("\\json\\safety.json",7);
    }
    @Test
    public static void createSatetyInformation(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.IMFORMATION);
        CommonMethod.sleep(2000);
        DeleteService.deleteState(6,SafetyPage.TR1,2);
        CreateService.addSafetyInformation("\\json\\Safetyinformation.json",3);


    }


    @Test
    public static void  getTrText(){
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERQR);
        CommonMethod.sleep(2000);
        CommonMethodService.trList();
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }
}


