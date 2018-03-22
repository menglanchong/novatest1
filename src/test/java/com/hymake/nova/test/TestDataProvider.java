

package com.hymake.nova.test;




/*Created by Administrator on 2017/12/21.
 *用数据驱动新增危险源
 */


import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.service.DangerSourceService;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][]{{"\\json\\jkgcdj.json", CreatDangerSourcePage.HOLEUNIT},{"\\json\\qzdz.json", CreatDangerSourcePage.HOLEUNIT}};

    }
   @Test(dataProvider = "data")
    public void creatTest(String url,By by){
       LoginTest.login();
       DangerSourceService.addDangerSource(url,by);

   }

}



