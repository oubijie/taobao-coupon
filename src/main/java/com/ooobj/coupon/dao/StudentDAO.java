package com.ooobj.coupon.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ooobj.coupon.bean.Student;
import com.ooobj.coupon.utils.DBUtil;

public class StudentDAO {

	/**
	 * 查询所有学生记录
	 * @return 学生的列表
	 */
	public List<Student> getAllStudent(){
		String sql = "select * from stu";
		ResultSet rs = DBUtil.execSelectSql(sql);
		List<Student> list = new ArrayList<Student>();
		try {
			while(rs.next()){
				Student s = new Student();
				s.setStuId(rs.getInt("stu_id"));
				s.setStuName(rs.getString("stu_name"));
				s.setBirthday(rs.getDate("birthday"));
				list.add(s);
			}
			DBUtil.close(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 插入新的学生记录
	 * @param s 学生信息
	 */
	public void saveStudent(Student s){
		String sql = "insert into stu values(?,?,?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = DBUtil.getConn();
            ps = conn.prepareStatement(sql);

            ps.setInt(1, s.getStuId());
            ps.setString(2, s.getStuName());
            ps.setDate(3, new Date(s.getBirthday().getTime()));
            ps.executeUpdate();

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
