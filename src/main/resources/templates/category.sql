/*
 Navicat Premium Data Transfer

 Source Server         : apaaja
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : ecommerce

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 27/04/2018 10:09:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `ID_category` int(2) NOT NULL,
  `category_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ID_category`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (10, 'olahraga');
INSERT INTO `category` VALUES (30, 'game');
INSERT INTO `category` VALUES (50, 'fashion');
INSERT INTO `category` VALUES (70, 'food');
INSERT INTO `category` VALUES (90, 'elektronik');

SET FOREIGN_KEY_CHECKS = 1;
