package com.entor.quan.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.entor.quan.db.DBUtil;
import com.entor.quan.po.Goods;
import com.opensymphony.xwork2.ActionSupport;

public class GoodsJsonAction extends ActionSupport {

	private int page;
	private String result;
	
	public String execute() {

		int size = 25;
		int start = size*(page-1);
		
		String sql = "select * from item limit " + start + ", " + size;
		ResultSet rs = DBUtil.execSelectSql(sql);
		List list = new ArrayList<Goods>();
		try {
			while(rs.next()){
				Goods g = new Goods();
				g.setId(rs.getString(1));
				g.setName(rs.getString(2));
				g.setPicture(rs.getString(3));
				g.setPrice(rs.getDouble(7));
				g.setRealPrice(rs.getDouble(8));
				g.setSales(rs.getInt(10));
				g.setYhq(rs.getDouble(22));
				list.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		result = JSON.toJSONString(list);
		System.out.println(result);
		
		return SUCCESS;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	
	
	
	
}
