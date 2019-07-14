package com.ooobj.coupon.example;

import java.sql.Date;
import java.util.List;

import com.ooobj.coupon.bean.Student;
import com.ooobj.coupon.dao.StudentDAO;

/**
 * JDBC使用简单示例
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年7月14日
 *
 */
public class JdbcExample {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		
		//查询所有学生并打印
		List<Student> list = dao.getAllStudent();
		for(Student s : list){
			System.out.println(s);
		}
		
		//新增一个学生
		Student stu = new Student();
		stu.setStuId(3);
		stu.setStuName("老王");
		stu.setBirthday(new Date(System.currentTimeMillis()));
		dao.saveStudent(stu);
		System.out.println("新增学生记录");
	}
}
