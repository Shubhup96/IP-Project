-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: subham
-- ------------------------------------------------------
-- Server version	5.1.33-community

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
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `name` varchar(20) DEFAULT NULL,
  `cost` decimal(10,0) DEFAULT NULL,
  `mileage` decimal(5,0) DEFAULT NULL,
  `fuel` decimal(6,0) DEFAULT NULL,
  `topspeed` decimal(5,0) DEFAULT NULL,
  `torque` decimal(5,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES ('Superleggara','400000','25','300','300','60'),('SuperVeloce','450000','20','270','360','70'),('Scruderia','300000','23','300','260','65'),('California','500000','27','320','290','62'),('R9','440000','15','390','330','70'),('R8','445000','23','400','280','78'),('16.4','555000','24','500','290','90'),('Supersport','655000','28','550','490','90'),('BMW M4','600000','28','570','300','95'),('H2','100000','22','400','200','85');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-25  4:09:32
