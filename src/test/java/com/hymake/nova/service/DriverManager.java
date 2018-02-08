package com.hymake.nova.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/11/13.
 */
public class DriverManager {
    public static WebDriver driver;
    /*public static WebDriver browserMethod(String browser){
        String path=System.getProperty("user.dir");
        if(browser.equals("firefox") ){
            System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }else if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }else if (browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path+"\\drivers\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }*/
}
