/*
Navicat MySQL Data Transfer

Source Server         : zzbzcglxt
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : zzbzcglxt

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2020-03-19 16:18:02
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
INSERT INTO `brand` VALUES ('1e0c425e4dce73d44ee6554470e97b0e587829f6', '8cdc5956ae1ff6913889aa5f8096588785d2d466', '惠普');
INSERT INTO `brand` VALUES ('7ed31ca8e31c207a9e5bccff8ee20e656f65943b', 'f5e0487e401ec8237e136b23986518ceb39bbce6', '惠普');

-- ----------------------------
-- Table structure for consumable
-- ----------------------------
DROP TABLE IF EXISTS `consumable`;
CREATE TABLE `consumable` (
  `CONSUMABLE_ID` varchar(255) NOT NULL,
  `CONSUMABLE_NAME` varchar(255) DEFAULT NULL,
  `CONSUMABLE_COUNT` int(255) DEFAULT NULL,
  `CONSUMABLE_UNIT` varchar(255) DEFAULT NULL,
  `PACKAGE_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CONSUMABLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of consumable
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
INSERT INTO `equipment` VALUES ('2f5d315a5bef26a3ba37fd00c06a041d83dca683', '130', 'f5e0487e401ec8237e136b23986518ceb39bbce6', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', 'ecfccca25032d3af1d5d42d71afb901c81e99815', '08ebab7ef709db8036443afe75e0690124267e9c', null, null, null, '2', '2020-02-29 16:00:00', '48244a0ef50d83b9b3636959f72efcff904b200c', '111', '');

-- ----------------------------
-- Table structure for ledger
-- ----------------------------
DROP TABLE IF EXISTS `ledger`;
CREATE TABLE `ledger` (
  `LEDGER_ID` varchar(255) NOT NULL,
  `LEDGER_CONSUMABLE` varchar(255) DEFAULT NULL,
  `LEDGER_COUNT` int(11) DEFAULT NULL,
  `LEDGER_TARGET` varchar(255) DEFAULT NULL,
  `LEDGER_TIME` datetime DEFAULT NULL,
  `LEDGER_USER` varchar(255) DEFAULT NULL,
  `LEDGER_TYPE` int(11) DEFAULT NULL COMMENT '0-清点；1-购入；2-领取',
  PRIMARY KEY (`LEDGER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ledger
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
INSERT INTO `log` VALUES ('cc6aa48e1118d0f9336320d985bafc113e67d8f5', '2f5d315a5bef26a3ba37fd00c06a041d83dca683', '6d4d2708dbc9fd944eecad305cdc72c5545d5e26', '2020-03-19 03:31:29', '4', '1036', '2020-02-29 16:00:00', null);

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
INSERT INTO `model` VALUES ('316d1e268c1b1c7f4e65e44a62892035fdc36827', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '6380');
INSERT INTO `model` VALUES ('349aadb974575e9706ee3d63366f7b3d5670ee47', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '400 G4');
INSERT INTO `model` VALUES ('61bfdcb07354a815f257075f40821bcfa372619b', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '6300');
INSERT INTO `model` VALUES ('85f0026e360e514826a7ca8856b75fa28667200f', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '280 G2');
INSERT INTO `model` VALUES ('8dc986d08a88eb72d65c4594df87b5ec3ab7efb7', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '3000 MT');
INSERT INTO `model` VALUES ('8de07ff1df49a61e34081e8dcce9f7b7bf0479ef', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '288 G3');
INSERT INTO `model` VALUES ('990d249633e95ce62d673ce5c7f2c0a602071c7c', '1e0c425e4dce73d44ee6554470e97b0e587829f6', '340 G4');
INSERT INTO `model` VALUES ('c5e5640606a19c875ef39a407f36e2d9f145068c', '1e0c425e4dce73d44ee6554470e97b0e587829f6', '440 G2');
INSERT INTO `model` VALUES ('d8f3cc140f2071368335fab548bab9990726476e', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '3381 MT');
INSERT INTO `model` VALUES ('ecfccca25032d3af1d5d42d71afb901c81e99815', '7ed31ca8e31c207a9e5bccff8ee20e656f65943b', '3330mt');

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
INSERT INTO `registration_reason` VALUES ('40c6ed6e5fe9b230a072588af4d0f78c10cbda68', '购入', '0');
INSERT INTO `registration_reason` VALUES ('48244a0ef50d83b9b3636959f72efcff904b200c', '移交', '1');

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
INSERT INTO `secrecy` VALUES ('08ebab7ef709db8036443afe75e0690124267e9c', '机密', '16777216', '-16777216');

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
INSERT INTO `type` VALUES ('50e52fac7a0d6f110b09b60966bd34d15824c0b4', '传真机', '1', '1', '1', '0', '0', '1');
INSERT INTO `type` VALUES ('88e99540312c865dd5617f50202d5c18128c703c', '打印机', '1', '1', '1', '1', '0', '1');
INSERT INTO `type` VALUES ('8cdc5956ae1ff6913889aa5f8096588785d2d466', '笔记本电脑', '1', '1', '1', '1', '1', '1');
INSERT INTO `type` VALUES ('ee619e98864f1076a75527f3400f03d471a9c93f', '复印机', '1', '1', '1', '1', '1', '1');
INSERT INTO `type` VALUES ('f5e0487e401ec8237e136b23986518ceb39bbce6', '台式电脑', '1', '1', '1', '0', '0', '0');
INSERT INTO `type` VALUES ('ff85b2189d2dbd589d9ee50d8de3761a3a940aaa', '碎纸机', '1', '1', '1', '1', '1', '1');

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
INSERT INTO `user` VALUES ('0e876709ae08fe659ff7c55b526ac1770c1a9db5', '陈文超', '4d4f26369171994f3a46776ee2d88494fb9955800a5bb6261c016c4bb9f30b56', null, '陈文超');
INSERT INTO `user` VALUES ('57c044ef00bb86cdb97c55abb3a8bcd24aa32643', '邹巨涛', 'c775e7b757ede630cd0aa1113bd102661ab38829ca52a6422ab782862f268646', null, '');
INSERT INTO `user` VALUES ('6d4d2708dbc9fd944eecad305cdc72c5545d5e26', '叶颖钧', 'c775e7b757ede630cd0aa1113bd102661ab38829ca52a6422ab782862f268646', null, '');
