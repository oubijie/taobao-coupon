package com.ooobj.coupon.action;

import java.util.List;

import com.ooobj.coupon.bean.Goods;
import com.ooobj.coupon.dao.GoodsDAO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	
	private List<Goods> list;
	
	public HomeAction() {
	}

	public String execute() {

		System.out.println("in home action...");
		
		GoodsDAO goodsDAO = new GoodsDAO();
		list = goodsDAO.getGoodsByPage(1);
		
		
		return SUCCESS;
	}

	public List<Goods> getList() {
		return list;
	}

	public void setList(List<Goods> list) {
		this.list = list;
	}
	
	
	
	
}
