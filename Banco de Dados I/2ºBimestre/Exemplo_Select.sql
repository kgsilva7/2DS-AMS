-- criar bd Exemplo_Select
CREATE DATABASE Exemplo_Select;

-- abrir bd Exemplo_Select
use Exemplo_Select;

-- criação tabela Categoria
CREATE TABLE Categoria
(
Cod_Categoria int,
Nome_Categoria varchar (15) NOT NULL,
Descricao varchar(25) NULL,
PRIMARY KEY (Cod_Categoria)
 );

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (1,'Beverages','Soft drinks');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (2,'Condiments','Sweet and savory sauces');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (3,'Confections','candies');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (4,'Dairy Products','Queijo');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (5,'Grains/Cereals','cereal');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (6,'Meat/Poultry','Prepared meats');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (7,'Produce','Dried fruit and bean curd');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (8,'Seafood','Seaweed and fish');

select * from categoria;

CREATE TABLE Envio
 (
	Cod_Envio int,
 	DataEnvio datetime,
  	Frete int,
	NomeNavio varchar(40),
 	Cidade varchar(15),
	Regiao varchar(15),
 	Pais varchar(15)
 );


INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10248,'7/4/1996',32.38,'Vins et alcools Chevalier','Abbaye','Reims','France');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10249,'7/5/1996',11.61,'Toms Spezialitaten','Luisenstr',nULL,'Germany');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10250,'7/8/1996',65.83,'Hanari Carnes','Rio de Janeiro','Sudeste','Brazil');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10251,'7/8/1996',41.34,'Victuailles en stock','Lyon',NULL,'France');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10252,'7/9/1996',51.30,'Supremes delices','Boulevard Tirou', 'Charleroi','Belgium');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10253,'7/10/1996',58.17,'Hanari Carnes','Rio de Janeiro','Sudeste','Brazil');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
vALUES (10254,'7/11/1996',22.98,'Chop-suey Chinese','Bern',NULL,'Switzerland');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10255,'7/12/1996',148.33,'Richter Supermarkt','Geneve',	NULL,'Switzerland');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10256,'15/7/1996',13.97,'Wellington Importadora','Resende','Sul','Brazil');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10257,'8/8/1996',81.91,'HILARION-Abastos','San Cristobal','Tachira','Venezuela');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10258,'17/7/1996',140.51,'Ernst Handel','Kirchgasse','Graz','Austria');


select * from Envio;


CREATE TABLE Territorio
(
       Cod_Territorio varchar(20) NOT NULL,
       Territoriodescricao varchar(50) NOT NULL,
       Cod_Regiao int
);



Insert Into Territorio Values ('01581','Westboro',1);
Insert Into Territorio Values ('01730','Bedford',1);
Insert Into Territorio Values ('01833','Georgetow',1);
Insert Into Territorio Values ('02116','Boston',1);
Insert Into Territorio Values ('02139','Cambridge',1);
Insert Into Territorio Values ('02184','Braintree',1);
Insert Into Territorio Values ('02903','Providence',1);
Insert Into Territorio Values ('03049','Hollis',3);
Insert Into Territorio Values ('03801','Portsmouth',3);
Insert Into Territorio Values ('06897','Wilton',1);
Insert Into Territorio Values ('07960','Morristown',1);
Insert Into Territorio Values ('08837','Edison',1);
Insert Into Territorio Values ('10019','New York',1);
Insert Into Territorio Values ('10038','New York',1);
Insert Into Territorio Values ('11747','Mellvile',1);
Insert Into Territorio Values ('14450','Fairport',1);
Insert Into Territorio Values ('19428','Philadelphia',3);
Insert Into Territorio Values ('19713','Neward',1);
Insert Into Territorio Values ('20852','Rockville',1);
Insert Into Territorio Values ('27403','Greensboro',1);
Insert Into Territorio Values ('27511','Cary',1);
Insert Into Territorio Values ('29202','Columbia',4);
Insert Into Territorio Values ('30346','Atlanta',4);
Insert Into Territorio Values ('31406','Savannah',4);
Insert Into Territorio Values ('32859','Orlando',4);
Insert Into Territorio Values ('33607','Tampa',4);
Insert Into Territorio Values ('40222','Louisville',1);
Insert Into Territorio Values ('44122','Beachwood',3);
Insert Into Territorio Values ('45839','Findlay',3);
Insert Into Territorio Values ('48075','Southfield',3);
Insert Into Territorio Values ('48084','Troy',3);
Insert Into Territorio Values ('48304','Bloomfield Hills',3);
Insert Into Territorio Values ('53404','Racine',3);
Insert Into Territorio Values ('55113','Roseville',3);
Insert Into Territorio Values ('55439','Minneapolis',3);
Insert Into Territorio Values ('60179','Hoffman Estates',2);
Insert Into Territorio Values ('60601','Chicago',2);
Insert Into Territorio Values ('72716','Bentonville',4);
Insert Into Territorio Values ('75234','Dallas',4);
Insert Into Territorio Values ('78759','Austin',4);
Insert Into Territorio Values ('80202','Denver',2);
Insert Into Territorio Values ('80909','Colorado Springs',2);
Insert Into Territorio Values ('85014','Phoenix',2);
Insert Into Territorio Values ('85251','Scottsdale',2);
Insert Into Territorio Values ('90405','Santa Monica',2);
Insert Into Territorio Values ('94025','Menlo Park',2);
Insert Into Territorio Values ('94105','San Francisco',2);
Insert Into Territorio Values ('95008','Campbell',2);
Insert Into Territorio Values ('95054','Santa Clara',2);
Insert Into Territorio Values ('95060','Santa Cruz',2);
Insert Into Territorio Values ('98004','Bellevue',2);
Insert Into Territorio Values ('98052','Redmond',2);
Insert Into Territorio Values ('98104','Seattle',2);

