-- MySQL dump 10.13  Distrib 5.7.15, for Win64 (x86_64)
--
-- Host: localhost    Database: books
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `authorisbn`
--

DROP TABLE IF EXISTS `authorisbn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorisbn` (
  `ISBN` varchar(13) DEFAULT NULL,
  `AuthorID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorisbn`
--

LOCK TABLES `authorisbn` WRITE;
/*!40000 ALTER TABLE `authorisbn` DISABLE KEYS */;
INSERT INTO `authorisbn` VALUES ('0-13-010671-2',1),('0-13-010671-2',2),('0-13-020522-2',1),('0-13-020522-2',2),('0-13-020522-2',3),('0-13-082714-2',1),('0-13-082714-2',2),('0-13-082925-0',1),('0-13-082925-0',2),('0-13-082927-7',1),('0-13-082927-7',2),('0-13-082928-5',1),('0-13-082928-5',2),('0-13-082928-5',3),('0-13-083054-2',1),('0-13-083054-2',2),('0-13-083055-0',1),('0-13-083055-0',2),('0-13-118043-6',1),('0-13-118043-6',2),('0-13-226119-7',1),('0-13-226119-7',2),('0-13-271974-6',1),('0-13-271974-6',2),('0-13-456955-5',1),('0-13-456955-5',2),('0-13-456955-5',3),('0-13-528910-6',1),('0-13-528910-6',2),('0-13-565912-4',1),('0-13-565912-4',2),('0-13-565912-4',3),('0-13-899394-7',1),('0-13-899394-7',2),('0-13-904947-9',1),('0-13-904947-9',2),('0-13-904947-9',3),('0-13-GSVCPP-x',1),('0-13-GSVCPP-x',2),('0-13-IWCTC-x',1),('0-13-IWCTC-x',2),('0-13-IWCTC-x',3),('0-13-IWWWIM',1),('0-13-IWWWIM',2),('0-13-IWWWIM',3),('0-13-IWWW-x',1),('0-13-IWWW-x',2),('0-13-IWWW-x',3),('0-13-JAVA3-x',1),('0-13-JAVA3-x',2),('0-13-JCTC2-x',1),('0-13-JCTC2-x',2);
/*!40000 ALTER TABLE `authorisbn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authors` (
  `AuthorID` bigint(20) NOT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `YearBorn` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`AuthorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors`
--

LOCK TABLES `authors` WRITE;
/*!40000 ALTER TABLE `authors` DISABLE KEYS */;
INSERT INTO `authors` VALUES (1,'Harvey','Deitel','1946'),(2,'Paul','Deitel','1968'),(3,'Tem','Nieto','1969');
/*!40000 ALTER TABLE `authors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publishers`
--

DROP TABLE IF EXISTS `publishers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publishers` (
  `PublisherID` bigint(20) NOT NULL,
  `PublisherName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PublisherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publishers`
--

LOCK TABLES `publishers` WRITE;
/*!40000 ALTER TABLE `publishers` DISABLE KEYS */;
INSERT INTO `publishers` VALUES (1,'Prentice Hall'),(2,'Prentice Hall Partner');
/*!40000 ALTER TABLE `publishers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titles`
--

DROP TABLE IF EXISTS `titles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titles` (
  `ISBN` varchar(13) NOT NULL,
  `Title` varchar(255) DEFAULT NULL,
  `EditionNumber` varchar(20) DEFAULT NULL,
  `YearPublished` varchar(4) DEFAULT NULL,
  `Description` text,
  `PublishedID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titles`
--

LOCK TABLES `titles` WRITE;
/*!40000 ALTER TABLE `titles` DISABLE KEYS */;
INSERT INTO `titles` VALUES ('0-13-010671-2','Java How to Program 2/e and Getting Started with Visual J++','2','1998','This university-only package includes the best-selling textbook.',1),('0-13-020522-2','Visual BAsic 6 How to Program Instructor Manual with Solution','1','1999','This university-only package includes the best-selling textbook.',1),('0-13-082714-2','C++ How to Program 2/e Instructor Manual with Solution','2','1998','This university-only package includes the best-selling textbook.',1),('0-13-082925-0','The Complete C++ Training Course','2','1998','This university-only package includes the best-selling textbook.',2),('0-13-082927-7','The Complete Java Training Course','2','1997','This university-only package includes the best-selling textbook.',2),('0-13-082928-5','The Complete Visual Basic 6 Training Course','2','1997','This university-only package includes the best-selling textbook.',2),('0-13-083054-2','The Complete C++ Training Course 2/e','2','1998','This university-only package includes the best-selling textbook.',1),('0-13-083055-0','The Complete Java Training Course 2/e','2','1998','This university-only package includes the best-selling textbook.',1),('0-13-118043-6','C How to Program','1','1992','This university-only package includes the best-selling textbook.',1),('0-13-226119-7','C How to Program','2','1994','This university-only package includes the best-selling textbook.',1),('0-13-271974-6','Java Multimedia Cyber Classroom','1','1996','This university-only package includes the best-selling textbook.',2),('0-13-456955-5','Visual Basic 6 How to Program','1','1998','This university-only package includes the best-selling textbook.',1),('0-13-528910-6','C++ How to Program','2','1997','This university-only package includes the best-selling textbook.',1),('0-13-565912-4','C++ How to Program Instructor Manual with Solution','2','1997','This university-only package includes the best-selling textbook.',1),('0-13-899394-7','Java How to Program','2','1997','This university-only package includes the best-selling textbook.',1),('0-13-904947-9','Java How to Program Instructor Manual with Solution','2','1997','This university-only package includes the best-selling textbook.',1),('0-13-GSVCPP-x','Getting Started with Visual C++','1','1999','This university-only package includes the best-selling textbook.',2),('0-13-IWCTC-x','The Internet and WWW','1','1999','This university-only package includes the best-selling textbook.',1),('0-13-IWWW-x','Internet and WWW How to Program Instructor Manual','1','1999','This university-only package includes the best-selling textbook.',1),('0-13-IWWWIM','The Internet and WWW How to Program','1','1999','This university-only package includes the best-selling textbook.',1),('0-13-JAVA3-x','Java How to Program 2/e Instructor Manual','3','1999','This university-only package includes the best-selling textbook.',1),('0-13-JCTC2-x','The Complete Java Training Course','3','1999','This university-only package includes the best-selling textbook.',2);
/*!40000 ALTER TABLE `titles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-08 16:06:41
