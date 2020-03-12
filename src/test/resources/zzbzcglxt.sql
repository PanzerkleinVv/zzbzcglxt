/*
Navicat MySQL Data Transfer

Source Server         : zzbzcglxt
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : zzbzcglxt

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2020-03-12 18:38:35
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
-- Records of brand
-- ----------------------------

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
-- Records of equipment
-- ----------------------------

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
-- Records of log
-- ----------------------------

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
-- Records of model
-- ----------------------------

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
-- Records of registration_reason
-- ----------------------------

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
-- Records of secrecy
-- ----------------------------

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
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('4b5ece21cc9fb8b368b3a355b7e3a4df57ceea0e', '笔记本', '1', '1', '1', '0', '1', '1');

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

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0e876709ae08fe659ff7c55b526ac1770c1a9db5', '陈文超', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', null, '陈文超');
INSERT INTO `user` VALUES ('6d4d2708dbc9fd944eecad305cdc72c5545d5e26', '叶颖钧', 'c775e7b757ede630cd0aa1113bd102661ab38829ca52a6422ab782862f268646', null, '');
