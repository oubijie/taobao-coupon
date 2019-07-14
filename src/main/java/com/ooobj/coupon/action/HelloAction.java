package com.ooobj.coupon.action;

import java.util.ArrayList;
import java.util.List;

import com.ooobj.coupon.bean.Goods;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	
	private List<Goods> list;
	
	public String execute() {
		list = new ArrayList<Goods>();
		Goods g = new Goods();
		g.setGoodPic("http://img.alicdn.com/bao/uploaded/i3/653250666/O1CN01osJQT71Gn4J05zrdr_!!0-item_pic.jpg");
		g.setGoodName("战甲羽毛球拍单双拍 初学者学校训练采购情侣拍套装2支装球拍送球");
		list.add(g);
		
		Goods g2 = new Goods();
		g2.setGoodPic("http://img.alicdn.com/bao/uploaded/i1/419652717/O1CN012krTwP1CaSxbilbFN_!!97-0-lubanu.jpg");
		g2.setGoodName("喜多驱蚊贴儿童防蚊贴避蚊新生儿婴儿成人宝宝卡通扣户外夏季用品");
		list.add(g2);
		return SUCCESS;
	}

	public List<Goods> getList() {
		return list;
	}

	public void setList(List<Goods> list) {
		this.list = list;
	}
	
	
	
	
}
