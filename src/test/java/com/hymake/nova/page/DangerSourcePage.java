package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/10/16.
 */
public class DangerSourcePage {
    public static By PROJECT = By.name("项目管理");//项目管理
    public static By DANGERM =By.partialLinkText("危险源管理");//危险源管理
    public static By DANGERREGISTER =By.linkText("危险源登记");//危险源登记
    public static By DANGERQR=By.name("危险源查询与解除");
    //public static By PAGETABLE =By.className("el-table__body");//定位在办事项,已办，所有的网页表格
    public static By JNAME =By.name("seek_proName");//工程项目名称
    public static By PROJECTQUERY =By.xpath(".//*[@id='ds_regist-list-tab']/div[1]/div/button[1]");//项目列表查询
    public static By PROJECTEMPTY =By.xpath(".//*[@id='ds_regist-list-tab']/div[1]/div/button[3]");//项目列表清空
    public static By PROJECTLIST =By.xpath(".//*[@id='ds_dangerRegist']/div[1]/ul/li[1]");//项目列表
    public static By INITEM =By.xpath(".//*[@id='ds_dangerRegist']/div[1]/ul/li[2]");//在办事项
    public static By QUERYBOX =By.xpath(".//*[@id='ds_regist-list-tab']/div[1]/ul/li/center/div/input");//在办项目名称查询框
    public static By PROJECTLEADER =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/ul/li[2]/center/div/input");//在办项目负责人
    public static By DANGERTYPE =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/ul/li[3]/center/div/select");//危险性类型选择在办查询
    public static By DANGERSOURCETYPE =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/ul/li[4]/center/div/select");//危险源类型选择在办查询
    public static By HAVEITEM =By.xpath(".//*[@id='ds_dangerRegist']/div[1]/ul/li[3]");//已办事项ybsx
    public static By ALLITEM =By.xpath(".//*[@id='ds_dangerRegist']/div[1]/ul/li[4]");//本单位所有事项
   // public static By cxlb=By.xpath(".//*[@id='app']/div/div/div[2]/div/div[2]/form/div/button[1]");//查询列表
    public static By DANGERRECORD =By.xpath(".//*[@id='ds_regist-list-tab']/div[1]/div/button[2]");//新增危险源
    public static By FIRSTPROJECT =By.xpath(".//*[@id='base-table']/div[1]/div[3]/table/tbody/tr");//选中第一条项目
    public static By INDANGERTYPE =By.name("seek_dangerLevel");//在办选择危险性类型
    public static By INDANGERSOURCETYPE =By.xpath("./[classname='plus-dialog-ul']/li[2]/select");//在办选择危险源类型
    public static By DANGERRELIEVE =By.linkText("危险源查询与解除");//危险源查询与解除
    public static By COUNT =By.className("el-pagination__total");//在办危险源统计条数table
    public static By INQUERYBOX =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/div/button[1]");//在办事项查询
    public static By INALTER =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/div/button[2]");//在办事项修改
    public static By INDELETE =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/div/button[3]");//在办事项删除
    public static By INSEE =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/div/button[4]");//在办事项查看
    public static By INEMPTY =By.xpath(".//*[@id='ds_regist-wait-tab']/div[1]/div/button[5]");//在办事项清空
    public static By PAGETABLE =By.className("el-table__body-wrapper");//在办事项表格
    public static By INFIRST=By.xpath(".//*[@id='base-table']/div[1]/div[3]/table/tbody/tr[1]/td[1]/div");//定位在办事项超链接第一行
    public static By zbxlk=By.className("el-input__inner");
    public static By HAVEPROJECT =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[1]/center/div/input");//已办事项工程项目名称
    public static By HAVEPROJECTLEADER =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[2]/center/div/input");//已办事项项目负责人
    public static By HAVEDANGER =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[3]/center/div/select");//已办事项危险性
    public static By HAVEDANGERSOURCE =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[4]/center/div/select");//已办事项危险源
    public static By HAVECHANGE =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[5]/center/div/select");//已办事项变更状态
    public static By STARTTIME =By.xpath(".//*[@id='ds_regist-already-tab']/form/ul/li[6]/center/div/div[1]/input");//已办事项流程开始1
    public static By STARTTIME2 =By.xpath(".//*[@id='ds_regist-already-tab']/form/ul/li[6]/center/div/div[2]/input");//已办事项流程开始2
    public static By ENDTIME =By.xpath(".//*[@id='ds_regist-already-tab']/form/ul/li[7]/center/div/div[1]/input");//已办事项流程结束1
    public static By ENDTIME2 =By.xpath(".//*[@id='ds_regist-already-tab']/form/ul/li[7]/center/div/div[2]/input");//已办事项流程结束2
    public static By HAVEQUERYBOX =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/div/button[1]");//已办事项查询
    public static By HAVERECALL =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/div/button[2]");//已办事项撤回
    public static By HAVESURE =By.xpath("html/body/div[2]/div/div[3]/button[2]");//已办事项撤回确定
    public static By HAVESEE =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/div/button[3]");//已办事项查看
    public static By HAVEEMPTY =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/div/button[4]");//已办事项清空
    public static By ALLPROJECTNAME =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[1]/center/div/input");//所有事项项目名称
    public static By ALLPROJECTLEADER =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[2]/center/div/input");//所有事项项目负责人
    public static By ALLDANGER =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[3]/center/div/select");//所有事项危险性
    public static By ALLDANGERSOURCE =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[4]/center/div/select");//所有事项危险源
    public static By ALLCHANGE =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[5]/center/div/select");//所有事项变更状态
    public static By ALLSTARTTIME =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[6]/center/div/div[1]/input");//所有事项开始时间1
    public static By ALLSTARTIME2 =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[6]/center/div/div[2]/input");//所有事项开始时间2
    public static By ALLENDTIME =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[7]/center/div/div[1]/input");//所有事项结束时间1
    public static By ALLENDTIME2 =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/ul/li[7]/center/div/div[2]/input");//所有事项结束时间2
    public static By ALLQUERYBOX =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/div/button[1]");//所有事项查询
    public static By ALLRECALL =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/div/button[2]");//所有事项撤回
    public static By ALLSEE =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/div/button[3]");//所有事项查看
    public static By ALLEMPTY =By.xpath(".//*[@id='ds_regist-all-tab']/div[1]/div/button[4]");//所有事项清空
    public static By zbwxyqd=By.xpath("html/body/div[2]/div/div[3]/button[2]");
    public static By dwgcxg=By.xpath(".//*[@id='lookupBelong_dw_container']/button");//危险源修改
    public static By ADDDENGERTYPE=By.id("dangerLevel-select");
    public static By ADDDENGERSOURCETYPE=By.id("dangerType-select");







}
