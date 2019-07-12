package com.ooobj.coupon.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Goods {

	private Long goodId;
	private String goodName;
	private String goodPic;
	private String goodDetail;
	private String category;
	private String tbkUrl;
	private Double price;
	private Double promotePrice;
	private Integer sales;
	private Double yjRate;
	private Double yjValue;
	private String sellerName;
	private String sellerId;
	private String sellerShop;
	private String platform;
	private String couponId;
	private Integer couponAmount;
	private Integer couponRemain;
	private String couponTitle;
	private Double couponValue;
	private Date couponStartDate;
	private Date couponEndDate;
	private String conponUrl;
	private String couponTbkUrl;
	
	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodPic() {
		return goodPic;
	}
	public void setGoodPic(String goodPic) {
		this.goodPic = goodPic;
	}
	public String getGoodDetail() {
		return goodDetail;
	}
	public void setGoodDetail(String goodDetail) {
		this.goodDetail = goodDetail;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTbkUrl() {
		return tbkUrl;
	}
	public void setTbkUrl(String tbkUrl) {
		this.tbkUrl = tbkUrl;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(Double promotePrice) {
		this.promotePrice = promotePrice;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Double getYjRate() {
		return yjRate;
	}
	public void setYjRate(Double yjRate) {
		this.yjRate = yjRate;
	}
	public Double getYjValue() {
		return yjValue;
	}
	public void setYjValue(Double yjValue) {
		this.yjValue = yjValue;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerShop() {
		return sellerShop;
	}
	public void setSellerShop(String sellerShop) {
		this.sellerShop = sellerShop;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public Integer getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(Integer couponAmount) {
		this.couponAmount = couponAmount;
	}
	public Integer getCouponRemain() {
		return couponRemain;
	}
	public void setCouponRemain(Integer couponRemain) {
		this.couponRemain = couponRemain;
	}
	public String getCouponTitle() {
		return couponTitle;
	}
	public void setCouponTitle(String couponTitle) {
		this.couponTitle = couponTitle;
		this.setCouponValueAndPromotePrice();
	}
	private void setCouponValueAndPromotePrice() {
		if(this.price != null && this.couponTitle != null){
			Pattern p = Pattern.compile("满\\d+元减(\\d+)元|(\\d+)元无条件券");
			Matcher m = p.matcher(this.couponTitle);
			if(m.matches()){
				String valueStr = m.group(1)!=null ? m.group(1) : m.group(2);
				this.couponValue = Double.parseDouble(valueStr);
				this.promotePrice = new BigDecimal(this.price - this.couponValue).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
		}
		
	}
	public Double getCouponValue() {
		return couponValue;
	}
	public void setCouponValue(Double couponValue) {
		this.couponValue = couponValue;
	}
	public Date getCouponStartDate() {
		return couponStartDate;
	}
	public void setCouponStartDate(Date couponStartDate) {
		this.couponStartDate = couponStartDate;
	}
	public Date getCouponEndDate() {
		return couponEndDate;
	}
	public void setCouponEndDate(Date couponEndDate) {
		this.couponEndDate = couponEndDate;
	}
	public String getConponUrl() {
		return conponUrl;
	}
	public void setConponUrl(String conponUrl) {
		this.conponUrl = conponUrl;
	}
	public String getCouponTbkUrl() {
		return couponTbkUrl;
	}
	public void setCouponTbkUrl(String couponTbkUrl) {
		this.couponTbkUrl = couponTbkUrl;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goodId == null) ? 0 : goodId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (goodId == null) {
			if (other.goodId != null)
				return false;
		} else if (!goodId.equals(other.goodId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goods [goodId=" + goodId + ", goodName=" + goodName + ", goodPic=" + goodPic + ", goodDetail="
				+ goodDetail + ", category=" + category + ", tbkUrl=" + tbkUrl + ", price=" + price + ", promotePrice="
				+ promotePrice + ", sales=" + sales + ", yjRate=" + yjRate + ", yjValue=" + yjValue + ", sellerName="
				+ sellerName + ", sellerId=" + sellerId + ", sellerShop=" + sellerShop + ", platform=" + platform
				+ ", couponId=" + couponId + ", couponAmount=" + couponAmount + ", couponRemain=" + couponRemain
				+ ", couponTitle=" + couponTitle + ", couponValue=" + couponValue + ", couponStartDate="
				+ couponStartDate + ", couponEndDate=" + couponEndDate + ", conponUrl=" + conponUrl + ", couponTbkUrl="
				+ couponTbkUrl + "]";
	}
	public static void main(String[] args) {
		Goods g = new Goods();
		g.setPrice(1000.0);
		g.setCouponTitle("3元无条件券");
		
		System.out.println(g.getCouponValue());
		System.out.println(g.getPrice());
		System.out.println(g.getPromotePrice());
	}
	
}
