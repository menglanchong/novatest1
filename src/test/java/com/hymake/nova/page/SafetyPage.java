package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/4.
 */
public class SafetyPage {
    public static By EMPTY=By.className("el-table__empty-text");//页面显示暂无数据
    public static By SAFETY=By.name("施工安全考评");
    public static By SAFETYPROJECT=By.name("施工项目考评");
    public static By MONTHCHECK=By.name("项目月自评(登记)");
    public static By DONECHECK=By.name("项目考评申请(填报)");
    public static By DONERESULT=By.name("项目考评结果公示书");
    public static By DONERESULTINFORM=By.name("项目考评结果告知书");
    public static By OBJECTCHECK=By.name("项目考评异议核实(查询)");
    public static By OBJECTRECHECK=By.name("项目考评异议复核(查询)");
    public static By REVOKECHECK=By.name("撤销项目考评结果公示书(查询)");
    public static By REVOKECHECKRESQUERY=By.name("撤销项目考评结果告知书(查询)");
    public static By QUARTERCHECK=By.name("项目季度自评(登记)");
    public static By DONECHECKSIGN=By.name("项目考评申请(签章)");
    public static By MONTHCHECKQUERY=By.name("项目月自评(查询)");
    public static By CHECKPROJECT=By.name("项目考评（查询）");
    public static By COMPANY=By.name("施工企业考评");
    public static By IMFORMATION=By.name("施工企业基本信息");
    public static By ETPEVALUE=By.name("施工企业自评(填报)");
    public static By EVALUATION=By.name("施工企业考评申请(填报)");
    public static By EVALUATIONQUERY=By.name("施工企业考评(查询)");
    public static By PUBLICKNOTICE=By.name("施工企业考评结果公示书");
    public static By RESULENOTICE=By.name("施工企业考评结果告知书");
    public static By DISSENTREVIEW=By.name("企业考评异议复核(查询)");
    public static By REVOKERESULT=By.name("撤销企业考评结果(查询)");
    public static By REVOKEPUBLIC=By.name("撤销企业考评结果公示书");
    public static By REVOKEDECISION=By.name("撤销企业考评结果决定书");
    public static By APPLYREGISTER=By.name("重新申请安全生产标准化考评(登记)");
    public static By REAPPLYQUERY=By.name("重新申请安全生产标准化考评(查询)");
    public static By GOODPROJECT =By.name("优良项目考评");
    public static By PROVINCE =By.name("省级标准化优良项目考评");
    public static By GOODDECLARE=By.name("省级优良项目申报(登记)");
    public static By GOODSUM=By.name("省级优良项目创建工程汇总表");
    public static By PROJECTSTATE=By.name("seek_protype");//工程类别
    public static By PROJECTNAME=By.name("seek_proname_like");//项目名称
    public static By PROJECTNAME2=By.name("seek_proname");
    public static By STATE=By.name("seek_opStatemc");//施工项目考评状态
    public static By OPSTATE=By.name("seek_opstatemc");//施工项目考评状态
    public static By MONOPSTATE=By.name("seek_opState");//月考评查询状态
    public static By CERSTATE=By.name("seek_certstate");//企业考评申请状态
    public static By ISQX=By.name("seek_isqx");//取消参评
    public static By CURYEAR=By.name("seek_curyear");//年份
    public static By CURMONTH=By.name("seek_curmonth");//月份
    public static By QUARTER=By.name("seek_curquarter");//季度
    public static By AREA=By.name("seek_totalname");//所在地市
    public static By RESULT=By.name("seek_finaltrialresult");//考评结果
    public static By CONUNIT=By.name("seek_conunitmc_like");//施工企业
    public static By PUBLICKNUM=By.name("seek_publicitybh");//公示书编号
    public static By AUDITSTATUS=By.name("seek_opstate");//审核状态
    public static By UNITNAME=By.name("seek_unitname");//施工企业考评项目
    public static By UNITSTATE=By.name("seek_area");//施工企业类别
    public static By EQALLEVEL=By.name("seek_quallevel");//施工企业资质等级
    public static By FINALRESULT=By.name("seek_finalresult");//施工企业考评结果
    public static By COUNITMC=By.name("seek_conunitmc_like");//施工企业名称
    public static By LICENSENNUMBER=By.name("seek_licensenumber");//安全生产许可证号
    public static By INFORMBH=By.name("seek_informbh");//施工企业考评结果告知书
    public static By LICENSENUM=By.name("seek_licensenumber_like");//重新申请安全标准化生产标准化考评安全生产许可证号
    public static By BUILDUNIT=By.name("seek_jsdwmc_like");//建设单位名称
    public static By SUPERVISOR=By.name("seek_jldwmc_like");//监理单位
    public static By OVERDUE=By.name("seek_isover");//是否逾期
    public static By EVALRESULT=By.name("seek_evalresult");//自评结果
    public static By DATA=By.className("el-pagination__total");//共几条
    public static By SAVE=By.xpath(".//*[@id='etpEvalueSelf']/div[2]/div/div[3]/center/input[1]");



}
