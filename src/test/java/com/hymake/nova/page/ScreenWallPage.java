package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/10/25.
 */
public class ScreenWallPage {
    public static By WALLREGISTER =By.linkText("外窗与幕墙登记");//菜单幕墙登记
    public static By FIRSTPROJECT =By.xpath(".//*[@id='base-table']/div/div[3]/table/tbody/tr/td[1]/div");//点击进入详情页面
    public static By ADD =By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[2]/div[2]/button[1]");//新增按钮
    public static By UNITSELECT =By.xpath(".//*[@id='lookupID_container']/button");//单位工程选择
    public static By WALLUNIT =By.xpath(".//*[@id='cw_addInfoDialog']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/table/tbody/tr[1]/td[1]/div/span");//定位单位工程
    public static By CHOICE =By.xpath(".//*[@id='cw_addInfoDialog']/div/div[2]/div/div/div[2]/div[2]/button[1]");//定位选择按钮
    public static By JOBDEP =By.name("jobDep");//总承包单位
    public static By JOBLINKMAN =By.name("'joblinkman");//联系人1
    public static By JOBTEL =By.name("jobTel");//联系电话1
    public static By DESIGNDEP =By.name("designDep");//幕墙设计单位
    public static By DESIGNLINKMAN =By.name("designlinkman");//联系人2
    public static By DESIGNTEL =By.name("designTel");//联系电话2
    public static By CONSTRUCTDEP =By.name("constructDep");//幕墙施工单位
    public static By CONSTRUCTLINKMAN =By.name("constructlinkman");//联系人3
    public static By CONSTRUCTEL =By.name("constructTel");//联系电话3
    public static By STARTDATE =By.name("startDate");//幕墙开工日期
    public static By COMPLETEDATE =By.name("completeDate");//幕墙竣工日期
    public static By BUILDHEIGHT =By.name("buildheight");//建筑高度
    public static By LEAVEFLOORHEIGHT =By.name("leavefloorheight");//最大高度
    public static By SAVE =By.id("saveButton");//保存
    public static By gb=By.xpath(".//*[@classname='eos-panel-body']/PAGETABLE/tbody/tr[24]/td/center/input[3]");
    public static By GLASSHIDE=By.id("chkGlassHide");//玻璃全隐
    public static By GLASSHALFHIDE=By.id("chkGlassHalfHide");//玻璃半隐
    public static By GLASSAPPEAR=By.id("chkGlassAppear");//玻璃明框
    public static By GLASSALL=By.id("chkGlassAll");//玻璃全玻
    public static By GLASSPOINT=By.id("chkGlassPoint");//玻璃点承式
    public static By GLASSUNIT=By.id("chkGlassUnit");//玻璃单元式
    public static By GLASSOTHER=By.id("chkGlassOther");//玻璃其他
    public static By CLOSE=By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[24]/td/center/input[3]");//关闭窗口
    public static By PAGETABLE=By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[2]/div[1]/div/div[3]/table");//定位网页表格位置
    public static By CHECKBOX=By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[2]/div[1]/div/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span");//第一个复选框
    public static By DELETE=By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[2]/div[2]/button[4]");//删除
    public static By CONFIRM=By.xpath("html/body/div[2]/div/div[3]/button[2]");
    public static By CLOSEWINDOW=By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[2]/div[2]/button[5]");//关闭窗口
    public static By WALLWINDOW=By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[1]/span");//幕墙登记列表
    public static By SUBMIT=By.xpath(".//*[@id='cw_plusDialog']/div[1]/div/div[2]/div[2]/button[3]");//提交
    public static By TR=By.xpath("//div[contains(text(),'草稿')]");




}
