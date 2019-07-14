package com.ooobj.coupon.example;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * POI读取Excel的简单样例
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年7月12日
 *
 */
public class ExcelExample {

	public static void main(String[] args) throws Exception {
		//打开excel文件
		FileInputStream fi = new FileInputStream(new File("src/site/精选优质商品清单(内含优惠券)-2019-07-09.xls"));
		HSSFWorkbook workbook = new HSSFWorkbook(fi);
		
		//获取excel中的一个sheet
		HSSFSheet sheet = workbook.getSheet("Page1");
		
		//获取sheet中的第一行
		HSSFRow row = sheet.getRow(0);
		
		//获取该行的第一个单元格
		System.out.println(row.getCell(0).getStringCellValue());
		
		//关闭文件流
		workbook.close();
	}
}
