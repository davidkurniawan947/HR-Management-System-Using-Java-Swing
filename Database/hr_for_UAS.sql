/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 10.1.30-MariaDB : Database - hr
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hr` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hr`;

/*Table structure for table `countries` */

DROP TABLE IF EXISTS `countries`;

CREATE TABLE `countries` (
  `country_id` int(11) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(40) DEFAULT NULL,
  `region_id` int(11) NOT NULL,
  PRIMARY KEY (`country_id`),
  KEY `countries_regions_region_id` (`region_id`),
  CONSTRAINT `countries_regions_region_id` FOREIGN KEY (`region_id`) REFERENCES `regions` (`region_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `countries` */

insert  into `countries`(`country_id`,`country_name`,`region_id`) values 
(1,'Argentina',2),
(2,'Australia',3),
(3,'Belgium',1),
(4,'Brazil',2),
(5,'Canada',2),
(6,'Switzerland',1),
(7,'China',3),
(8,'Germany',1),
(9,'Denmark',1),
(10,'Egypt',4),
(11,'France',1),
(12,'HongKong',3),
(13,'Israel',4),
(14,'India',3),
(15,'Italy',1),
(16,'Japan',3),
(17,'Kuwait',4),
(18,'Mexico',2),
(19,'Nigeria',4),
(20,'Netherlands',1),
(21,'Singapore',3),
(22,'United Kingdom',1),
(23,'United States of America',2),
(24,'Zambia',4),
(25,'Zimbabwe',4),
(28,'',7);

/*Table structure for table `departments` */

DROP TABLE IF EXISTS `departments`;

CREATE TABLE `departments` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(30) NOT NULL,
  `manager_id` int(11) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`department_id`),
  KEY `departments_locations_location_id` (`location_id`),
  KEY `departments_ibfk_1` (`manager_id`),
  CONSTRAINT `departments_locations_location_id` FOREIGN KEY (`location_id`) REFERENCES `locations` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=271 DEFAULT CHARSET=utf8;

/*Data for the table `departments` */

insert  into `departments`(`department_id`,`department_name`,`manager_id`,`location_id`) values 
(10,'Administration',200,1700),
(20,'Marketing',201,1800),
(30,'Purchasing',114,1700),
(40,'Human Resources',203,2400),
(50,'Shipping',121,1500),
(60,'IT',103,1400),
(70,'Public Relations',204,2700),
(80,'Sales',145,2500),
(90,'Executive',100,1700),
(100,'Finance',108,1700),
(110,'Accounting',205,1700),
(120,'Treasury',NULL,1700),
(130,'Corporate Tax',NULL,1700),
(140,'Control And Credit',NULL,1700),
(150,'Shareholder Services',NULL,1700),
(160,'Benefits',NULL,1700),
(170,'Manufacturing',NULL,1700),
(180,'Construction',NULL,1700),
(190,'Contracting',NULL,1700),
(200,'Operations',NULL,1700),
(210,'IT Support',NULL,1700),
(220,'NOC',NULL,1700),
(230,'IT Helpdesk',NULL,1700),
(240,'Government Sales',NULL,1700),
(250,'Retail Sales',NULL,1700),
(260,'Recruiting',NULL,1700),
(270,'Payroll',NULL,1700);

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `hire_date` date NOT NULL,
  `job_id` int(11) NOT NULL,
  `salary` double NOT NULL,
  `commission_pct` double DEFAULT NULL,
  `manager_id` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `employees_departments_department_id` (`department_id`),
  KEY `employees_employees_employee_id` (`manager_id`),
  KEY `employees_jobs_job_id` (`job_id`),
  CONSTRAINT `employees_departments_department_id` FOREIGN KEY (`department_id`) REFERENCES `departments` (`department_id`),
  CONSTRAINT `employees_jobs_job_id` FOREIGN KEY (`job_id`) REFERENCES `jobs` (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8;

/*Data for the table `employees` */

insert  into `employees`(`employee_id`,`first_name`,`last_name`,`email`,`phone_number`,`hire_date`,`job_id`,`salary`,`commission_pct`,`manager_id`,`department_id`) values 
(100,'Steven','King','SKING','515.123.4567','1987-06-17',1,24000,NULL,NULL,90),
(101,'Neena','Kochhar','NKOCHHAR','515.123.4568','1989-09-21',2,17000,NULL,100,90),
(102,'Lex','De Haan','LDEHAAN','515.123.4569','1993-01-13',2,17000,NULL,100,90),
(103,'Alexander','Hunold','AHUNOLD','590.423.4567','1990-01-03',3,9000,NULL,102,60),
(104,'Bruce','Ernst','BERNST','590.423.4568','1991-05-21',3,6000,NULL,103,60),
(105,'David','Austin','DAUSTIN','590.423.4569','1997-06-25',3,4800,NULL,103,60),
(106,'Valli','Pataballa','VPATABAL','590.423.4560','1998-02-05',3,4800,NULL,103,60),
(107,'Diana','Lorentz','DLORENTZ','590.423.5567','1999-02-07',3,4200,NULL,103,60),
(108,'Nancy','Greenberg','NGREENBE','515.124.4569','1994-08-17',4,12000,NULL,101,100),
(109,'Daniel','Faviet','DFAVIET','515.124.4169','1994-08-16',5,9000,NULL,108,100),
(110,'John','Chen','JCHEN','515.124.4269','1997-09-28',5,8200,NULL,108,100),
(111,'Ismael','Sciarra','ISCIARRA','515.124.4369','1997-09-30',5,7700,NULL,108,100),
(112,'Jose Manuel','Urman','JMURMAN','515.124.4469','1998-03-07',5,7800,NULL,108,100),
(113,'Luis','Popp','LPOPP','515.124.4567','1999-12-07',5,6900,NULL,108,100),
(114,'Den','Raphaely','DRAPHEAL','515.127.4561','1994-12-07',14,11000,NULL,100,30),
(115,'Alexander','Khoo','AKHOO','515.127.4562','1995-05-18',13,3100,NULL,114,30),
(116,'Shelli','Baida','SBAIDA','515.127.4563','1997-12-24',13,2900,NULL,114,30),
(117,'Sigal','Tobias','STOBIAS','515.127.4564','1997-07-24',13,2800,NULL,114,30),
(118,'Guy','Himuro','GHIMURO','515.127.4565','1998-11-15',13,2600,NULL,114,30),
(119,'Karen','Colmenares','KCOLMENA','515.127.4566','1999-08-10',13,2500,NULL,114,30),
(120,'Matthew','Weiss','MWEISS','650.123.1234','1996-07-18',19,8000,NULL,100,50),
(121,'Adam','Fripp','AFRIPP','650.123.2234','1997-04-10',19,8200,NULL,100,50),
(122,'Payam','Kaufling','PKAUFLIN','650.123.3234','1995-05-01',19,7900,NULL,100,50),
(123,'Shanta','Vollman','SVOLLMAN','650.123.4234','1997-10-10',19,6500,NULL,100,50),
(124,'Kevin','Mourgos','KMOURGOS','650.123.5234','1999-11-16',19,5800,NULL,100,50),
(125,'Julia','Nayer','JNAYER','650.124.1214','1997-07-16',18,3200,NULL,120,50),
(126,'Irene','Mikkilineni','IMIKKILI','650.124.1224','1998-09-28',18,2700,NULL,120,50),
(127,'James','Landry','JLANDRY','650.124.1334','1999-01-14',18,2400,NULL,120,50),
(128,'Steven','Markle','SMARKLE','650.124.1434','2000-03-08',18,2200,NULL,120,50),
(129,'Laura','Bissot','LBISSOT','650.124.5234','1997-08-20',18,3300,NULL,121,50),
(130,'Mozhe','Atkinson','MATKINSO','650.124.6234','1997-10-30',18,2800,NULL,121,50),
(131,'James','Marlow','JAMRLOW','650.124.7234','1997-02-16',18,2500,NULL,121,50),
(132,'TJ','Olson','TJOLSON','650.124.8234','1999-04-10',18,2100,NULL,121,50),
(133,'Jason','Mallin','JMALLIN','650.127.1934','1996-06-14',18,3300,NULL,122,50),
(134,'Michael','Rogers','MROGERS','650.127.1834','1998-08-26',18,2900,NULL,122,50),
(135,'Ki','Gee','KGEE','650.127.1734','1999-12-12',18,2400,NULL,122,50),
(136,'Hazel','Philtanker','HPHILTAN','650.127.1634','2000-02-06',18,2200,NULL,122,50),
(137,'Renske','Ladwig','RLADWIG','650.121.1234','1995-07-14',18,3600,NULL,123,50),
(138,'Stephen','Stiles','SSTILES','650.121.2034','1997-10-26',18,3200,NULL,123,50),
(139,'John','Seo','JSEO','650.121.2019','1998-02-12',18,2700,NULL,123,50),
(140,'Joshua','Patel','JPATEL','650.121.1834','1998-04-06',18,2500,NULL,123,50),
(141,'Trenna','Rajs','TRAJS','650.121.8009','1995-10-17',18,3500,NULL,124,50),
(142,'Curtis','Davies','CDAVIES','650.121.2994','1997-01-29',18,3100,NULL,124,50),
(143,'Randall','Matos','RMATOS','650.121.2874','1998-03-15',18,2600,NULL,124,50),
(144,'Peter','Vargas','PVARGAS','650.121.2004','1998-07-09',18,2500,NULL,124,50),
(145,'John','Russell','JRUSSEL','011.44.1344.429268','1996-10-01',15,14000,0.4,100,80),
(146,'Karen','Partners','KPARTNER','011.44.1344.467268','1997-01-05',15,13500,0.3,100,80),
(147,'Alberto','Errazuriz','AERRAZUR','011.44.1344.429278','1997-03-10',15,12000,0.3,100,80),
(148,'Gerald','Cambrault','GCAMBRAU','011.44.1344.619268','1999-10-15',15,11000,0.3,100,80),
(149,'Eleni','Zlotkey','EZLOTKEY','011.44.1344.429018','2000-01-29',15,10500,0.2,100,80),
(150,'Peter','Tucker','PTUCKER','011.44.1344.129268','1997-01-30',16,10000,0.3,145,80),
(151,'David','Bernstein','DBERNSTE','011.44.1344.345268','1997-03-24',16,9500,0.25,145,80),
(152,'Peter','Hall','PHALL','011.44.1344.478968','1997-08-20',16,9000,0.25,145,80),
(153,'Christopher','Olsen','COLSEN','011.44.1344.498718','1998-03-30',16,8000,0.2,145,80),
(154,'Nanette','Cambrault','NCAMBRAU','011.44.1344.987668','1998-12-09',16,7500,0.2,145,80),
(155,'Oliver','Tuvault','OTUVAULT','011.44.1344.486508','1999-11-23',16,7000,0.15,145,80),
(156,'Janette','King','JKING','011.44.1345.429268','1996-01-30',16,10000,0.35,146,80),
(157,'Patrick','Sully','PSULLY','011.44.1345.929268','1996-03-04',16,9500,0.35,146,80),
(158,'Allan','McEwen','AMCEWEN','011.44.1345.829268','1996-08-01',16,9000,0.35,146,80),
(159,'Lindsey','Smith','LSMITH','011.44.1345.729268','1997-03-10',16,8000,0.3,146,80),
(160,'Louise','Doran','LDORAN','011.44.1345.629268','1997-12-15',16,7500,0.3,146,80),
(161,'Sarath','Sewall','SSEWALL','011.44.1345.529268','1998-11-03',16,7000,0.25,146,80),
(162,'Clara','Vishney','CVISHNEY','011.44.1346.129268','1997-11-11',16,10500,0.25,147,80),
(163,'Danielle','Greene','DGREENE','011.44.1346.229268','1999-03-19',16,9500,0.15,147,80),
(164,'Mattea','Marvins','MMARVINS','011.44.1346.329268','2000-01-24',16,7200,0.1,147,80),
(165,'David','Lee','DLEE','011.44.1346.529268','2000-02-23',16,6800,0.1,147,80),
(166,'Sundar','Ande','SANDE','011.44.1346.629268','2000-03-24',16,6400,0.1,147,80),
(167,'Amit','Banda','ABANDA','011.44.1346.729268','2000-04-21',16,6200,0.1,147,80),
(168,'Lisa','Ozer','LOZER','011.44.1343.929268','1997-03-11',16,11500,0.25,148,80),
(169,'Harrison','Bloom','HBLOOM','011.44.1343.829268','1998-03-23',16,10000,0.2,148,80),
(170,'Tayler','Fox','TFOX','011.44.1343.729268','1998-01-24',16,9600,0.2,148,80),
(171,'William','Smith','WSMITH','011.44.1343.629268','1999-02-23',16,7400,0.15,148,80),
(172,'Elizabeth','Bates','EBATES','011.44.1343.529268','1999-03-24',16,7300,0.15,148,80),
(173,'Sundita','Kumar','SKUMAR','011.44.1343.329268','2000-04-21',16,6100,0.1,148,80),
(174,'Ellen','Abel','EABEL','011.44.1644.429267','1996-05-11',16,11000,0.3,149,80),
(175,'Alyssa','Hutton','AHUTTON','011.44.1644.429266','1997-03-19',16,8800,0.25,149,80),
(176,'Jonathon','Taylor','JTAYLOR','011.44.1644.429265','1998-03-24',16,8600,0.2,149,80),
(177,'Jack','Livingston','JLIVINGS','011.44.1644.429264','1998-04-23',16,8400,0.2,149,80),
(178,'Kimberely','Grant','KGRANT','011.44.1644.429263','1999-05-24',16,7000,0.15,149,80),
(179,'Charles','Johnson','CJOHNSON','011.44.1644.429262','2000-01-04',16,6200,0.1,149,80),
(180,'Winston','Taylor','WTAYLOR','650.507.9876','1998-01-24',17,3200,NULL,120,50),
(181,'Jean','Fleaur','JFLEAUR','650.507.9877','1998-02-23',17,3100,NULL,120,50),
(182,'Martha','Sullivan','MSULLIVA','650.507.9878','1999-06-21',17,2500,NULL,120,50),
(183,'Girard','Geoni','GGEONI','650.507.9879','2000-02-03',17,2800,NULL,120,50),
(184,'Nandita','Sarchand','NSARCHAN','650.509.1876','1996-01-27',17,4200,NULL,121,50),
(185,'Alexis','Bull','ABULL','650.509.2876','1997-02-20',17,4100,NULL,121,50),
(186,'Julia','Dellinger','JDELLING','650.509.3876','1998-06-24',17,3400,NULL,121,50),
(187,'Anthony','Cabrio','ACABRIO','650.509.4876','1999-02-07',17,3000,NULL,121,50),
(188,'Kelly','Chung','KCHUNG','650.505.1876','1997-06-14',17,3800,NULL,122,50),
(189,'Jennifer','Dilly','JDILLY','650.505.2876','1997-08-13',17,3600,NULL,122,50),
(190,'Timothy','Gates','TGATES','650.505.3876','1998-07-11',17,2900,NULL,122,50),
(191,'Randall','Perkins','RPERKINS','650.505.4876','1999-12-19',17,2500,NULL,122,50),
(192,'Sarah','Bell','SBELL','650.501.1876','1996-02-04',17,4000,NULL,123,50),
(193,'Britney','Everett','BEVERETT','650.501.2876','1997-03-03',17,3900,NULL,123,50),
(194,'Samuel','McCain','SMCCAIN','650.501.3876','1998-07-01',17,3200,NULL,123,50),
(195,'Vance','Jones','VJONES','650.501.4876','1999-03-17',17,2800,NULL,123,50),
(196,'Alana','Walsh','AWALSH','650.507.9811','1998-04-24',17,3100,NULL,124,50),
(197,'Kevin','Feeney','KFEENEY','650.507.9822','1998-05-23',17,3000,NULL,124,50),
(198,'Donald','OConnell','DOCONNEL','650.507.9833','1999-06-21',17,2600,NULL,124,50),
(199,'Douglas','Grant','DGRANT','650.507.9844','2000-01-13',17,2600,NULL,124,50),
(200,'Jennifer','Whalen','JWHALEN','515.123.4444','1987-09-17',8,4400,NULL,101,10),
(201,'Michael','Hartstein','MHARTSTE','515.123.5555','1996-02-17',10,13000,NULL,100,20),
(202,'Pat','Fay','PFAY','603.123.6666','1997-08-17',11,6000,NULL,201,20),
(203,'Susan','Mavris','SMAVRIS','515.123.7777','1994-06-07',9,6500,NULL,101,40),
(204,'Hermann','Baer','HBAER','515.123.8888','1994-06-07',12,10000,NULL,101,70),
(205,'Shelley','Higgins','SHIGGINS','515.123.8080','1994-06-07',7,12000,NULL,101,110),
(206,'William','Gietz','WGIETZ','51hr5.123.8181','1994-06-07',6,8300,NULL,205,110);

/*Table structure for table `jobs` */

DROP TABLE IF EXISTS `jobs`;

CREATE TABLE `jobs` (
  `job_id` int(11) NOT NULL AUTO_INCREMENT,
  `job_title` varchar(35) NOT NULL,
  `min_salary` double NOT NULL,
  `max_salary` double NOT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `jobs` */

insert  into `jobs`(`job_id`,`job_title`,`min_salary`,`max_salary`) values 
(1,'President',20000,40000),
(2,'Administration Vice President',15000,30000),
(3,'Programmer',4000,10000),
(4,'Finance Manager',8200,16000),
(5,'Accountant',4200,9000),
(6,'Public Accountant',4200,9000),
(7,'Accounting Manager',8200,16000),
(8,'Administration Assistant',3000,6000),
(9,'Human Resources Representative',4000,9000),
(10,'Marketing Manager',9000,15000),
(11,'Marketing Representative',4000,9000),
(12,'Public Relations Representative',4500,10500),
(13,'Purchasing Clerk',2500,5500),
(14,'Purchasing Manager',8000,15000),
(15,'Sales Manager',10000,20000),
(16,'Sales Representative',6000,12000),
(17,'Shipping Clerk',2500,5500),
(18,'Stock Clerk',2000,5000),
(19,'Stock Manager',5500,8500);

/*Table structure for table `locations` */

DROP TABLE IF EXISTS `locations`;

CREATE TABLE `locations` (
  `location_id` int(11) NOT NULL AUTO_INCREMENT,
  `street_address` varchar(40) DEFAULT NULL,
  `postal_code` varchar(12) DEFAULT NULL,
  `city` varchar(30) NOT NULL,
  `state_province` varchar(25) DEFAULT NULL,
  `country_id` int(11) NOT NULL,
  PRIMARY KEY (`location_id`),
  KEY `locations_countries_country_id` (`country_id`),
  CONSTRAINT `locations_countries_country_id` FOREIGN KEY (`country_id`) REFERENCES `countries` (`country_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3203 DEFAULT CHARSET=utf8;

/*Data for the table `locations` */

insert  into `locations`(`location_id`,`street_address`,`postal_code`,`city`,`state_province`,`country_id`) values 
(1000,'1297 Via Cola di Rie','00989','Roma',NULL,15),
(1100,'93091 Calle della Testa','10934','Venice',NULL,15),
(1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefecture',16),
(1300,'9450 Kamiya-cho','6823','Hiroshima',NULL,16),
(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas',23),
(1500,'2011 Interiors Blvd','99236','South San Francisco','California',23),
(1600,'2007 Zagora St','50090','South Brunswick','New Jersey',23),
(1700,'2004 Charade Rd','98199','Seattle','Washington',23),
(1800,'147 Spadina Ave','M5V 2L7','Toronto','Ontario',5),
(1900,'6092 Boxwood St','YSW 9T2','Whitehorse','Yukon',5),
(2000,'40-5-12 Laogianggen','190518','Beijing',NULL,7),
(2100,'1298 Vileparle (E)','490231','Bombay','Maharashtra',14),
(2200,'12-98 Victoria Street','2901','Sydney','New South Wales',2),
(2300,'198 Clementi North','540198','Singapore',NULL,21),
(2400,'8204 Arthur St',NULL,'London',NULL,22),
(2500,'Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford',22),
(2600,'9702 Chester Road','09629850293','Stretford','Manchester',22),
(2700,'Schwanthalerstr. 7031','80925','Munich','Bavaria',8),
(2800,'Rua Frei Caneca 1360 ','01307-002','Sao Paulo','Sao Paulo',4),
(2900,'20 Rue des Corps-Saints','1730','Geneva','Geneve',6),
(3000,'Murtenstrasse 921','3095','Bern','BE',6),
(3100,'Pieter Breughelstraat 837','3029SK','Utrecht','Utrecht',20),
(3200,'Mariano Escobedo 9991','11932','Mexico City','Distrito Federal,',18),
(3202,'yy','yy','yy','yy',5);

/*Table structure for table `regions` */

DROP TABLE IF EXISTS `regions`;

CREATE TABLE `regions` (
  `region_id` int(11) NOT NULL AUTO_INCREMENT,
  `region_name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `regions` */

insert  into `regions`(`region_id`,`region_name`) values 
(1,'Europe'),
(2,'Americas'),
(3,'Asia'),
(4,'Middle East and Africa'),
(7,'aaaa'),
(10,'xx'),
(11,'');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
