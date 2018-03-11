CREATE DATABASE  IF NOT EXISTS `tpv` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tpv`;
-- MySQL dump 10.13  Distrib 5.7.19, for macos10.12 (x86_64)
--
-- Host: localhost    Database: tpv
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'cafes'),(2,'chocolates'),(3,'infusiones'),(4,'zumos'),(5,'bolleria'),(6,'menus'),(7,'bocadillos'),(8,'madalenas'),(9,'cookies'),(10,'teste');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `cp` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `provincia` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Diego','Hauptman','666666666','Carrer del Mas Duran','08923','Barcelona',''),(2,'Gliki','Geller Green','666666','La Joya Boulevard','45398754','Los Angeles','California'),(3,'Natalie','Carpenter','09 28 71 13 21','Ap #480-1380 Convallis St.','42961','Dos Hermanas','Andalucía'),(4,'Fiona','Gillespie','01 38 05 84 28','189-9667 Amet Rd.','57073','Cartagena','Murcia'),(5,'Brooke','Harrell','02 31 87 05 58','Ap #289-6895 Et, St.','08773','Santa Coloma de Gramenet','CA'),(6,'Stacy','Valenzuela','08 85 09 61 08','983-9585 Ipsum St.','09810','Torrejón de Ardoz','Madrid'),(7,'Kylee','Lindsey','06 59 84 62 26','Ap #103-1639 In Rd.','71111','Tarrasa','Catalunya'),(8,'Kylee','Padilla','08 11 29 17 29','Ap #720-8532 Integer St.','05013','Lugo','GA'),(9,'Kaseem','Riggs','02 16 36 80 08','Ap #322-6510 Eu, Rd.','86042','Cádiz','Andalucía'),(10,'Zahir','Olsen','02 42 92 18 91','P.O. Box 168, 1465 Ut Rd.','60363','Segovia','CL'),(11,'Simon','Ruiz','03 26 80 75 45','Ap #323-895 Risus. Rd.','50271','Castelló','Comunitat Valenciana'),(12,'Deborah','Rollins','08 68 68 24 36','574-3056 Vestibulum St.','51415','Getafe','Madrid'),(13,'Tanner','Gross','01 33 99 88 14','Ap #823-7939 In St.','12721','Elx','Comunitat Valenciana'),(14,'Malik','Haley','06 62 74 76 04','820-3714 A Av.','41419','Girona','Catalunya'),(15,'Elmo','Baldwin','04 27 99 91 85','136-9334 Lobortis Rd.','09830','Madrid','MA'),(16,'Ronan','Clark','03 86 73 48 04','2268 Pulvinar Ave','48710','Huelva','AN'),(17,'Kimberley','Holder','03 96 71 30 74','690 Massa. Street','85456','Tarragona','CA'),(18,'Xena','Saunders','05 94 93 37 32','281-7477 Lorem St.','55703','Bilbo','Euskadi'),(19,'Jennifer','Barlow','07 12 29 24 96','1744 Hendrerit Rd.','30803','Girona','Catalunya'),(20,'Ariana','Madden','04 80 61 53 06','Ap #213-5974 Magna. St.','48804','Reus','CA'),(21,'Remedios','Rose','03 59 42 19 22','Ap #760-2073 Rutrum Avenue','59314','Palma de Mallorca','BA'),(22,'Camilla','Hutchinson','08 48 31 48 65','P.O. Box 431, 5744 Eleifend Ave','30691','Telde','CN'),(23,'Victor','Walls','08 87 60 91 22','P.O. Box 337, 2935 In Rd.','53263','Marbella','Andalucía'),(24,'Thor','Curry','04 63 39 89 09','P.O. Box 913, 8384 Et Road','60048','Segovia','CL'),(25,'Katell','Terry','09 48 28 15 40','Ap #180-4437 Quis, Rd.','08659','Palencia','Castilla y León'),(26,'Len','Hunter','06 47 80 00 20','P.O. Box 991, 1570 Vitae Rd.','14625','Dos Hermanas','Andalucía'),(27,'Dustin','Fletcher','05 48 95 45 50','P.O. Box 169, 7935 Est, Rd.','58424','Sevilla','Andalucía'),(28,'Eric','Melton','02 08 70 73 87','P.O. Box 541, 8277 Eu St.','24641','Sevilla','Andalucía'),(29,'Shannon','Adkins','06 88 18 93 81','P.O. Box 679, 2982 Iaculis Rd.','15030','Madrid','MA'),(30,'Nathan','Welch','08 01 25 85 76','Ap #295-7954 Ultrices St.','20199','Gijón','AS'),(31,'Heidi','Deleon','09 99 89 56 71','Ap #298-7795 Sociis Avenue','73749','Alacant','Comunitat Valenciana'),(32,'Drake','Salinas','09 77 96 29 04','Ap #614-8818 Ac St.','11693','A Coruña','Galicia'),(33,'Reece','Haynes','06 76 84 29 56','5357 Justo. Avenue','76500','Mataró','CA'),(34,'Byron','Kline','03 75 38 89 95','Ap #201-6320 Sed Ave','17104','Barcelona','CA'),(35,'Morgan','Alvarado','05 07 63 32 35','Ap #146-9858 Metus St.','10470','Málaga','AN'),(36,'Miranda','Sellers','02 93 27 63 09','Ap #706-1016 Elit. Street','28586','Badalona','CA'),(37,'May','Jennings','02 15 59 44 36','771-4483 Auctor Ave','27370','Valéncia','CV'),(38,'Fuller','Calhoun','07 49 14 71 75','Ap #151-7447 Lacinia Road','69851','Almería','AN'),(39,'Amery','Turner','08 45 73 49 98','1122 Nec Rd.','95539','Getafe','Madrid'),(40,'Orson','Ayala','08 83 45 46 17','P.O. Box 608, 5860 Quisque Rd.','06556','Baracaldo','Euskadi'),(41,'Leandra','Osborn','07 69 63 13 61','P.O. Box 121, 644 Amet Avenue','77618','Logroño','LR'),(42,'Wesley','Schwartz','09 76 52 63 92','P.O. Box 694, 7440 Donec St.','17491','Girona','CA'),(43,'Lucas','Perkins','06 96 15 25 49','Ap #999-8060 Parturient St.','91209','Santa Coloma de Gramenet','CA'),(44,'Neil','Franks','09 69 95 97 87','Ap #753-101 Non, Avenue','78717','Madrid','MA'),(45,'Nissim','Blevins','03 22 90 73 81','Ap #575-3419 Faucibus Rd.','86865','Ourense','Galicia'),(46,'Hashim','Walls','06 86 53 24 84','2378 Commodo Road','51346','Donosti','Euskadi'),(47,'Lester','Sanchez','04 58 65 25 52','841-4422 Malesuada Rd.','95671','Badalona','CA'),(48,'Vivien','Burks','06 47 31 38 21','8364 Tellus. Road','66942','Badalona','CA'),(49,'Isadora','Orr','02 17 49 61 24','Ap #122-6709 Ultrices, Av.','35864','Huelva','AN'),(50,'Miriam','Brown','05 66 50 76 89','7007 Praesent St.','25186','Jaén','Andalucía'),(51,'Bianca','Frank','02 91 90 11 90','2912 Turpis. Ave','24101','Madrid','Madrid'),(52,'Kaye','Stafford','06 05 28 60 03','P.O. Box 995, 8479 Parturient Road','21037','Logroño','LR'),(53,'Aimee','Lane','01 66 53 93 08','P.O. Box 559, 9716 Fringilla Rd.','75669','Alcalá de Henares','Madrid'),(54,'Sierra','Barry','06 52 48 43 75','7412 Cursus St.','47329','Huelva','Andalucía'),(55,'Kylie','Mccormick','02 84 40 80 16','4459 Commodo Road','44448','Albacete','CM'),(56,'Erasmus','Chaney','09 76 38 13 19','5214 Nascetur Rd.','06738','Lugo','GA'),(57,'Bradley','Randall','04 22 86 58 22','P.O. Box 379, 2258 Sed, St.','43342','Almería','AN'),(58,'Keith','Downs','09 57 37 63 11','304-7427 Mauris St.','44366','Alcalá de Henares','Madrid'),(59,'Quinn','Frye','06 39 89 57 38','502-2671 Cubilia St.','63219','Pontevedra','Galicia'),(60,'Ariana','Mccoy','09 09 01 41 58','3459 Nonummy. Road','64152','Valéncia','Comunitat Valenciana'),(61,'Dean','Larsen','08 89 07 78 29','464-5019 Est Rd.','32597','Madrid','MA'),(62,'Anjolie','Wall','03 83 55 80 53','157 Amet St.','85069','Getafe','Madrid'),(63,'Clio','Rosario','02 83 82 66 59','5660 Erat. Rd.','30003','Alcorcón','Madrid'),(64,'Addison','Burns','02 28 23 12 11','897-3498 Vestibulum St.','51980','L\'Hospitalet de Llobregat','Catalunya'),(65,'Katelyn','Myers','01 55 32 36 55','9457 Aliquam St.','15459','Sevilla','Andalucía'),(66,'Uriah','Hartman','06 94 97 09 96','P.O. Box 761, 2607 Libero. St.','38192','Huelva','Andalucía'),(67,'Laurel','Harrington','03 34 02 08 15','8788 Consectetuer Street','10219','Parla','MA'),(68,'Ian','Mejia','04 02 38 07 14','P.O. Box 980, 8517 Dolor St.','16177','Torrevieja','Comunitat Valenciana'),(69,'Audrey','Middleton','03 31 01 09 64','P.O. Box 656, 6140 Nibh Street','23610','Ciudad Real','CM'),(70,'Carson','Blackburn','09 30 26 20 87','756-348 Phasellus Rd.','38079','Telde','CN'),(71,'Amanda','Peck','01 94 15 82 24','Ap #242-9386 Pede. Ave','76543','Oviedo','Principado de Asturias'),(72,'Brian','Rivers','06 92 33 31 08','P.O. Box 945, 7471 Aliquet, Av.','81516','Bilbo','Euskadi'),(73,'Kelly','Porter','05 05 16 68 60','4990 Lectus Avenue','36073','Granada','AN'),(74,'Eric','Hays','06 06 88 34 09','Ap #727-8018 Ac Avenue','88064','Palma de Mallorca','BA'),(75,'Jasper','Simmons','04 18 89 87 83','4732 Id, St.','37356','Castelló','Comunitat Valenciana'),(76,'Lunea','Parrish','06 04 35 77 51','3361 Dictum St.','29790','Pamplona','NA'),(77,'Bernard','Hurley','05 76 57 42 55','P.O. Box 569, 9696 Sed, St.','75391','Alcobendas','Madrid'),(78,'Aurora','Sheppard','01 51 68 47 32','6204 Mauris, St.','43287','Granada','AN'),(79,'Ella','Bennett','07 73 45 64 29','493-7856 Tellus Rd.','92795','Cáceres','EX'),(80,'Tyler','Dale','05 01 92 00 56','Ap #672-7190 Nec, Rd.','28333','Telde','Canarias'),(81,'Ciaran','Carlson','09 60 82 82 93','299-805 Erat Ave','34012','Algeciras','AN'),(82,'Rose','Guzman','09 42 45 20 94','5335 Pede, St.','43764','Melilla','Melilla'),(83,'Naida','Colon','07 72 85 91 73','1802 Donec Rd.','38201','Palma de Mallorca','Illes Balears'),(84,'Kato','Terry','09 14 21 39 47','Ap #894-1517 Rutrum Rd.','68866','Palencia','Castilla y León'),(85,'Maggie','Chen','05 37 93 62 69','716 Dapibus St.','45351','Sevilla','Andalucía'),(86,'Rebecca','Cote','01 31 42 80 56','Ap #689-9609 Ultrices. Ave','13887','Ourense','Galicia'),(87,'Ray','Rosales','03 17 91 26 10','8519 Urna. Av.','21959','Tarrasa','CA'),(88,'Paul','Finley','02 15 10 54 53','611-6743 Fusce St.','69206','Elx','CV'),(89,'Iona','Reid','04 93 59 22 28','Ap #626-2688 Nibh Road','78541','Palencia','CL'),(90,'Jamal','Doyle','09 88 05 85 13','7710 Ultrices Ave','52028','Lugo','Galicia'),(91,'Ulysses','Mcintyre','03 42 92 12 22','435-5776 Convallis St.','16528','Torrevieja','CV'),(92,'Maris','Downs','07 88 31 92 50','Ap #672-4183 Cras St.','18948','Santa Coloma de Gramenet','CA'),(93,'Sybill','Shelton','09 42 60 14 11','430-2179 Lobortis Rd.','41694','Cáceres','EX'),(94,'Leila','Mayer','08 15 60 93 42','Ap #616-9569 Urna Road','62175','Lugo','Galicia'),(95,'Vernon','Perkins','03 49 13 40 61','455-2623 Diam. Av.','86167','Huelva','Andalucía'),(96,'Sierra','Bradshaw','02 74 39 17 34','P.O. Box 288, 6447 Suspendisse Rd.','97382','Parla','MA'),(97,'Magee','Davenport','06 91 12 72 80','Ap #267-131 Enim. Rd.','58003','Reus','CA'),(98,'Elton','Henson','06 89 00 63 41','869-6394 Sollicitudin St.','97880','Murcia','Murcia'),(99,'Galena','Montgomery','03 06 12 30 91','Ap #568-6376 Mus. Ave','20637','Getafe','MA'),(100,'Ori','Doyle','03 10 84 80 13','901-7498 Fames Rd.','92257','Sabadell','CA'),(101,'Zachary','Cervantes','06 06 15 14 96','Ap #867-8786 Fringilla St.','84828','Córdoba','AN'),(102,'Lucia','','','','','',''),(104,'Thiago','','','','','','');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_factura`
--

