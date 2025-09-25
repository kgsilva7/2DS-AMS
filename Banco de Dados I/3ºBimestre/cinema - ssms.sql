
-- Atividade - Multidisciplinar: --
-- Criando o BD CInema
Create database cinema

use cinema

-- Criando a Tabela cliente
CREATE TABLE cliente
(
ID_cliente int Primary Key ,
Nome varchar(50) NOT NULL,
CPF varchar(14)  NOT NULL,
Email varchar(50)  NOT NULL,
Telefone varchar(15)  NOT NULL
);

-- Criando a Tabela filme
CREATE TABLE filme
(
Cod_Filme int Primary Key ,
Nome varchar(25) NOT NULL,
Duracao time  NOT NULL,
Classificacao varchar(5)  NOT NULL,
Genero varchar(40)  NOT NULL,
Sinopse varchar(1024)  NOT NULL
);

-- Criando a Tabela sala
CREATE TABLE sala
(
Num_Sala int Primary Key ,
Num_Assent int NOT NULL,
Tipo_Sala varchar(5)  NOT NULL
);

-- Criando a Tabela sessao
CREATE TABLE sessao
(
Cod_Ses int Primary Key ,
Cod_Filme int ,
Num_Sala int ,
horario datetime ,
foreign key (Num_Sala) references sala ,
foreign key (Cod_Filme) references filme 
);

-- Criando a Tabela ingresso
CREATE TABLE ingresso
(
ID_Ing int Primary Key ,
ID_cliente int ,
Cod_Ses int ,
Preco_ing float NOT NULL,
foreign key (ID_cliente) references cliente ,
foreign key (Cod_Ses) references sessao 
);
