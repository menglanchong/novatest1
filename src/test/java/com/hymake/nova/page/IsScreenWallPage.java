package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/11/14.
 */
public class IsScreenWallPage {
    public static By UNIT =By.xpath(".//*[@id='lookupID_container']/span");//单位工程必填
    public static By JOBDEP =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[4]/td[2]/span");//总承包单位必填
    public static By JOBLINKMAN =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[4]/td[4]/span");//总承包单位联系人必填
    public static By JOBTEL =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[4]/td[6]/span");//总承包单位联系电话必填
    public static By DESIGNDEP =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[5]/td[2]/span");//幕墙设计单位必填
    public static By DESIGNLINKMAN =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[5]/td[4]/span");//幕墙设计单位联系人必填
    public static By DESIGNTEL =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[5]/td[6]/span");//幕墙设计单位联系电话必填
    public static By CONSTRUCTDEP =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[6]/td[2]/span");//幕墙施工单位必填
    public static By CONSTRUCTLINKMAN =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[6]/td[4]/span");//幕墙施工单位联系人必填
    public static By CONSTRUCTEL =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[6]/td[6]/span");//幕墙施工单位联系电话必填
    public static By STARTDATE =By.xpath(".//*[@id='startDate_container']/span");//幕墙开工日期必填
    public static By COMPLETEDATE =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[7]/td[4]/span");//幕墙竣工日期必填
    public static By BUILDHEIGHT =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[8]/td[2]/span");//建筑高度必填1
    public static By LEAVEFLOORHEIGHT =By.xpath(".//*[@id='_panel1_panel_table']/tbody/tr/td/table/tbody/tr[8]/td[4]/span");//最大高度必填2
}
