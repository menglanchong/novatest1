package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import org.testng.Assert;

/**
 * Created by Administrator on 2018/3/7.
 * 撤回方法
 */
public class RevokeServices {
    public static void revokeServices(int num,int num2){
        CommonMethod.sleep(2000);
        int t1= CommonMethod.count(DangerSourcePage.COUNT);
        CommonMethodService.listData(CommonPage.TR,0);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.BUTTON,num);
        CommonMethod.sleep(2000);
        CommonMethodService.listData(CommonPage.PROMPT,num2);
        CommonMethod.sleep(2000);
        int t=CommonMethod.count(DangerSourcePage.COUNT);
        Assert.assertEquals(t,t1-1);
    }
}
