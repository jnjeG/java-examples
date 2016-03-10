CREATE DATABASE `java_examples` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE TABLE `product` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `product_name` varchar(32) DEFAULT NULL,
  `category` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `java_examples`.`product`
(`id`,
`product_name`,
`category`)
VALUES
('1', 'iphone', 'mobile');