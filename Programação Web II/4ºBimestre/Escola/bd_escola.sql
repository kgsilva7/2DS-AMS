-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/10/2025 às 19:21
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_escola`
--
CREATE DATABASE IF NOT EXISTS `bd_escola` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_escola`;
-- --------------------------------------------------------

--
-- Estrutura para tabela `alunos`
--

CREATE TABLE `alunos` (
  `matricula` varchar(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `codcurso` char(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `alunos`
--

INSERT INTO `alunos` (`matricula`, `nome`, `endereco`, `cidade`, `codcurso`) VALUES
('00001', 'Gustavo Alexandre da Silva', 'Rua Reinado do Cavalo Marinho', 'São Paulo', '04'),
('00002', 'Felipe Vivêncio', 'Travessa Na Paz do Seu Sorriso', 'São Paulo', '04'),
('00003', 'Antônio Bernardino', 'Rua Verão do Cometa', 'São Paulo', '04'),
('00004', 'Arthur Gutemberg', 'Rua Borboletas Psicodélicas', 'São Paulo', '04'),
('00005', 'Andrei Oliveira', 'Travessa Canção Excêntrica', 'São Paulo', '04'),
('00006', 'Jõao Pedro', 'Travessa Sonho de um Carnaval', 'São Paulo', '05'),
('00007', 'Jõao Xavier', 'Rua Viagem ao Céu', 'São Paulo', '05'),
('00008', 'Jõao Paiva', 'Rua Sol da Meia-Noite', 'São Paulo', '05'),
('00009', 'Felipe Tesser', 'Travessa Sol do Meio-Dia', 'São Paulo', '05'),
('00010', 'Higor Mota', 'Travessa Final Feliz', 'São Paulo', '05'),
('00011', 'Igor Sales', 'Rua A', 'São Paulo', '06'),
('00012', 'Beatriz Galdino', 'Rua B', 'São Paulo', '06'),
('00013', 'Beatriz Batista', 'Rua C', 'São Paulo', '06'),
('00014', 'Miguel Heleno', 'Rua D', 'São Paulo', '06'),
('00015', 'Guilherme Deustch', 'Rua F', 'São Paulo', '06'),
('00016', 'Nicollas Lopes', 'Rua G', 'São Paulo', '07'),
('00017', 'Eduardo Cavalcante', 'Rua H', 'São Paulo', '07'),
('00018', 'Nicollas Heiderich', 'Rua I', 'São Paulo', '07'),
('00019', 'Ana Lívia', 'Rua J', 'São Paulo', '07'),
('00020', 'Sophia Moura', 'Rua K', 'São Paulo', '07');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cursos`
--

CREATE TABLE `cursos` (
  `codcurso` char(2) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `coddisc1` char(2) NOT NULL,
  `coddisc2` char(2) NOT NULL,
  `coddisc3` char(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cursos`
--

INSERT INTO `cursos` (`codcurso`, `nome`, `coddisc1`, `coddisc2`, `coddisc3`) VALUES
('04', 'Logística', '12', '13', '14'),
('05', 'Recursos Humanos', '22', '23', '24'),
('06', 'Administração', '32', '33', '34'),
('07', 'Técnico de Edificações', '12', '23', '34');

-- --------------------------------------------------------

--
-- Estrutura para tabela `disciplinas`
--

CREATE TABLE `disciplinas` (
  `CodDisciplina` char(2) NOT NULL,
  `NomeDisciplina` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `disciplinas`
--

INSERT INTO `disciplinas` (`CodDisciplina`, `NomeDisciplina`) VALUES
('12', 'Sistemas de Gestão'),
('13', 'Gestão de Projetos'),
('14', 'Gestão de Pessoas'),
('22', 'Administração de Cargos '),
('23', 'Tecnologia das Construções'),
('24', 'Topografia'),
('32', 'Segurança do Trabalho'),
('33', 'Planejamento de Edificações'),
('34', 'Contabilidade'),
('35', 'Comunicação Empresarial');

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `Login` varchar(5) NOT NULL,
  `Senha` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`Login`, `Senha`) VALUES
('a', 123),
('b', 456);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices de tabela `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`codcurso`);

--
-- Índices de tabela `disciplinas`
--
ALTER TABLE `disciplinas`
  ADD PRIMARY KEY (`CodDisciplina`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
