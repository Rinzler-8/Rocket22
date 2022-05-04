drop database vti;
create database vti;
use vti;

/*
 Navicat Premium Data Transfer
 Source Server         : vti
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : vti_database
 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001
 Date: 22/04/2022 21:58:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `account_id` int(0) NOT NULL,
  `user_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `full_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department_id` int(0) NULL DEFAULT NULL,
  `position_id` int(0) NULL DEFAULT NULL,
  `create_at` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`account_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, 'vuongtc', '', '', NULL, NULL, '2022-04-21 22:58:00');
INSERT INTO `account` VALUES (2, 'vuongtc', 'vuongtc@gmail.com', 'trinh cong vuong', NULL, NULL, '2022-04-21 23:00:43');

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer`  (
  `answer_id` int(0) NOT NULL,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `question_id` int(0) NOT NULL,
  `is_correct` tinyint(0) NOT NULL,
  PRIMARY KEY (`answer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of answer
-- ----------------------------
INSERT INTO answer (answer_id, content, question_id, is_correct) VALUES 
(1, 'Câu 1', 11, true),
(2, "Câu 2", 12, false),
(3, "Câu 3", 13, true),
(4, "Câu 4", 14, false),
(5, "Câu 5", 15, true);
-- ----------------------------
-- Table structure for category_question
-- ----------------------------
DROP TABLE IF EXISTS `category_question`;
CREATE TABLE `category_question`  (
  `category_id` int(0) NOT NULL,
  `category_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category_question
-- ----------------------------
INSERT INTO category_question (category_id,category_name) VALUES    
(1, 'Embedded'), 
(2, 'Multimedia'),
(3, 'Database'),
(4, 'Software Engineer'),
(5, 'Meaningless');
-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `department_id` int(0) NOT NULL,account
  `department_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`department_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, 'DEV1');
INSERT INTO `department` VALUES (2, 'DEV1');
INSERT INTO `department` VALUES (3, 'DEV1');
INSERT INTO `department` VALUES (10, 'DEV1');

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `exam_id` int(0) NOT NULL,
  `code` varchar(150) NOT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `category_id` int(0) NOT NULL,
  `duration` int(0) NOT NULL,
  `creator_id` int(0) NOT NULL,
  `create_date` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`exam_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO exam (exam_id, code, title, category_id, duration, creator_id, create_date) VALUES (1, '190A', "Math", 11, 60, 1, '2022-8-25'),
                                       (2, '190B2', "Literature", 12, 60, 1, '2022-4-26'),
                                       (3, '190C7', "Science", 13, 60, 1,'2022-4-27'),
                                       (4, '190D7', "Physics", 14, 60, 2,  '2022-4-28'),
                                       (5, '190I10', "Chemistry", 15, 60, 2,  '2022-8-29');       
-- ----------------------------
-- Table structure for exam_question
-- ----------------------------
DROP TABLE IF EXISTS `exam_question`;
CREATE TABLE `exam_question`  (
  `exam_id` int(0) NOT NULL,
  `question_id` int(0) NOT NULL,
  PRIMARY KEY (`exam_id`, `question_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exam_question
-- ----------------------------

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group`  (
  `group_id` int(0) NOT NULL,
  `group_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `creator_id` int(0) NOT NULL,
  `create_date` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`group_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `vti`.`group` (`group_id`, `group_name`, `creator_id`, `create_date`) VALUES ('1', 'SAS', '11', '2002-7-28');
INSERT INTO `vti`.`group` (`group_id`, `group_name`, `creator_id`, `create_date`) VALUES ('2', 'GIGN', '12', '2002-7-26');
INSERT INTO `vti`.`group` (`group_id`, `group_name`, `creator_id`, `create_date`) VALUES ('3', 'Navy SEAL', '13', '2002-7-21');
INSERT INTO `vti`.`group` (`group_id`, `group_name`, `creator_id`, `create_date`) VALUES ('4', 'Spetsnaz', '14', '2002-7-25');
INSERT INTO `vti`.`group` (`group_id`, `group_name`, `creator_id`, `create_date`) VALUES ('5', 'GIS', '15', '2002-7-23');
-- ----------------------------
-- Table structure for group_account
-- ----------------------------
DROP TABLE IF EXISTS `group_account`;
CREATE TABLE `group_account`  (
  `group_id` int(0) NOT NULL,
  `account_id` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `join_date` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`group_id`, `account_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of group_account
-- ----------------------------
INSERT INTO `vti`.`group_account` (`group_id`, `account_id`, `join_date`) VALUES ('15', '11', '2008-8-1');
INSERT INTO `vti`.`group_account` (`group_id`, `account_id`, `join_date`) VALUES ('245', '12', '2008-8-7');
INSERT INTO `vti`.`group_account` (`group_id`, `account_id`, `join_date`) VALUES ('3312', '13', '2008-8-9');
INSERT INTO `vti`.`group_account` (`group_id`, `account_id`, `join_date`) VALUES ('41', '14', '2008-8-8');
INSERT INTO `vti`.`group_account` (`group_id`, `account_id`, `join_date`) VALUES ('55', '15', '2008-8-19');
-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position`  (
  `position_id` int(0) NOT NULL,
  `position_name` enum('Dev','Test','Scrum Master','PM') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`position_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `vti`.`position` (`position_id`, `position_name`) VALUES ('21', 'Dev');
INSERT INTO `vti`.`position` (`position_id`, `position_name`) VALUES ('251', 'Test');
INSERT INTO `vti`.`position` (`position_id`, `position_name`) VALUES ('355', 'Scrum Master');
INSERT INTO `vti`.`position` (`position_id`, `position_name`) VALUES ('44', 'PM');
INSERT INTO `vti`.`position` (`position_id`, `position_name`) VALUES ('55', 'Dev');
-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
    `question_id` INT(0) NOT NULL,
    `content` VARCHAR(255)CHARACTER SET UTF8MB4 COLLATE UTF8MB4_0900_AI_CI NOT NULL,
    `category_id` INT(0) NOT NULL,
    `type_id` VARCHAR(45)CHARACTER SET UTF8MB4 COLLATE UTF8MB4_0900_AI_CI NOT NULL,
    `creator_id` INT(0) NOT NULL,
    `create_date` DATETIME(0) NOT NULL DEFAULT CURRENT_TIMESTAMP (0),
    PRIMARY KEY (`question_id`) USING BTREE
)  ENGINE=INNODB CHARACTER SET=UTF8MB4 COLLATE = UTF8MB4_0900_AI_CI ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `vti`.`question` (`question_id`, `content`, `category_id`, `type_id`, `creator_id`, `create_date`) VALUES ('1', 'What’s your favorite way to spend a day off?', '11', '57', '83', '2001-5-7');
INSERT INTO `vti`.`question` (`question_id`, `content`, `category_id`, `type_id`, `creator_id`, `create_date`) VALUES ('2', ' What type of music?', '12', '894', '5', '2001-5-8');
INSERT INTO `vti`.`question` (`question_id`, `content`, `category_id`, `type_id`, `creator_id`, `create_date`) VALUES ('3', 'What was the best?', '123', '321', '5', '2001-5-17');
INSERT INTO `vti`.`question` (`question_id`, `content`, `category_id`, `type_id`, `creator_id`, `create_date`) VALUES ('15', 'Where’s the next', '11', '57', '1', '2001-5-9');
INSERT INTO `vti`.`question` (`question_id`, `content`, `category_id`, `type_id`, `creator_id`, `create_date`) VALUES ('16', 'What are your hobbies', '12', '894', '5', '2001-5-15');
-- ----------------------------
-- Table structure for type_question
-- ----------------------------
DROP TABLE IF EXISTS `type_question`;
CREATE TABLE `type_question`  (
  `type_id` int(0) NOT NULL,
  `type_name` enum('Essay','Multiple-Choice') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type_question
-- ----------------------------
INSERT INTO `vti`.`type_question` (`type_id`, `type_name`) VALUES ('145', 'Essay ');
INSERT INTO `vti`.`type_question` (`type_id`, `type_name`) VALUES ('2312', 'Multiple-Choice ');
INSERT INTO `vti`.`type_question` (`type_id`, `type_name`) VALUES ('321', 'Essay ');
INSERT INTO `vti`.`type_question` (`type_id`, `type_name`) VALUES ('45', 'Multiple-Choice ');
INSERT INTO `vti`.`type_question` (`type_id`, `type_name`) VALUES ('54', 'Multiple-Choice ');
SET FOREIGN_KEY_CHECKS = 1;