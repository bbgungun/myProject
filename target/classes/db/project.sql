/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : project

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2017-09-08 14:00:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for alumni_bookifo
-- ----------------------------
DROP TABLE IF EXISTS `alumni_bookifo`;
CREATE TABLE `alumni_bookifo` (
  `ab_id` int(11) NOT NULL AUTO_INCREMENT,
  `ab_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `grade_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `ab_description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for classmateifo
-- ----------------------------
DROP TABLE IF EXISTS `classmateifo`;
CREATE TABLE `classmateifo` (
  `cm_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for models
-- ----------------------------
DROP TABLE IF EXISTS `models`;
CREATE TABLE `models` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `indexpage` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `teacherpage` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `studentpage` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tailpage` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pictrue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `descrip` varchar(225) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`models_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for models_aluminbook
-- ----------------------------
DROP TABLE IF EXISTS `models_aluminbook`;
CREATE TABLE `models_aluminbook` (
  `mab_id` int(11) NOT NULL AUTO_INCREMENT,
  `ab_id` int(11) DEFAULT NULL,
  `models_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`mab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for page_aluminbook
-- ----------------------------
DROP TABLE IF EXISTS `page_aluminbook`;
CREATE TABLE `page_aluminbook` (
  `pab_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_id` int(11) DEFAULT NULL,
  `ab_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for studentpageifo
-- ----------------------------
DROP TABLE IF EXISTS `studentpageifo`;
CREATE TABLE `studentpageifo` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_nickname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_picture` tinyint(1) DEFAULT NULL,
  `p_sex` char(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_birthday` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_interesting` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_tel` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_qq` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_weibo` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_constellation` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_idol` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_luckcolor` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_wishes` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for teacherifo
-- ----------------------------
DROP TABLE IF EXISTS `teacherifo`;
CREATE TABLE `teacherifo` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacherPageIfo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for teacherpageifo
-- ----------------------------
DROP TABLE IF EXISTS `teacherpageifo`;
CREATE TABLE `teacherpageifo` (
  `teacherPageIfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_sex` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_birth` date DEFAULT NULL,
  `t_email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_qq` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_tel` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`teacherPageIfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for userifo
-- ----------------------------
DROP TABLE IF EXISTS `userifo`;
CREATE TABLE `userifo` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_realname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_sex` char(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_birth` date DEFAULT NULL,
  `user_education` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_Email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_tel` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_QQ` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_descriptoin` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for user_aluminbook
-- ----------------------------
DROP TABLE IF EXISTS `user_aluminbook`;
CREATE TABLE `user_aluminbook` (
  `uab_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `ab_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`uab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