select * from Territorio;





-- exercício 1, deletar conteúdo "queijo"

delete from Categoria where Descricao like 'Queijo'
select * from Categoria


-- exercício 2, deletar conteúdo que comece com "s"

delete from Categoria where Descricao like 's%'
select * from Categoria


-- exercício 3, deletar conteúdo que tenha a letra "a"

delete from Categoria where Nome_Categoria like '%a%'
select * from Categoria


-- exercício 4, deletar conteúdo "null"

delete from Envio where Regiao is null
select * from Envio


-- exercício 5, deletar conteúdo "Chop-suey Chinese"

delete from Envio where NomeNavio like 'Chop-suey Chinese'
select * from Envio


-- exercício 6, deletar conteúdo que seja "maior que 100"

delete from Envio where Frete > 100
select * from Envio


-- exercício 7, deletar conteúdo que contenha "3"

delete from Territorio where Cod_Regiao = 3
select * from Territorio


-- exercício 8, deletar conteúdo "New York"

delete from Territorio where Territoriodescricao like 'New York'
select * from Territorio


-- exercício 9, deletar conteúdo "maior que 90000"

delete from Territorio where Cod_Territorio > 90000
select * from Territorio


-- exercício 10, deletar todo o conteúdo da tabela "Categoria"

delete from Categoria
select * from Categoria


-- exercício 11, deletar todo o conteúdo da tabela "Envio"

delete from Envio
select * from Envio


-- exercício 12, deletar todo o conteúdo da tabela "Territorio"

delete from Territorio
select * from Territorio





-- exercício 13 (extra)


-- criando uma tabela de cliente

create table Cliente (
    Id int PRIMARY KEY,
    Nome varchar(100),
    Email varchar(100),
    Cidade varchar(50),
    Profissao varchar(50),
    Idade int
);

-- inserindo registros nessa tabela

INSERT INTO Cliente VALUES (1, 'Andrei', 'andrei@email.com', 'São Paulo', 'Engenheiro', 28);
INSERT INTO Cliente VALUES (2, 'Arthur', 'arthur@email.com', 'Santos', 'Professor', 35);
INSERT INTO Cliente VALUES (3, 'Bruno', 'bruno@email.com', 'Fortaleza', 'Médico', 40);
INSERT INTO Cliente VALUES (4, 'Rodrigo', 'rodrigo@email.com', 'Campinas', 'Designer', 25);
INSERT INTO Cliente VALUES (5, 'Giovanna', 'giovanna@email.com', 'São Paulo', 'Arquiteta', 32);
INSERT INTO Cliente VALUES (6, 'Miguel', 'miguel@email.com', 'Curitiba', 'Veterinário', 45);
INSERT INTO Cliente VALUES (7, 'Vitor', 'vitor@email.com', 'Curitiba', 'Engenheiro', 50);
INSERT INTO Cliente VALUES (8, 'João Victor', 'joaovictor@email.com', 'Salvador', 'Desempregado', 22);
INSERT INTO Cliente VALUES (9, 'João Pedro', 'joaopedro@email.com', 'Santos', 'Estudante', 19);
INSERT INTO Cliente VALUES (10, 'Guilherme', 'guilherme@email.com', 'Belo Horizonte', 'Programador', 31);


-- exercício 13, deletar clientes da cidade de curitiba

delete from Cliente where Cidade = 'Curitiba';
select * from Cliente


-- exercício 14, deletar clientes c/ profissão começando com a letra “e”

delete from Cliente where Profissao like 'E%';
select * from Cliente


-- exercício 15, deletar clientes c/ nome contendo letra “a”

delete from Cliente where Nome like '%a%';
select * from Cliente


-- exercício 16, deletar clientes com idade maior que 22

delete from Cliente where Idade > 22;
select * from Cliente


-- exercício 17, deletar todos os registros da tabela

delete from Cliente;
select * from Cliente
