-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: project1
-- ------------------------------------------------------
-- Server version	5.7.33-log

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
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `food_id` int(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `price` int(45) DEFAULT NULL,
  PRIMARY KEY (`food_id`),
  UNIQUE KEY `food_id_UNIQUE` (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES (1,'Paneer Tikka','Starters',180),(2,'Chilli Paneer','Starters',180),(3,'Honey Chilli Potato','Starters',200),(4,'Crispy Corn','Starters',170),(5,'Manchurian','Starters',150),(6,'Murg Malai Tikka','Starters',250),(7,'Fish and Chips','Starters',299),(8,'Spring Rolls','Starters',190),(9,'Chicken Kebab','Starters',260),(10,'Mutton Keema','Starters',310),(11,'Paneer Butter Masala','Curries',180),(12,'Aloo Gobi Masala','Curries',150),(13,'Chana Masala','Curries',150),(14,'Cashew Paneer','Curries',170),(15,'Cashew Tomato','Curries',170),(16,'Butter Chicken','Curries',200),(17,'Prawn Kurma','Curries',250),(18,'Mutton Curry','Curries',260),(19,'Zeera Rice','Rice',120),(20,'Veg Dum Biryani','Rice',180),(21,'Veg Fried Rice','Rice',185),(22,'Egg Fried Rice','Rice',170),(23,'Chicken Fried Rice','Rice',200),(24,'Chicken Dum Biryani','Rice',300),(25,'Mutton Biryani','Rice',290),(26,'Plain Rice','Rice',100),(27,'Butter Naan','Roti & Breads',80),(28,'Butter Roti','Roti & Breads',80),(29,'Garlic Naan','Roti & Breads',85),(30,'Kulcha','Roti & Breads',40),(31,'Aloo Paratha','Roti & Breads',60),(32,'Pulka','Roti & Breads',50),(33,'Idli','Tiffins',30),(34,'Poori','Tiffins',35),(35,'Chole Bhature','Tiffins',40),(36,'Dosa','Tiffins',30),(37,'Masala Dosa','Tiffins',35),(38,'Upma','Tiffins',30),(39,'Poha','Tiffins',30),(40,'Chocolate Ice cream','Desserts',50),(41,'Vanilla Ice cream','Desserts',45),(42,'Strawberry Ice cream','Desserts',45),(43,'Brownie','Desserts',50),(44,'Tiramisu','Desserts',55),(45,'Rasmalai','Desserts',60),(46,'Nutella Sandwich','Desserts',65),(47,'Chocolate Mousse','Desserts',70),(48,'Gulab jamun with Ice cream','Desserts',80),(49,'Almond Malai Kulfi','Desserts',85),(50,'Chocolate Coffee Truffle','Desserts',90),(51,'French Fries','Starters',90),(52,'Paneer 65','Starters',100),(53,'Veg Momos','Starters',120),(54,'Dahi Bhalla','Starters',150);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-20  6:58:13
