/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.102
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : account_book

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-01-07 09:52:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) DEFAULT NULL COMMENT '顾客id',
  `cash_id` int(11) DEFAULT NULL COMMENT '交易记录id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` varchar(255) DEFAULT NULL COMMENT '状态（0未付清1已付清）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cash_buy
-- ----------------------------
DROP TABLE IF EXISTS `cash_buy`;
CREATE TABLE `cash_buy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) DEFAULT NULL COMMENT '顾客Id',
  `money` varchar(255) DEFAULT NULL COMMENT '交易金额',
  `cash_type` varchar(255) DEFAULT NULL COMMENT '支付方式',
  `cash_fen` varchar(255) DEFAULT NULL COMMENT '交易积分',
  `cash_time` datetime DEFAULT NULL COMMENT '交易时间',
  `status` varchar(255) DEFAULT NULL COMMENT '交易状态（1正常9删除）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cash_buy_plus
-- ----------------------------
DROP TABLE IF EXISTS `cash_buy_plus`;
CREATE TABLE `cash_buy_plus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cash_id` int(11) DEFAULT NULL COMMENT '交易记录id',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品id',
  `num` int(11) DEFAULT NULL COMMENT '数量',
  `zmoney` varchar(255) DEFAULT NULL COMMENT '总价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_name` varchar(255) DEFAULT NULL COMMENT '顾客姓名',
  `client_sex` char(255) DEFAULT NULL COMMENT '顾客性别(0男1女)',
  `client_phone` varchar(255) DEFAULT NULL COMMENT '顾客联系方式',
  `client_address` varchar(255) DEFAULT NULL COMMENT '顾客住址',
  `client_grade` varchar(255) DEFAULT NULL COMMENT '顾客等级',
  `money` varchar(255) DEFAULT NULL COMMENT '消费金额',
  `num` int(11) DEFAULT NULL COMMENT '消费次数',
  `client_fen` varchar(255) DEFAULT NULL COMMENT '消费积分',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` char(255) DEFAULT NULL COMMENT '状态（1正常 9删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `goods_img` varchar(255) DEFAULT NULL COMMENT '商品图片',
  `goods_concent` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` char(255) DEFAULT NULL COMMENT '商品状态(1正常9删除)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
