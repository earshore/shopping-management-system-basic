

DROP TABLE IF EXISTS `salesman`;
CREATE TABLE `salesman` (
  `sid` int(10) NOT NULL AUTO_INCREMENT,
  `sname` varchar(10) NOT NULL,
  `spassword` varchar(20) NOT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY `sname` (`sname`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;