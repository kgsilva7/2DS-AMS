-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18-Jul-2023 às 15:13
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clientes`
--
create DATABASE `clientes`;
use `clientes`;
-- --------------------------------------------------------

--
-- Estrutura da tabela `tbclientes`
--

CREATE TABLE `tbclientes` (
  `cod` int(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `dt_nasc` varchar(10) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbclientes`
--

INSERT INTO `tbclientes` (`cod`, `nome`, `dt_nasc`, `telefone`, `email`) VALUES
(1, 'Marco Lopes', '12/01/1939', '(11)1111-1111', 'marco@lopes.com.br'),
(2, 'Maria Amélia Dantas', '27/03/1969', '(11)2222-2222', 'maria@amelia.com.br'),
(3, 'Henrique Lopes Dantas', '27/05/2000', '(11)3333-3333', 'henrique@ld.com.br'),
(4, 'Samantha Lopes Dantas', '01/10/2001', '(11)4444-4444', 'sa@lp.com.br'),
(5, 'Robson Lopes Dantas', '02/09/2004', '(11)5555-5555', 'robson@ld.com.br'),
(6, 'xxxx', '02/10/1969', '(11)5252-5252', 'xxx@xxx'),
(7, 'yyyyyy', '01/02/2021', '(11)2222-2222', 'yyy@yyy.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblusuario`
--

CREATE TABLE `tblusuario` (
  `usuario` varchar(25) NOT NULL,
  `senha` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblusuario`
--

INSERT INTO `tblusuario` (`usuario`, `senha`) VALUES
('A', 123),
('B', 456);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbclientes`
--
ALTER TABLE `tbclientes`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbclientes`
--
ALTER TABLE `tbclientes`
  MODIFY `cod` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
