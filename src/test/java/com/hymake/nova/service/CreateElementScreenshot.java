package com.hymake.nova.service;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.WrapsDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/15.
 */
public class CreateElementScreenshot extends CommonMethod{
    private static org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(ScreenWallService.class);
    //public static WebDriver driver= DriverManager.getDriver();

    public static String getCurrentSystemTime() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH点mm分ss秒");
        String time = dateFormat.format(now);
        return(time);
    }
    public static void takeScreenshotByName(WebDriver driver) {
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String imageName = df.format(calendar.getTime());
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String file = "C:\\Users\\user\\Desktop\\"+imageName+".png";
        try {
            FileUtils.copyFile(srcFile,new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String  errorScreenshot(WebDriver driver,String path,String pictureFormat){
        String systemTime = CreateElementScreenshot.getCurrentSystemTime();
        String pictureName = systemTime + pictureFormat ;
        File  jpg = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(jpg, new File(path + pictureName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pictureName;
    }

}
