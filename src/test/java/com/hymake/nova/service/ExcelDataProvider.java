package com.hymake.nova.service;

import jxl.Cell;
import jxl.Workbook;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import jxl.*;
/**
 * Created by Administrator on 2017/12/1.
 */
public class ExcelDataProvider {

    private Workbook book         = null;
    private Sheet    sheet        = null;
    private int      rowNum       = 0;
    private int      currentRowNo = 0;
    private int      columnNum    = 0;
    private String[] columnnName;
    public ExcelDataProvider(String classname) {

            try {

                int dotNum = classname.indexOf(".");

                if (dotNum > 0) {
                    classname = classname.substring(classname.lastIndexOf(".") + 1,
                            classname.length());
                }
                //从/data文件夹下读取以类名命名的excel文件
                String path = "C:\\Users\\Administrator\\Desktop\\login.xls";
                InputStream inputStream = new FileInputStream(path);//读取文件
                /*
                * 一个excel就对应一个Workbook对象，
                * 一个Workbook可以有多个Sheet对象
                * 一个Sheet对象可以有多个Cell对象
                * */
                book = Workbook.getWorkbook(inputStream);//选取Excel文件得到工作薄Workbook
                //取sheet
                sheet = book.getSheet(0);//通过Workbook的getSheet方法选择第一个工作表（从0开始）(也可以通过名称来获取如Sheet)
                rowNum = sheet.getRows();//获取Sheet表中所包含的总行数
                Cell[] cell = sheet.getRow(0);//获取某一行的所有单元格，返回的是单元格对象数组
                /*Cell getCell(int column, int row)获取指定单元格的对象引用，
                * 需要注意的是它的两个参数，第一个是列数，第二个是行数，这与通常的行、列组合有些不同
                * */
                columnNum = cell.length;
                columnnName = new String[cell.length];

                for (int i = 0; i < cell.length; i++) {
                    columnnName[i] = cell[i].getContents();//把单元格中的信息以字符的形式读取出来
                }
                this.currentRowNo++;

            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("unable to read Excel data");
            }
        }

        //判断Excel表中是否存在下一行数据
        public boolean hasNext() {

            if (this.rowNum == 0 || this.currentRowNo >= this.rowNum) {
                try {
                    book.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            } else {
                // sheet下一行内容为空判定结束
                if ((sheet.getRow(currentRowNo))[0].getContents().equals(""))
                    return false;
                return true;
            }
        }
        //读取Excel中某一行数据，并为下一行做准备
        public List<String> getdata_list() {

            Cell[] c = sheet.getRow(this.currentRowNo);
            List<String> list = new ArrayList<String>();

            for (int i = 0; i < this.columnNum; i++) {
                String temp = "";
                try {
                    temp = c[i].getContents().toString();
                } catch (ArrayIndexOutOfBoundsException ex) {
                    temp = "";
                }
                if(temp != null&& !temp.equals(""))
                    list.add(temp);
            }

            this.currentRowNo++;
            return list;
        }

        public void remove() {
            throw new UnsupportedOperationException("remove unsupported.");
        }

}
