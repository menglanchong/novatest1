package com.hymake.nova.service;


import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.DangerSourcePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/10/16.
 */
public class CommonMethod {
    private static Logger logger= Logger.getLogger(ScreenWallService.class);

    public static WebDriver driver;
    public static void browserMethod(String browser){
        String path=System.getProperty("user.dir");
        if(browser.equals("firefox") ){
            System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }else if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
            /*
//        设置为 headless 模式 （必须）
            chromeOptions.addArguments("--headless");
//        设置浏览器窗口打开大小  （非必须）
           // chromeOptions.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver(chromeOptions);*/
          // ChromeOptions chromeOptions = new ChromeOptions();
          // chromeOptions.setBinary("C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");

            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }else if (browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path+"\\drivers\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        System.out.println(path);

    }

    public static void  winTest() {

        String hadle = driver.getWindowHandle();
        for (String hadles : driver.getWindowHandles()) {
            if (hadles.equals(hadle)) {
                continue;
            }
            driver.switchTo().window(hadles);

        }

    }

    public static void ifrTest(By frame){
        WebElement fran=driver.findElement(frame);
        driver.switchTo().frame(fran);

    }

    public static void sfIfr(){

        driver.switchTo().defaultContent();
    }

    public static  void  alterMethod(){
        try {
            Thread.sleep(8000);
        }catch (Exception e){

        }

        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    public static  void  confirmMethod(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    public static  void  promptMethod(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

        Alert prompt=driver.switchTo().alert();
        prompt.accept();
    }

    public static  void  promptMethod1(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

        Alert prompt=driver.switchTo().alert();
        prompt.dismiss();
    }
    public static  void actionMethod(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public static void actionUp(){
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.UP);
        actions.sendKeys(Keys.ENTER);
    }
    public static  void selectIndex(By a,int b){
        WebElement element=driver.findElement(a);
        Select select=new Select(element);
        select.selectByIndex(b);


    }
    public static  void selectMethod(By a,String b){
        WebElement element=driver.findElement(a);
        Select select=new Select(element);
        select.selectByValue(b);


    }
    public static void selectValueMethod(By a,String b){
        WebElement element=driver.findElement(a);
        Select select=new Select(element);
        select.selectByVisibleText(b);
    }

    public static  void assertEquals(Object actual, Object expected){
        Assert.assertEquals(actual,expected);

    }
    public static void actionKey(){
        Actions action = new Actions(driver);

        action.keyDown(Keys.ALT).keyDown(Keys.F1).keyUp(Keys.ALT).perform();
    }
    public static String tableCell(WebDriver driver,int row, int column)
    {
        String text = null;

        String xpath="//*[@classname='el-table__body']/tbody/tr["+row+"]/td["+column+"]";
        WebElement table=driver.findElement(By.xpath(xpath)); //*[@id="table138"]/tbody/tr[1]/td[1]/strong
        text=table.getText();
        return text;


    }
    public static void totalTable() {

        System.out.print(driver.findElement(DangerSourcePage.COUNT).getText());
    }
    public static void sendText(By te,String text){
        WebElement sendt=driver.findElement(te);
        sendt.clear();
        sendt.sendKeys(text);

    }
    public static void sleep(int second){
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitDriver(By element){
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(element));

    }
    public static void timeOut(int second){
        driver.manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);
    }
//    public static int totalT(String u,String jk){
//        try {
//            DefaultHttpClient Client = new DefaultHttpClient();
//            String url = "http://192.168.102.234:9090/NOVA/rest/safetyConstructionLicense/unitInfos/20/1/";
//            url += URLEncoder.encode(URLEncoder.encode("{\"limit\":{},\"userId\":\"15622043X\"}", "utf-8"), "utf-8");
//            HttpGet httpGet = new HttpGet(url);
//
//            HttpResponse response = Client.execute(httpGet);
//
//            System.out.println("response =" + response);
//
//            BufferedReader breader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//            StringBuilder responseString = new StringBuilder();
//            String line = "";
//            while ((line = breader.readLine()) !=null) {
//                responseString.append(line);
//            }
//            breader.close();
//            String repsonseStr =responseString.toString();
//            JSONObject jsStr = JSONObject.parseObject(repsonseStr);
//
//
//            int total= Integer.parseInt(jsStr.getString("total"));
//            System.out.println("repsonseStr =" + repsonseStr);
//            return  total;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    /*读取文件*/
    public String ReadFile(String Path){
        BufferedReader reader = null;
        String laststr = "";
        try{
            FileInputStream fileInputStream = new FileInputStream(Path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while((tempString = reader.readLine()) != null){
                laststr += tempString;
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return laststr;
    }
    public static void  selectButton(By dwgc,By lb,By xz){
        driver.findElement(dwgc).click();
        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(lb));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(lb).click();
        driver.findElement(xz).click();
    }
    public static WebElement findElement(final By by) {
       /* WebElement webElement = null;
        try {
            //定义等待，等待元素
            webElement = new WebDriverWait(driver, 30).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        }catch (Exception e){
            System.out.println("元素："+by+"查找超时");
            e.printStackTrace();
        }
        return webElement;*/

        /*new WebDriverWait(driver, 20, 300).until(ExpectedConditions.attributeToBe(CreatMaterialReviewPage.dis
                , "style", "display: none;"));*/
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return driver.findElement(by);


    }
      public static int count(By a){
        String total=driver.findElement(a).getText();//获取底部总条数文本
        total=total.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
        int t=Integer.parseInt(total);
        return t;
    }


}
