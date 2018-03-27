
package com.hymake.nova.test;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.service.CommonMethod;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.OtherService;
import com.hymake.nova.service.QueryService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2018/2/8.
 * 校验建材报验公示平台查询功能
 */


public class QueryMaterialPlatform {
    @BeforeMethod
    public static void before(){

        LoginTest.login();
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.PLSTFORM);
        CommonMethod.winTest();
    }

    @Test(description = "建材报验公示平台项目名称和建设单位查询")
    public static void queryJsUnit(){

        QueryService.multipeService("龙岩",2,"医院",2);

    }
    @Test(description = "建材报验公示平台项目名称和施工单位查询")
    public static void querySgUnit(){

        QueryService.multipeService("龙岩",3,"福建",3);

    }
    @Test(description = "建材报验公示平台项目名称和监理单位查询")
    public static void queryJUnit(){

        QueryService.multipeService("龙岩",4,"厦门",4);

    }
    @Test(description = "建材报验公示平台项目名称和类型查询")
    public static void queryStytle(){

        QueryService.multipeStytleService("龙岩","建设工程主要材料报审表",1);
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }
}

