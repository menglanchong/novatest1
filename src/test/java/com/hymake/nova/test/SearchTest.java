/*
package com.hymake.nova.test;

import com.hymake.nova.page.QueryMaterialPage;
import com.hymake.nova.service.*;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

*/
/**
 * Created by Administrator on 2017/12/21.
 *//*

public class SearchTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
        //SearchService.menuService();
        SearchService.menuRecordService();
    }
    @Test
    public static void other(){
        LoginTest.login();
        SearchService.menuService();
        OtherService.tableService();
    }
    @Test
    public static void delete(){
        LoginTest.login();
        DeleteService.deleteService();
    }
    @Test
    public static void searchProject(){

        CommonMethodService.lookUpText(QueryMaterialPage.PROJECTNAME,QueryMaterialPage.SEARCH,"南",1);
    }
    @Test
    public static void searchNum(){
        CommonMethodService.lookUpText(QueryMaterialPage.MATERIALSNUM,QueryMaterialPage.SEARCH,"2",0);

    }
    @Test
    public static void searchSgUnit(){
        CommonMethodService.lookUpText(QueryMaterialPage.SGUNIT,QueryMaterialPage.SEARCH,"福建",2);

    }
    @Test
    public static void searchScUnit(){
        CommonMethodService.lookUpText(QueryMaterialPage.SCUNIT,QueryMaterialPage.SEARCH,"厦门",6);

    }
    @Test
    public static void searchScPeason(){
        CommonMethodService.lookUpText(QueryMaterialPage.SCPERSON,QueryMaterialPage.SEARCH,"赖",7);

    }
    @Test
    public static void searchPm(){
        CommonMethodService.lookUpText(QueryMaterialPage.PMNAME,QueryMaterialPage.SEARCH,"黄",3);

    }
    @Test
    public static void searchEntryTime(){
        try {
            CommonMethodService.lookUpSelectTime(QueryMaterialPage.ENTRYSTARTTIME,QueryMaterialPage.ENTRYENDTIME,
                        QueryMaterialPage.SEARCH,"2017-12-14","2017-12-18",4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void searchSub(){
        try {
            CommonMethodService.lookUpSelectTime(QueryMaterialPage.SUBSTARTDATE,QueryMaterialPage.SUBENDDATE,
                    QueryMaterialPage.SEARCH,"2017-12-14","2017-12-18",9);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void searchThrough(){
        try {
            CommonMethodService.lookUpSelectTime(QueryMaterialPage.THROUGHSTRATTIME,QueryMaterialPage.THROUGHENDTIME,
                    QueryMaterialPage.SEARCH,"2017-12-14","2017-12-18",10);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void table(){
        LoginTest.login();
        OtherService.reCall();
    }
    @Test
    public static void searchProjectName(){
        CommonMethodService.lookUpText(QueryMaterialPage.RECOREPRONAME,QueryMaterialPage.SEARCHRECORD,"工程",0);
    }
    @Test
    public static void searchJsUnit(){
        CommonMethodService.lookUpText(QueryMaterialPage.JSUNIT,QueryMaterialPage.SEARCHRECORD,"路桥",2);
    }
    @Test
    public static void searchSgUnitName(){
        CommonMethodService.lookUpText(QueryMaterialPage.SGUNITNAME,QueryMaterialPage.SEARCHRECORD,"厦门",3 );
    }
    @Test
    public static void searchJlUnitName(){
        CommonMethodService.lookUpText(QueryMaterialPage.JLUNIT,QueryMaterialPage.SEARCHRECORD,"厦门",4 );
    }
    @Test
    public static void searchReportType(){
        CommonMethodService.lookSelectType(QueryMaterialPage.REPORTTYPE,"建设工程主要材料报审表",QueryMaterialPage.SEARCHRECORD,1);
    }
    @Test
    public static void searchSubTime(){
        try {
            CommonMethodService.lookUpSelectTime(QueryMaterialPage.SUBMITSTART,QueryMaterialPage.SUBMITEND,
                    QueryMaterialPage.SEARCHRECORD,"2017-12-15","2017-12-22",5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void searchRecordTime(){
        try {
            CommonMethodService.lookUpSelectTime(QueryMaterialPage.REPORTSTART,QueryMaterialPage.REPORTEND,
                    QueryMaterialPage.SEARCHRECORD,"2017-12-15","2017-12-22",6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public static void clearProject(){
        ClearService.clearTextService(QueryMaterialPage.RECOREPRONAME,QueryMaterialPage.clear,"天马");
    }
    @Test
    public static void clearSgUnit(){
        ClearService.clearTextService(QueryMaterialPage.SGUNITNAME,QueryMaterialPage.clear,"厦门");
    }

}
*/
