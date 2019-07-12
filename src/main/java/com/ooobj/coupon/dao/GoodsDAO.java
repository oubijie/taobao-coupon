package com.ooobj.coupon.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
	
	public void saveGoodsBatch(Set<Goods> set){
//		String sql = "insert into goods(good_id, good_name, good_pic, good_detail, category, tbk_url, price, promote_price"
//				+ ") values(?,?,?,?,?,?,?,?)";
		String sql = "insert into goods values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = DBUtil.getConn();
            ps = conn.prepareStatement(sql);

            for (Goods g : set) {
            	System.out.println(g.getGoodId());
            	ps.setLong(1, g.getGoodId());
            	ps.setString(2, g.getGoodName());
            	ps.setString(3, g.getGoodPic());
            	ps.setString(4, g.getGoodDetail());
            	ps.setString(5, g.getCategory());
            	ps.setString(6, g.getTbkUrl());
            	ps.setDouble(7, g.getPrice());
            	ps.setDouble(8, g.getPromotePrice());
            	ps.setInt(9, g.getSales());
            	ps.setDouble(10, g.getYjRate());
            	ps.setDouble(11, g.getYjValue());
            	ps.setString(12, g.getSellerId());
            	ps.setString(13, g.getSellerName());
            	ps.setString(14, g.getSellerShop());
            	ps.setString(15, g.getPlatform());
            	ps.setString(16, g.getCouponId());
            	ps.setInt(17, g.getCouponAmount());
            	ps.setInt(18, g.getCouponRemain());
            	ps.setString(19, g.getCouponTitle());
            	ps.setDouble(20, g.getCouponValue());
            	ps.setDate(21, new Date(g.getCouponStartDate().getTime()));
            	ps.setDate(22, new Date(g.getCouponStartDate().getTime()));
            	ps.setString(23, g.getConponUrl());
            	ps.setString(24, g.getCouponTbkUrl());
            	ps.executeUpdate();
            }

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
