package com.ooobj.coupon.utils;

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
		FileInputStream fi = new FileInputStream(new File("src/site/精选优质商品清单(内含优惠券)-2019-07-09.xls"));
		HSSFWorkbook workbook = new HSSFWorkbook(fi);
		HSSFSheet sheet = workbook.getSheet("Page1");
		HSSFRow row = sheet.getRow(0);
		System.out.println(row.getCell(0));
		workbook.close();
	}
}
