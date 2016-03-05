CREATE SCHEMA `java_example` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE TABLE `ur_user` (
  `user_id` varchar(32) NOT NULL,
  `sex` char(1) DEFAULT NULL,
  `nickname` varchar(16) DEFAULT NULL,
  `qq_no` varchar(16) DEFAULT NULL,
  `wx_no` varchar(16) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;