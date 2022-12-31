-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Giu 30, 2017 alle 16:00
-- Versione del server: 10.1.21-MariaDB
-- Versione PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Biglietteria`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `tratte`
--

CREATE TABLE `tratte` (
  `id_tratta` int(11) NOT NULL,
  `descrizione` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `tratte`
--

INSERT INTO `tratte` (`id_tratta`, `descrizione`) VALUES
(1, 'Torino-Roma'),
(2, 'Torino-Napoli'),
(3, 'Torino-Venezia'),
(4, 'Torino-Palermo');

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `id_utenti` int(11) NOT NULL,
  `denominazione` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `utenti`
--

INSERT INTO `utenti` (`id_utenti`, `denominazione`) VALUES
(1, 'chivapiano'),
(2, 'bagarino');

-- --------------------------------------------------------

--
-- Struttura della tabella `viaggi`
--

CREATE TABLE `viaggi` (
  `id_viaggi` int(11) NOT NULL,
  `id_utenti` int(11) NOT NULL,
  `id_tratte` int(11) NOT NULL,
  `data_viaggio` date NOT NULL,
  `numero_biglietti` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `viaggi`
--

INSERT INTO `viaggi` (`id_viaggi`, `id_utenti`, `id_tratte`, `data_viaggio`, `numero_biglietti`) VALUES
(1, 1, 1, '2017-06-30', 10),
(2, 1, 1, '2017-06-30', 10),
(3, 1, 1, '2017-06-30', 10),
(4, 1, 1, '2017-06-30', 10),
(5, 1, 1, '2017-06-30', 10),
(6, 1, 1, '2017-06-30', 10);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `tratte`
--
ALTER TABLE `tratte`
  ADD PRIMARY KEY (`id_tratta`);

--
-- Indici per le tabelle `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`id_utenti`);

--
-- Indici per le tabelle `viaggi`
--
ALTER TABLE `viaggi`
  ADD PRIMARY KEY (`id_viaggi`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `tratte`
--
ALTER TABLE `tratte`
  MODIFY `id_tratta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT per la tabella `utenti`
--
ALTER TABLE `utenti`
  MODIFY `id_utenti` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT per la tabella `viaggi`
--
ALTER TABLE `viaggi`
  MODIFY `id_viaggi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
