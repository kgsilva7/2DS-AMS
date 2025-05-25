-- criando um bd

create database ExercBD01

use ExercBD01

-- criando tabela

create table pet
(
 NumRegistro int, -- criando campo NumRegistro
 Nome varchar(80) Not Null, -- criando campo Nome
 Especie varchar(25) Not Null, -- criando campo Especie
 Raca varchar(30) Not Null, -- criando campo Raca
 Cor varchar(40) Not Null, -- criando campo Cor
 Nascimento datetime Not Null, -- criando campo Nascimento
 Sexo varchar(9) Not Null -- criando campo Sexo
);


-- exercício 1

-- atribuindo valores para a tabela 'pet'

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (1, 'Luna', 'Cachorro', 'Chow-chow', 'Preto', '08/03/2023', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (2, 'Rafaella', 'Gato', 'Vira-lata', 'Cinza', '27/11/2024', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (3, 'Louro', 'Papagaio', 'Papagaio-moleiro', 'Verde', '12/06/1975', 'Macho');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (4, 'Brisa', 'Coelho', 'Coelho-euroupeu', 'Marrom', '22/01/2008', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (5, 'Jade', 'Pássaro', 'Calopsita', 'Cinza', '04/01/2014', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (6, 'Maya', 'Hamster', 'Campbell', 'Marrom', '12/07/2024', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (7, 'Popó', 'Galinha', 'Sedosa', 'Branca', '08/08/2018', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (8, 'Wilbert', 'Tartaruga', 'Marinha', 'Verde', '15/11/2006', 'Macho');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (9, 'Gold', 'Peixe', 'Espada', 'Laranja', '15/11/2006', 'Fêmea');

INSERT INTO pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES (10, 'Lisa', 'Coelho', 'Coelho-americano', 'Branca', '01/01/2000', 'Fêmea');

-- visualizando os dados inseridos na tabela
Select * from pet


------------------


-- exercício 2

-- cadastro do departamento (2 - a)

-- criando um bd

create database ExercBD02

-- entrando no bd

use ExercBD02

-- criando tabela do departamento

 create table Departamento
 (
 CodFunc int, -- criando campo do departamento
 NomeDepto varchar(50) -- criando campo do nome do departamento
);


-- atribuindo valores para a tabela 'pet'


INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (001, 'Administração');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (002, 'RH');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (003, 'T.I');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (004, 'Logística');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (005, 'Jurídico');


-- visualizando os dados inseridos na tabela
Select * from Departamento


-- criando tabela do funcionário (2 - b)

create table Funcionario
(
 CodFunc int, -- criando campo CodFunc
 NomeFunc varchar(50), -- criando campo NomeFunc
 CodDepto int, -- criando campo CodDepto
 Ramal int NULL , -- criando campo Ramal
 Salario float, -- criando campo Salario
 DataAdmissao datetime, -- criando campo DataAdmissao
 DataCadastro datetime, -- criando campo DataCadastro
 Sexo varchar(10) -- criando campo Sexo
 );


-- atribuindo valores para a tabela 'Funcionario'

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (1, 'Felipe Vivêncio', '101', 1001, 3500.00, '01/03/2025', '07/02/2024', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (2, 'Bruno Vivêncio', '102', 1002, 4200.00, '22/11/2024', '11/01/2022', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (3, 'Giovanna Vivêncio', '103', 1003, 4000.00, '15/08/2023', '10/01/2022', 'Feminino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (4, 'Caroline', '104', 1004, 3800.00, '10/05/2022', '28/02/2025', 'Feminino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (5, 'João Pedro', '101', 1005, 4500.00, '01/12/2023', '01/03/2023', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (6, 'Antonio', '102', 1006, 3900.00, '30/06/2024', '02/09/2022', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (7, 'Rodrigo', '103', 1007, 3700.00, '20/03/2023', '07/02/2023', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (8, 'Guilherme', '104', 1008, 3600.00, '12/09/2022', '12/04/2024', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (9, 'João Xavier', '102', 1010, 3900.00, '01/01/2023', '08/12/2024', 'Masculino');

INSERT INTO Funcionario(CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES (10, 'Edna', '103', 1011, 6200.00, '05/03/2022', '17/07/2008', 'Feminino');

-- visualizando os dados inseridos na tabela
Select * from Funcionario


------------------


 -- exercício 3 (extra, baseado na atividade anterior)


 -- criando um banco de dados

 create database ExercBD03

 -- entrando no banco de dados

 use ExercBD03

 -- criando tabela de papelaria

 create table papelaria
 (
 ID_Produto int PRIMARY KEY Not Null , -- campo para o id do produto
 Nome varchar(50) Not Null, -- campo para o nome do produto
 Estoque int Not Null , -- campo para o estoque do produto
 Preco float Not Null, -- campo para o preço do produto
 );

 -- inserindo registros na tabela papelaria

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (1, 'Caderno Universitário', 50, 15.90);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (2, 'Caneta Esferográfica Azul', 200, 1.90);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (3, 'Lápis de Cor', 30, 27.99);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (4, 'Apontador', 100, 3.99);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (5, 'Borracha', 150, 1.99);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (6, 'Papel Sulfite A4', 70, 22.90);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (7, 'Marca-texto', 80, 4.99);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (8, 'Cola', 120, 4.99);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (9, 'Régua', 90, 4.00);

INSERT INTO papelaria (ID_Produto, Nome, Estoque, Preco)
VALUES (10, 'Calculadora', 15, 75.00);

-- visualizando os dados inseridos na tabela
Select * from papelaria;


------------------


-- exercício 4 (extra, baseado na atividade anterior)

  -- criando um banco de dados

 create database ExercBD04

 -- entrando no banco de dados

 use ExercBD04

 -- criando tabela de funcionários

 create table funcionario
 (
 RM int PRIMARY KEY Not Null, -- campo para o rm do funcionário
 Nome varchar(50) Not Null, -- campo para o nome do funcionário
 CPF varchar(11) Not Null, -- campo para o cpf do funcionário
 Cargo varchar(50) Not Null, -- campo para o cargo do funcionário
 Salario float Not Null, -- campo para o salário do funcionário
 );

 -- inserindo registros na tabela funcionario

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (1, 'Endrigo', '12345678901', 'Analista de Sistemas', 4500.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (2, 'Nikolas', '23456789012', 'Gerente de Projetos', 7500.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (3, 'Rogério', '34567890123', 'Técnico de Suporte', 3500.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (4, 'Margarete', '45678901234', 'Designer Gráfico', 4000.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (5, 'Jeferson', '56789012345', 'Desenvolvedor Web', 5000.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (6, 'Sofia', '67890123456', 'Analista Financeiro', 5500.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (7, 'Gabriel', '78901234567', 'Engenheiro de Dados', 6000.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (8, 'Vitor', '89012345678', 'Coordenadora de Marketing', 7000.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (9, 'Lucas', '90123456789', 'Consultor de Vendas', 4200.00);

INSERT INTO funcionario (RM, Nome, CPF, Cargo, Salario)
VALUES (10, 'Camila', '01234567890', 'Secretária Executiva', 3500.00);

Select * from funcionario;
