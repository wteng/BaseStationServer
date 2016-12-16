/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost
 Source Database       : base_station

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : utf-8

 Date: 12/15/2016 16:47:10 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `base_station_info`
-- ----------------------------
DROP TABLE IF EXISTS `base_station_info`;
CREATE TABLE `base_station_info` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address_qu` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `latitude` varchar(10) DEFAULT NULL,
  `longtitude` varchar(10) DEFAULT NULL,
  `platform_number` int(11) DEFAULT NULL,
  `tianxian_platform` varchar(100) DEFAULT NULL,
  `fangweijiao` varchar(100) DEFAULT NULL COMMENT '方位角',
  `jixie_xiaqingjiao` varchar(255) DEFAULT NULL,
  `dianzi_xiaqingjiao` varchar(255) DEFAULT NULL,
  `station_height` varchar(255) DEFAULT NULL,
  `beautiful_tianxian` varchar(255) DEFAULT NULL,
  `tianxian_type` varchar(255) DEFAULT NULL,
  `floor` varchar(255) DEFAULT NULL,
  `tianxian_model` varchar(255) DEFAULT NULL,
  `RRU_location` varchar(255) DEFAULT NULL,
  `have_cnet_device` varchar(255) DEFAULT NULL,
  `cnet_device_model` varchar(255) DEFAULT NULL,
  `has_farther` varchar(255) DEFAULT NULL,
  `room_share` varchar(255) DEFAULT NULL,
  `has_air_conditioning` varchar(255) DEFAULT NULL,
  `has_battery` varchar(255) DEFAULT NULL,
  `question` varchar(500) DEFAULT NULL,
  `pic_path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
