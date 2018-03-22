

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
    @Test
    public static void hole(){

        CheckService.holeCheck();

    }
    @Test
    public static void tmp(){

        CheckService.tmpCheck();

    }
    @Test
    public static void scf(){

        CheckService.scfCheck();

    }
    @Test
    public static void blst(){

        CheckService.blstCheck();

    }
    @Test
    public static void dig(){

        CheckService.digCheck();

    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


