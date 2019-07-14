/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : yhq

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-07-14 23:01:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `stu`
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `stu_id` int(11) NOT NULL,
  `stu_name` varchar(32) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('1', '张三', '2019-07-01');
INSERT INTO `stu` VALUES ('2', '李四', '2010-01-02');
