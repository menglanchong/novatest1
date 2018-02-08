package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/10/16.
 */
public class LoginPage {
    public  static By user=By.xpath("//input[@placeholder='请输入用户名']");
    public  static By pwd=By.xpath("//input[@placeholder='请输入密码']");
    public  static By login=By.className("loginbtn");
    public  static By qt=By.className("switchtext");
    public  static By xz=By.xpath("html/body/div[2]/div/div[1]/ul/li[1]");
    public  static By OUT=By.linkText("安全退出");
    public  static By ROLE=By.xpath(".//*[@id='app']/header/nav/span");
    public  static By loginOut=By.linkText("安全退出");

}
