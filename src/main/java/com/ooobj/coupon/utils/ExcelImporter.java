package com.ooobj.coupon.utils;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.ooobj.coupon.bean.Goods;
import com.ooobj.coupon.dao.GoodsDAO;

/**
 * 读取优惠券的excel表格并导入数据库
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年7月12日
 *
 */
public class ExcelImporter {

	public static void main(String[] args) {
		try {
			Set<Goods> set = readExcel("src/site/精选优质商品清单(内含优惠券)-2019-07-09.xls");
			GoodsDAO dao = new GoodsDAO();
			dao.saveGoodsBatch(set);
			System.out.println("保存成功！共有记录：" + set.size());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Set<Goods> readExcel(String filePath) throws Exception{
		Set<Goods> set = new HashSet<Goods>();
		
		FileInputStream fi = new FileInputStream(new File(filePath));
		HSSFWorkbook workbook = new HSSFWorkbook(fi);
		HSSFSheet sheet = workbook.getSheet("Page1");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		HSSFRow row;
		for(int i=1; i<sheet.getPhysicalNumberOfRows(); i++){
			row = sheet.getRow(i);
			Goods g = new Goods();
			g.setGoodId(Long.parseLong(row.getCell(0).getStringCellValue()));
			g.setGoodName(row.getCell(1).getStringCellValue());
			g.setGoodPic(row.getCell(2).getStringCellValue());
			g.setGoodDetail(row.getCell(3).getStringCellValue());
			g.setCategory(row.getCell(4).getStringCellValue());
			g.setTbkUrl(row.getCell(5).getStringCellValue());
			g.setPrice(Double.valueOf(row.getCell(6).getStringCellValue()));
			g.setSales(Integer.valueOf(row.getCell(7).getStringCellValue()));
			g.setYjRate(Double.valueOf(row.getCell(8).getStringCellValue()));
			g.setYjValue(Double.valueOf(row.getCell(9).getStringCellValue()));
			g.setSellerName(row.getCell(10).getStringCellValue());
			g.setSellerId(row.getCell(11).getStringCellValue());
			g.setSellerShop(row.getCell(12).getStringCellValue());
			g.setPlatform(row.getCell(13).getStringCellValue());
			g.setCouponId(row.getCell(14).getStringCellValue());
			g.setCouponAmount(Integer.valueOf(row.getCell(15).getStringCellValue()));
			g.setCouponRemain(Integer.valueOf(row.getCell(16).getStringCellValue()));
			g.setCouponTitle(row.getCell(17).getStringCellValue());
			g.setCouponStartDate(sdf.parse(row.getCell(18).getStringCellValue()));
			g.setCouponEndDate(sdf.parse(row.getCell(19).getStringCellValue()));
			g.setConponUrl(row.getCell(20).getStringCellValue());
			g.setCouponTbkUrl(row.getCell(21).getStringCellValue());
			set.add(g);
			System.out.println(i + " : " + g.getGoodId());
		}
		System.out.println("read end");
		workbook.close();
		fi.close();
		
		return set;
	}
}
