CREATE DATABASE  IF NOT EXISTS `bdchapa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdchapa`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: bdchapa
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cadastrochapa`
--

DROP TABLE IF EXISTS `cadastrochapa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadastrochapa` (
  `cod_cadch` int NOT NULL AUTO_INCREMENT,
  `ordemprod` varchar(10) DEFAULT NULL,
  `situacao` varchar(15) DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  `turno` int DEFAULT NULL,
  `cod_hcg` int DEFAULT NULL,
  `maquina` varchar(10) DEFAULT NULL,
  `apontamento` varchar(30) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `obs` varchar(200) DEFAULT NULL,
  `criado` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modificado` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cod_cadch`),
  KEY `fk_hcgcadch` (`cod_hcg`),
  CONSTRAINT `fk_hcgcadch` FOREIGN KEY (`cod_hcg`) REFERENCES `horascompgraf` (`cod_hcg`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadastrochapa`
--

LOCK TABLES `cadastrochapa` WRITE;
/*!40000 ALTER TABLE `cadastrochapa` DISABLE KEYS */;
INSERT INTO `cadastrochapa` VALUES (2,'100800.2','Gravado',5,2,5,'I-12',NULL,NULL,NULL,'2021-12-15 13:27:51','2021-12-15 13:27:51'),(3,'100800.7','Gravado',6,1,5,'I-12',NULL,NULL,NULL,'2021-12-15 14:00:37','2021-12-15 14:00:37'),(4,'100800.3','Gravado',4,1,5,'I-12',NULL,NULL,NULL,'2021-12-15 14:21:16','2021-12-15 14:21:16'),(5,'100800.5','Gravado',2,1,5,'I-12',NULL,NULL,NULL,'2021-12-15 15:33:52','2021-12-15 15:33:52'),(7,'101830.1','Gravado',5,1,40,'I-13',NULL,NULL,NULL,'2021-12-15 16:07:30','2021-12-15 16:07:30'),(8,'101616.1','Gravado',7,1,19,'I-13',NULL,NULL,NULL,'2021-12-15 16:07:51','2021-12-15 16:07:51'),(9,'101813.1','Gravado',4,1,38,'I-5',NULL,NULL,NULL,'2021-12-15 16:08:09','2021-12-15 16:08:09'),(10,'101735.1','Gravado',8,1,37,'I-11',NULL,NULL,NULL,'2021-12-15 16:08:31','2021-12-15 16:08:31'),(11,'101667.1','Gravado',2,1,16,'I-12',NULL,NULL,NULL,'2021-12-15 16:08:53','2021-12-15 16:08:53'),(12,'100800.1','Gravado',6,1,5,'I-13',NULL,NULL,NULL,'2021-12-15 16:09:23','2021-12-15 16:09:23'),(13,'100664.1','Gravado',4,1,30,'I-5',NULL,NULL,NULL,'2021-12-15 16:12:18','2021-12-15 16:12:18'),(14,'100541.1','Gravado',6,1,21,'I-11',NULL,NULL,NULL,'2022-01-28 12:16:13','2022-01-28 12:16:13'),(15,'101735.1','Gravado',8,1,37,'I-5',NULL,NULL,NULL,'2022-01-28 12:16:10','2022-01-28 12:16:10'),(17,'101659.1','Gravado',5,1,23,'I-5',NULL,NULL,NULL,'2022-01-28 14:28:24','2022-02-16 19:46:06'),(20,'101659.1','Regravado',1,2,23,'I-12','Impressão','Chapa arranhada','Teste','2022-01-28 18:51:15','2022-01-28 18:51:15'),(21,'100541.1','Regravado',1,2,21,'I-11','Vendas Cliente','Alter. mont / quant.','teste','2022-02-11 14:13:52','2022-02-11 14:13:52'),(23,'101735.1','Regravado',2,1,37,'I-11','Programação','Troca de máquina','Teste','2022-02-11 14:47:20','2022-02-11 14:47:20'),(24,'101830.1','Regravado',1,1,40,'I-12','Cópia de Chapa','Sugeira no cilindro','teste','2022-02-11 14:48:58','2022-02-11 14:48:58'),(26,'101902.1','Gravado',4,1,47,'I-11',NULL,NULL,NULL,'2022-02-16 17:48:26','2022-02-16 17:49:31'),(27,'101813.1','Regravado',2,1,38,'I-11','Programação','Troca de máquina','Teste','2022-02-17 14:24:11','2022-02-17 14:24:11'),(28,'101616.1','Regravado',2,2,19,'I-13','Pré-Impressão','Não chega na cor','Teste','2022-02-17 14:47:17','2022-02-17 14:50:24'),(29,'101667.1','Regravado',2,2,16,'I-12','Vendas Cliente','Alter. mont / quant.',NULL,'2022-02-17 14:52:15','2022-02-17 14:52:15');
/*!40000 ALTER TABLE `cadastrochapa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `copiachapa`
--

DROP TABLE IF EXISTS `copiachapa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `copiachapa` (
  `cod_copchapa` int NOT NULL AUTO_INCREMENT,
  `motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_copchapa`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `copiachapa`
--

LOCK TABLES `copiachapa` WRITE;
/*!40000 ALTER TABLE `copiachapa` DISABLE KEYS */;
INSERT INTO `copiachapa` VALUES (1,'Chapa arranhada'),(2,'Sugeira no cilindro');
/*!40000 ALTER TABLE `copiachapa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horascompgraf`
--

DROP TABLE IF EXISTS `horascompgraf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horascompgraf` (
  `cod_hcg` int NOT NULL AUTO_INCREMENT,
  `cadoperador` int DEFAULT NULL,
  `nomeoperador` varchar(15) DEFAULT NULL,
  `ordemprod` varchar(10) DEFAULT NULL,
  `obs` varchar(30) DEFAULT NULL,
  `inicio` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `termino` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `criado` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modificado` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cod_hcg`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horascompgraf`
--

LOCK TABLES `horascompgraf` WRITE;
/*!40000 ALTER TABLE `horascompgraf` DISABLE KEYS */;
INSERT INTO `horascompgraf` VALUES (2,20250,'Marcos','100200','Prova','2021-12-09 17:41:13','2021-12-09 20:50:13','2021-12-09 20:50:13','2021-12-09 20:50:13'),(3,20250,'Marcos','100300','Prova','2021-12-09 15:44:03','2021-12-09 15:44:03','2021-12-09 15:44:03','2021-12-09 15:44:03'),(5,20189,'Marcos','100800','Prova','2021-12-10 10:00:00','2021-12-10 14:00:00','2021-12-10 11:08:15','2021-12-10 11:08:15'),(7,20189,'Fred','100800','Conforme Modelo','2021-12-12 08:00:00','2021-12-12 14:00:00','2021-12-10 11:11:05','2021-12-10 11:11:05'),(8,21353,'Janaira','101302','Prova','2021-12-02 15:30:00','2021-12-02 23:30:00','2021-12-10 11:15:49','2021-12-10 13:28:10'),(9,20250,'Marcos','100450','Alteração de Arte','2021-12-10 11:00:00','2021-12-10 13:05:00','2021-12-10 11:45:50','2021-12-10 11:45:50'),(10,20250,'Marcos','100800','Trat. Imagens','2021-12-10 11:00:00','2021-12-10 12:10:00','2021-12-10 13:42:26','2022-01-27 13:46:31'),(11,20250,'Marcos','100800','Trat. Imagens','2021-12-10 14:00:00','2021-12-10 14:30:00','2021-12-10 13:42:54','2021-12-10 13:42:54'),(12,20250,'Marcos','100800','Prova','2021-12-10 15:30:00','2021-12-10 17:00:00','2021-12-10 13:43:51','2021-12-10 17:27:00'),(13,20250,'Marcos','100150','Prova','2021-06-09 12:30:00','2021-06-09 12:50:00','2021-12-10 13:29:13','2021-12-10 13:30:09'),(14,21353,'Janaira','100800','Arte Nova','2021-12-10 15:30:00','2021-12-10 19:00:00','2021-12-10 18:25:21','2021-12-10 18:25:21'),(15,20189,'Raquel','100800','Trat. Imagens','2021-12-10 15:30:00','2021-12-11 00:00:00','2021-12-10 18:39:11','2021-12-10 18:39:11'),(16,20189,'Raquel','101667','Arte Nova','2021-12-10 18:00:00','2021-12-11 00:00:00','2021-12-11 15:21:12','2021-12-11 15:21:12'),(17,20189,'Raquel','101667','Arte Nova','2021-12-11 11:00:00','2021-12-11 16:00:00','2021-12-11 15:21:54','2021-12-11 15:21:54'),(18,20189,'Raquel','101733','Conforme Modelo','2021-12-11 15:30:00','2021-12-11 16:00:00','2021-12-11 16:07:45','2021-12-11 16:07:45'),(19,20189,'Raquel','101616','Alteração de Arte','2021-12-08 23:00:00','2021-12-09 00:00:00','2021-12-11 16:14:42','2021-12-11 16:14:42'),(20,20189,'Raquel','101616','Alteração de Arte','2021-12-09 16:30:00','2021-12-09 20:00:00','2021-12-11 16:15:39','2021-12-11 16:15:39'),(21,20189,'Raquel','100541','Prova','2021-11-05 22:00:00','2021-11-06 00:00:00','2021-12-11 16:17:44','2021-12-11 16:17:44'),(22,20189,'Raquel','101646','Conforme Modelo','2021-12-08 19:00:00','2021-12-08 19:30:00','2021-12-11 16:19:18','2021-12-11 16:19:18'),(23,20189,'Raquel','101659','Conforme Modelo','2021-12-08 17:30:00','2021-12-08 18:00:00','2021-12-11 16:20:17','2021-12-11 16:20:17'),(24,20189,'Raquel','101572','Alteração de Arte','2021-11-08 22:30:00','2021-11-09 00:00:00','2021-12-11 16:21:52','2021-12-11 16:21:52'),(25,20189,'Raquel','101572','Alteração de Arte','2021-11-09 15:30:00','2021-11-09 17:30:00','2021-12-11 16:22:22','2021-12-11 16:22:22'),(26,20189,'Raquel','101476','Alteração de Arte','2021-12-06 21:00:00','2021-12-07 00:00:00','2021-12-11 16:24:00','2021-12-11 16:24:00'),(27,20189,'Raquel','101476','Alteração de Arte','2021-12-07 15:30:00','2021-12-07 19:30:00','2021-12-11 16:24:30','2021-12-11 16:24:30'),(28,20189,'Raquel','101529','Conforme Modelo','2021-12-06 17:30:00','2021-12-06 18:30:00','2021-12-11 16:26:11','2021-12-11 16:26:11'),(29,20189,'Raquel','101441','Conforme Modelo','2021-12-06 17:00:00','2021-12-06 17:30:00','2021-12-11 16:26:57','2021-12-11 16:26:57'),(30,20189,'Raquel','100664','Conforme Modelo','2021-12-03 19:00:00','2021-12-03 19:30:00','2021-12-11 16:27:47','2021-12-11 16:27:47'),(31,20189,'Raquel','101494','Conforme Modelo','2021-12-03 22:30:00','2021-12-03 23:00:00','2021-12-11 16:29:21','2021-12-11 16:29:21'),(32,20189,'Raquel','101419','Prova','2021-12-02 19:00:00','2021-12-03 00:00:00','2021-12-11 16:31:01','2021-12-11 16:31:01'),(33,20250,'Marcos','100800','Retrabalho','2021-12-13 09:06:00','2021-12-13 09:07:00','2021-12-13 09:07:27','2021-12-13 09:07:27'),(34,20029,'Fred','100500','Arte Nova','2021-12-13 12:39:00','2021-12-13 12:45:00','2021-12-13 12:39:38','2021-12-13 12:40:32'),(35,21353,'Janaira','100800','Retrabalho','2021-12-13 12:48:00','2021-12-13 12:55:00','2021-12-13 12:48:13','2021-12-13 12:49:12'),(36,20189,'Raquel','101667','Arte Nova','2021-12-13 15:43:00','2021-12-13 23:07:00','2021-12-13 23:07:51','2021-12-13 23:07:51'),(37,20029,'Fred','101735','Arte Nova','2021-12-14 08:00:00','2021-12-14 09:51:00','2021-12-14 09:53:07','2021-12-14 09:53:07'),(38,20189,'Raquel','101813','Conforme Modelo','2021-12-14 15:30:00','2021-12-14 16:27:00','2021-12-14 16:28:01','2021-12-14 16:28:01'),(39,20189,'Raquel','101616','Alteração de Arte','2021-12-14 16:46:00','2021-12-14 17:42:00','2021-12-14 17:42:54','2021-12-14 17:42:54'),(40,20189,'Raquel','101830','Conforme Modelo','2021-12-14 18:00:00','2021-12-14 20:30:00','2021-12-14 20:35:27','2021-12-14 20:35:27'),(41,20029,'Fred','101735','Arte Nova','2021-12-14 11:30:00','2021-12-14 13:45:00','2021-12-15 09:54:13','2021-12-15 09:54:13'),(42,20029,'Fred','101735','Arte Nova','2021-12-14 14:45:00','2021-12-14 15:30:00','2021-12-15 09:55:20','2021-12-15 09:55:20'),(43,20029,'Fred','101735','Arte Nova','2021-12-15 07:00:00','2021-12-15 09:55:00','2021-12-15 09:56:07','2021-12-15 09:56:07'),(44,20189,'Raquel','101832','Arte Nova','2021-12-14 20:30:00','2021-12-15 00:00:00','2021-12-15 19:29:55','2021-12-15 19:29:55'),(45,20189,'Raquel','101832','Arte Nova','2021-12-15 15:30:00','2021-12-15 19:30:00','2021-12-15 19:31:14','2021-12-15 19:31:14'),(46,20189,'Raquel','101820','Prova','2021-12-13 20:00:00','2021-12-13 22:00:00','2021-12-16 19:03:57','2021-12-16 19:03:57'),(47,20029,'Fred','101902','Arte Nova','2021-12-17 07:00:00','2021-12-17 09:13:00','2021-12-17 09:13:17','2021-12-17 09:13:17'),(48,20189,'Raquel','101852','Arte Nova','2021-12-15 22:00:00','2021-12-16 00:00:00','2021-12-17 18:09:50','2021-12-17 18:09:50'),(49,20189,'Raquel','101852','Arte Nova','2021-12-16 15:30:00','2021-12-16 19:00:00','2021-12-17 18:10:26','2021-12-17 18:10:26'),(50,20189,'Raquel','101852','Arte Nova','2021-12-17 15:30:00','2021-12-17 18:00:00','2021-12-17 18:10:51','2021-12-17 18:10:51'),(51,20189,'Raquel','101902','Arte Nova','2021-12-17 18:00:00','2021-12-17 21:00:00','2021-12-17 20:43:27','2021-12-17 20:43:27'),(52,20189,'Raquel','101903','Arte Nova','2021-12-16 19:30:00','2021-12-16 23:00:00','2021-12-20 15:52:01','2021-12-20 15:52:01'),(53,20189,'Raquel','101903','Arte Nova','2021-12-17 18:00:00','2021-12-17 23:00:00','2021-12-20 15:54:33','2021-12-20 15:54:33'),(54,20189,'Raquel','100375','Prova','2021-10-29 17:30:00','2021-10-29 20:30:00','2021-12-20 16:59:40','2021-12-20 16:59:40'),(55,20189,'Raquel','102027','Arte Nova','2021-12-20 18:00:00','2021-12-20 23:00:00','2021-12-20 22:51:53','2021-12-20 22:51:53'),(56,20189,'Raquel','102044','Arte Nova','2021-12-20 23:00:00','2021-12-21 00:00:00','2021-12-21 23:42:37','2021-12-21 23:42:37'),(57,20189,'Raquel','102044','Arte Nova','2021-12-21 15:30:00','2021-12-21 17:00:00','2021-12-21 23:43:27','2021-12-21 23:43:27');
/*!40000 ALTER TABLE `horascompgraf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impressao`
--

DROP TABLE IF EXISTS `impressao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `impressao` (
  `cod_imp` int NOT NULL AUTO_INCREMENT,
  `motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_imp`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impressao`
--

LOCK TABLES `impressao` WRITE;
/*!40000 ALTER TABLE `impressao` DISABLE KEYS */;
INSERT INTO `impressao` VALUES (1,'Chapa arranhada'),(2,'Não chega na cor'),(3,'Outro fator');
/*!40000 ALTER TABLE `impressao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lotechapa`
--

DROP TABLE IF EXISTS `lotechapa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lotechapa` (
  `cod_lch` int NOT NULL AUTO_INCREMENT,
  `lote` varchar(20) DEFAULT NULL,
  `situacao` varchar(10) DEFAULT NULL,
  `cod_cadch` int DEFAULT NULL,
  PRIMARY KEY (`cod_lch`),
  KEY `fk_cadchlch` (`cod_cadch`),
  CONSTRAINT `fk_cadchlch` FOREIGN KEY (`cod_cadch`) REFERENCES `cadastrochapa` (`cod_cadch`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lotechapa`
--

LOCK TABLES `lotechapa` WRITE;
/*!40000 ALTER TABLE `lotechapa` DISABLE KEYS */;
/*!40000 ALTER TABLE `lotechapa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maquina`
--

DROP TABLE IF EXISTS `maquina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maquina` (
  `cod_maq` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_maq`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maquina`
--

LOCK TABLES `maquina` WRITE;
/*!40000 ALTER TABLE `maquina` DISABLE KEYS */;
INSERT INTO `maquina` VALUES (1,'I-5'),(2,'I-11'),(3,'I-12'),(4,'I-13');
/*!40000 ALTER TABLE `maquina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `obscompgraf`
--

DROP TABLE IF EXISTS `obscompgraf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `obscompgraf` (
  `cod_obs` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`cod_obs`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obscompgraf`
--

LOCK TABLES `obscompgraf` WRITE;
/*!40000 ALTER TABLE `obscompgraf` DISABLE KEYS */;
INSERT INTO `obscompgraf` VALUES (1,'Prova'),(2,'Arte Nova'),(3,'Alteração de Arte'),(4,'Conforme Modelo'),(7,'Trat. Imagens'),(11,'Retrabalho');
/*!40000 ALTER TABLE `obscompgraf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operador`
--

DROP TABLE IF EXISTS `operador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operador` (
  `cod_oper` int NOT NULL AUTO_INCREMENT,
  `cadastro` int NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`cod_oper`),
  UNIQUE KEY `cadastro` (`cadastro`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operador`
--

LOCK TABLES `operador` WRITE;
/*!40000 ALTER TABLE `operador` DISABLE KEYS */;
INSERT INTO `operador` VALUES (1,20029,'Fred'),(2,21353,'Janaira'),(3,20250,'Marcos'),(4,21064,'Maximiliano'),(5,20189,'Raquel');
/*!40000 ALTER TABLE `operador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `outros`
--

DROP TABLE IF EXISTS `outros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `outros` (
  `cod_out` int NOT NULL AUTO_INCREMENT,
  `motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_out`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `outros`
--

LOCK TABLES `outros` WRITE;
/*!40000 ALTER TABLE `outros` DISABLE KEYS */;
INSERT INTO `outros` VALUES (1,'Gastou a camada'),(2,'Teste'),(3,'Chapa para reforço'),(4,'Reposição'),(5,'Sem definição');
/*!40000 ALTER TABLE `outros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preimpressao`
--

DROP TABLE IF EXISTS `preimpressao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preimpressao` (
  `cod_pre` int NOT NULL AUTO_INCREMENT,
  `motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_pre`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preimpressao`
--

LOCK TABLES `preimpressao` WRITE;
/*!40000 ALTER TABLE `preimpressao` DISABLE KEYS */;
INSERT INTO `preimpressao` VALUES (1,'Arquivo errado'),(2,'Não chega na cor'),(3,'Texto');
/*!40000 ALTER TABLE `preimpressao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programacao`
--

DROP TABLE IF EXISTS `programacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programacao` (
  `cod_prog` int NOT NULL AUTO_INCREMENT,
  `motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_prog`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programacao`
--

LOCK TABLES `programacao` WRITE;
/*!40000 ALTER TABLE `programacao` DISABLE KEYS */;
INSERT INTO `programacao` VALUES (1,'Troca de máquina'),(2,'Completar tiragem'),(3,'Alteração de papel');
/*!40000 ALTER TABLE `programacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendascliente`
--

DROP TABLE IF EXISTS `vendascliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendascliente` (
  `cod_vend` int NOT NULL AUTO_INCREMENT,
  `motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_vend`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendascliente`
--

LOCK TABLES `vendascliente` WRITE;
/*!40000 ALTER TABLE `vendascliente` DISABLE KEYS */;
INSERT INTO `vendascliente` VALUES (1,'Aprovação'),(2,'Troca de cor'),(3,'Alter. mont / quant.'),(4,'Alteração de arte');
/*!40000 ALTER TABLE `vendascliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bdchapa'
--

--
-- Dumping routines for database 'bdchapa'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-23 10:28:27
