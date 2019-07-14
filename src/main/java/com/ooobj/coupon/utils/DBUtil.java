package com.ooobj.coupon.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 简单的数据库连接工具类
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年7月14日
 *
 */
public class DBUtil {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/yhq";
	private static String username = "root";
	private static String password = "root";

	// 返回数据库连接
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 执行更新sql
	public static int execUpdateSql(String sql) {
		int i = 0;
		Connection conn = null;
		Statement sm = null;
		try {
			conn = getConn();
			sm = conn.createStatement();
			System.out.println("sql:" + sql);
			i = sm.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close(sm);
		}
		return i;
	}

	//执行查询sql(查询后不能关闭连接)
	public static ResultSet execSelectSql(String sql) {
		ResultSet rs = null;
		Connection conn = null;
		Statement sm = null;
		try {
			conn = getConn();
			sm = conn.createStatement();
			System.out.println("sql:" + sql);
			rs = sm.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	// 关闭
	public static void close(ResultSet rs) {
		try {
			Statement sm = null;
			Connection conn = null;
			if (rs != null) {
				// 从结果集对象获取语句对象
				sm = rs.getStatement();
				rs.close();
			}
			if (sm != null) {
				// 从语句对象获取连接对象
				conn = sm.getConnection();
				sm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 关闭
	public static void close(Statement sm) {
		try {
			Connection conn = null;
			if (sm != null) {
				// 从语句对象获取连接对象
				conn = sm.getConnection();
				sm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
