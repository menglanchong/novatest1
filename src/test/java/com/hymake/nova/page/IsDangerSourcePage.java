package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/11/7.
 */
public class IsDangerSourcePage {
    public static By HOLEITEM = By.xpath(".//*[@id='lookupBelong_dw_container']/span");//基坑工程单位工程必填校验
    public static By HOLEPERSON = By.xpath(".//*[@id='ds_basedAnti_form']/table/tbody/tr[1]/td[4]/span");//基坑工程项目负责人必填校验
    public static By HOLEUNIT = By.xpath(".//*[@id='ds_basedAnti_form']/table/tbody/tr[2]/td[2]/span");//基坑工程监测单位必填校验
    public static By HOLEHEIGH = By.xpath(".//*[@id='ds_basedAnti_form']/table/tbody/tr[3]/td[2]/span");//基坑工程开挖深度必填校验
    public static By HOLEBASENUM = By.xpath(".//*[@id='ds_basedAnti_form']/table/tbody/tr[4]/td[2]/span");//基坑工程地下层数必填校验
    public static By HOLEPLANDATE = By.xpath(".//*[@id='ds_basedAnti_form']/table/tbody/tr[4]/td[4]/div/span");//基坑工程开工日期必填校验
    public static By TMPITEM = By.xpath(".//*[@id='ds_templateSupport_form']/table/tbody/tr[1]/td[2]/span");//模版工程单位工程必填校验
    public static By TMPDANGER = By.xpath(".//*[@id='ds_templateSupport_form']/table/tbody/tr[2]/td[2]/span");//模版工程危险源部位必填校验
    public static By TMPREALDATE = By.xpath(".//*[@id='date_19853448_container']/span");//模版工程实际开工必填校验
    public static By TMPTYPE = By.xpath(".//*[@id='ds_templateSupport_form']/table/tbody/tr[3]/td[2]/span");//模版工程模版类型必填校验
    public static By TMPDANGERDESC = By.xpath(".//*[@id='ds_templateSupport_form']/table/tbody/tr[5]/td[2]/span");//模版工程基本情况描述必填校验
    public static By SCFUNIT = By.xpath(".//*[@id='ds_othBase_form']/table/tbody/tr[1]/td[2]/span");//脚手架工程单位工程必填校验
    public static By SCFHEIGH = By.xpath(".//*[@id='ds_othBase_form']/table/tbody/tr[2]/td[2]/span");//脚手架工程搭设高度必填校验
    public static By SCFPLANDATE = By.xpath(".//*[@id='ds_othBase_form']/table/tbody/tr[2]/td[4]/div/span");//脚手架工程安装时间必填校验
    public static By SCFDANGER = By.xpath(".//*[@id='ds_othBase_form']/table/tbody/tr[3]/td[4]/span");//脚手架工程危险源部位必填校验
    public static By BLSTPROJECTUNIT = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[1]/td[2]/span");//爆破工程单位工程必填项校验
    public static By BLSTPERSON = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[1]/td[4]/span");//爆破工程项目负责人必填项校验
    public static By BLSTUNIT = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[2]/td[2]/span");//爆破工程爆破单位必填项校验
    public static By BLSTPLANDATE = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[2]/td[4]/div/span");//爆破工程爆破时间必填项校验
    public static By BLSTSITE = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[3]/td[2]/span");//爆破工程爆破部位必填项校验
    public static By BLSTRANGE = By.xpath(".//*[@id='ds_explode_form']/table/tbody/tr[5]/td[2]/span");//爆破工程影响范围必填项校验
    public static By DIGUNIT = By.xpath(".//*[@id='lookupBelong_dw_container']/span");//暗挖工程单位工程必填项校验
    public static By DIGPERSON = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[1]/td[4]/span");//暗挖工程项目负责人必填项校验
    public static By DIGEQUIP = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[2]/td[2]/span");//暗挖工程开挖设备必填项校验
    public static By DIGTYPE = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[2]/td[4]/span");//暗挖工程型号必填项校验
    public static By DIGSITE = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[3]/td[2]/span");//暗挖工程开挖部位必填项校验
    public static By DIGEXAMUNIT = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[3]/td[4]/span");//暗挖工程监测单位必填项校验
    public static By DIGHEIGH = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[4]/td[2]/div/span");//暗挖工程开挖时间必填项校验
    public static By DIGLENGTH = By.xpath(".//*[@id='ds_underground_form']/table/tbody/tr[5]/td[2]/span");//暗挖工程开挖长度必填项校验
    public static By DIGPLANTIME =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[6]/center/div/div[1]/input");//流程开始时间1
    public static By DIGREALTIME =By.xpath(".//*[@id='ds_regist-already-tab']/div[1]/ul/li[6]/center/div/div[2]/input");//流程开始时间2
    public static By CHECKBUTTON=By.xpath("html/body/div[2]/div/div[2]/div[2]/p");//直接点击危险源登记弹框提示
    public static By CHECKBUTTONCLICK=By.xpath("html/body/div[2]/div/div[3]/button[2]");//点击提示框确定





}
