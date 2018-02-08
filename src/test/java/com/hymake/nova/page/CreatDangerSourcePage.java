package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/10/20.
 */
public class CreatDangerSourcePage {
    public static By DANGERTYPE = By.xpath(".//*[@id='ds_regist-list-tab']/div[4]/div/div[2]/ul/li[1]/select");//选择危险性类型
    public static By DANGERSOURCETYPE = By.xpath(".//*[@id='ds_regist-list-tab']/div[4]/div/div[2]/ul/li[2]/select");//选择危险性源类型
    public static By PROJECTUNIT = By.xpath(".//*[@id='ds_regist-list-tab']/div[5]/div/div[2]/div[2]/div/div[3]/table/tbody/tr[1]");//单位工程列表页面点击
    public static By UNITSELECT = By.xpath(".//*[@id='ds_regist-list-tab_item']/div/div[2]/div[1]/div/button[2]");//单位工程列表选中按钮
    public static By UNITCLOSE = By.xpath(".//*[@id='ds_regist-list-tab_item']/div/div[2]/div[1]/div/button[3]");//单位工程列表关闭按钮
    public static By UNITLISTCLOSE = By.xpath(".//*[@id='ds_regist-list-tab_item']/div/div[2]/div[1]/div/button[3]");//单位工程列表关闭
    public static By HOLEUNIT = By.xpath(".//*[@id='lookupBelong_dw_container']/button");//基坑工程/地下暗挖工程单位工程
    public static By TMPUNIT = By.xpath(".//*[@id='ds_templateSupport_form']/table/tbody/tr[1]/td[2]/button");//模版工程及支撑体系单位工程
    public static By SCFUNIT = By.xpath(".//*[@id='ds_othBase_form']/table/tbody/tr[1]/td[2]/button");//脚手架工程单位工程
    public static By BLSTUNIT = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[1]/td[2]/button");//爆破工程单位工程
    public static By HOLEPERSON = By.name("proResPerson");//基坑工程项目负责人
    public static By EXAMORG = By.name("examOrg");//基坑工程监测单位
    public static By HOLEDIGDEPTH = By.name("digDepth");//基坑工程开挖深度
    public static By HOLESUPWAY = By.name("holeSupWay");//基坑工程支护方法
    public static By BASENUM = By.name("baseNum");//基坑工程地下室层数
    public static By REALBEGDATE = By.name("realBegDate");//基坑工程开挖时间
    public static By HOLESAVE = By.xpath(".//*[@id='ds_basedAnti_form']/center/button[1]");//基坑工程保存
    public static By HOLESUB = By.xpath(".//*[@id='ds_basedAnti_form']/center/button[2]");//基坑工程提交
    public static By HOLECLOSE = By.xpath(".//*[@id='ds_basedAnti_form']/center/button[3]");//基坑工程关闭
    public static By SEEHOLECLOSE=By.xpath(".//*[@id='ds_basedAnti_form']/div/button");//查看基坑详情关闭
    public static By dwgcjy=By.xpath(".//*[@id='lookupBelong_dw_container']/span");
    //public static By PROMPT= By.className("el-button el-button--default el-button--primary");//基坑工程提示确定
    public static By PROMPT =By.className("el-message-box__headerbtn");//el-message-box__headerbtn X类名
    public static By DIGPERSON = By.name("proResPerson");//地下暗挖工程项目负责人
    public static By DIGEQUIP = By.name("digEquip");//地下暗挖工程开挖设备
    public static By EQUIPTYPE = By.name("equipType");//地下暗挖工程型号
    public static By DIGSITE = By.name("digSite");//地下暗挖工程开挖部位
    public static By DIGEXAMORG = By.name("examOrg");//地下暗挖工程监测单位
    public static By DIGREALBEGDATE = By.name("realBegDate");//地下暗挖工程开挖时间
    public static By DIGWAY = By.name("digWay");//地下暗挖工程开挖方法
    public static By DIGLENGTH = By.name("digLength");//地下暗挖工程开挖深度
    public static By DIGSAVE = By.xpath(".//*[@id='ds_underground_form']/div/button[1]");//地下暗挖工程保存
    public static By DIGSUB = By.xpath(".//*[@id='ds_underground_form']/div/button[2]");//地下暗挖工程提交
    public static By DIGCLOSE = By.xpath(".//*[@id='ds_underground_form']/div/button[3]");//地下暗挖工程关闭
    public static By SEEDIGCLOSE = By.xpath(".//*[@id='ds_underground_form']/div/button");//地下暗挖查看详情关闭
    public static By TMPFASTEXAMUNIT = By.name("fastExamUnit");//模版工程及支撑体系检测单位
    public static By TMPDANGER = By.name("dangerSite");//模版工程及支撑体系危险源部位
    public static By TMPREALBEGDATE = By.name("realBegDate");//模版工程及支撑体系实际开工时间
    public static By TMPTYPE = By.id("1");//模版工程及支撑体系模版类型
    public static By TMPSUPSYSTYPE = By.name("supSysType");//模版工程及支撑体系型式
    public static By TMPDANGERDESC = By.name("dangerDesc");//模版工程及支撑体系基本情况
    public static By TMPSAVE = By.xpath(".//*[@id='ds_templateSupport_form']/div/button[1]");//模版工程及支撑体系保存
    public static By TMPSUB = By.xpath(".//*[@id='ds_templateSupport_form']/div/button[2]");//模版工程及支撑体系提交
    public static By TMPCLOSE = By.xpath(".//*[@id='ds_templateSupport_form']/div/button[3]");//模版工程及支撑体系关闭
    public static By SEETMPCLOSE=By.xpath(".//*[@id='ds_templateSupport_form']/div/button");//查看模版详情关闭
    public static By TMPPROMPT =By.xpath(".//*[@id='ds_templateSupport_form']/table/tbody/tr[1]/td[2]/button");//单位工程提示信息
    public static By SCFFASTEXAMUNIT = By.name("hstEquipName");//脚手架工程检测单位
    public static By SCFHEIGHT = By.name("erectHeight");//脚手架工程搭设高度
    public static By SCFREALBEGDATE = By.name("realBegDate");//脚手架工程安装时间
    public static By SCFTYPE = By.name("scfType");//脚手架工程脚手架型式
    public static By SCFDANGERSITE = By.name("dangerSite");//脚手架工程危险源部位
    public static By SCFSAVE = By.xpath(".//*[@id='ds_othBase_form']/div/button[1]");//脚手架工程保存
    public static By SCFSUM = By.xpath(".//*[@id='ds_othBase_form']/div/button[2]");//脚手架工程提交
    public static By SCFCLOSE = By.xpath(".//*[@id='ds_othBase_form']/div/button[3]");//脚手架工程关闭
    public static By SEESCLCLOSE=By.xpath(".//*[@id='ds_othBase_form']/div/button");//查看脚手架详情关闭
    public static By SCFPROMPT =By.xpath(".//*[@id='ds_othBase_form']/table/tbody/tr[1]/td[2]/span");//脚手架提示信息验证
    public static By BLSTPERSON = By.name("proResPerson");//爆破工程项目负责人
    public static By BLSTPROJECTUNIT = By.name("blstUnit");//爆破工程爆破单位
    public static By BLSTREALBEGDATE = By.name("realBegDate");//爆破工程爆破时间
    public static By BLSTSITE = By.name("blstSite");//爆破工程爆破部位
    public static By BLSTEQUIP = By.name("blstEquip");//爆破工程起爆器材
    public static By BLSTWAY = By.name("blstWay");//爆破工程起爆方式
    public static By BLSTTECH = By.name("blatTech");//爆破工程爆破技术
    public static By BLSTRANGE = By.name("quakeRange");//爆破工程影响范围
    public static By BLSTSAVE = By.xpath(".//*[@id='ds_explode_form']/div/button[1]");//爆破工程保存
    public static By BLSTSUB = By.xpath(".//*[@id='ds_explode_form']/div/button[2]");//爆破工程提交
    public static By BLSTCLOSE = By.xpath(".//*[@id='ds_explode_form']/div/button[3]");//爆破工程关闭
    public static By SEEBLSTCLOSE=By.xpath(".//*[@id='ds_explode_form']/div/button");//查看爆破详情关闭

}
