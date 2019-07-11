package com.entor.quan.po;

public class Goods {

	private String id;
	private String name;
	private String picture;
	private Double price;
	private Double realPrice;
	private Integer sales;
	private Double yhq;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Double getYhq() {
		return yhq;
	}
	public void setYhq(Double yhq) {
		this.yhq = yhq;
	}
	public Double getRealPrice() {
		return realPrice;
	}
	public void setRealPrice(Double realPrice) {
		this.realPrice = realPrice;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", picture=" + picture + ", price=" + price + ", realPrice="
				+ realPrice + ", sales=" + sales + ", yhq=" + yhq + "]";
	}
	
	
}
