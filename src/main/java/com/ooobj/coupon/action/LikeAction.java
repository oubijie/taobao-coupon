package com.ooobj.coupon.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LikeAction extends ActionSupport{

	private String id;

	public String execute() {

		System.out.println("in like action...");
		
		System.out.println("========" + id);
		
//		HttpServletResponse response = ServletActionContext.getResponse();  
//        response.setContentType("text/html;charset=UTF-8");  
//        PrintWriter out = null;
//        try {
//			out = response.getWriter();
//			out.write("ok");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally{
//			out.close();
//		}
		
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	
	
	
	
	
}
