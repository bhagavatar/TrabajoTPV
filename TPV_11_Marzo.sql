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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'cafes'),(2,'chocolates'),(3,'infusiones'),(4,'zumos'),(5,'bolleria'),(6,'menus'),(7,'bocadillos'),(8,'madalenas'),(9,'cookies'),(17,'categoria teste');
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
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Diego','Hauptman','666666666','Carrer del Mas Duran','08923','Barcelona','Barcelona'),(2,'Gliki','Geller Green','666666','La Joya Boulevard','45398754','Los Angeles','California'),(3,'Natalie','Carpenter','09 28 71 13 21','Ap #480-1380 Convallis St.','42961','Dos Hermanas','Andalucía'),(4,'Fiona','Gillespie','01 38 05 84 28','189-9667 Amet Rd.','57073','Cartagena','Murcia'),(5,'Brooke','Harrell','02 31 87 05 58','Ap #289-6895 Et, St.','08773','Santa Coloma de Gramenet','CA'),(6,'Stacy','Valenzuela','08 85 09 61 08','983-9585 Ipsum St.','09810','Torrejón de Ardoz','Madrid'),(7,'Kylee','Lindsey','06 59 84 62 26','Ap #103-1639 In Rd.','71111','Tarrasa','Catalunya'),(8,'Kylee','Padilla','08 11 29 17 29','Ap #720-8532 Integer St.','05013','Lugo','GA'),(9,'Kaseem','Riggs','02 16 36 80 08','Ap #322-6510 Eu, Rd.','86042','Cádiz','Andalucía'),(10,'Zahir','Olsen','02 42 92 18 91','P.O. Box 168, 1465 Ut Rd.','60363','Segovia','CL'),(11,'Simon','Ruiz','03 26 80 75 45','Ap #323-895 Risus. Rd.','50271','Castelló','Comunitat Valenciana'),(12,'Deborah','Rollins','08 68 68 24 36','574-3056 Vestibulum St.','51415','Getafe','Madrid'),(13,'Tanner','Gross','01 33 99 88 14','Ap #823-7939 In St.','12721','Elx','Comunitat Valenciana'),(14,'Malik','Haley','06 62 74 76 04','820-3714 A Av.','41419','Girona','Catalunya'),(15,'Elmo','Baldwin','04 27 99 91 85','136-9334 Lobortis Rd.','09830','Madrid','MA'),(16,'Ronan','Clark','03 86 73 48 04','2268 Pulvinar Ave','48710','Huelva','AN'),(17,'Kimberley','Holder','03 96 71 30 74','690 Massa. Street','85456','Tarragona','CA'),(18,'Xena','Saunders','05 94 93 37 32','281-7477 Lorem St.','55703','Bilbo','Euskadi'),(19,'Jennifer','Barlow','07 12 29 24 96','1744 Hendrerit Rd.','30803','Girona','Catalunya'),(20,'Ariana','Madden','04 80 61 53 06','Ap #213-5974 Magna. St.','48804','Reus','CA'),(21,'Remedios','Rose','03 59 42 19 22','Ap #760-2073 Rutrum Avenue','59314','Palma de Mallorca','BA'),(22,'Camilla','Hutchinson','08 48 31 48 65','P.O. Box 431, 5744 Eleifend Ave','30691','Telde','CN'),(23,'Victor','Walls','08 87 60 91 22','P.O. Box 337, 2935 In Rd.','53263','Marbella','Andalucía'),(24,'Thor','Curry','04 63 39 89 09','P.O. Box 913, 8384 Et Road','60048','Segovia','CL'),(25,'Katell','Terry','09 48 28 15 40','Ap #180-4437 Quis, Rd.','08659','Palencia','Castilla y León'),(26,'Len','Hunter','06 47 80 00 20','P.O. Box 991, 1570 Vitae Rd.','14625','Dos Hermanas','Andalucía'),(27,'Dustin','Fletcher','05 48 95 45 50','P.O. Box 169, 7935 Est, Rd.','58424','Sevilla','Andalucía'),(28,'Eric','Melton','02 08 70 73 87','P.O. Box 541, 8277 Eu St.','24641','Sevilla','Andalucía'),(29,'Shannon','Adkins','06 88 18 93 81','P.O. Box 679, 2982 Iaculis Rd.','15030','Madrid','MA'),(30,'Nathan','Welch','08 01 25 85 76','Ap #295-7954 Ultrices St.','20199','Gijón','AS'),(31,'Heidi','Deleon','09 99 89 56 71','Ap #298-7795 Sociis Avenue','73749','Alacant','Comunitat Valenciana'),(32,'Drake','Salinas','09 77 96 29 04','Ap #614-8818 Ac St.','11693','A Coruña','Galicia'),(33,'Reece','Haynes','06 76 84 29 56','5357 Justo. Avenue','76500','Mataró','CA'),(34,'Byron','Kline','03 75 38 89 95','Ap #201-6320 Sed Ave','17104','Barcelona','CA'),(35,'Morgan','Alvarado','05 07 63 32 35','Ap #146-9858 Metus St.','10470','Málaga','AN'),(36,'Miranda','Sellers','02 93 27 63 09','Ap #706-1016 Elit. Street','28586','Badalona','CA'),(37,'May','Jennings','02 15 59 44 36','771-4483 Auctor Ave','27370','Valéncia','CV'),(38,'Fuller','Calhoun','07 49 14 71 75','Ap #151-7447 Lacinia Road','69851','Almería','AN'),(39,'Amery','Turner','08 45 73 49 98','1122 Nec Rd.','95539','Getafe','Madrid'),(40,'Orson','Ayala','08 83 45 46 17','P.O. Box 608, 5860 Quisque Rd.','06556','Baracaldo','Euskadi'),(41,'Leandra','Osborn','07 69 63 13 61','P.O. Box 121, 644 Amet Avenue','77618','Logroño','LR'),(42,'Wesley','Schwartz','09 76 52 63 92','P.O. Box 694, 7440 Donec St.','17491','Girona','CA'),(43,'Lucas','Perkins','06 96 15 25 49','Ap #999-8060 Parturient St.','91209','Santa Coloma de Gramenet','CA'),(44,'Neil','Franks','09 69 95 97 87','Ap #753-101 Non, Avenue','78717','Madrid','MA'),(45,'Nissim','Blevins','03 22 90 73 81','Ap #575-3419 Faucibus Rd.','86865','Ourense','Galicia'),(46,'Hashim','Walls','06 86 53 24 84','2378 Commodo Road','51346','Donosti','Euskadi'),(47,'Lester','Sanchez','04 58 65 25 52','841-4422 Malesuada Rd.','95671','Badalona','CA'),(48,'Vivien','Burks','06 47 31 38 21','8364 Tellus. Road','66942','Badalona','CA'),(49,'Isadora','Orr','02 17 49 61 24','Ap #122-6709 Ultrices, Av.','35864','Huelva','AN'),(50,'Miriam','Brown','05 66 50 76 89','7007 Praesent St.','25186','Jaén','Andalucía'),(51,'Bianca','Frank','02 91 90 11 90','2912 Turpis. Ave','24101','Madrid','Madrid'),(52,'Kaye','Stafford','06 05 28 60 03','P.O. Box 995, 8479 Parturient Road','21037','Logroño','LR'),(53,'Aimee','Lane','01 66 53 93 08','P.O. Box 559, 9716 Fringilla Rd.','75669','Alcalá de Henares','Madrid'),(54,'Sierra','Barry','06 52 48 43 75','7412 Cursus St.','47329','Huelva','Andalucía'),(55,'Kylie','Mccormick','02 84 40 80 16','4459 Commodo Road','44448','Albacete','CM'),(56,'Erasmus','Chaney','09 76 38 13 19','5214 Nascetur Rd.','06738','Lugo','GA'),(57,'Bradley','Randall','04 22 86 58 22','P.O. Box 379, 2258 Sed, St.','43342','Almería','AN'),(58,'Keith','Downs','09 57 37 63 11','304-7427 Mauris St.','44366','Alcalá de Henares','Madrid'),(59,'Quinn','Frye','06 39 89 57 38','502-2671 Cubilia St.','63219','Pontevedra','Galicia'),(60,'Ariana','Mccoy','09 09 01 41 58','3459 Nonummy. Road','64152','Valéncia','Comunitat Valenciana'),(61,'Dean','Larsen','08 89 07 78 29','464-5019 Est Rd.','32597','Madrid','MA'),(62,'Anjolie','Wall','03 83 55 80 53','157 Amet St.','85069','Getafe','Madrid'),(63,'Clio','Rosario','02 83 82 66 59','5660 Erat. Rd.','30003','Alcorcón','Madrid'),(64,'Addison','Burns','02 28 23 12 11','897-3498 Vestibulum St.','51980','L\'Hospitalet de Llobregat','Catalunya'),(65,'Katelyn','Myers','01 55 32 36 55','9457 Aliquam St.','15459','Sevilla','Andalucía'),(66,'Uriah','Hartman','06 94 97 09 96','P.O. Box 761, 2607 Libero. St.','38192','Huelva','Andalucía'),(67,'Laurel','Harrington','03 34 02 08 15','8788 Consectetuer Street','10219','Parla','MA'),(68,'Ian','Mejia','04 02 38 07 14','P.O. Box 980, 8517 Dolor St.','16177','Torrevieja','Comunitat Valenciana'),(69,'Audrey','Middleton','03 31 01 09 64','P.O. Box 656, 6140 Nibh Street','23610','Ciudad Real','CM'),(70,'Carson','Blackburn','09 30 26 20 87','756-348 Phasellus Rd.','38079','Telde','CN'),(71,'Amanda','Peck','01 94 15 82 24','Ap #242-9386 Pede. Ave','76543','Oviedo','Principado de Asturias'),(72,'Brian','Rivers','06 92 33 31 08','P.O. Box 945, 7471 Aliquet, Av.','81516','Bilbo','Euskadi'),(73,'Kelly','Porter','05 05 16 68 60','4990 Lectus Avenue','36073','Granada','AN'),(74,'Eric','Hays','06 06 88 34 09','Ap #727-8018 Ac Avenue','88064','Palma de Mallorca','BA'),(75,'Jasper','Simmons','04 18 89 87 83','4732 Id, St.','37356','Castelló','Comunitat Valenciana'),(76,'Lunea','Parrish','06 04 35 77 51','3361 Dictum St.','29790','Pamplona','NA'),(77,'Bernard','Hurley','05 76 57 42 55','P.O. Box 569, 9696 Sed, St.','75391','Alcobendas','Madrid'),(78,'Aurora','Sheppard','01 51 68 47 32','6204 Mauris, St.','43287','Granada','AN'),(79,'Ella','Bennett','07 73 45 64 29','493-7856 Tellus Rd.','92795','Cáceres','EX'),(80,'Tyler','Dale','05 01 92 00 56','Ap #672-7190 Nec, Rd.','28333','Telde','Canarias'),(81,'Ciaran','Carlson','09 60 82 82 93','299-805 Erat Ave','34012','Algeciras','AN'),(82,'Rose','Guzman','09 42 45 20 94','5335 Pede, St.','43764','Melilla','Melilla'),(83,'Naida','Colon','07 72 85 91 73','1802 Donec Rd.','38201','Palma de Mallorca','Illes Balears'),(84,'Kato','Terry','09 14 21 39 47','Ap #894-1517 Rutrum Rd.','68866','Palencia','Castilla y León'),(85,'Maggie','Chen','05 37 93 62 69','716 Dapibus St.','45351','Sevilla','Andalucía'),(86,'Rebecca','Cote','01 31 42 80 56','Ap #689-9609 Ultrices. Ave','13887','Ourense','Galicia'),(87,'Ray','Rosales','03 17 91 26 10','8519 Urna. Av.','21959','Tarrasa','CA'),(88,'Paul','Finley','02 15 10 54 53','611-6743 Fusce St.','69206','Elx','CV'),(89,'Iona','Reid','04 93 59 22 28','Ap #626-2688 Nibh Road','78541','Palencia','CL'),(90,'Jamal','Doyle','09 88 05 85 13','7710 Ultrices Ave','52028','Lugo','Galicia'),(91,'Ulysses','Mcintyre','03 42 92 12 22','435-5776 Convallis St.','16528','Torrevieja','CV'),(92,'Maris','Downs','07 88 31 92 50','Ap #672-4183 Cras St.','18948','Santa Coloma de Gramenet','CA'),(93,'Sybill','Shelton','09 42 60 14 11','430-2179 Lobortis Rd.','41694','Cáceres','EX'),(94,'Leila','Mayer','08 15 60 93 42','Ap #616-9569 Urna Road','62175','Lugo','Galicia'),(95,'Vernon','Perkins','03 49 13 40 61','455-2623 Diam. Av.','86167','Huelva','Andalucía'),(96,'Sierra','Bradshaw','02 74 39 17 34','P.O. Box 288, 6447 Suspendisse Rd.','97382','Parla','MA'),(97,'Magee','Davenport','06 91 12 72 80','Ap #267-131 Enim. Rd.','58003','Reus','CA'),(98,'Elton','Henson','06 89 00 63 41','869-6394 Sollicitudin St.','97880','Murcia','Murcia'),(99,'Galena','Montgomery','03 06 12 30 91','Ap #568-6376 Mus. Ave','20637','Getafe','MA'),(100,'Ori','Doyle','03 10 84 80 13','901-7498 Fames Rd.','92257','Sabadell','CA'),(101,'Zachary','Cervantes','06 06 15 14 96','Ap #867-8786 Fringilla St.','84828','Córdoba','AN');
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
  KEY `fk_productos_has_factura_productos1_idx` (`productos_id`),
  CONSTRAINT `fk_productos_has_factura_factura1` FOREIGN KEY (`factura_ticket_id`) REFERENCES `factura` (`ticket_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_has_factura_productos1` FOREIGN KEY (`productos_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=370 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES (8,2,6,2,1,331),(46,6,6,5,1,332),(19,4,6,1,1,333),(10,2,7,1,1,334),(24,5,7,1,1,335),(1,1,8,1,1,336),(4,1,8,3,2,337),(1,1,14,1,1,352),(4,1,14,3,2,353),(2,1,14,2.4000000000000004,3,354),(1,1,15,1,1,355),(4,1,15,3,2,356),(1,1,16,1,1,357),(4,1,16,3,2,358),(1,1,17,1,1,359),(2,1,17,1.6,2,360),(1,1,19,1,1,363),(2,1,19,1.6,2,364),(1,1,22,2,2,367),(1,1,23,1,1,368),(2,1,23,0.8,1,369);
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
  `total_con_descuento` double DEFAULT NULL,
  `descuento` double DEFAULT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `fk_ventas_clientes_idx` (`clientes_id`),
  CONSTRAINT `fk_ventas_clientes` FOREIGN KEY (`clientes_id`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (6,1,'2018-03-10 11:41:14',8,7.2,0.1),(7,1,'2018-03-10 19:33:12',2,1.8,0.1),(8,4,'2018-03-10 19:44:15',4,3.6,0.1),(14,4,'2018-03-11 16:03:51',6.4,5.760000000000001,0.1),(15,4,'2018-03-11 19:26:35',4,3.6,0.1),(16,1,'2018-03-11 19:34:07',4,4,NULL),(17,5,'2018-03-11 19:34:44',2.6,2.3400000000000003,0.1),(19,1,'2018-03-11 19:46:49',2.6,1.3,0.5),(22,NULL,'2018-03-11 19:49:51',2,2,NULL),(23,6,'2018-03-11 20:28:04',1.8,1.62,0.1);
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
  PRIMARY KEY (`id`),
  KEY `fk_productos_categorias1_idx` (`categorias_id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'cafe largo',1,1,531),(2,'cafe corto',1,0.8,591),(3,'cafe cortado',1,0.4,497),(4,'cafe con leche',1,1.5,454),(5,'capuccino',1,2,495),(6,'carajillo',1,2.5,18),(7,'mocaccino',1,1.5,20),(8,'chocolate suizo',2,2,19),(9,'chocolate taza grande',2,1.5,20),(10,'chocolate taza pequena',2,1,19),(12,'te negro',3,0.4,10),(13,'te con leche',3,0.5,9),(14,'chai latte',3,1.5,7),(15,'menta',3,0.4,10),(16,'manzanilla',3,0.4,9),(17,'naranja natural',4,2,26),(18,'pina',4,1,20),(19,'melocoton',4,1,19),(21,'croissant normal',5,1,10),(22,'croissant integral',5,1.5,9),(23,'croissant de chocolate',5,2,10),(24,'brownie',5,1,9),(25,'pastel de chocolate',5,2,10),(26,'tarta de fresa',5,2,10),(41,'bikini',7,2,10),(42,'menu del dia',6,7,29),(43,'cookie de chocolate negro',9,1,10),(44,'cookie de chocolate blanco',9,1,10),(45,'cookie de caramelo',9,1,10),(46,'menu desayuno',6,5,9),(47,'mini madalena',8,0.8,9),(48,'madalena integral',8,1,10),(49,'madalena de chocolate',8,1,8),(50,'madalena de arandano',8,2,10),(51,'bocadillo atun',7,2,10),(52,'bocadillo carne',7,3,8),(53,'bocadillo pollo',7,3,10),(54,'bocadillo jamon serrano',7,3,10),(67,'productoteste1',14,2,20),(68,'productoteste1',15,2,10),(69,'productoteste2',16,10,20),(71,'producto teste4',17,1,10),(72,'productoteste5',17,10,500),(73,'teste',17,10,500),(74,'producto teste1a',17,20,30),(75,'producto teste2a',17,1,10),(76,'producto teste3c',17,2,10);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
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
 1 AS `total_con_descuento`,
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
/*!50001 VIEW `view_factura` AS select `factura`.`ticket_id` AS `ticket_id`,`factura`.`clientes_id` AS `clientes_id`,`factura`.`fecha` AS `fecha`,`factura`.`total_compra` AS `total_compra`,`factura`.`total_con_descuento` AS `total_con_descuento`,`factura`.`descuento` AS `descuento`,`detalle_factura`.`productos_id` AS `productos_id`,`detalle_factura`.`productos_categorias_id` AS `productos_categorias_id`,`detalle_factura`.`factura_ticket_id` AS `factura_ticket_id`,`detalle_factura`.`subtotal` AS `subtotal`,`detalle_factura`.`cantidad_comprada` AS `cantidad_comprada`,`detalle_factura`.`id_detalle_factura` AS `id_detalle_factura`,`productos`.`id` AS `id`,`productos`.`nombreProducto` AS `nombreProducto`,`productos`.`categorias_id` AS `categorias_id`,`productos`.`precio` AS `precio`,`productos`.`cantidadStock` AS `cantidadStock` from ((`factura` join `detalle_factura` on((`factura`.`ticket_id` = `detalle_factura`.`factura_ticket_id`))) join `productos` on((`detalle_factura`.`productos_id` = `productos`.`id`))) */;
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
/*!50001 VIEW `view_facturaclientes` AS select `factura`.`ticket_id` AS `ticket_id`,`factura`.`clientes_id` AS `clientes_id`,`factura`.`fecha` AS `fecha`,`factura`.`total_compra` AS `total_compra`,`factura`.`total_con_descuento` AS `total_con_descuento`,`factura`.`descuento` AS `descuento`,`clientes`.`nombre` AS `nombre`,`clientes`.`apellido` AS `apellido` from (`factura` left join `clientes` on((`factura`.`clientes_id` = `clientes`.`id`))) */;
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

-- Dump completed on 2018-03-11 22:45:10
