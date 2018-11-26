-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Creato il: Feb 19, 2018 alle 12:15
-- Versione del server: 10.1.16-MariaDB
-- Versione PHP: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tss_2018`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `africa`
--

CREATE TABLE `africa` (
  `id` int(11) NOT NULL,
  `stato` varchar(30) DEFAULT NULL,
  `capitale` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `africa`
--

INSERT INTO `africa` (`id`, `stato`, `capitale`) VALUES
(1, 'Egitto', 'Il Cairo'),
(2, 'Algeria', 'Algeri'),
(3, 'Marocco', 'Rabat'),
(5, 'Libia', 'Tripoli'),
(6, 'Sud Africa', 'Pretoria');

-- --------------------------------------------------------

--
-- Struttura della tabella `americhe`
--

CREATE TABLE `americhe` (
  `id` int(11) NOT NULL,
  `stato` varchar(30) DEFAULT NULL,
  `capitale` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `americhe`
--

INSERT INTO `americhe` (`id`, `stato`, `capitale`) VALUES
(1, 'Stati Uniti', 'Washington'),
(2, 'Canada', 'Toronto'),
(3, 'Uruguay', 'Montevideo');

-- --------------------------------------------------------

--
-- Struttura della tabella `amici`
--

CREATE TABLE `amici` (
  `amici_id` int(11) NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `amici`
--

INSERT INTO `amici` (`amici_id`, `nome`, `cognome`) VALUES
(1, 'anna', 'negro'),
(2, 'poli', 'tito'),
(3, 'matteo', 'tito'),
(4, 'emilio', 'maglia'),
(5, 'melina', 'cappelli');

-- --------------------------------------------------------

--
-- Struttura della tabella `articoli`
--

CREATE TABLE `articoli` (
  `id_articolo` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `prezzo` decimal(7,2) NOT NULL,
  `categoria` enum('hardware','software') NOT NULL,
  `rimanenza` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `articoli`
--

INSERT INTO `articoli` (`id_articolo`, `nome`, `prezzo`, `categoria`, `rimanenza`) VALUES
(1, 'monitor', '350.00', 'hardware', 96),
(2, 'chiavetta', '38.50', 'hardware', 84),
(3, 'hard-disk', '300.00', 'hardware', 94),
(4, 'smartwatch', '400.00', 'hardware', 96),
(5, 'Photoshop', '700.00', 'software', 98),
(6, 'Office', '350.50', 'software', 95),
(7, 'webcam', '68.00', 'hardware', 94);

-- --------------------------------------------------------

--
-- Struttura della tabella `autore`
--

CREATE TABLE `autore` (
  `autore_id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `autore`
--

INSERT INTO `autore` (`autore_id`, `nome`, `cognome`) VALUES
(1, 'Paulo', 'Coelho'),
(2, 'E.L.', 'James'),
(3, 'Agatha', 'Christie'),
(4, 'Miguel', 'de Cervantes'),
(5, 'J.K.', 'Rowling'),
(6, 'Dan', 'Brown'),
(7, 'J.D.', 'Salinger'),
(8, 'Clive Staples', 'Lewis'),
(9, 'Mao', 'Tse-tung'),
(10, 'Antoine', 'de Saint-Exupery'),
(11, 'John Ronald Reuel', 'Tolkien'),
(12, 'Chan', 'Tsao'),
(13, 'Ken', 'Follett'),
(14, 'Kazuo', 'Ishiguro'),
(15, 'Zerocalcare', NULL),
(16, NULL, 'Fruttero'),
(17, NULL, 'Lucentini'),
(18, 'Andrea', 'Camilleri'),
(19, 'Charles', 'Dickens'),
(20, 'Stephen', 'King');

-- --------------------------------------------------------

--
-- Struttura della tabella `autore_libro`
--

CREATE TABLE `autore_libro` (
  `libro_id` int(11) DEFAULT NULL,
  `autore_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `autore_libro`
--

INSERT INTO `autore_libro` (`libro_id`, `autore_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 16),
(14, 17),
(15, 11),
(16, 15),
(17, 6),
(18, 14),
(19, 18),
(20, 19),
(22, 20);

-- --------------------------------------------------------

--
-- Struttura della tabella `clienti`
--

CREATE TABLE `clienti` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `e_mail` varchar(50) NOT NULL,
  `indirizzo` varchar(100) NOT NULL,
  `citta` varchar(50) NOT NULL,
  `regione` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `clienti`
