-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 26, 2021 alle 15:01
-- Versione del server: 10.4.14-MariaDB
-- Versione PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cloud2021`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `videogames`
--

CREATE TABLE `videogames` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `genere` varchar(50) NOT NULL,
  `valutazione` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `videogames`
--

INSERT INTO `videogames` (`id`, `nome`, `genere`, `valutazione`) VALUES
(1, 'Minecraft', '', '0.00'),
(2, 'Grand Theft Auto V', '', '0.00'),
(3, 'Wii Sports', '', '0.00'),
(4, 'PlayerUnknown\'s Battlegrounds', '', '0.00'),
(5, 'Super Mario Bros.', '', '0.00'),
(6, 'Pokémon Red / Green / Blue', '', '0.00'),
(7, 'Yellow', '', '0.00'),
(8, 'Mario Kart 8 / Deluxe', '', '0.00'),
(9, 'Wii Fit', '', '0.00'),
(10, 'Plus', '', '0.00'),
(11, 'Pac-Man', '', '0.00'),
(12, 'Mario Kart Wii', '', '0.00'),
(13, 'Red Dead Redemption 2', '', '0.00'),
(14, 'Terraria', '', '0.00'),
(15, 'Wii Sports Resort', '', '0.00'),
(16, 'Animal Crossing: New Horizons', '', '0.00'),
(17, 'New Super Mario Bros.', '', '0.00'),
(18, 'New Super Mario Bros. Wii', '', '0.00'),
(19, 'The Elder Scrolls V: Skyrim', '', '0.00'),
(20, 'Call of Duty: Modern Warfare', '', '0.00'),
(21, 'Diablo III', '', '0.00'),
(22, 'Reaper of Souls', '', '0.00'),
(23, 'The Witcher 3', '', '0.00'),
(24, 'Hearts of Stone', '', '0.00'),
(25, 'Blood and Wine', '', '0.00'),
(26, 'Pokémon Gold / Silver', '', '0.00'),
(27, 'Crystal', '', '0.00'),
(28, 'Duck Hunt', '', '0.00'),
(29, 'Wii Play', '', '0.00'),
(30, 'Grand Theft Auto: San Andreas', '', '0.00'),
(31, 'Super Mario World', '', '0.00'),
(32, 'Call of Duty: Modern Warfare 3', '', '0.00'),
(33, 'Call of Duty: Black Ops', '', '0.00'),
(34, 'Pokémon Sun / Moon', '', '0.00'),
(35, 'Ultra Sun / Ultra Moon', '', '0.00'),
(36, 'Grand Theft Auto IV', '', '0.00'),
(37, 'Human Fall Flat', '', '0.00'),
(38, 'Pokémon Diamond / Pearl', '', '0.00'),
(39, 'Platinum', '', '0.00'),
(40, 'Super Mario Bros. 3', '', '0.00'),
(41, 'Call of Duty: Black Ops II', '', '0.00'),
(42, 'Kinect Adventures!', '', '0.00'),
(43, 'FIFA 18', '', '0.00'),
(44, 'Sonic the Hedgehog', '', '0.00'),
(45, 'The Legend of Zelda: Breath of the Wild', '', '0.00'),
(46, 'Nintendogs', '', '0.00'),
(47, 'Super Smash Bros. Ultimate', '', '0.00'),
(48, 'Mario Kart DS', '', '0.00'),
(49, 'Super Mario 64', '', '0.00'),
(50, 'DS', '', '0.00'),
(51, 'Call of Duty: Modern Warfare 2', '', '0.00'),
(52, 'Pokémon Ruby / Sapphire', '', '0.00'),
(53, 'Emerald', '', '0.00'),
(54, 'Borderlands 2', '', '0.00'),
(55, 'Pokémon Sword / Shield', '', '0.00'),
(56, 'Super Mario Odyssey', '', '0.00'),
(57, 'Grand Theft Auto: Vice City', '', '0.00'),
(58, 'The Last of Us / Remastered', '', '0.00');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `videogames`
--
ALTER TABLE `videogames`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `videogames`
--
ALTER TABLE `videogames`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
