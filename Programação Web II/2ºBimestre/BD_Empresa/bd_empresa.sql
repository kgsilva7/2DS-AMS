-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15-Maio-2025 às 21:27
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_empresa`
--
CREATE DATABASE  `bd_empresa`;
USE  `bd_empresa`;
-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `Cod_Fornecedor` int(11) NOT NULL,
  `Razao_Social` varchar(70) NOT NULL,
  `Nome_Fantasia` varchar(70) NOT NULL,
  `CNPJ` varchar(20) NOT NULL,
  `Endereço` varchar(50) NOT NULL,
  `Num` varchar(7) NOT NULL,
  `Bairro` varchar(25) NOT NULL,
  `Cidade` varchar(25) NOT NULL,
  `Fone` varchar(18) NOT NULL,
  `Nome_Contato` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Site` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`Cod_Fornecedor`, `Razao_Social`, `Nome_Fantasia`, `CNPJ`, `Endereço`, `Num`, `Bairro`, `Cidade`, `Fone`, `Nome_Contato`, `Email`, `Site`) VALUES
(1, 'Supricorp Suprimentos Ltda', 'Gimba', ' 54.651.716/0011-50', 'Avenida Prefeito João Vilallobo Quero, Jardim Belv', '1160', 'Baruerí', 'São Paulo', '(11) 2763.5000', 'Gimba', ' suporte-ti@gimba.com.br', 'www.gimba.com.br'),
(2, 'Xingó Embalagens', 'Xingó', ' 62.438.429/0001-12', 'Rodovia Pref Aziz Lian SP-107, Borda da Mata Jagua', '107', 'Jaguariúna', 'São Paulo', ' (19) 98772-5126', 'Xingó', 'vendas@xingoembalagens.com.br', 'www.xingoembalagens.com.br'),
(3, 'Technova Soluções Digitais Ltda\r\n\r\n', ' Technova', '03.456.789/0001-52', 'Rua das Acácias', '123', 'Ponte Rasa', 'São Paulo', '(11) 91234-5678', 'Mariana Andrade', 'contato@technova.com.br', ' www.technova.com.br'),
(4, 'Alvorada Comércio de Alimentos EIRELI', 'Super Alvorada', '76.123.456/0001-97', 'Av. Atlântica', '987', 'Liberdade', 'São Paulo', '(11) 99876-4321', 'Carlos Menezes', ' vendas@superalvorada.com.br', ' www.superalvorada.com.br'),
(5, 'EcoVida Produtos Naturais Ltda\r\n\r\n', 'EcoVida Natural', '29.654.123/0001-61', 'Rua Sete de Setembro', '456', 'Vila Araguaia', 'São Paulo', '(11) 98765-1234', 'Fernanda Lima', ' contato@ecovidanatural.com.br', ' www.ecovidanatural.com.br'),
(6, ' Infinity Tecnologia e Inovação S.A.', ' Infinity Tech', '18.345.678/0001-45', 'Av. João Pessoa', '2323', 'Jardim Romanao', 'São Paulo', '(51) 99321-7890', 'Rafael Oliveira', ' suporte@infinitytech.com.br', ' www.infinitytech.com.br'),
(7, ' Estrela do Norte Distribuidora Ltda', 'Estrela Distribuidora\r\n\r\n', '52.789.123/0001-34', 'Rua das Palmeiras', '55', 'Vila Penteado', 'São Paulo', '(11) 99123-4567', 'Luciana Torres', 'atendimento@estreladistribuidora.com.br', 'www.estreladistribuidora.com.br'),
(8, 'Construtora Bela Vista Ltda\r\n\r\n', ' Bela Vista Engenharia', '91.654.327/0001-00', 'Rua Santa Luzia', '101', 'Vila Guilhermina', 'São Paulo', '(11) 99987-6543', 'Henrique Farias', 'contato@belavistaengenharia.com.br', ' www.belavistaengenharia.com.br'),
(9, ' Net Farma Comércio de Produtos Farmacêuticos Ltda', 'Net Farma', '84.789.456/0001-73', 'Av. Presidente Vargas', '2500', 'Jardim Helena', 'São Paulo', '(85) 98877-1234', ' Priscila Duarte', 'sac@netfarma.com.br', ' www.netfarma.com.br'),
(10, ' Café Brasil Indústria e Comércio de Alimentos Ltda', 'Café Brasil', '45.987.321/0001-08', 'Rua XV de Novembro', '775', 'Vila Cisper', 'São Paulo', '(11) 98712-3456', 'João Guilherme Souza', ' contato@cafebrasil.com.br', ' www.cafebrasil.com.br');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `Cod_Produto` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Unidade` varchar(2) NOT NULL,
  `Qtde_Estoque` double NOT NULL,
  `Caracteristicas` varchar(50) NOT NULL,
  `Cod_Fornecedor` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`Cod_Produto`, `Descricao`, `Unidade`, `Qtde_Estoque`, `Caracteristicas`, `Cod_Fornecedor`) VALUES
(1, 'Apontador', 'cx', 85, 'colorido', 1),
(37, 'Mochila', 'cx', 50, 'apenas um bolso', 8),
(36, 'Mochila', 'cx', 110, 'com multibolsos', 8),
(30, 'Estojo', 'un', 5, 'pequeno', 5),
(31, 'Estojo', 'un', 7, 'grande', 5),
(32, 'Calculadora', 'un', 35, 'normal', 6),
(33, 'Calculadora', 'un', 65, 'Científica', 6),
(34, 'Garrafa', 'un', 123, 'transparente', 7),
(35, 'Garrafa', 'un', 300, 'de metal', 7),
(2, 'Papel crepom', 'pc', 10, 'colorido', 2),
(3, 'Papel crepom', 'pc', 15, 'descolorido', 2),
(4, 'Fichario', 'pc', 20, 'com figurinhas ', 3),
(5, 'Fichario', 'pc', 40, 'sem figurinhas', 3),
(6, 'Transferidor', 'un', 45, 'maleável', 4),
(7, 'Transferidor', 'un', 60, 'não maleável', 4);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`Cod_Fornecedor`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`Cod_Produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `Cod_Fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `Cod_Produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