--

INSERT INTO `clienti` (`id_cliente`, `nome`, `cognome`, `telefono`, `e_mail`, `indirizzo`, `citta`, `regione`) VALUES
(1, 'paolo', 'rossi', '0116702323', 'paolo25@gmail.com', 'Via Roma 25', 'Torino', 'Piemonte'),
(2, 'marco', 'mori', '0116704040', 'marco18@gmail.com', 'Via Torino 18', 'Milano', 'Lombardia'),
(3, 'luca', 'bianchi', '0116701010', 'luca2@gmail,com', 'Via Milano 2', 'Bologna', 'Emilia-Romagna'),
(4, 'mario', 'verdi', '0116702020', 'mario128@gmail.com', 'Corso Francia 128', 'Torino', 'Piemonte'),
(5, 'alberto', 'rosso', '0116707070', 'alberto12@icloud.com', 'Corso Svizzera 12', 'Milano', 'Lombardia'),
(6, 'franco', 'esposito', '0119978812', 'francoe@icloud.com', 'Via Roma 3', 'Asti', 'Piemonte'),
(7, 'carlo', 'bruni', '0117778816', 'brunicarlo@icloud.com', 'Corso Stati Uniti 13', 'Torino', 'Piemonte');

-- --------------------------------------------------------

--
-- Struttura della tabella `editore`
--

