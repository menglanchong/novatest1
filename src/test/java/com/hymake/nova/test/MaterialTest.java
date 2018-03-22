

package com.hymake.nova.test;

import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.QueryMaterialPage;
import com.hymake.nova.service.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;



/*
 * Created by Administrator on 2017/12/14.
 * 主要材料报审新增和查询
 * */


public class MaterialTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
        CommonMethodService.projectManage(CreatMaterialReviewPage.REPORTMENU,CreatMaterialReviewPage.MATERIALCHECK);
        CommonMethod.sleep(4000);
    }
    @Test
    public static void createMaterial() {

        CreateMaterialService.createMaterial();
    }
    @Test
    public static void querySelectTime(){

        try {
            CommonMethodService.lookUpSelectTime(0,1,"2017-12-14","2017-12-18",4);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }





 @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }


}


