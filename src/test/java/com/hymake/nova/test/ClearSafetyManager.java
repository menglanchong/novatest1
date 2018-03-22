package com.hymake.nova.test;

import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.SafetyService;
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
    @Test
    public static void monthCheckRegist(){
        SafetyService.commonMethod(SafetyPage.SAFETYPROJECT,SafetyPage.MONTHCHECK);
        ClearService.clearTextService(SafetyPage.PROJECTNAME,"龙岩");
    }

}
