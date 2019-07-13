/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : yhq

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-07-13 22:46:28
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
  `tbk_url` varchar(300) DEFAULT NULL,
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
  `conpon_url` varchar(300) DEFAULT NULL,
  `coupon_tbk_url` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`good_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1847234439', '壁挂式篮球板标准篮框家用室内外儿童篮板家居装饰成人篮筐篮球筐', 'http://img.alicdn.com/bao/uploaded/i2/13759683/TB23nv5X_PEK1JjSZFAXXbZuXXa_!!13759683.jpg', 'http://item.taobao.com/item.htm?id=1847234439', '运动/瑜伽/健身/球迷用品', 'https://s.click.taobao.com/t?e=m%3D2%26s%3Dz8w5oVASH3kcQipKwQzePOeEDrYVVa64LKpWJ%2Bin0XJRAdhuF14FMdq8xFEIt2%2BARitN3%2FurF3wpjvOPPJrI%2BMtfwbm1adqNXQeI5fm2X9lyef0EAoWQhbsa32Yj7LDnDovxAueVkmKAiQ8Mlr1t5MYMXU3NNCg%2F', '109.00', '104.00', '54', '0.45', '0.49', '13759683', 'davidchinese', '雨燕体育', '淘宝', 'f1cbe94372d845c4916a4c9b0946a3d2', '10000', '10000', '满88元减5元', '5.00', '2019-06-19', '2019-06-19', 'https://taoquan.taobao.com/coupon/unify_apply.htm?sellerId=13759683&activityId=f1cbe94372d845c4916a4c9b0946a3d2', 'https://uland.taobao.com/coupon/edetail?e=KNT9dDbW7gcN%2BoQUE6FNzCJpYmvsuRwW1BgHPSWZ5eMg4XlEpjIU6bcZelJt%2BzjyY4WKCQb%2FaGCIopifUwpu8diGlVXLfx%2BnC0DytI6FkgQRmXbjg3B8kPgHTYlSc%2BSpcndmbdIPctsbqt7%2F2V5YT%2BGmBoXWa%2Bob&af=1&pid=mm_15024289_7176531_23800850');
