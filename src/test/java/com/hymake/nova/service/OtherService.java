package com.hymake.nova.service;

import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.LoginPage;
import com.hymake.nova.page.QueryMaterialPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/11/9.
 */
public class OtherService extends CommonMethod{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);

    public static void closeWindow(){

        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(LoginPage.OUT).click();*/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    public static void tableService(){
        CommonMethod.sleep(2000);
        String text=driver.findElement(CreatMaterialReviewPage.PAGETABLE).getText();
        System.out.println(text);
    }
    public static void reCall(){
        SearchService.menuService();
        driver.findElement(QueryMaterialPage.HAVEITEM).click();
        CommonMethod.sleep(3000);

        System.out.println("结果："+driver.findElement(QueryMaterialPage.PAGETABLE).getText());
    }
}
