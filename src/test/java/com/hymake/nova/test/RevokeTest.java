package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.ScreenWallPage;
import com.hymake.nova.service.CommonMethod;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.DeleteService;
import com.hymake.nova.service.RevokeServices;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/3/7.
 * 外窗和幕墙撤回功能校验，建材报验撤回
 */

public class RevokeTest {
    @Test
    public static void dangersourcesRevoke(){
        LoginTest.login();
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERREGISTER);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        RevokeServices.revokeServices(1,1);

    }
    @Test
    public static void screenWallRevoke(){
        LoginTest.loginManager();
        CommonMethodService.Manage(ScreenWallPage.WALLREGISTER);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,2);
        RevokeServices.revokeServices(3,1);
    }
    /*@Test
    public static  void dangerRelieve(){
        LoginTest.login();
        CommonMethodService.projectManage(DangerSourcePage.DANGERM,DangerSourcePage.DANGERQR);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,2);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,5);
    }*/
    @Test
    public static void materialRevoke(){
        LoginTest.login();
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU, CreatMaterialReviewPage.MATERIALCHECK);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.MENU,1);
        CommonMethod.sleep(2000);
        DeleteService.deleteState(8,CreatMaterialReviewPage.REVOKE,2);

    }
}
