/*
SQLyog - Free MySQL GUI v5.13
Host - 5.6.32 : Database - clouddatasecurity
*********************************************************************
Server version : 5.6.32
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `clouddatasecurity`;

USE `clouddatasecurity`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `receiver` varchar(50) DEFAULT NULL,
  `message` varchar(300) DEFAULT NULL,
  `covermessage` varchar(300) DEFAULT NULL,
  `stegomessage` varchar(300) DEFAULT NULL,
  `key1` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `message` */

insert into `message` (`id`,`username`,`receiver`,`message`,`covermessage`,`stegomessage`,`key1`) values (1,'selva','selva','this is private message','K76jv1D3G70ro04A','11610410511532105115321121141051189711610132109101115115971031017555541061184968517155481141114852653045022024691fef2d9e11bb150f965d2354aa7dd166bb988ed0c73af38d12ff7ff7d068022100bd5415d1d679fb73b2cb6296130925acf37a552f1d565dae483a5bc2d675fc24','3045022024691fef2d9e11bb150f965d2354aa7dd166bb988ed0c73af38d12ff7ff7d068022100bd5415d1d679fb73b2cb6296130925acf37a552f1d565dae483a5bc2d675fc24');

/*Table structure for table `userdetails` */

DROP TABLE IF EXISTS `userdetails`;

CREATE TABLE `userdetails` (
  `fullname` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `prof` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userdetails` */

insert into `userdetails` (`fullname`,`username`,`password`,`prof`,`mobile`,`emailid`) values ('Selva Kumar','selva','java','developer','9003570191','dselvait@gmail.com');

SET SQL_MODE=@OLD_SQL_MODE;