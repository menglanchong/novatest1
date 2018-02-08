package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/12/13.
 */
public class CreatMaterialReviewPage {
    public static By REPORTMENU =By.name("建设工程主要材料报审及溯源公示平台");
    public static By MATERIALCHECK=By.name("建设工程主要材料报审");
    public static By MATERIALRECORD=By.name("主要材料报审记录查询");
    public static By ADDMATERIAL=By.xpath(".//*[@id='materialsCheck_wait']/div[1]/div/button[3]");//点击新增
    public static By SELECT=By.xpath("//div[@id='materialsCheck_addInfo']/table/tr[2]/td[2]/button");//点击选择
    public static By MAINUNIT=By.className("highlightRow");//点击第一条单位工程
    public static By CONFIRM =By.xpath(".//*[@id='unitMenu']/div[1]/button[2]");//点击确认
    public static By REAFFIRM=By.xpath("html/body/div[2]/div/div[3]/button[2]");//再次确定
    public static By dis=By.className("el-loading-mask");
    public static By scroll=By.xpath(".//*[@id='materialsCheck_add_table']/div[3]/div/div[2]");
    public static By ADD=By.xpath(".//*[@id='materialsCheck_add_table']/div[2]/div[1]/div/button[1]");
    public static By MOVE =By.xpath(".//*[@id='materialsAdd']/table/tr[9]/td[2]/textarea");
    public static By YES=By.id("hasInCheck1");
    public static By QD =By.xpath("html/body/div[2]/div/div[3]/button[2]");
    public static By PAGETABLE =By.className("el-table__body-wrapper");//在办事项表格





}
