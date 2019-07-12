package com.ooobj.coupon.action;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.ooobj.coupon.bean.Goods;
import com.ooobj.coupon.dao.GoodsDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GoodsJsonAction extends ActionSupport {

	private int page;
	private String result;
	
	public String execute() {

		GoodsDAO goodsDAO = new GoodsDAO();
		List<Goods> list = goodsDAO.getGoodsByPage(page);
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
