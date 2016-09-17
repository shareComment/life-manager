/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : life_version

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2016-07-11 21:59:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `life_brand`
-- ----------------------------
DROP TABLE IF EXISTS `life_brand`;
CREATE TABLE `life_brand` (
  `brand_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌ID',
  `brand_name` varchar(32) NOT NULL COMMENT '品牌名称',
  `official_website` varchar(96) DEFAULT NULL COMMENT '品牌官网',
  `cate_id` int(11) NOT NULL COMMENT '类目ID(二级ID)',
  `pc_img` varchar(96) DEFAULT NULL COMMENT 'PC图片',
  `wap_img` varchar(96) DEFAULT NULL COMMENT 'wap图片',
  `co_name` varchar(48) NOT NULL COMMENT '所属企业',
  `std_time` varchar(10) NOT NULL COMMENT '成立时间',
  `co_address` text NOT NULL COMMENT '总部地址',
  `biz_scope` varchar(255) NOT NULL COMMENT '经营产品',
  `score` int(11) NOT NULL DEFAULT '100' COMMENT '评分',
  `brand_info` text COMMENT '品牌描述',
  `mng_id` char(32) NOT NULL,
  `add_time` datetime NOT NULL COMMENT '加入时间',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态(0有效，1无效)',
  PRIMARY KEY (`brand_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_brand
-- ----------------------------
INSERT INTO `life_brand` VALUES ('1', '耐克', '', '2', '', '', '耐克', '2008-10-29', '中国', '服装，鞋帽', '100', '', 'b45e0fca9ae94c93b81c292534c690fa', '2016-06-29 21:47:52', '2016-06-29 21:47:55', '0');
INSERT INTO `life_brand` VALUES ('2', '李宁', '', '2', '', '', '李宁', '2007-9-10', '中国', '服装，鞋帽', '100', '', 'b45e0fca9ae94c93b81c292534c690fa', '2016-06-29 22:02:17', '2016-06-29 22:02:20', '0');
INSERT INTO `life_brand` VALUES ('3', '维多利亚的秘密', null, '4', null, null, '维多利亚的秘密', '2016-07-04', '维多利亚的秘密', '维多利亚的秘密', '100', null, 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-09 00:01:45', '2016-07-09 00:01:45', '0');
INSERT INTO `life_brand` VALUES ('4', '维多利亚的秘密', null, '4', null, null, '维多利亚的秘密11', '2016-07-04', '维多利亚的秘密', '维多利亚的秘密', '100', null, 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-09 00:22:38', '2016-07-09 00:25:40', '1');

-- ----------------------------
-- Table structure for `life_category`
-- ----------------------------
DROP TABLE IF EXISTS `life_category`;
CREATE TABLE `life_category` (
  `cate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别ID',
  `cate_pid` int(11) DEFAULT NULL COMMENT '父类别ID',
  `cate_name` varchar(32) NOT NULL COMMENT '类别名',
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`cate_id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_category
-- ----------------------------
INSERT INTO `life_category` VALUES ('1', '0', '鞋服', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 12:41:48');
INSERT INTO `life_category` VALUES ('2', '1', '鞋子', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 12:41:59');
INSERT INTO `life_category` VALUES ('3', '1', '服装', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 16:46:18');
INSERT INTO `life_category` VALUES ('4', '1', '内衣', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 12:42:15');
INSERT INTO `life_category` VALUES ('5', '1', '配饰', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 12:42:33');
INSERT INTO `life_category` VALUES ('6', '1', '童装童鞋', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 12:42:48');
INSERT INTO `life_category` VALUES ('7', '0', '运动健身', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-03 15:37:54');
INSERT INTO `life_category` VALUES ('8', '0', '家电家具', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-05 08:21:32');

-- ----------------------------
-- Table structure for `life_comment`
-- ----------------------------
DROP TABLE IF EXISTS `life_comment`;
CREATE TABLE `life_comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `brand_id` int(11) NOT NULL COMMENT '品牌ID',
  `user_id` char(32) NOT NULL COMMENT '会员ID',
  `comment_pid` int(11) DEFAULT NULL COMMENT '一级评论ID',
  `comment` text NOT NULL COMMENT '评论内容',
  `comment_img` text COMMENT '评论图片(多张图片逗号分隔)',
  `add_time` datetime NOT NULL COMMENT '评论时间',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态(0有效，1无效)',
  PRIMARY KEY (`comment_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_comment
-- ----------------------------
INSERT INTO `life_comment` VALUES ('1', '1', '79b09257337d4c868e3bc3694c0246ed', '0', '随便评论评论吧', null, '2016-07-10 21:14:38', '0');
INSERT INTO `life_comment` VALUES ('2', '1', '79b09257337d4c868e3bc3694c0246ed', '1', '回复一下', null, '2016-07-10 21:45:23', '1');

-- ----------------------------
-- Table structure for `life_content`
-- ----------------------------
DROP TABLE IF EXISTS `life_content`;
CREATE TABLE `life_content` (
  `con_id` int(11) NOT NULL COMMENT '内容ID',
  `class_id` int(11) NOT NULL COMMENT '类别(0网站公告，1关于我们)',
  `content` text NOT NULL COMMENT '内容',
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`con_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_content
-- ----------------------------
INSERT INTO `life_content` VALUES ('1', '1', '关于我们123456', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 22:23:41');
INSERT INTO `life_content` VALUES ('2', '0', '网站公告1111111', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-04 08:37:41');

-- ----------------------------
-- Table structure for `life_feedback`
-- ----------------------------
DROP TABLE IF EXISTS `life_feedback`;
CREATE TABLE `life_feedback` (
  `feed_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '反馈ID',
  `user_id` char(32) NOT NULL COMMENT '会员ID',
  `feed_con` text NOT NULL COMMENT '反馈内容',
  `add_time` datetime NOT NULL COMMENT '反馈时间',
  PRIMARY KEY (`feed_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_feedback
-- ----------------------------
INSERT INTO `life_feedback` VALUES ('1', '79b09257337d4c868e3bc3694c0246ed', '傻逼玩意儿', '2016-06-29 23:09:44');

-- ----------------------------
-- Table structure for `life_grade`
-- ----------------------------
DROP TABLE IF EXISTS `life_grade`;
CREATE TABLE `life_grade` (
  `grade_id` int(9) NOT NULL AUTO_INCREMENT COMMENT '等级ID',
  `grade_name` varchar(32) NOT NULL COMMENT '等级名称',
  `min_point` int(9) NOT NULL COMMENT '最低积分',
  `max_point` int(9) NOT NULL COMMENT '最高积分',
  `grade_color` varchar(12) NOT NULL COMMENT '色值',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`grade_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_grade
-- ----------------------------
INSERT INTO `life_grade` VALUES ('1', '平民', '0', '500', '#808080', '2016-07-10 19:36:21');
INSERT INTO `life_grade` VALUES ('2', '勋爵', '501', '5000', '#00B050', '2016-07-06 19:48:18');
INSERT INTO `life_grade` VALUES ('3', '子爵', '5001', '15000', '#0070C8', '2016-07-06 19:48:59');
INSERT INTO `life_grade` VALUES ('4', '伯爵', '15001', '30000', '#7030BC', '2016-07-06 19:49:33');
INSERT INTO `life_grade` VALUES ('5', '侯爵', '30001', '60000', '#FF0000', '2016-07-06 19:50:25');
INSERT INTO `life_grade` VALUES ('6', '公爵', '60001', '120000', '#FCC000', '2016-07-06 19:51:06');
INSERT INTO `life_grade` VALUES ('7', '王', '240000', '0', '#FFFF00', '2016-07-06 19:52:10');

-- ----------------------------
-- Table structure for `life_log`
-- ----------------------------
DROP TABLE IF EXISTS `life_log`;
CREATE TABLE `life_log` (
  `log_id` char(17) NOT NULL COMMENT '日志ID',
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `oper_con` varchar(255) NOT NULL COMMENT '操作内容',
  `oper_time` datetime NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`log_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_log
-- ----------------------------

-- ----------------------------
-- Table structure for `life_manager`
-- ----------------------------
DROP TABLE IF EXISTS `life_manager`;
CREATE TABLE `life_manager` (
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `nickname` varchar(32) NOT NULL COMMENT '管理员名',
  `password` varchar(40) NOT NULL COMMENT '管理员密码',
  `salt` varchar(9) NOT NULL COMMENT '盐值',
  `telephone` varchar(32) NOT NULL COMMENT '手机号码',
  `last_time` datetime NOT NULL COMMENT '上回登录时间',
  PRIMARY KEY (`mng_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_manager
-- ----------------------------
INSERT INTO `life_manager` VALUES ('b45e0fca9ae94c93b81c292534c690fa', 'Chaos', 'b0dbd7e34637fb116fbb6ca9605f0077', 'dv<n6!-ol', '15161644051', '2016-07-09 18:58:40');
INSERT INTO `life_manager` VALUES ('8b5b37d9208b4b7d828d4fa9828bf146', 'Administrator', 'fc781272cfd5070fe425e3805fd9c34f', '@2+<@)->)', '18505107840', '2016-07-09 19:11:25');

-- ----------------------------
-- Table structure for `life_parameter`
-- ----------------------------
DROP TABLE IF EXISTS `life_parameter`;
CREATE TABLE `life_parameter` (
  `param_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '参数ID',
  `param_key` varchar(24) NOT NULL COMMENT '参数名',
  `param_value` varchar(96) NOT NULL COMMENT '参数值',
  `remark` varchar(96) NOT NULL,
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`param_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_parameter
-- ----------------------------
INSERT INTO `life_parameter` VALUES ('1', 'CAROUSEL', '/images/u4_state0.jpg', '轮播', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-09 19:47:44');
INSERT INTO `life_parameter` VALUES ('2', 'CAROUSEL', '/images/carousel2', '轮播', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-09 19:48:32');
INSERT INTO `life_parameter` VALUES ('3', 'CAROUSEL', '/images/carousel3', '轮播', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-09 19:48:28');
INSERT INTO `life_parameter` VALUES ('4', 'SYSTEM_EMAIL', '840618902@qq.com', '系统邮箱', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 01:10:10');
INSERT INTO `life_parameter` VALUES ('5', 'STAR_POINT', '20', '每颗星对应分数', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 19:07:06');
INSERT INTO `life_parameter` VALUES ('6', 'MAX_POINT', '100', '点评分数上限', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-10 17:03:27');
INSERT INTO `life_parameter` VALUES ('7', 'COMMENT_NO_PIC', '5', '无图点评分数', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-10 17:04:32');
INSERT INTO `life_parameter` VALUES ('8', 'COMMENT_PIC', '10', '有图点评分数', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-10 17:05:04');
INSERT INTO `life_parameter` VALUES ('9', 'RECOM_POINT', '20', '推荐用户', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-10 17:06:19');
INSERT INTO `life_parameter` VALUES ('10', 'INDEX_BRAND_NO', '15', '首页默认显示品牌数', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-11 21:59:02');

-- ----------------------------
-- Table structure for `life_sms`
-- ----------------------------
DROP TABLE IF EXISTS `life_sms`;
CREATE TABLE `life_sms` (
  `sms_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '短信ID',
  `content` varchar(255) NOT NULL COMMENT '内容',
  `code` char(10) NOT NULL COMMENT '验证码',
  `add_time` datetime NOT NULL COMMENT '添加时间',
  `type` tinyint(1) NOT NULL COMMENT '短信类别(0是注册，1是忘记密码)',
  PRIMARY KEY (`sms_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_sms
-- ----------------------------

-- ----------------------------
-- Table structure for `life_system_info`
-- ----------------------------
DROP TABLE IF EXISTS `life_system_info`;
CREATE TABLE `life_system_info` (
  `sys_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统信息关联ID',
  `sms_id` int(11) NOT NULL COMMENT '消息ID',
  `user_id` char(32) NOT NULL COMMENT '会员ID',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '消息状态(0未读，1已读)',
  `view_time` datetime DEFAULT NULL COMMENT '查阅时间',
  PRIMARY KEY (`sys_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_system_info
-- ----------------------------

-- ----------------------------
-- Table structure for `life_system_sms_info`
-- ----------------------------
DROP TABLE IF EXISTS `life_system_sms_info`;
CREATE TABLE `life_system_sms_info` (
  `sms_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '信息ID',
  `title` varchar(40) NOT NULL COMMENT '标题',
  `content` text NOT NULL COMMENT '内容',
  `mng_id` char(32) NOT NULL,
  `send_time` datetime NOT NULL COMMENT '发送时间',
  PRIMARY KEY (`sms_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_system_sms_info
-- ----------------------------
INSERT INTO `life_system_sms_info` VALUES ('1', '系统消息', '消息测试', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-11 19:09:37');
INSERT INTO `life_system_sms_info` VALUES ('2', '网站上线喽', '网站上线喽', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-11 19:41:37');

-- ----------------------------
-- Table structure for `life_tag`
-- ----------------------------
DROP TABLE IF EXISTS `life_tag`;
CREATE TABLE `life_tag` (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `tag_name` varchar(32) NOT NULL COMMENT '标签名',
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`tag_id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_tag
-- ----------------------------
INSERT INTO `life_tag` VALUES ('1', '驰名品牌', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 16:33:39');
INSERT INTO `life_tag` VALUES ('2', '最近热门', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 17:09:20');
INSERT INTO `life_tag` VALUES ('3', '增长最快', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 17:11:07');
INSERT INTO `life_tag` VALUES ('4', '测试测试', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 19:34:43');
INSERT INTO `life_tag` VALUES ('5', '测试而已', '8b5b37d9208b4b7d828d4fa9828bf146', '2016-07-06 19:01:55');
INSERT INTO `life_tag` VALUES ('6', '继续实施', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 19:14:27');
INSERT INTO `life_tag` VALUES ('7', '测试1', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 19:16:13');
INSERT INTO `life_tag` VALUES ('8', '测试2', 'b45e0fca9ae94c93b81c292534c690fa', '2016-07-10 19:16:59');

-- ----------------------------
-- Table structure for `life_tag_brand`
-- ----------------------------
DROP TABLE IF EXISTS `life_tag_brand`;
CREATE TABLE `life_tag_brand` (
  `tb_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签品牌关联ID',
  `brand_id` int(11) NOT NULL COMMENT '品牌ID',
  `tag_id` int(11) NOT NULL COMMENT '标签ID',
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`tb_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_tag_brand
-- ----------------------------

-- ----------------------------
-- Table structure for `life_tag_category`
-- ----------------------------
DROP TABLE IF EXISTS `life_tag_category`;
CREATE TABLE `life_tag_category` (
  `tc_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签类别关联ID',
  `cate_id` int(11) NOT NULL COMMENT '类别ID',
  `tag_id` int(11) NOT NULL COMMENT '标签ID',
  `mng_id` char(32) NOT NULL COMMENT '管理员ID',
  `visable` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否菜单显示(0显示，1不显示)',
  `upd_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`tc_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_tag_category
-- ----------------------------
INSERT INTO `life_tag_category` VALUES ('1', '3', '1', '8b5b37d9208b4b7d828d4fa9828bf146', '0', '2016-07-10 10:40:08');
INSERT INTO `life_tag_category` VALUES ('2', '3', '2', '8b5b37d9208b4b7d828d4fa9828bf146', '0', '2016-07-10 15:25:46');

-- ----------------------------
-- Table structure for `life_user`
-- ----------------------------
DROP TABLE IF EXISTS `life_user`;
CREATE TABLE `life_user` (
  `user_id` char(32) NOT NULL COMMENT '会员ID',
  `nickname` varchar(32) NOT NULL COMMENT '会员昵称',
  `username` varchar(32) DEFAULT NULL COMMENT '会员名(真实名称)',
  `telephone` varchar(32) NOT NULL COMMENT '手机号码',
  `password` varchar(40) NOT NULL COMMENT '密码',
  `salt` varchar(9) NOT NULL COMMENT '盐值',
  `email` varchar(96) DEFAULT NULL COMMENT '邮箱',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别(0女，1男)',
  `education` varchar(12) DEFAULT NULL COMMENT '学历',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `collage` varchar(255) DEFAULT NULL COMMENT '毕业院校',
  `avatar` varchar(96) DEFAULT NULL COMMENT '用户头像',
  `bonus_point` int(11) NOT NULL DEFAULT '0' COMMENT '积分',
  `grade_id` int(9) NOT NULL COMMENT '等级ID',
  `address` text COMMENT '所在地区',
  `idcard` varchar(24) DEFAULT NULL COMMENT '身份证号码',
  `img_a` varchar(96) DEFAULT NULL COMMENT '身份证照(正面)',
  `img_b` varchar(96) DEFAULT NULL COMMENT '身份证照(反面)',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '用户状态(0有效，1无效)',
  `verified` tinyint(1) DEFAULT '1' COMMENT '审核状态(0已审核，1未审核，2审核不通过)',
  `add_time` datetime NOT NULL COMMENT '注册日期',
  `last_time` datetime NOT NULL COMMENT '上回登录时间',
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of life_user
-- ----------------------------
INSERT INTO `life_user` VALUES ('79b09257337d4c868e3bc3694c0246ed', 'Chaos', '刘强', '15161644051', 'b605e86d02eef8bfd0646f6a704c17c9', '1234', '604373163@qq.com', '1', null, null, null, 'kong', '0', '1', '1123', '1', null, null, '0', '2', '2016-06-12 14:18:56', '2016-06-12 14:18:59');