DROP TABLE IF EXISTS `detalle_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_factura` (
  `productos_id` int(11) NOT NULL,
  `productos_categorias_id` int(11) NOT NULL,
  `factura_ticket_id` int(11) NOT NULL,
  `subtotal` double DEFAULT NULL,
  `cantidad_comprada` int(11) DEFAULT NULL,
  `id_detalle_factura` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_detalle_factura`),
  KEY `fk_productos_has_factura_factura1_idx` (`factura_ticket_id`),
  KEY `fk_productos_has_factura_productos1_idx` (`productos_id`,`productos_categorias_id`),
  CONSTRAINT `fk_productos_has_factura_factura1` FOREIGN KEY (`factura_ticket_id`) REFERENCES `factura` (`ticket_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_has_factura_productos1` FOREIGN KEY (`productos_id`, `productos_categorias_id`) REFERENCES `productos` (`id`, `categorias_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=293 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES (1,1,1,0,0,1),(1,1,2,0,0,2),(1,1,3,0,0,3),(1,1,5,5,5,4),(1,1,7,2,2,5),(1,1,9,5,5,6),(1,1,10,5,5,7),(1,1,12,0,0,8),(1,1,13,0,0,9),(1,1,14,0,0,10),(1,1,15,0,0,11),(1,1,16,0,0,12),(1,1,19,1,1,13),(1,1,20,1,1,14),(1,1,21,1,1,15),(2,1,2,0,0,16),(2,1,5,4.800000000000001,6,17),(2,1,7,0.8,1,18),(2,1,8,4,5,19),(2,1,10,4.800000000000001,6,20),(4,1,2,0,0,21),(4,1,3,0,0,22),(4,1,5,6,4,23),(4,1,6,9,6,24),(4,1,8,10.5,7,25),(4,1,17,4.5,3,26),(4,1,18,4.5,3,27),(4,1,19,12,8,28),(4,1,20,4.5,3,29),(5,1,1,0,0,30),(5,1,3,0,0,31),(5,1,6,18,9,32),(6,1,1,0,0,33),(6,1,4,20,8,34),(6,1,6,17.5,7,35),(1,1,22,2,2,36),(4,1,22,4.5,3,37),(1,1,24,4,4,38),(2,1,24,1.6,2,39),(1,1,24,4,4,40),(1,1,25,0,0,41),(1,1,26,0,0,42),(2,1,28,4,5,43),(1,1,28,3,3,44),(1,1,29,2,2,45),(1,1,30,1,1,46),(1,1,34,2,2,47),(1,1,40,3,3,48),(1,1,41,2,2,49),(1,1,42,2,2,50),(1,1,43,1,1,51),(2,1,44,1.6,2,52),(2,1,44,1.6,2,53),(1,1,45,6,6,54),(9,2,46,3,2,55),(8,2,46,12,6,56),(12,3,46,0.8,2,57),(16,3,47,2.4000000000000004,6,58),(17,4,47,4,2,59),(21,5,47,3,3,60),(1,1,48,2,2,61),(2,1,48,4.800000000000001,6,62),(1,1,49,2,2,63),(2,1,49,4.800000000000001,6,64),(1,1,50,3,3,65),(4,1,50,7.5,5,66),(2,1,50,4,5,67),(1,1,51,6,6,68),(4,1,51,7.5,5,69),(5,1,51,18,9,70),(1,1,62,2,2,71),(5,1,62,12,6,72),(1,1,63,6,6,73),(5,1,63,18,9,74),(4,1,64,9,6,75),(5,1,64,18,9,76),(1,1,65,6,6,77),(4,1,65,13.5,9,78),(6,1,66,22.5,9,79),(5,1,66,20,10,80),(1,1,67,6,6,81),(4,1,67,4.5,3,82),(4,1,68,12,8,83),(6,1,68,15,6,84),(1,1,69,6,6,85),(5,1,69,16,8,86),(4,1,69,10.5,7,87),(5,1,70,12,6,88),(5,1,70,12,6,89),(17,4,70,4,2,90),(9,2,70,9,6,91),(9,2,71,4.5,3,92),(13,3,71,4,8,93),(21,5,71,5,5,94),(4,1,72,3,2,95),(5,1,72,6,3,96),(6,1,72,10,4,97),(1,1,73,3,3,98),(4,1,73,9,6,99),(5,1,73,14,7,100),(1,1,74,1,1,101),(4,1,74,3,2,102),(1,1,77,2,2,103),(4,1,77,9,6,104),(5,1,78,6,3,105),(6,1,78,15,6,106),(1,1,79,3,3,107),(6,1,79,20,8,108),(1,1,80,2,2,109),(1,1,81,6,6,110),(1,1,82,5,5,111),(22,5,84,1.5,1,112),(13,3,84,0.5,1,113),(1,1,85,2,2,114),(1,1,86,3,3,115),(4,1,86,7.5,5,116),(1,1,87,2,2,117),(4,1,87,9,6,118),(1,1,88,3,3,119),(5,1,88,12,6,120),(1,1,89,2,2,121),(21,5,90,3,3,122),(43,9,91,2,2,123),(44,9,91,1,1,124),(45,9,91,1,1,125),(43,9,92,2,2,126),(45,9,92,6,6,127),(44,9,92,2,2,128),(42,6,93,7,1,129),(46,6,93,5,1,130),(50,8,94,4,2,131),(47,8,94,0.8,1,132),(48,8,94,3,3,133),(49,8,94,4,4,134),(52,7,95,3,1,135),(51,7,95,4,2,136),(41,7,95,6,3,137),(53,7,95,12,4,138),(54,7,95,15,5,139),(45,9,96,1,1,140),(1,1,98,1,1,141),(1,1,99,1,1,142),(45,9,100,1,1,143),(1,1,101,1,1,144),(1,1,102,1,1,145),(2,1,102,0.8,1,146),(1,1,103,1,1,147),(2,1,103,0.8,1,148),(1,1,104,1,1,149),(1,1,105,1,1,150),(2,1,105,0.8,1,151),(1,1,106,1,1,152),(2,1,106,0.8,1,153),(1,1,107,6,6,154),(2,1,107,7.2,9,155),(4,1,107,18,12,156),(1,1,108,23,23,157),(1,1,109,23,23,158),(1,1,110,23,23,159),(2,1,110,2.4000000000000004,3,160),(1,1,111,1,1,161),(2,1,111,1.6,2,162),(5,1,112,4,2,163),(5,1,113,6,3,164),(1,1,114,2,2,165),(1,1,117,3,3,166),(1,1,118,3,3,167),(1,1,119,3,3,168),(1,1,120,6,6,169),(1,1,121,1,1,170),(1,1,122,6,6,171),(1,1,123,6,6,172),(1,1,124,6,6,173),(1,1,124,6,6,174),(1,1,124,6,6,175),(1,1,124,6,6,176),(1,1,125,6,6,177),(1,1,126,6,6,178),(1,1,127,6,6,179),(1,1,128,6,6,180),(1,1,129,6,6,181),(1,1,130,6,6,182),(1,1,131,2,2,183),(1,1,131,2,2,184),(1,1,132,2,2,185),(1,1,132,2,2,186),(1,1,133,2,2,187),(1,1,133,2,2,188),(1,1,134,6,6,189),(1,1,135,6,6,190),(1,1,135,6,6,191),(1,1,136,2,2,192),(1,1,136,2,2,193),(2,1,137,2.4000000000000004,3,194),(2,1,137,2.4000000000000004,3,195),(1,1,138,1,1,196),(4,1,138,3,2,197),(1,1,139,1,1,198),(1,1,139,1,1,199),(1,1,140,2,2,200),(1,1,140,2,2,201),(1,1,141,2,2,202),(1,1,141,2,2,203),(2,1,142,0.8,1,204),(2,1,142,0.8,1,205),(1,1,143,3,3,206),(1,1,143,3,3,207),(1,1,144,3,3,208),(1,1,144,3,3,209),(1,1,145,2,2,210),(1,1,145,2,2,211),(1,1,146,5,5,212),(1,1,146,5,5,213),(1,1,147,1,1,214),(1,1,147,1,1,215),(1,1,147,1,1,216),(1,1,148,3,3,217),(1,1,148,3,3,218),(1,1,149,1,1,219),(2,1,149,0.8,1,220),(1,1,150,3,3,221),(2,1,150,2.4000000000000004,3,222),(1,1,150,3,3,223),(1,1,151,1,1,224),(1,1,151,1,1,225),(1,1,151,1,1,226),(1,1,152,10,10,227),(1,1,152,10,10,228),(1,1,152,10,10,229),(1,1,153,3,3,230),(1,1,153,3,3,231),(1,1,153,3,3,232),(2,1,153,0.8,1,233),(1,1,153,3,3,234),(1,1,154,5,5,235),(1,1,154,5,5,236),(1,1,154,5,5,237),(1,1,155,5,5,238),(1,1,155,5,5,239),(1,1,155,5,5,240),(1,1,156,5,5,241),(1,1,156,5,5,242),(1,1,156,5,5,243),(2,1,156,3.2,4,244),(1,1,156,5,5,245),(1,1,156,5,5,246),(1,1,156,5,5,247),(1,1,156,5,5,248),(1,1,156,5,5,249),(1,1,157,2,2,250),(1,1,158,1,5,251),(3,1,158,1.2000000000000002,2,252),(5,1,158,6,3,253),(1,1,159,1,3,254),(4,1,159,1.5,1,255),(1,1,160,4,4,256),(4,1,160,3,2,257),(1,1,160,4,4,258),(5,1,160,8,4,259),(1,1,160,4,4,260),(1,1,160,4,4,261),(4,1,160,3,2,262),(5,1,160,8,4,263),(1,1,161,2,2,264),(4,1,161,4.5,3,265),(1,1,162,4,4,266),(5,1,162,4,2,267),(6,1,162,2.5,1,268),(1,1,163,3,3,269),(4,1,163,1.5,1,270),(5,1,163,2,1,271),(3,1,163,1.2000000000000002,3,272),(1,1,164,1,1,273),(4,1,164,1.5,1,274),(2,1,164,0.8,2,275),(3,1,164,0.8,2,276),(5,1,164,6,3,277),(1,1,165,10,10,278),(1,1,166,10,10,279),(1,1,167,10,10,280),(1,1,168,10,10,281),(1,1,169,3,3,282),(1,1,170,10,10,283),(1,1,171,10,10,284),(1,1,172,10,10,285),(1,1,173,10,10,286),(1,1,174,10,10,287),(1,1,175,10,10,288),(1,1,176,10,10,289),(1,1,177,15,15,290),(1,1,178,10,10,291),(1,1,179,10,10,292);
/*!40000 ALTER TABLE `detalle_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `ticket_id` int(11) NOT NULL AUTO_INCREMENT,
  `clientes_id` int(11) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT NULL,
  `total_compra` double DEFAULT NULL,
  `usuarios_id` int(11) DEFAULT NULL,
  `total_con_descuento` double DEFAULT NULL,
  `descuento` double DEFAULT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `fk_ventas_clientes_idx` (`clientes_id`),
  KEY `fk_ventas_usuarios1_idx` (`usuarios_id`),
  CONSTRAINT `fk_ventas_clientes` FOREIGN KEY (`clientes_id`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ventas_usuarios1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id_usuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=180 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL),(2,NULL,NULL,NULL,NULL,NULL,NULL),(3,NULL,NULL,NULL,NULL,NULL,NULL),(4,NULL,NULL,NULL,NULL,NULL,NULL),(5,NULL,NULL,NULL,NULL,NULL,NULL),(6,NULL,NULL,NULL,NULL,NULL,NULL),(7,NULL,NULL,NULL,NULL,NULL,NULL),(8,NULL,NULL,NULL,NULL,NULL,NULL),(9,NULL,NULL,NULL,NULL,NULL,NULL),(10,NULL,NULL,NULL,NULL,NULL,NULL),(11,NULL,NULL,NULL,NULL,NULL,NULL),(12,NULL,NULL,NULL,NULL,NULL,NULL),(13,NULL,NULL,NULL,NULL,NULL,NULL),(14,NULL,NULL,NULL,NULL,NULL,NULL),(15,NULL,NULL,NULL,NULL,NULL,NULL),(16,NULL,NULL,NULL,NULL,NULL,NULL),(17,NULL,NULL,NULL,NULL,NULL,NULL),(18,NULL,NULL,NULL,NULL,NULL,NULL),(19,NULL,NULL,NULL,NULL,NULL,NULL),(20,NULL,NULL,NULL,NULL,NULL,NULL),(21,NULL,NULL,NULL,NULL,NULL,NULL),(22,NULL,NULL,NULL,NULL,NULL,NULL),(23,NULL,NULL,NULL,NULL,NULL,NULL),(24,NULL,NULL,NULL,NULL,NULL,NULL),(25,NULL,'2018-02-03 21:45:50',NULL,NULL,NULL,NULL),(26,10,'2018-02-03 21:59:15',0,NULL,NULL,NULL),(28,NULL,'2018-02-04 21:32:17',7,NULL,NULL,NULL),(29,1,'2018-02-04 21:40:15',2,NULL,NULL,NULL),(30,1,'2018-02-04 22:26:47',1,NULL,NULL,NULL),(34,2,'2018-02-05 11:33:33',2,NULL,NULL,NULL),(40,2,'2018-02-05 13:47:02',3,NULL,NULL,NULL),(41,NULL,'2018-02-05 14:16:20',2,NULL,NULL,NULL),(42,2,'2018-02-05 14:16:47',2,NULL,NULL,NULL),(43,2,'2018-02-05 14:32:38',1,NULL,NULL,NULL),(44,NULL,'2018-02-05 14:33:17',4,NULL,NULL,NULL),(45,4,'2018-02-05 14:51:18',6,NULL,NULL,NULL),(46,2,'2018-02-05 22:26:51',15.8,NULL,NULL,NULL),(47,NULL,'2018-02-05 22:27:45',9.4,NULL,NULL,NULL),(48,1,'2018-02-07 23:26:06',6.800000000000001,NULL,NULL,NULL),(49,NULL,'2018-02-07 23:27:48',6.800000000000001,NULL,NULL,NULL),(50,1,'2018-02-08 19:56:00',14.5,NULL,NULL,NULL),(51,1,'2018-02-08 19:57:14',31.5,NULL,NULL,NULL),(52,NULL,'2018-02-08 20:02:52',0,NULL,NULL,NULL),(53,NULL,'2018-02-08 20:03:25',0,NULL,NULL,NULL),(54,NULL,'2018-02-08 20:06:34',0,NULL,NULL,NULL),(55,NULL,'2018-02-08 20:07:27',0,NULL,NULL,NULL),(56,NULL,'2018-02-08 20:07:54',0,NULL,NULL,NULL),(57,NULL,'2018-02-08 20:08:19',0,NULL,NULL,NULL),(58,NULL,'2018-02-08 20:08:43',0,NULL,NULL,NULL),(59,NULL,'2018-02-08 20:09:11',0,NULL,NULL,NULL),(60,NULL,'2018-02-08 20:09:30',0,NULL,NULL,NULL),(61,NULL,'2018-02-08 20:09:46',0,NULL,NULL,NULL),(62,1,'2018-02-08 21:58:12',14,NULL,NULL,NULL),(63,1,'2018-02-08 22:01:53',24,NULL,NULL,NULL),(64,NULL,'2018-02-08 22:03:38',27,NULL,NULL,NULL),(65,NULL,'2018-02-08 22:04:46',19.5,NULL,NULL,NULL),(66,1,'2018-02-08 22:08:33',42.5,NULL,NULL,NULL),(67,NULL,'2018-02-08 23:40:10',10.5,NULL,NULL,NULL),(68,NULL,'2018-02-09 19:25:20',27,NULL,NULL,NULL),(69,NULL,'2018-02-09 19:39:52',32.5,NULL,NULL,NULL),(70,NULL,'2018-02-09 19:41:07',25,NULL,NULL,NULL),(71,NULL,'2018-02-09 20:07:41',13.5,NULL,NULL,NULL),(72,NULL,'2018-02-09 20:09:42',19,NULL,NULL,NULL),(73,NULL,'2018-02-09 20:11:06',26,NULL,NULL,NULL),(74,1,'2018-02-09 20:54:28',4,NULL,NULL,NULL),(75,NULL,'2018-02-09 21:04:04',0,NULL,NULL,NULL),(76,NULL,'2018-02-09 21:15:00',0,NULL,NULL,NULL),(77,1,'2018-02-09 21:19:45',11,NULL,NULL,NULL),(78,1,'2018-02-09 21:20:02',21,NULL,NULL,NULL),(79,2,'2018-02-09 21:20:23',23,NULL,NULL,NULL),(80,2,'2018-02-09 21:27:01',2,NULL,NULL,NULL),(81,1,'2018-02-09 21:30:48',6,NULL,NULL,NULL),(82,1,'2018-02-09 21:38:00',5,NULL,NULL,NULL),(83,NULL,'2018-02-09 21:41:23',0,NULL,NULL,NULL),(84,2,'2018-02-09 22:17:27',2,NULL,NULL,NULL),(85,1,'2018-02-14 21:07:03',2,NULL,NULL,NULL),(86,2,'2018-02-14 21:07:23',10.5,NULL,NULL,NULL),(87,NULL,'2018-02-14 22:28:04',11,NULL,NULL,NULL),(88,2,'2018-02-14 22:28:18',15,NULL,NULL,NULL),(89,1,'2018-02-22 22:27:12',2,NULL,NULL,NULL),(90,1,'2018-02-22 22:45:29',3,NULL,NULL,NULL),(91,1,'2018-02-22 23:01:03',4,NULL,NULL,NULL),(92,1,'2018-02-22 23:05:48',10,NULL,NULL,NULL),(93,1,'2018-02-23 21:40:51',12,NULL,NULL,NULL),(94,NULL,'2018-02-23 21:52:39',11.8,NULL,NULL,NULL),(95,2,'2018-02-23 23:24:15',40,NULL,NULL,NULL),(96,1,'2018-02-25 19:26:25',1,NULL,NULL,NULL),(97,1,'2018-02-25 20:10:54',0,NULL,NULL,NULL),(98,1,'2018-02-25 20:11:40',1,NULL,NULL,NULL),(99,1,'2018-02-25 20:12:46',1,NULL,NULL,NULL),(100,1,'2018-02-25 20:13:36',1,NULL,NULL,NULL),(101,1,'2018-02-25 20:15:19',1,NULL,NULL,NULL),(102,NULL,'2018-02-25 20:18:39',1.8,NULL,NULL,NULL),(103,2,'2018-02-25 21:06:48',1.8,NULL,NULL,NULL),(104,NULL,'2018-02-25 21:08:35',1,NULL,NULL,NULL),(105,NULL,'2018-02-25 21:09:25',1.8,NULL,NULL,NULL),(106,2,'2018-02-25 21:25:33',1.8,NULL,NULL,NULL),(107,2,'2018-02-25 21:26:17',31.2,NULL,NULL,NULL),(108,NULL,'2018-02-25 22:00:44',23,NULL,NULL,NULL),(109,NULL,'2018-02-25 22:09:39',23,NULL,NULL,NULL),(110,NULL,'2018-02-25 22:14:32',25.4,NULL,NULL,NULL),(111,NULL,'2018-02-25 22:31:49',2.6,NULL,NULL,NULL),(112,2,'2018-02-26 19:05:29',4,NULL,NULL,NULL),(113,2,'2018-02-26 19:19:37',6,NULL,NULL,NULL),(114,NULL,'2018-02-26 22:28:48',2,NULL,NULL,NULL),(115,NULL,'2018-02-26 23:58:01',0,NULL,NULL,NULL),(116,NULL,'2018-02-26 23:59:40',0,NULL,NULL,NULL),(117,2,'2018-02-28 23:20:38',3,NULL,NULL,NULL),(118,1,'2018-02-28 23:22:01',3,NULL,NULL,NULL),(119,1,'2018-02-28 23:33:47',3,NULL,NULL,NULL),(120,1,'2018-03-01 22:13:39',6,NULL,NULL,NULL),(121,1,'2018-03-01 22:27:18',1,NULL,NULL,NULL),(122,1,'2018-03-03 14:20:44',6,NULL,NULL,NULL),(123,NULL,'2018-03-03 15:40:08',6,NULL,NULL,NULL),(124,1,'2018-03-03 21:32:03',24,NULL,NULL,NULL),(125,1,'2018-03-03 23:57:44',6,NULL,NULL,NULL),(126,1,'2018-03-04 00:09:26',6,NULL,NULL,NULL),(127,1,'2018-03-04 00:11:33',6,NULL,NULL,NULL),(128,1,'2018-03-04 00:16:21',6,NULL,NULL,NULL),(129,NULL,'2018-03-04 18:00:20',6,NULL,NULL,NULL),(130,1,'2018-03-04 18:03:18',6,NULL,NULL,NULL),(131,1,'2018-03-04 18:44:37',2,NULL,NULL,NULL),(132,1,'2018-03-04 18:45:15',1,NULL,NULL,NULL),(133,1,'2018-03-04 18:45:41',3,NULL,NULL,NULL),(134,NULL,'2018-03-04 18:53:52',6,NULL,NULL,NULL),(135,NULL,'2018-03-04 18:54:40',12,NULL,NULL,NULL),(136,1,'2018-03-04 18:55:40',8,NULL,NULL,NULL),(137,1,'2018-03-04 18:56:02',4,NULL,NULL,NULL),(138,1,'2018-03-04 18:56:22',4,NULL,NULL,NULL),(139,1,'2018-03-04 18:56:39',2,NULL,NULL,NULL),(140,1,'2018-03-04 18:58:36',3,NULL,NULL,NULL),(141,NULL,'2018-03-04 18:58:58',3,NULL,NULL,NULL),(142,NULL,'2018-03-04 18:59:46',2.4000000000000004,NULL,NULL,NULL),(143,NULL,'2018-03-04 19:06:02',9,NULL,NULL,NULL),(144,NULL,'2018-03-04 19:07:01',9,NULL,NULL,NULL),(145,NULL,'2018-03-04 19:52:56',8,NULL,NULL,NULL),(146,NULL,'2018-03-04 19:54:51',8,NULL,NULL,NULL),(147,NULL,'2018-03-04 19:56:13',3,NULL,NULL,NULL),(148,NULL,'2018-03-04 19:57:12',8,NULL,NULL,NULL),(149,NULL,'2018-03-04 19:57:57',1.8,NULL,NULL,NULL),(150,NULL,'2018-03-04 19:58:54',6.4,NULL,NULL,NULL),(151,NULL,'2018-03-04 20:00:08',9,NULL,NULL,NULL),(152,NULL,'2018-03-04 20:01:27',13,NULL,NULL,NULL),(153,NULL,'2018-03-04 20:03:46',9.8,NULL,NULL,NULL),(154,NULL,'2018-03-04 20:21:36',9,NULL,NULL,NULL),(155,NULL,'2018-03-04 20:43:09',8,NULL,NULL,NULL),(156,NULL,'2018-03-04 20:56:57',14,NULL,NULL,NULL),(157,NULL,'2018-03-04 21:24:06',2,NULL,NULL,NULL),(158,1,'2018-03-05 21:19:13',8.2,NULL,NULL,NULL),(159,NULL,'2018-03-05 21:59:33',2.5,NULL,NULL,NULL),(160,1,'2018-03-05 22:19:00',15,NULL,NULL,NULL),(161,NULL,'2018-03-05 22:20:47',6.5,NULL,NULL,NULL),(162,1,'2018-03-05 22:21:42',10.5,NULL,NULL,NULL),(163,NULL,'2018-03-05 22:53:17',7.7,NULL,NULL,NULL),(164,1,'2018-03-06 23:22:50',10.1,NULL,NULL,NULL),(165,1,'2018-03-06 23:33:11',10,NULL,NULL,NULL),(166,1,'2018-03-06 23:38:26',10,NULL,NULL,NULL),(167,1,'2018-03-06 23:42:04',10,NULL,NULL,NULL),(168,1,'2018-03-06 23:45:45',10,NULL,NULL,NULL),(169,1,'2018-03-06 23:49:09',3,NULL,NULL,NULL),(170,1,'2018-03-07 00:04:55',10,NULL,NULL,NULL),(171,1,'2018-03-07 00:07:13',10,NULL,NULL,NULL),(172,1,'2018-03-07 00:12:50',10,NULL,NULL,NULL),(173,1,'2018-03-07 00:17:52',10,NULL,NULL,NULL),(174,1,'2018-03-07 00:19:41',10,NULL,NULL,NULL),(175,1,'2018-03-07 00:24:08',10,NULL,NULL,NULL),(176,1,'2018-03-07 00:28:05',10,NULL,NULL,NULL),(177,1,'2018-03-07 00:28:28',15,NULL,NULL,NULL),(178,1,'2018-03-07 20:13:13',10,NULL,NULL,NULL),(179,1,'2018-03-07 20:55:19',10,NULL,NULL,0.1);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(45) DEFAULT NULL,
  `categorias_id` int(11) NOT NULL,
  `precio` double DEFAULT NULL,
  `cantidadStock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`categorias_id`),
  KEY `fk_productos_categorias1_idx` (`categorias_id`),
  CONSTRAINT `fk_productos_categorias1` FOREIGN KEY (`categorias_id`) REFERENCES `categorias` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'cafe largo',1,1,594),(2,'cafe corto',1,0.8,-1),(3,'cafe cortado',1,0.4,13),(4,'cafe con leche',1,1.5,8),(5,'capuccino',1,2,3),(6,'carajillo',1,2.5,19),(7,'mocaccino',1,1.5,20),(8,'chocolate suizo',2,2,20),(9,'chocolate taza grande',2,1.5,20),(10,'chocolate taza pequena',2,1,20),(12,'te negro',3,0.4,10),(13,'te con leche',3,0.5,10),(14,'chai latte',3,1.5,7),(15,'menta',3,0.4,10),(16,'manzanilla',3,0.4,9),(17,'naranja natural',4,2,30),(18,'pina',4,1,20),(19,'melocoton',4,1,20),(21,'croissant normal',5,1,10),(22,'croissant integral',5,1.5,10),(23,'croissant de chocolate',5,2,10),(24,'brownie',5,1,10),(25,'pastel de chocolate',5,2,10),(26,'tarta de fresa',5,2,10),(41,'bikini',7,2,10),(42,'menu del dia',6,7,30),(43,'cookie de chocolate negro',9,1,10),(44,'cookie de chocolate blanco',9,1,10),(45,'cookie de caramelo',9,1,10),(46,'menu desayuno',6,5,10),(47,'mini madalena',8,0.8,10),(48,'madalena integral',8,1,10),(49,'madalena de chocolate',8,1,10),(50,'madalena de arandano',8,2,10),(51,'bocadillo atun',7,2,10),(52,'bocadillo carne',7,3,10),(53,'bocadillo pollo',7,3,10),(54,'bocadillo jamon serrano',7,3,10);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuarios` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `tipo_usuario` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `view_factura`
--

DROP TABLE IF EXISTS `view_factura`;
/*!50001 DROP VIEW IF EXISTS `view_factura`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_factura` AS SELECT 
 1 AS `ticket_id`,
 1 AS `clientes_id`,
 1 AS `fecha`,
 1 AS `total_compra`,
 1 AS `usuarios_id`,
 1 AS `total_con_descuento`,
 1 AS `descuento`,
 1 AS `productos_id`,
 1 AS `productos_categorias_id`,
 1 AS `factura_ticket_id`,
 1 AS `subtotal`,
 1 AS `cantidad_comprada`,
 1 AS `id_detalle_factura`,
 1 AS `id`,
 1 AS `nombreProducto`,
 1 AS `categorias_id`,
 1 AS `precio`,
 1 AS `cantidadStock`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `view_facturaclientes`
--

DROP TABLE IF EXISTS `view_facturaclientes`;
/*!50001 DROP VIEW IF EXISTS `view_facturaclientes`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_facturaclientes` AS SELECT 
 1 AS `ticket_id`,
 1 AS `clientes_id`,
 1 AS `fecha`,
 1 AS `total_compra`,
 1 AS `usuarios_id`,
 1 AS `descuento`,
 1 AS `nombre`,
 1 AS `apellido`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `view_facturadisplay`
--

DROP TABLE IF EXISTS `view_facturadisplay`;
/*!50001 DROP VIEW IF EXISTS `view_facturadisplay`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_facturadisplay` AS SELECT 
 1 AS `ticket_id`,
 1 AS `nombreProducto`,
 1 AS `cantidad_comprada`,
 1 AS `precio`,
 1 AS `subtotal`,
 1 AS `total_compra`,
 1 AS `total_con_descuento`,
 1 AS `descuento`,
 1 AS `nombre`,
 1 AS `apellido`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `view_productocategoria`
--

DROP TABLE IF EXISTS `view_productocategoria`;
/*!50001 DROP VIEW IF EXISTS `view_productocategoria`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_productocategoria` AS SELECT 
 1 AS `prod_id`,
 1 AS `nombreProducto`,
 1 AS `categorias_id`,
 1 AS `precio`,
 1 AS `cantidadStock`,
 1 AS `id_cat`,
 1 AS `descripcion`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_factura`
--

/*!50001 DROP VIEW IF EXISTS `view_factura`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_factura` AS select `factura`.`ticket_id` AS `ticket_id`,`factura`.`clientes_id` AS `clientes_id`,`factura`.`fecha` AS `fecha`,`factura`.`total_compra` AS `total_compra`,`factura`.`usuarios_id` AS `usuarios_id`,`factura`.`total_con_descuento` AS `total_con_descuento`,`factura`.`descuento` AS `descuento`,`detalle_factura`.`productos_id` AS `productos_id`,`detalle_factura`.`productos_categorias_id` AS `productos_categorias_id`,`detalle_factura`.`factura_ticket_id` AS `factura_ticket_id`,`detalle_factura`.`subtotal` AS `subtotal`,`detalle_factura`.`cantidad_comprada` AS `cantidad_comprada`,`detalle_factura`.`id_detalle_factura` AS `id_detalle_factura`,`productos`.`id` AS `id`,`productos`.`nombreProducto` AS `nombreProducto`,`productos`.`categorias_id` AS `categorias_id`,`productos`.`precio` AS `precio`,`productos`.`cantidadStock` AS `cantidadStock` from ((`factura` join `detalle_factura` on((`factura`.`ticket_id` = `detalle_factura`.`factura_ticket_id`))) join `productos` on((`detalle_factura`.`productos_id` = `productos`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_facturaclientes`
--

/*!50001 DROP VIEW IF EXISTS `view_facturaclientes`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_facturaclientes` AS select `factura`.`ticket_id` AS `ticket_id`,`factura`.`clientes_id` AS `clientes_id`,`factura`.`fecha` AS `fecha`,`factura`.`total_compra` AS `total_compra`,`factura`.`usuarios_id` AS `usuarios_id`,`factura`.`descuento` AS `descuento`,`clientes`.`nombre` AS `nombre`,`clientes`.`apellido` AS `apellido` from (`factura` left join `clientes` on((`factura`.`clientes_id` = `clientes`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_facturadisplay`
--

/*!50001 DROP VIEW IF EXISTS `view_facturadisplay`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_facturadisplay` AS select `view_factura`.`ticket_id` AS `ticket_id`,`view_factura`.`nombreProducto` AS `nombreProducto`,`view_factura`.`cantidad_comprada` AS `cantidad_comprada`,`view_factura`.`precio` AS `precio`,`view_factura`.`subtotal` AS `subtotal`,`view_factura`.`total_compra` AS `total_compra`,`view_factura`.`total_con_descuento` AS `total_con_descuento`,`view_factura`.`descuento` AS `descuento`,`view_facturaclientes`.`nombre` AS `nombre`,`view_facturaclientes`.`apellido` AS `apellido` from (`view_factura` left join `view_facturaclientes` on((`view_factura`.`ticket_id` = `view_facturaclientes`.`ticket_id`))) union all select `view_factura`.`ticket_id` AS `ticket_id`,`view_factura`.`nombreProducto` AS `nombreProducto`,`view_factura`.`cantidad_comprada` AS `cantidad_comprada`,`view_factura`.`precio` AS `precio`,`view_factura`.`subtotal` AS `subtotal`,`view_factura`.`total_compra` AS `total_compra`,`view_factura`.`total_con_descuento` AS `total_con_descuento`,`view_factura`.`descuento` AS `descuento`,`view_facturaclientes`.`nombre` AS `nombre`,`view_facturaclientes`.`apellido` AS `apellido` from (`view_facturaclientes` left join `view_factura` on((`view_factura`.`ticket_id` = `view_facturaclientes`.`ticket_id`))) where isnull(`view_facturaclientes`.`ticket_id`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_productocategoria`
--

/*!50001 DROP VIEW IF EXISTS `view_productocategoria`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_productocategoria` AS select `p`.`id` AS `prod_id`,`p`.`nombreProducto` AS `nombreProducto`,`p`.`categorias_id` AS `categorias_id`,`p`.`precio` AS `precio`,`p`.`cantidadStock` AS `cantidadStock`,`c`.`id` AS `id_cat`,`c`.`descripcion` AS `descripcion` from (`productos` `p` join `categorias` `c` on((`c`.`id` = `p`.`categorias_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-07 22:04:07
