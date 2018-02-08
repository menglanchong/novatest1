package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/11/15.
 */
public class QueryScreenWallPage {
    public static By PROJECTNAME= By.name("seek_proName_like");//项目列表项目名称
    public static By PROJECTCODE= By.name("seek_pronum");//项目列表项目代码
    public static By PROJECTTYPE= By.name("seek_proType");//项目列表项目类别
    public static By QUERY=By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/div/button[1]");//项目列表查询
    public static By CLEAR=By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/div/button[3]");//项目列表清空
    public static By INPROJECTNAME= By.name("seek_proName");//在办事项项目名称
    public static By INPROJECTCODE= By.name("seek_pronum");//在办事项项目代码
    public static By INPROJECTTYPE= By.name("seek_proType");//在办事项工程项目类别
    public static By INCONDEP=By.name("seek_unitName");//在办建设单位名称
    public static By INCHANGESTATUS=By.name("seek_wfStatus");//在办审核状态
    public static By INQUERY=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/div/button[1]");//在办查询
    public static By INCLEAR=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/div/button[2]");//在办清空
    public static By DONEPROJECTNAME= By.name("seek_proName");//已办事项项目名称
    public static By DONEPROJECTCODE= By.name("seek_pronum");//已办事项项目代码
    public static By DONEPROJECTTYPE= By.name("seek_proType");//已办事项工程类别
    public static By DONECONDEP=By.name("seek_unitName");//已办建设单位名称
    public static By DONECHANGESTATUS=By.name("seek_wfStatus");//已办审核状态
    public static By DONEQUERY=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/div/button[1]");//已办查询
    public static By DONECLEAR=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/div/button[2]");//已办清空
    public static By ALLPROJECTNAME= By.name("seek_proName");//所有事项项目名称
    public static By ALLPROJECTCODE= By.name("seek_pronum");//所有事项项目代码
    public static By ALLPROJECTTYPE= By.name("seek_proType");//所有事项工程项目类别
    public static By ALLCONDEP=By.name("seek_unitName");//所有建设单位名称
    public static By ALLCHANGESTATUS=By.name("seek_wfStatus");//所有变更状态
    public static By ALLQUERY=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/div/button[1]");//所有查询
    public static By ALLCLEAR=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/div/button[2]");//所有清空
    public static By PROJECTLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[1]");//项目列表定位
    public static By INITEMLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[2]");//在办事项定位
    public static By DONEITEMLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[3]");//已办事项定位
    public static By ALLITEMLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[4]");//所有事项定位
    public static By SHOWCLEAR=By.className("showClear");

}
