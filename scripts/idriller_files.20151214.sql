-- MySQL dump 10.13  Distrib 5.1.66, for redhat-linux-gnu (x86_64)
--
-- Host: localhost    Database: idriller_files
-- ------------------------------------------------------
-- Server version	5.1.66

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
-- Table structure for table `ifile_params`
--

DROP TABLE IF EXISTS `ifile_params`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ifile_params` (
  `file_id` bigint(20) NOT NULL DEFAULT '0',
  `file_key` varchar(255) DEFAULT NULL,
  `file_values` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`file_id`),
  CONSTRAINT `ifile_params_ibfk_1` FOREIGN KEY (`file_id`) REFERENCES `ifiles` (`file_id`) ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ifile_params`
--

LOCK TABLES `ifile_params` WRITE;
/*!40000 ALTER TABLE `ifile_params` DISABLE KEYS */;
/*!40000 ALTER TABLE `ifile_params` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ifile_replicas`
--

DROP TABLE IF EXISTS `ifile_replicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ifile_replicas` (
  `rep_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rep_file_id` bigint(20) DEFAULT NULL,
  `rep_file_location` varchar(2000) DEFAULT NULL,
  `rep_node` varchar(255) DEFAULT NULL,
  `rep_dev` varchar(255) DEFAULT NULL,
  `rep_updatetime` int(11) DEFAULT NULL,
  `rep_status` smallint(6) DEFAULT NULL,
  `rep_version` smallint(6) DEFAULT NULL,
  `rep_idx` tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`rep_id`),
  KEY `ifile_replicas_ibfk_1` (`rep_file_id`),
  CONSTRAINT `ifile_replicas_ibfk_1` FOREIGN KEY (`rep_file_id`) REFERENCES `ifiles` (`file_id`) ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ifile_replicas`
--

LOCK TABLES `ifile_replicas` WRITE;
/*!40000 ALTER TABLE `ifile_replicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ifile_replicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ifile_set`
--

DROP TABLE IF EXISTS `ifile_set`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ifile_set` (
  `fs_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fs_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ifile_set`
--

LOCK TABLES `ifile_set` WRITE;
/*!40000 ALTER TABLE `ifile_set` DISABLE KEYS */;
/*!40000 ALTER TABLE `ifile_set` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ifiles`
--

DROP TABLE IF EXISTS `ifiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ifiles` (
  `file_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) NOT NULL DEFAULT '',
  `file_type` varchar(255) DEFAULT NULL,
  `file_location` varchar(1000) DEFAULT NULL,
  `file_status` smallint(6) DEFAULT '0',
  `file_record_number` bigint(20) DEFAULT '0',
  `file_bytes` bigint(20) DEFAULT '0',
  `file_createtime` int(11) DEFAULT NULL,
  `file_updatetime` int(11) DEFAULT NULL,
  `file_desc` varchar(255) DEFAULT NULL,
  `file_version` smallint(6) DEFAULT NULL,
  `file_fs_id` bigint(20) DEFAULT '0',
  PRIMARY KEY (`file_id`),
  KEY `file_fs_id` (`file_fs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ifiles`
--

LOCK TABLES `ifiles` WRITE;
/*!40000 ALTER TABLE `ifiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `ifiles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-14 17:33:04
