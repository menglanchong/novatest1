

package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.*;
import org.testng.annotations.*;



/**
 * Created by Administrator on 2017/11/9.
 * 校验危险源登记页面必填项
 */

public class CheckTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethodService.listData(CommonPage.BUTTON,1);
        //DangerSourceService.dangerSourceToProject();

    }
    @Test(description = "基坑工程必填校验")
    public static void hole(){

        CheckService.holeCheck();

    }
    @Test(description = "模板工程及支撑体系必填校验")
    public static void tmp(){

        CheckService.tmpCheck();

    }
    @Test(description = "脚手架工程必填校验")
    public static void scf(){

        CheckService.scfCheck();

    }
    @Test(description = "爆破工程必填校验")
    public static void blst(){

        CheckService.blstCheck();

    }
    @Test(description = "地下暗挖必填校验")
    public static void dig(){

        CheckService.digCheck();

    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


