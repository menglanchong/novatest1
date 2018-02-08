package com.hymake.nova.service;



import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import static com.hymake.nova.service.CommonMethod.driver;

/**
 * Created by Administrator on 2017/11/15.
 */
public class Listener extends TestListenerAdapter{
    private static Logger logger= Logger.getLogger(ScreenWallService.class);
    @Override
    public void onTestFailure(ITestResult tr){

        //CreateElementScreenshot.takeScreenshotByName(driver);
        String pictureName = CreateElementScreenshot.errorScreenshot(driver,"D:\\logs\\",".jpg");
        String name=tr.getMethod().getMethodName();
        Reporter.log("出错方法名称："+name+"  错误位置截图存放位置：<a href=\"d:\\logs\\"+pictureName+"\" target=\"_blank\">D:\\logs\\</a>");
        logger.error("出现错误："+name);
        System.out.println("打印出错："+name);
    }

}
