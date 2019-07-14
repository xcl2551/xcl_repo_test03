/*
SQLyog v10.2 
MySQL - 5.5.40 : Database - scda_user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`scda_user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `scda_user`;

/*Table structure for table `oauth_access_token` */

DROP TABLE IF EXISTS `oauth_access_token`;

CREATE TABLE `oauth_access_token` (
  `token_id` varchar(256) DEFAULT NULL,
  `token` blob,
  `authentication_id` varchar(48) NOT NULL,
  `user_name` varchar(256) DEFAULT NULL,
  `client_id` varchar(256) DEFAULT NULL,
  `authentication` blob,
  `refresh_token` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`authentication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_access_token` */

/*Table structure for table `oauth_approvals` */

DROP TABLE IF EXISTS `oauth_approvals`;

CREATE TABLE `oauth_approvals` (
  `userId` varchar(256) DEFAULT NULL,
  `clientId` varchar(256) DEFAULT NULL,
  `scope` varchar(256) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `expiresAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lastModifiedAt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_approvals` */

insert  into `oauth_approvals`(`userId`,`clientId`,`scope`,`status`,`expiresAt`,`lastModifiedAt`) values (NULL,NULL,NULL,NULL,'2019-03-05 19:29:18','0000-00-00 00:00:00');

/*Table structure for table `oauth_client_details` */

DROP TABLE IF EXISTS `oauth_client_details`;

CREATE TABLE `oauth_client_details` (
  `client_id` varchar(48) NOT NULL,
  `resource_ids` varchar(256) DEFAULT NULL,
  `client_secret` varchar(256) DEFAULT NULL,
  `scope` varchar(256) DEFAULT NULL,
  `authorized_grant_types` varchar(256) DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) DEFAULT NULL,
  `authorities` varchar(256) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `autoapprove` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_client_details` */

insert  into `oauth_client_details`(`client_id`,`resource_ids`,`client_secret`,`scope`,`authorized_grant_types`,`web_server_redirect_uri`,`authorities`,`access_token_validity`,`refresh_token_validity`,`additional_information`,`autoapprove`) values ('app',NULL,'app','app','password,refresh_token',NULL,NULL,NULL,NULL,NULL,NULL),('XcWebApp',NULL,'$2a$10$9bEpZ/hWRQxyr5hn5wHUj.jxFpIrnOmBcWlE/g/0Zp3uNxt9QTh/S','app','authorization_code,password,refresh_token,client_credentials',NULL,NULL,43200,43200,NULL,NULL);

/*Table structure for table `oauth_client_token` */

DROP TABLE IF EXISTS `oauth_client_token`;

CREATE TABLE `oauth_client_token` (
  `token_id` varchar(256) DEFAULT NULL,
  `token` blob,
  `authentication_id` varchar(48) NOT NULL,
  `user_name` varchar(256) DEFAULT NULL,
  `client_id` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`authentication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_client_token` */

/*Table structure for table `oauth_code` */

DROP TABLE IF EXISTS `oauth_code`;

CREATE TABLE `oauth_code` (
  `code` varchar(256) DEFAULT NULL,
  `authentication` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_code` */

/*Table structure for table `oauth_refresh_token` */

DROP TABLE IF EXISTS `oauth_refresh_token`;

CREATE TABLE `oauth_refresh_token` (
  `token_id` varchar(256) DEFAULT NULL,
  `token` blob,
  `authentication` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_refresh_token` */

insert  into `oauth_refresh_token`(`token_id`,`token`,`authentication`) values ('b96e057b4e1c4920428e833db48d4c15','��\0sr\0Lorg.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken/�Gc��ɷ\0L\0\nexpirationt\0Ljava/util/Date;xr\0Dorg.springframework.security.oauth2.common.DefaultOAuth2RefreshTokens�\ncT�^\0L\0valuet\0Ljava/lang/String;xpt\0$b012d487-a908-43af-a8ef-53c5399c8bd6sr\0java.util.Datehj�KYt\0\0xpw\0\0a;tɎx','��\0sr\0Aorg.springframework.security.oauth2.provider.OAuth2Authentication�@bR\0L\0\rstoredRequestt\0<Lorg/springframework/security/oauth2/provider/OAuth2Request;L\0userAuthenticationt\02Lorg/springframework/security/core/Authentication;xr\0Gorg.springframework.security.authentication.AbstractAuthenticationTokenӪ(~nGd\0Z\0\rauthenticatedL\0authoritiest\0Ljava/util/Collection;L\0detailst\0Ljava/lang/Object;xp\0sr\0&java.util.Collections$UnmodifiableList�%1��\0L\0listt\0Ljava/util/List;xr\0,java.util.Collections$UnmodifiableCollectionB\0��^�\0L\0cq\0~\0xpsr\0java.util.ArrayListx����a�\0I\0sizexp\0\0\0	w\0\0\0	sr\0Borg.springframework.security.core.authority.SimpleGrantedAuthority\0\0\0\0\0\0�\0L\0rolet\0Ljava/lang/String;xpt\0\nROLE_adminsq\0~\0\rt\0apidocsq\0~\0\rt\0database/logsq\0~\0\rt\0systemsq\0~\0\rt\0user/addsq\0~\0\rt\0user/deletesq\0~\0\rt\0	user/editsq\0~\0\rt\0	user/viewsq\0~\0\rt\0userListxq\0~\0psr\0:org.springframework.security.oauth2.provider.OAuth2Request\0\0\0\0\0\0\0\0Z\0approvedL\0authoritiesq\0~\0L\0\nextensionst\0Ljava/util/Map;L\0redirectUriq\0~\0L\0refresht\0;Lorg/springframework/security/oauth2/provider/TokenRequest;L\0resourceIdst\0Ljava/util/Set;L\0\rresponseTypesq\0~\0$xr\08org.springframework.security.oauth2.provider.BaseRequest6(z>�qi�\0L\0clientIdq\0~\0L\0requestParametersq\0~\0\"L\0scopeq\0~\0$xpt\0webAppsr\0%java.util.Collections$UnmodifiableMap��t�B\0L\0mq\0~\0\"xpsr\0java.util.HashMap���`�\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\0w\0\0\0\0\0\0t\0\ngrant_typet\0passwordt\0usernamet\0adminxsr\0%java.util.Collections$UnmodifiableSet��я��U\0\0xq\0~\0	sr\0java.util.LinkedHashSet�l�Z��*\0\0xr\0java.util.HashSet�D�����4\0\0xpw\0\0\0?@\0\0\0\0\0t\0appxsq\0~\03w\0\0\0?@\0\0\0\0\0\0xsq\0~\0*?@\0\0\0\0\0\0w\0\0\0\0\0\0\0xppsq\0~\03w\0\0\0?@\0\0\0\0\0\0xsq\0~\03w\0\0\0?@\0\0\0\0\0\0xsr\0Oorg.springframework.security.authentication.UsernamePasswordAuthenticationToken\0\0\0\0\0\0�\0L\0credentialsq\0~\0L\0	principalq\0~\0xq\0~\0sq\0~\0sq\0~\0\0\0\0	w\0\0\0	q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0xq\0~\0=sr\0java.util.LinkedHashMap4�N\\l��\0Z\0accessOrderxq\0~\0*?@\0\0\0\0\0w\0\0\0\0\0\0q\0~\0,q\0~\0-q\0~\0.q\0~\0/x\0psr\02org.springframework.security.core.userdetails.User\0\0\0\0\0\0�\0Z\0accountNonExpiredZ\0accountNonLockedZ\0credentialsNonExpiredZ\0enabledL\0authoritiesq\0~\0$L\0passwordq\0~\0L\0usernameq\0~\0xpsq\0~\00sr\0java.util.TreeSetݘP���[\0\0xpsr\0Forg.springframework.security.core.userdetails.User$AuthorityComparator\0\0\0\0\0\0�\0\0xpw\0\0\0	q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0q\0~\0xpt\0admin');

/*Table structure for table `scda_company` */

DROP TABLE IF EXISTS `scda_company`;

CREATE TABLE `scda_company` (
  `id` varchar(32) NOT NULL,
  `linkname` varchar(64) DEFAULT NULL COMMENT '联系人名称',
  `name` varchar(128) NOT NULL COMMENT '名称',
  `mobile` varchar(11) NOT NULL,
  `email` varchar(128) NOT NULL,
  `intro` varchar(512) DEFAULT NULL COMMENT '简介',
  `logo` varchar(128) DEFAULT NULL COMMENT 'logo',
  `identitypic` varchar(128) DEFAULT NULL COMMENT '身份证照片',
  `worktype` varchar(32) DEFAULT NULL COMMENT '工具性质',
  `businesspic` varchar(128) DEFAULT NULL COMMENT '营业执照',
  `status` varchar(32) DEFAULT NULL COMMENT '企业状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `scda_company` */

insert  into `scda_company`(`id`,`linkname`,`name`,`mobile`,`email`,`intro`,`logo`,`identitypic`,`worktype`,`businesspic`,`status`) values ('1','张老师','传智播客','13333334444','abc@126.com','2006年创建！',NULL,NULL,NULL,NULL,NULL),('2','李老师','博学谷','','',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `scda_company_userauth` */

DROP TABLE IF EXISTS `scda_company_userauth`;

CREATE TABLE `scda_company_userauth` (
  `id` varchar(32) NOT NULL,
  `company_id` varchar(32) NOT NULL,
  `user_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `xc_company_user_unique` (`company_id`,`user_id`),
  KEY `FK_xc_company_user_user_id` (`user_id`),
  CONSTRAINT `FK_xc_company_user_company_id` FOREIGN KEY (`company_id`) REFERENCES `scda_company` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_xc_company_user_user_id` FOREIGN KEY (`user_id`) REFERENCES `scda_userauth` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `scda_company_userauth` */

insert  into `scda_company_userauth`(`id`,`company_id`,`user_id`) values ('1','1','49'),('2','2','52');

/*Table structure for table `scda_userauth` */

DROP TABLE IF EXISTS `scda_userauth`;

CREATE TABLE `scda_userauth` (
  `id` varchar(32) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(96) NOT NULL,
  `salt` varchar(45) DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `userpic` varchar(255) DEFAULT NULL COMMENT '头像',
  `utype` varchar(32) NOT NULL,
  `birthday` datetime DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `qq` varchar(32) DEFAULT NULL,
  `status` varchar(32) NOT NULL COMMENT '用户状态',
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_user_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `scda_userauth` */

insert  into `scda_userauth`(`id`,`username`,`password`,`salt`,`name`,`userpic`,`utype`,`birthday`,`sex`,`email`,`phone`,`qq`,`status`,`create_time`,`update_time`) values ('46','super','$2a$10$TJ4TmCdK.X4wv/tCqHW14.w70U3CC33CeVncD3SLmyMXMknstqKRe',NULL,'超级管理员',NULL,'101003',NULL,'1',NULL,NULL,NULL,'1','2018-03-07 16:27:47',NULL),('48','admin','$2a$10$TJ4TmCdK.X4wv/tCqHW14.w70U3CC33CeVncD3SLmyMXMknstqKRe',NULL,'系统管理员',NULL,'101003',NULL,'1',NULL,NULL,NULL,'1','2018-03-07 16:27:47',NULL),('49','itcast','$2a$10$TJ4TmCdK.X4wv/tCqHW14.w70U3CC33CeVncD3SLmyMXMknstqKRe',NULL,'test02',NULL,'101002',NULL,'1','','12345',NULL,'1','2018-03-07 16:27:47',NULL),('50','stu1','$2a$10$pLtt2KDAFpwTWLjNsmTEi.oU1yOZyIn9XkziK/y/spH5rftCpUMZa',NULL,'学生1',NULL,'101001',NULL,'1',NULL,NULL,NULL,'1','2018-03-07 16:27:47',NULL),('51','stu2','$2a$10$nxPKkYSez7uz2YQYUnwhR.z57km3yqKn3Hr/p1FR6ZKgc18u.Tvqm',NULL,'学生2',NULL,'101001',NULL,'1',NULL,NULL,NULL,'1','2018-03-07 16:27:47',NULL),('52','t1','$2a$10$TJ4TmCdK.X4wv/tCqHW14.w70U3CC33CeVncD3SLmyMXMknstqKRe',NULL,'老师1',NULL,'101002',NULL,'1',NULL,NULL,NULL,'','2018-03-07 16:27:47',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
