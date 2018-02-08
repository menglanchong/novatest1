package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/12/20.
 */
public class QueryMaterialPage {
    public static By PROJECTNAME=By.name("seek_proName_like");//工程项目名称
    public static By MATERIALSNUM=By.name("seek_materialsNum");//工程材料报审编号
    public static By SGUNIT=By.name("seek_sgUnit_like");//施工单位
    public static By PMNAME=By.name("seek_pmName_like");//项目经理
    public static By SCPERSON=By.name("seek_scPerson_like");//审查人员
    public static By SCUNIT=By.name("seek_scUnit_like");//审查单位
    public static By ENTRYSTARTTIME =By.xpath(".//*[@id='materialsCheck_wait']/div[1]/ul/li[6]/center/div/div[1]/input");//进场开始时间
    public static By ENTRYENDTIME=By.xpath(".//*[@id='materialsCheck_wait']/div[1]/ul/li[6]/center/div/div[2]/input");//进场结束时间
    public static By SUBSTARTDATE=By.xpath(".//*[@id='materialsCheck_wait']/div[1]/ul/li[8]/center/div/div[1]/input");//提交开始日期
    public static By SUBENDDATE=By.xpath(".//*[@id='materialsCheck_wait']/div[1]/ul/li[8]/center/div/div[2]/input");//提交结束日期
    public static By THROUGHSTRATTIME =By.xpath(".//*[@id='materialsCheck_wait']/div[1]/ul/li[9]/center/div/div[1]/input");//审核通过开始时间
    public static By THROUGHENDTIME =By.xpath(".//*[@id='materialsCheck_wait']/div[1]/ul/li[9]/center/div/div[2]/input");//审核通过结束时间
    public static By SEARCH  =By.xpath(".//*[@id='materialsCheck_wait']/div[1]/div/button[1]");//列表搜索
    public static By TOTAL=By.className("el-pagination__total");//定位共x条
    public static By PAGETABLE =By.className("el-table__body-wrapper");//定位表格
    public static By INITEM=By.xpath(".//*[@id='materialsCheck']/div[1]/ul/li[1]");//在办事项
    public static By HAVEITEM=By.xpath(".//*[@id='materialsCheck']/div[1]/ul/li[2]");//已办事项
    public static By ALLITEM=By.xpath(".//*[@id='materialsCheck']/div[1]/ul/li[3]");//全部事项
    public static By FIRSTTR=By.xpath(".//*[@id='materialsCheck_wait']/div[3]/div/div[3]/table/tbody/tr[1]");//定位第一条数据
    public static By DELETE=By.xpath(".//*[@id='materialsCheck_wait']/div[1]/div/button[5]");//删除按钮
    public static By RECOREPRONAME=By.name("seek_proName");//查询项目名称
    public static By REPORTTYPE=By.name("seek_reportFormType");//报审类型
    public static By JSUNIT=By.name("seek_jsUnitName");//建设单位
    public static By SGUNITNAME=By.name("seek_sgUnitName");//施工单位
    public static By JLUNIT=By.name("seek_jlUnitName");//监理单位
    public static By clear=By.xpath(".//*[@id='materialCheckQuery']/div[1]/div/button[4]");








}
