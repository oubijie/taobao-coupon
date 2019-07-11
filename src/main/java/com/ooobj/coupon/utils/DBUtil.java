package com.ooobj.coupon.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 数据库连接工具类
 */
public class DBUtil {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	// 静态代码块（只在类加载时执行一次）
//	static {
//		try {
//			// 使用相对路径，JAVA工程的路径从工程名开始查找
//			FileInputStream fis = new FileInputStream("config/db.properties");
//			Properties pro = new Properties();
//			// 加载数据
//			pro.load(fis);
//			driver = pro.getProperty("driver");
//			url = pro.getProperty("url");
//			username = pro.getProperty("username");
//			password = pro.getProperty("password");
//			System.out.println("数据库配置信息加载完毕...");
//			fis.close();// 关闭
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	// 返回数据库连接
	public static Connection getConn() {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/yhq";
		username = "root";
		password = "root";
		
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
			//执行更新sql
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
