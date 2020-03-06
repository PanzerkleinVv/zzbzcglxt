/*
Navicat MySQL Data Transfer

Source Server         : zzbzcglxt
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : zzbzcglxt

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2020-03-06 19:06:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `BRAND_ID` varchar(255) NOT NULL,
  `BRAND_TYPE` varchar(255) DEFAULT NULL,
  `BRAND_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`BRAND_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `EQUIPMENT_ID` varchar(255) NOT NULL,
  `EQUIPMENT_NAME` varchar(255) DEFAULT NULL,
  `EQUIPMENT_TYPE` varchar(255) DEFAULT NULL,
  `EQUIPMENT_BRAND` varchar(255) DEFAULT NULL,
  `EQUIPMENT_MODEL` varchar(255) DEFAULT NULL,
  `EQUIPMENT_SECRECY` varchar(255) DEFAULT NULL,
  `EQUIPMENT_IP` int(11) DEFAULT NULL,
  `EQUIPMENT_MAC` varchar(255) DEFAULT NULL,
  `EQUIPMENT_SN` varchar(255) DEFAULT NULL,
  `EQUIPMENT_STATUS` int(2) DEFAULT NULL COMMENT '0-报废；1-借出；2-暂存；3-维修',
  `EQUIPMENT_REGISTRATION_DATE` datetime DEFAULT NULL,
  `EQUIPMENT_REGISTRATION_REASON` varchar(255) DEFAULT NULL,
  `EQUIPMENT_REGISTRATION_NOTE` varchar(255) DEFAULT NULL,
  `EQUIPMENT_NOTE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EQUIPMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `LOG_ID` varchar(255) NOT NULL,
  `LOG_EQUIPMENT` varchar(255) DEFAULT NULL,
  `LOG_USER` varchar(255) DEFAULT NULL,
  `LOG_TIME` datetime DEFAULT NULL,
  `LOG_STATUS` int(2) DEFAULT NULL COMMENT '0-报废；1-借出；2-暂存；3-维修',
  `LOG_TARGET` varchar(255) DEFAULT NULL,
  `LOG_OPERATION_DATE` datetime DEFAULT NULL,
  `LOG_NOTE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `MODEL_ID` varchar(255) NOT NULL,
  `MODEL_BRAND` varchar(255) DEFAULT NULL,
  `MODEL_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MODEL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `PERM_ID` int(3) NOT NULL AUTO_INCREMENT,
  `PERM_NAME` varchar(255) DEFAULT NULL,
  `PERM_SIGN` varchar(255) DEFAULT NULL,
  `PERM_DESC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PERM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for registration_reason
-- ----------------------------
DROP TABLE IF EXISTS `registration_reason`;
CREATE TABLE `registration_reason` (
  `REGISTRATION_REASON_ID` varchar(255) NOT NULL,
  `REGISTRATION_REASON_NAME` varchar(255) DEFAULT NULL,
  `REGISTRATION_REASON_NOTE` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`REGISTRATION_REASON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `ROLE_ID` int(3) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(255) DEFAULT NULL,
  `ROLE_SIGN` varchar(255) DEFAULT NULL,
  `ROLE_DESC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(3) DEFAULT NULL,
  `PERM_ID` int(3) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for secrecy
-- ----------------------------
DROP TABLE IF EXISTS `secrecy`;
CREATE TABLE `secrecy` (
  `SECRECY_ID` varchar(255) NOT NULL,
  `SECRECY_NAME` varchar(255) DEFAULT NULL,
  `IP_MIN` int(11) DEFAULT NULL,
  `IP_MAX` int(11) DEFAULT NULL,
  PRIMARY KEY (`SECRECY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `TYPE_ID` varchar(255) NOT NULL,
  `TYPE_NAME` varchar(255) DEFAULT NULL,
  `TYPE_BRAND` tinyint(1) DEFAULT NULL,
  `TYPE_MODEL` tinyint(1) DEFAULT NULL,
  `TYPE_SECRECY` tinyint(1) DEFAULT NULL,
  `TYPE_IP` tinyint(1) DEFAULT NULL,
  `TYPE_MAC` tinyint(1) DEFAULT NULL,
  `TYPE_SN` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`TYPE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USER_ID` varchar(255) NOT NULL,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `USER_PSW` varchar(255) DEFAULT NULL,
  `USER_ROLE_ID` int(3) DEFAULT NULL,
  `USER_DESC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
