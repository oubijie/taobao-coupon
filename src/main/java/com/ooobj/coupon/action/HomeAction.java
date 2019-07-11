package com.ooobj.coupon.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ooobj.coupon.bean.Goods;
import com.ooobj.coupon.utils.DBUtil;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	
	private List<Goods> list;
	
	public HomeAction() {
	}

	public String execute() {

		System.out.println("in home action...");
		
		String sql = "select * from item limit 25";
		ResultSet rs = DBUtil.execSelectSql(sql);
		list = new ArrayList<Goods>();
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
		
//		for(Goods g : list){
//			System.out.println(g);
//		}
		
		return SUCCESS;
	}

	public List<Goods> getList() {
		return list;
	}

	public void setList(List<Goods> list) {
		this.list = list;
	}
	
	
	
	
}
