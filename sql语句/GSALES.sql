

DROP TABLE IF EXISTS `gsales`;
CREATE TABLE `gsales` (
  `gsid` int(10) NOT NULL AUTO_INCREMENT,
  `gid` int(10) NOT NULL,
  `sid` int(10) NOT NULL,
  `sdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `snum` int(11) NOT NULL,
  PRIMARY KEY (`gsid`),
  FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`),
  FOREIGN KEY (`sid`) REFERENCES `salesman` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;