CREATE TABLE `editore` (
  `editore_id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `editore`
--

INSERT INTO `editore` (`editore_id`, `nome`) VALUES
(4, 'Bao Publishing'),
(7, 'Edizioni Clandestine'),
(5, 'Einaudi'),
(6, 'Salani'),
(3, 'Sellerio'),
(8, 'Sperling & Kupfer');

-- --------------------------------------------------------

--
-- Struttura della tabella `editore_bk`
--

CREATE TABLE `editore_bk` (
  `editore_id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `editore_bk`
--

INSERT INTO `editore_bk` (`editore_id`, `nome`) VALUES
(4, 'Bao Publishing'),
(1, 'Bompiani'),
(7, 'Edizioni Clandestine'),
(5, 'Einaudi'),
(2, 'Mondadori'),
(6, 'Salani'),
(3, 'Sellerio'),
(8, 'Sperling & Kupfer');

-- --------------------------------------------------------

--
-- Struttura stand-in per le viste `elenco_libri`
--
CREATE TABLE `elenco_libri` (
`Titolo` varchar(255)
,`Prezzo` decimal(6,2)
,`Autore` varchar(50)
,`Edito da` varchar(50)
);

-- --------------------------------------------------------

--
-- Struttura della tabella `europa`
--

CREATE TABLE `europa` (
  `id` int(11) NOT NULL,
  `stato` varchar(30) DEFAULT NULL,
  `capitale` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `europa`
--

INSERT INTO `europa` (`id`, `stato`, `capitale`) VALUES
(1, 'Italia', 'Roma'),
(2, 'Francia', 'Parigi'),
(3, 'Spagna', 'Madrid');

-- --------------------------------------------------------

--
-- Struttura della tabella `impiegati`
--

CREATE TABLE `impiegati` (
  `impiegato_id` int(11) NOT NULL,
  `nome` varchar(60) DEFAULT NULL,
  `cognome` varchar(60) DEFAULT NULL,
  `ruolo` varchar(30) DEFAULT NULL,
  `rif_to` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `impiegati`
--

INSERT INTO `impiegati` (`impiegato_id`, `nome`, `cognome`, `ruolo`, `rif_to`) VALUES
(1, 'Mario', 'Rossi', 'tecnico', NULL),
(2, 'Marco', 'Bianchi', 'amministrativo', 7),
(3, 'Paolo', 'Verdi', 'amministrativo', 7),
(4, 'Enrico', 'Marrone', 'venditore', 8),
(5, 'Nicola', 'Testa', 'venditore', 8),
(6, 'Franco', 'Barba', 'tecnico', 1),
(7, 'Elena', 'Totti', 'amministrativo', NULL),
(8, 'Paola', 'Capra', 'venditore', NULL),
(9, 'Mauro', 'Esposito', 'venditore', 8);

-- --------------------------------------------------------

--
-- Struttura della tabella `libro`
--

CREATE TABLE `libro` (
  `libro_id` int(11) NOT NULL,
  `titolo` varchar(255) NOT NULL,
  `prezzo` decimal(6,2) NOT NULL,
  `p_iva` decimal(6,2) DEFAULT NULL,
  `editore_id` int(11) DEFAULT NULL,
  `pagine` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `libro`
--

INSERT INTO `libro` (`libro_id`, `titolo`, `prezzo`, `p_iva`, `editore_id`, `pagine`) VALUES
(1, 'L''Alchimista', '12.00', '14.64', NULL, 184),
(4, 'Don Chisciotte della Mancha', '20.40', '24.89', 5, NULL),
(5, 'Harry Potter e la Pietra Filosofale', '8.50', '10.37', 6, 302),
(7, 'Il giovane Holden', '10.20', '12.44', 5, 251),
(9, 'Il libretto rosso', '7.22', '8.81', 7, 160),
(11, 'Il Signore degli Anelli: La compagnia dell''anello. Le due torri. Il ritorno del re', '25.00', '30.50', NULL, 1255),
(12, 'Il sogno della camera rossa. Romanzo cinese del XVIII secolo', '15.30', '18.67', 5, 721),
(15, 'Lo Hobbit', '9.35', '11.41', NULL, 417),
(16, 'Macerie prime', '14.45', '17.63', 4, 192),
(18, 'Quel che resta del giorno', '12.00', '14.64', 5, 276),
(19, 'Un mese con Montalbano', '12.75', '15.56', 6, 512),
(21, 'Marcovaldo', '10.00', '12.20', 7, 120),
(22, 'IT', '25.00', '30.50', 8, 550);

-- --------------------------------------------------------

--
-- Struttura della tabella `libro_bk`
--

CREATE TABLE `libro_bk` (
  `libro_id` int(11) NOT NULL,
  `titolo` varchar(255) NOT NULL,
  `prezzo` decimal(6,2) NOT NULL,
  `p_iva` decimal(6,2) DEFAULT NULL,
  `editore_id` int(11) DEFAULT NULL,
  `pagine` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `libro_bk`
--

INSERT INTO `libro_bk` (`libro_id`, `titolo`, `prezzo`, `p_iva`, `editore_id`, `pagine`) VALUES
(1, 'L''Alchimista', '12.00', '14.64', 1, 184),
(2, 'Cinquanta sfumature di grigio', '10.20', '12.44', 2, 560),
(3, 'Dieci piccoli indiani', '10.20', '12.44', 2, 208),
(4, 'Don Chisciotte della Mancha', '20.40', '24.89', 5, NULL),
(5, 'Harry Potter e la Pietra Filosofale', '8.50', '10.37', 6, 302),
(6, 'Il Codice da Vinci', '11.00', '13.42', 2, 512),
(7, 'Il giovane Holden', '10.20', '12.44', 5, 251),
(8, 'Il leone, la strega e l''armadio', '7.65', '9.33', 2, 182),
(9, 'Il libretto rosso', '7.22', '8.81', 7, 160),
(10, 'Il Piccolo Principe', '4.25', '5.19', 2, 95),
(11, 'Il Signore degli Anelli: La compagnia dell''anello. Le due torri. Il ritorno del re', '25.00', '30.50', 1, 1255),
(12, 'Il sogno della camera rossa. Romanzo cinese del XVIII secolo', '15.30', '18.67', 5, 721),
(13, 'La colonna di fuoco', '27.00', '32.94', 2, 912),
(14, 'La donna della domenica', '12.00', '14.64', 2, 434),
(15, 'Lo Hobbit', '9.35', '11.41', 1, 417),
(16, 'Macerie prime', '14.45', '17.63', 4, 192),
(17, 'Origin', '21.25', '25.93', 2, 564),
(18, 'Quel che resta del giorno', '12.00', '14.64', 5, 276),
(19, 'Un mese con Montalbano', '12.75', '15.56', 6, 512),
(20, 'Una storia tra due città', '9.77', '11.92', 2, 600),
(21, 'Marcovaldo', '10.00', '12.20', 7, 120),
(22, 'IT', '25.00', '30.50', 8, 550);

-- --------------------------------------------------------

--
-- Struttura della tabella `ordine_dettagli`
--

CREATE TABLE `ordine_dettagli` (
  `id_ordine` int(11) NOT NULL,
  `id_articolo` int(11) NOT NULL,
  `quantita` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `ordine_dettagli`
--

INSERT INTO `ordine_dettagli` (`id_ordine`, `id_articolo`, `quantita`) VALUES
(1, 2, 1),
(1, 7, 3),
(2, 5, 1),
(2, 6, 5),
(3, 2, 10),
(3, 4, 1),
(4, 1, 3),
(4, 3, 2),
(4, 7, 1),
(5, 3, 2),
(5, 7, 1),
(5, 4, 3),
(5, 5, 1),
(6, 2, 5),
(6, 3, 2),
(6, 7, 1),
(7, 1, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `ordini`
--

CREATE TABLE `ordini` (
  `id_ordine` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `ordini`
--

INSERT INTO `ordini` (`id_ordine`, `id_cliente`, `data`) VALUES
(1, 1, '2017-12-01'),
(2, 3, '2018-01-11'),
(3, 5, '2018-01-21'),
(4, 3, '2018-01-23'),
(5, 6, '2018-02-03'),
(6, 6, '2018-02-13'),
(7, 5, '2018-02-14');

-- --------------------------------------------------------

--
-- Struttura della tabella `parenti`
--

CREATE TABLE `parenti` (
  `parenti_id` int(11) NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  `eta` tinyint(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `parenti`
--

INSERT INTO `parenti` (`parenti_id`, `nome`, `cognome`, `eta`) VALUES
(1, 'anna', 'negro', 83),
(2, 'poli', 'tito', 89),
(3, 'matteo', 'tito', 37),
(4, 'emilio', 'maglia', 62),
(5, 'melina', 'cappelli', 56);

-- --------------------------------------------------------

--
-- Struttura della tabella `prodotti`
--

CREATE TABLE `prodotti` (
  `id` int(11) NOT NULL,
  `descrizione` varchar(15) DEFAULT NULL,
  `modello` varchar(15) DEFAULT NULL,
  `marca` varchar(15) DEFAULT NULL,
  `prezzo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `prodotti`
--

INSERT INTO `prodotti` (`id`, `descrizione`, `modello`, `marca`, `prezzo`) VALUES
(1, 'Desktop', 'IMac', 'Apple', 849),
(2, 'Notebook', 'MacBook', 'Apple', 1849),
(3, 'Convertibli', 'Air', 'Apple', 929);

-- --------------------------------------------------------

--
-- Struttura della tabella `studenti`
--

CREATE TABLE `studenti` (
  `studente_id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `genere` enum('m','f') DEFAULT NULL,
  `data_nascita` date DEFAULT NULL,
  `telefono` varchar(15) NOT NULL,
  `e_mail` varchar(40) NOT NULL,
  `eta` int(6) DEFAULT NULL,
  `fascia_eta` enum('giovane','anziano') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `studenti`
--

INSERT INTO `studenti` (`studente_id`, `nome`, `cognome`, `genere`, `data_nascita`, `telefono`, `e_mail`, `eta`, `fascia_eta`) VALUES
(1, 'alberto', 'rossi', 'm', '1990-11-13', '3409131484', 'tito.alberto@gmail.com', 27, 'giovane'),
(2, 'andrei', 'verdi', 'm', '1991-10-24', '3320893456', 'tasca.andrei@gmail.com', 26, 'giovane'),
(3, 'danut', 'rossi', 'm', '1995-07-18', '3406122789', 'danut.andres@gmail.com', 22, 'giovane'),
(5, 'ludo', 'rossi', 'f', '1990-09-13', '3820893456', 'magnano.ludovitto@libero.it', 27, 'giovane'),
(6, 'irene', 'verdi', 'f', '1993-10-04', '3824893456', 'verde.mela@libero.it', 24, 'giovane'),
(7, 'fabio', 'rossi', 'm', '1990-03-04', '3824893426', 'gialla.pera@gmail.com', 27, 'giovane'),
(8, 'mauro', 'verdi', 'm', '1989-03-24', '3024893426', 'arancione.caco@gmail.com', 28, 'giovane'),
(9, 'davide', 'rossi', 'm', '1988-02-14', '3024893366', 'rossi.valeria@gmail.com', 29, 'giovane'),
(10, 'fabio', 'verdi', 'm', '1988-12-14', '3024893886', 'fabio.caccia@gmail.com', 29, 'giovane'),
(11, 'maria', 'bruno', 'f', '1997-12-14', '3024893006', 'lorex@libero.it', 20, 'giovane'),
(12, 'francesca', 'bianchi', 'f', '1981-12-01', '3024823006', 'pellexx@libero.it', 36, 'giovane'),
(13, 'andrea', 'bruno', 'm', '1881-12-01', '3024845676', 'piorexx@gmail.com', 136, 'anziano'),
(14, 'maria', 'bianchi', 'f', '1886-12-01', '3224845676', 'prexx@libero.it', 131, 'anziano'),
(15, 'ivana', 'verdi', 'f', '1886-12-11', '3224812346', 'prjdfhasjexx@libero.it', 131, 'anziano'),
(16, 'andres', 'bianchi', 'f', '2006-12-11', '3424812346', 'mercoledi@libero.it', 11, 'giovane'),
(17, 'paolo', 'bruno', 'm', '1881-05-01', '3024845123', 'ploxigenx@gmail.com', 136, 'anziano'),
(18, 'fabio', 'bianchi', 'm', '1881-05-31', '3006122153', 'destra@gmail.com', 136, 'anziano'),
(19, 'ivano', 'bruno', 'm', '1881-05-21', '3206122153', 'sinistra@gmail.com', 136, 'anziano'),
(20, 'artura', 'bianchi', 'f', '1981-05-21', '3206122151', 'caciaa@libero.it', 36, 'giovane');

-- --------------------------------------------------------

--
-- Struttura della tabella `studenti_bk`
--

CREATE TABLE `studenti_bk` (
  `studente_id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `genere` enum('m','f') DEFAULT NULL,
  `data_nascita` date DEFAULT NULL,
  `telefono` varchar(15) NOT NULL,
  `e_mail` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `studenti_bk`
--

INSERT INTO `studenti_bk` (`studente_id`, `nome`, `cognome`, `genere`, `data_nascita`, `telefono`, `e_mail`) VALUES
(1, 'alberto', 'tito', 'm', '1990-11-13', '3409131484', 'tito.alberto@gmail.com'),
(2, 'andrei', 'tasca', 'm', '1991-10-24', '3320893456', 'tasca.andrei@gmail.com'),
(3, 'danut', 'andres', 'm', '1995-07-18', '3406122789', 'danut.andres@gmail.com'),
(5, 'ludo', 'magnano', 'f', '1990-09-13', '3820893456', 'magnano.ludovitto@gmail.com'),
(6, 'irene', 'verde', 'f', '1993-10-04', '3824893456', 'verde.mela@gmail.com'),
(7, 'fabio', 'gialla', 'm', '1990-03-04', '3824893426', 'gialla.pera@gmail.com'),
(8, 'mauro', 'arancione', 'm', '1989-03-24', '3024893426', 'arancione.caco@gmail.com'),
(9, 'davide', 'rossi', 'm', '1988-02-14', '3024893366', 'rossi.valeria@gmail.com'),
(10, 'fabio', 'caccia', 'm', '1988-12-14', '3024893886', 'fabio.caccia@gmail.com'),
(11, 'maria', 'milka', 'f', '1997-12-14', '3024893006', 'lorex@gmail.com'),
(12, 'francesca', 'merla', 'f', '1981-12-01', '3024823006', 'pellexx@gmail.com'),
(13, 'andrea', 'merlo', 'm', '1881-12-01', '3024845676', 'piorexx@gmail.com'),
(14, 'maura', 'merlo', 'f', '1886-12-01', '3224845676', 'prexx@gmail.com'),
(15, 'ivana', 'meringo', 'f', '1886-12-11', '3224812346', 'prjdfhasjexx@gmail.com'),
(16, 'andres', 'meringa', 'f', '2006-12-11', '3424812346', 'mercoledi@gmail.com'),
(17, 'paolo', 'mallo', 'm', '1881-05-01', '3024845123', 'ploxigenx@gmail.com'),
(18, 'luigi', 'marra', 'm', '1881-05-31', '3006122153', 'destra@gmail.com'),
(19, 'ivano', 'marra', 'm', '1881-05-21', '3206122153', 'sinistra@gmail.com'),
(20, 'artura', 'marameo', 'f', '1981-05-21', '3206122151', 'caciaa@gmail.com');

-- --------------------------------------------------------

--
-- Struttura della tabella `studenti_bk2`
--

CREATE TABLE `studenti_bk2` (
  `studente_id` int(11) NOT NULL DEFAULT '0',
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `genere` enum('m','f') DEFAULT NULL,
  `data_nascita` date DEFAULT NULL,
  `telefono` varchar(15) NOT NULL,
  `e_mail` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `studenti_bk2`
--

INSERT INTO `studenti_bk2` (`studente_id`, `nome`, `cognome`, `genere`, `data_nascita`, `telefono`, `e_mail`) VALUES
(1, 'alberto', 'tito', 'm', '1990-11-13', '3409131484', 'tito.alberto@gmail.com'),
(2, 'andrei', 'tasca', 'm', '1991-10-24', '3320893456', 'tasca.andrei@gmail.com'),
(3, 'danut', 'andres', 'm', '1995-07-18', '3406122789', 'danut.andres@gmail.com'),
(5, 'ludo', 'magnano', 'f', '1990-09-13', '3820893456', 'magnano.ludovitto@gmail.com'),
(6, 'irene', 'verde', 'f', '1993-10-04', '3824893456', 'verde.mela@gmail.com'),
(7, 'fabio', 'gialla', 'm', '1990-03-04', '3824893426', 'gialla.pera@gmail.com'),
(8, 'mauro', 'arancione', 'm', '1989-03-24', '3024893426', 'arancione.caco@gmail.com'),
(9, 'davide', 'rossi', 'm', '1988-02-14', '3024893366', 'rossi.valeria@gmail.com'),
(10, 'fabio', 'caccia', 'm', '1988-12-14', '3024893886', 'fabio.caccia@gmail.com'),
(11, 'maria', 'milka', 'f', '1997-12-14', '3024893006', 'lorex@gmail.com'),
(12, 'francesca', 'merla', 'f', '1981-12-01', '3024823006', 'pellexx@gmail.com'),
(13, 'andrea', 'merlo', 'm', '1881-12-01', '3024845676', 'piorexx@gmail.com'),
(14, 'maura', 'merlo', 'f', '1886-12-01', '3224845676', 'prexx@gmail.com'),
(15, 'ivana', 'meringo', 'f', '1886-12-11', '3224812346', 'prjdfhasjexx@gmail.com'),
(16, 'andres', 'meringa', 'f', '2006-12-11', '3424812346', 'mercoledi@gmail.com'),
(17, 'paolo', 'mallo', 'm', '1881-05-01', '3024845123', 'ploxigenx@gmail.com'),
(18, 'luigi', 'marra', 'm', '1881-05-31', '3006122153', 'destra@gmail.com'),
(19, 'ivano', 'marra', 'm', '1881-05-21', '3206122153', 'sinistra@gmail.com'),
(20, 'artura', 'marameo', 'f', '1981-05-21', '3206122151', 'caciaa@gmail.com');

-- --------------------------------------------------------

--
-- Struttura stand-in per le viste `studenti_ok`
--
CREATE TABLE `studenti_ok` (
`nome` varchar(50)
,`cognome` varchar(50)
,`data_nascita` date
);

-- --------------------------------------------------------

--
-- Struttura per la vista `elenco_libri`
--
DROP TABLE IF EXISTS `elenco_libri`;

CREATE ALGORITHM=UNDEFINED DEFINER=`admin_tss`@`localhost` SQL SECURITY DEFINER VIEW `elenco_libri`  AS  select `l`.`titolo` AS `Titolo`,`l`.`prezzo` AS `Prezzo`,`a`.`nome` AS `Autore`,`e`.`nome` AS `Edito da` from (((`libro` `l` join `editore` `e`) join `autore` `a`) join `autore_libro` `al`) where ((`l`.`editore_id` = `e`.`editore_id`) and (`l`.`libro_id` = `al`.`libro_id`) and (`a`.`autore_id` = `al`.`autore_id`)) ;

-- --------------------------------------------------------

--
-- Struttura per la vista `studenti_ok`
--
DROP TABLE IF EXISTS `studenti_ok`;

CREATE ALGORITHM=UNDEFINED DEFINER=`admin_tss`@`localhost` SQL SECURITY DEFINER VIEW `studenti_ok`  AS  select `studenti`.`nome` AS `nome`,`studenti`.`cognome` AS `cognome`,`studenti`.`data_nascita` AS `data_nascita` from `studenti` ;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `africa`
--
ALTER TABLE `africa`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `americhe`
--
ALTER TABLE `americhe`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `amici`
--
ALTER TABLE `amici`
  ADD PRIMARY KEY (`amici_id`);

--
-- Indici per le tabelle `articoli`
--
ALTER TABLE `articoli`
  ADD PRIMARY KEY (`id_articolo`);

--
-- Indici per le tabelle `autore`
--
ALTER TABLE `autore`
  ADD PRIMARY KEY (`autore_id`);

--
-- Indici per le tabelle `clienti`
--
ALTER TABLE `clienti`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `e_mail` (`e_mail`);

--
-- Indici per le tabelle `editore`
--
ALTER TABLE `editore`
  ADD PRIMARY KEY (`editore_id`),
  ADD KEY `indice_nome` (`nome`);

--
-- Indici per le tabelle `editore_bk`
--
ALTER TABLE `editore_bk`
  ADD PRIMARY KEY (`editore_id`),
  ADD KEY `indice_nome` (`nome`);

--
-- Indici per le tabelle `europa`
--
ALTER TABLE `europa`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `impiegati`
--
ALTER TABLE `impiegati`
  ADD PRIMARY KEY (`impiegato_id`);

--
-- Indici per le tabelle `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`libro_id`),
  ADD KEY `fk_libro_editore` (`editore_id`);

--
-- Indici per le tabelle `libro_bk`
--
ALTER TABLE `libro_bk`
  ADD PRIMARY KEY (`libro_id`);

--
-- Indici per le tabelle `ordine_dettagli`
--
ALTER TABLE `ordine_dettagli`
  ADD KEY `fk_ordine_dettagli` (`id_ordine`);

--
-- Indici per le tabelle `ordini`
--
ALTER TABLE `ordini`
  ADD PRIMARY KEY (`id_ordine`);

--
-- Indici per le tabelle `parenti`
--
ALTER TABLE `parenti`
  ADD PRIMARY KEY (`parenti_id`);

--
-- Indici per le tabelle `prodotti`
--
ALTER TABLE `prodotti`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `studenti`
--
ALTER TABLE `studenti`
  ADD PRIMARY KEY (`studente_id`),
  ADD UNIQUE KEY `e_mail` (`e_mail`),
  ADD KEY `cognome_index` (`cognome`);

--
-- Indici per le tabelle `studenti_bk`
--
ALTER TABLE `studenti_bk`
  ADD PRIMARY KEY (`studente_id`),
  ADD UNIQUE KEY `e_mail` (`e_mail`),
  ADD KEY `cognome_index` (`cognome`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `africa`
--
ALTER TABLE `africa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT per la tabella `americhe`
--
ALTER TABLE `americhe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT per la tabella `amici`
--
ALTER TABLE `amici`
  MODIFY `amici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT per la tabella `articoli`
--
ALTER TABLE `articoli`
  MODIFY `id_articolo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT per la tabella `autore`
--
ALTER TABLE `autore`
  MODIFY `autore_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT per la tabella `clienti`
--
ALTER TABLE `clienti`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT per la tabella `editore`
--
ALTER TABLE `editore`
  MODIFY `editore_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT per la tabella `editore_bk`
--
ALTER TABLE `editore_bk`
  MODIFY `editore_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT per la tabella `europa`
--
ALTER TABLE `europa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT per la tabella `impiegati`
--
ALTER TABLE `impiegati`
  MODIFY `impiegato_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT per la tabella `libro`
--
ALTER TABLE `libro`
  MODIFY `libro_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT per la tabella `libro_bk`
--
ALTER TABLE `libro_bk`
  MODIFY `libro_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT per la tabella `ordini`
--
ALTER TABLE `ordini`
  MODIFY `id_ordine` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT per la tabella `parenti`
--
ALTER TABLE `parenti`
  MODIFY `parenti_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT per la tabella `studenti`
--
ALTER TABLE `studenti`
  MODIFY `studente_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT per la tabella `studenti_bk`
--
ALTER TABLE `studenti_bk`
  MODIFY `studente_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `fk_libro_editore` FOREIGN KEY (`editore_id`) REFERENCES `editore` (`editore_id`) ON DELETE CASCADE;

--
-- Limiti per la tabella `ordine_dettagli`
--
ALTER TABLE `ordine_dettagli`
  ADD CONSTRAINT `fk_ordine_dettagli` FOREIGN KEY (`id_ordine`) REFERENCES `ordini` (`id_ordine`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
