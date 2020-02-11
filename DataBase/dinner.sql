-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 2018 m. Spa 10 d. 12:36
-- Server version: 10.2.12-MariaDB
-- PHP Version: 7.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id3260688_db`
--

-- --------------------------------------------------------
CREATE DATABASE IF NOT EXISTS  `dinner` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `dinner`;
-- 
--
-- Sukurta duomenų struktūra lentelei `dinner`
--

CREATE TABLE `dinner` (
  `id` int(11) NOT NULL,
  `data` datetime NOT NULL DEFAULT current_timestamp(),
  `type` varchar(255) NOT NULL,
  `delivery` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `payment` varchar(255) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Sukurta duomenų kopija lentelei `F2`
--

INSERT INTO `dinner` (`id`, `data`, `type`, `delivery`, `price`, `payment`) VALUES
(3, '2020-02-10 12:15:33', 'salad', 'yes', '10 ', 'card'),
(4, '2020-02-10 12:15:33', 'soup', 'yes', '5', 'card');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `F2`
--
ALTER TABLE `dinner`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `F2`
--
ALTER TABLE `dinner`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;