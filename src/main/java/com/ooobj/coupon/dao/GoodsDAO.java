package com.ooobj.coupon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ooobj.coupon.bean.Goods;
import com.ooobj.coupon.utils.DBUtil;

public class GoodsDAO {

	public static final int PAGE_SIZE = 20;
	
	public List<Goods> getGoodsByPage(int page){
		if(page<=0){
			page = 1;
		}
		int start = 0 + (page-1)*PAGE_SIZE;
		
		String sql = "select * from goods limit " + PAGE_SIZE + " OFFSET " + start;
		ResultSet rs = DBUtil.execSelectSql(sql);
		List<Goods> list = new ArrayList<Goods>();
		try {
			while(rs.next()){
				Goods g = new Goods();
				g.setGoodId(rs.getLong("good_id"));
				g.setGoodName(rs.getString("good_name"));
				g.setGoodPic(rs.getString("good_pic"));
				g.setPrice(rs.getDouble("price"));
				g.setPromotePrice(rs.getDouble("promote_price"));
				g.setSales(rs.getInt("sales"));
				g.setCouponValue(rs.getDouble("coupon_value"));
				list.add(g);
			}
			DBUtil.close(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
