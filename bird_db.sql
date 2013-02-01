-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 20, 2013 at 07:18 PM
-- Server version: 5.5.28
-- PHP Version: 5.3.10-1ubuntu3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bird_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `displaytable`
--

CREATE TABLE IF NOT EXISTS `displaytable` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `Book_Name` varchar(30) NOT NULL,
  `Author_Name` varchar(20) NOT NULL,
  `ISBN_Number` varchar(19) NOT NULL,
  `Qunatity` int(3) NOT NULL,
  `Available` int(3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `displaytable`
--

INSERT INTO `displaytable` (`id`, `Book_Name`, `Author_Name`, `ISBN_Number`, `Qunatity`, `Available`) VALUES
(1, '1', '1', '1', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `issuetable`
--

CREATE TABLE IF NOT EXISTS `issuetable` (
  `id` int(11) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Book_Name` varchar(30) DEFAULT NULL,
  `Issue_Date` date DEFAULT NULL,
  `Return_Date` date DEFAULT NULL,
  `Quantity` int(11) NOT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
