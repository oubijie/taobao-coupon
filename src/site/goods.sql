/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : yhq

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-07-12 01:05:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `good_id` bigint(20) NOT NULL,
  `good_name` varchar(100) NOT NULL,
  `good_pic` varchar(200) NOT NULL,
  `good_detail` varchar(200) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `tbk_url` varchar(200) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `promote_price` double(10,2) DEFAULT NULL,
  `sales` int(11) DEFAULT NULL,
  `yj_rate` double(10,2) DEFAULT NULL,
  `yj_value` double(10,2) DEFAULT NULL,
  `seller_name` varchar(100) DEFAULT NULL,
  `seller_id` varchar(32) DEFAULT NULL,
  `seller_shop` varchar(100) DEFAULT NULL,
  `platform` varchar(10) DEFAULT NULL,
  `coupon_id` varchar(32) DEFAULT NULL,
  `coupon_amount` int(11) DEFAULT NULL,
  `coupon_remain` int(11) DEFAULT NULL,
  `coupon_title` varchar(50) DEFAULT NULL,
  `coupon_value` double(10,2) DEFAULT NULL,
  `coupon_start_date` date DEFAULT NULL,
  `coupon_end_date` date DEFAULT NULL,
  `conpon_url` varchar(200) DEFAULT NULL,
  `coupon_tbk_url` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`good_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('592692323396', '韩派便携式迷你榨汁机家用水果小型炸果汁机无线电动多功能榨汁杯', 'http://img.alicdn.com/bao/uploaded/i4/2975139354/O1CN01vn8Byt2IyBLHBzJb2_!!0-item_pic.jpg', 'http://item.taobao.com/item.htm?id=592692323396', '厨房电器', 'https://s.click.taobao.com/t?e=m%3D2%26s%3D3%2B6CwM8ELlEcQipKwQzePOeEDrYVVa64K7Vc7tFgwiFRAdhuF14FMdq8xFEIt2%2BARitN3%2FurF3wpjvOPPJrI%2BMtfwbm1adqNXQeI5fm2X9lyef0EAoWQheEdjznrGiQX0f7vtFmFRNs5H1S63Uo%2', '59.00', '39.00', '9384', '6.00', '3.54', 'hap韩派众鑫专卖店', '2975139354', 'hap韩派众鑫专卖店', '天猫', '2c173abdf46e470db0012ab58f8cadb4', '50000', '45138', '满59元减20元', '20.00', '2019-07-06', '2019-07-13', 'https://taoquan.taobao.com/coupon/unify_apply.htm?sellerId=2975139354&activityId=2c173abdf46e470db0012ab58f8cadb4', 'https://uland.taobao.com/coupon/edetail?e=SiALaDM92ucN%2BoQUE6FNzCJpYmvsuRwW1BgHPSWZ5eMg4XlEpjIU6bcZelJt%2Bzjya6S9WcEv29bPN7yJ9qI492S4ihT3PrBb19fIGjTfiD6b8NdHu3ngLoWWBrrjuk0gzlry8yOQbJf%2F3fI4S75CBzKYk%2ByEZGthonv6QcvcARY%3D&af=1&pid=mm_15024289_7176531_23800850');
