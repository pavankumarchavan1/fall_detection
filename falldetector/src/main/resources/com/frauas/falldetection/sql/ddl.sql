CREATE DATABASE IF NOT EXISTS falldetectordb;
USE falldetectordb;

DROP TABLE IF EXISTS `falldetectordb`.`patientinfo`;
CREATE TABLE `falldetectordb`.`patientinfo` (
  `patientname` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NULL,
  `hospital` VARCHAR(45) NULL,
  `contact` VARCHAR(45) NULL,
  `id` VARCHAR(45) not NULL,
  PRIMARY KEY (`id`));