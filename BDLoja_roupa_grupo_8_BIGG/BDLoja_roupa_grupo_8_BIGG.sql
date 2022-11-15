DROP DATABASE IF EXISTS lojaderoupa;

CREATE DATABASE lojaderoupa;

USE lojaderoupa;

CREATE TABLE `tb_cargo` (
  `id_cargo` int(11) NOT NULL,
  `cargo` varchar(50) NOT NULL
);
INSERT INTO `tb_cargo` (`id_cargo`, `cargo`) VALUES
(1, 'vendedor'),
(2, 'gerente'),
(3, 'Administrador');


CREATE TABLE tb_categoria (
  id_categoria int(11) NOT NULL,
  categoria varchar(50) NOT NULL,
  usr_id varchar(4) DEFAULT NULL,
  data_exclusao timestamp NULL DEFAULT NULL,
  excluido tinyint(1) NOT NULL DEFAULT 0
) ;


INSERT INTO tb_categoria (`id_categoria`, `categoria`, `usr_id`, `data_exclusao`, `excluido`) VALUES
(1, 'Calça jeans', NULL, NULL, 0),
(2, 'Camisa regata', NULL, NULL, 0),
(3, 'kit infantil', '6', '2022-11-11 03:00:00', 1),
(4, 'Saia jeans', NULL, NULL, 0);
select * from tb_categoria;


CREATE TABLE tb_cliente (
  id_cliente int(11) NOT NULL,
  id_usr int(11) NOT NULL,
  CPF varchar(15) NOT NULL,
  Nome varchar(80) NOT NULL,
  telefone varchar(15) NOT NULL,
  excluido tinyint(1) NOT NULL DEFAULT 0,
  data_exclusao date DEFAULT NULL,
  data_nascimento varchar(10) NOT NULL,
  email varchar(70) NOT NULL,
  sexo varchar(10) NOT NULL,
  Estado_civil varchar(10) NOT NULL,
  Endereco varchar(100) NOT NULL,
  usr_exclusao varchar(50) DEFAULT NULL
);
select * from tb_cliente; /* faz busca no banco de dado dentro da tablea */

INSERT INTO tb_cliente (`id_cliente`, `id_usr`, `CPF`, `Nome`, `telefone`, `excluido`, `data_exclusao`, `data_nascimento`, `email`, `sexo`, `Estado_civil`, `Endereco`, `usr_exclusao`) VALUES
(1, 1, '52348479850', 'Genivaldo Alves ', '11960920552', 0, NULL, '08/03/1977', 'gda_anjos@hotmail.com.br', 'Masculino', 'Casado', 'Rua tribos dos Acras 18', ''); /*adiciona dados na tabelas */


delete from tb_cliente where id_cliente = 8;/*apaga somente a linha escolhida na tabela */
truncate table tb_cliente;/*apaga todo o dados inseridos */




CREATE TABLE tb_item_venda (
  id_item int(11) NOT NULL,
  id_venda int(11) NOT NULL,
  id_produto int(11) NOT NULL,
  qtde int(11) NOT NULL,
  valor decimal(7,2) NOT NULL
);
select * from tb_item_venda;
INSERT INTO tb_item_venda (`id_item`, `id_venda`, `id_produto`, `qtde`, `valor`) VALUES
(1, 1, 2, 1, '12.00'),
(2, 2, 3, 2, '13.60'),
(3, 1, 1, 1, '12.50');


CREATE TABLE tb_produto (
  id_produto int(11) NOT NULL,
  id_categoria int(11) NOT NULL,
  nome varchar(50) NOT NULL,
  qtde int(11) NOT NULL,
  descricao varchar(70) NOT NULL,
  valor decimal(7,2) NOT NULL,
  excluido tinyint(1) NOT NULL DEFAULT 0,
  usr_id varchar(4) NOT NULL,
  data_exclusao timestamp NULL DEFAULT NULL,
  usr_exclusao varchar(4) DEFAULT NULL
);
select * from tb_produto;
INSERT INTO tb_produto (`id_produto`, `id_categoria`, `nome`, `qtde`, `descricao`, `valor`, `excluido`, `usr_id`, `data_exclusao`, `usr_exclusao`) VALUES
(1, 1, 'CALÇA JEANS ', 1, 'CALÇA JEANS  INFANTIL', '35.50', 0, '1', '2022/11/18 13:05:55', NULL);



CREATE TABLE tb_usuario (
  id_usr int(11) NOT NULL,
  id_cargo int(11) NOT NULL,
  nome varchar(50) NOT NULL,
  cpf varchar(11) NOT NULL,
  data_nascimento varchar(10) NOT NULL,
  excluido tinyint(1) NOT NULL DEFAULT 0,
  data_exclusao timestamp NULL DEFAULT NULL,
  usr_id varchar(4) DEFAULT NULL,
  senha varchar(70) NOT NULL,
  email varchar(70) NOT NULL
);
select * FROM tb_usuario;
INSERT INTO tb_usuario (`id_usr`, `id_cargo`, `nome`, `cpf`, `data_nascimento`, `excluido`, `data_exclusao`, `usr_id`, `senha`, `email`) VALUES
(1, 1, 'DANILO MAXISMINIANO', '77777777789', '24/02/1982', '0', '18-11-2022 15:28:22', '','123456', 'MAX@GMAIL.COM');


CREATE TABLE tb_venda (
  id_venda int(11) NOT NULL,
  id_usr int(11) NOT NULL,
  valor_total decimal(7,2) DEFAULT NULL,
  data_venda timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  usr_id int(11) DEFAULT NULL,
  id_cliente int(11) DEFAULT NULL,
  excluido tinyint(1) NOT NULL DEFAULT 0  /*O tipo de dados TINYINT é um Valor inteiro de 0 a 255.TINYINT é o menor tipo de dados inteiro e usa apenas 1 byte de armazenamento.
															Um exemplo de uso de é a idade de uma pessoa, uma vez que nenhuma pessoa atinge a idade de 255 anos.TINYINT*/
);
SELECT * FROM tb_venda;
INSERT INTO tb_venda (`id_venda`, `id_usr`, `valor_total`, `data_venda`, `usr_id`, `id_cliente`, `excluido`) VALUES
(1, 3, '24.50', '2022-11-15 21:42:36', 0, 1, 0),
(2, 4, '27.20', '2022-01-19 21:42:42', NULL, 1, 0);


ALTER TABLE `tb_cargo`
  ADD PRIMARY KEY (`id_cargo`);



ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`id_categoria`);


ALTER TABLE `tb_cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `tb_usuario_tb_cliente_fk` (`id_usr`);


ALTER TABLE `tb_item_venda`
  ADD PRIMARY KEY (`id_item`),
  ADD KEY `tb_produto_tb_item_venda_fk` (`id_produto`),
  ADD KEY `tb_venda_tb_item_venda_fk` (`id_venda`);


ALTER TABLE `tb_produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `tb_categoria_tb_produto_fk` (`id_categoria`);


ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`id_usr`),
  ADD KEY `tb_cargo_tb_usuario_fk` (`id_cargo`);


ALTER TABLE `tb_venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `tb_cliente_tb_venda_fk` (`id_cliente`);


ALTER TABLE `tb_cargo`
  MODIFY `id_cargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `tb_categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `tb_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;


ALTER TABLE `tb_item_venda`
  MODIFY `id_item` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;


ALTER TABLE `tb_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;


ALTER TABLE `tb_usuario`
  MODIFY `id_usr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;


ALTER TABLE `tb_venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;




ALTER TABLE `tb_cliente`
  ADD CONSTRAINT `tb_usuario_tb_cliente_fk` FOREIGN KEY (`id_usr`) REFERENCES `tb_usuario` (`id_usr`);


ALTER TABLE `tb_item_venda`
  ADD CONSTRAINT `tb_produto_tb_item_venda_fk` FOREIGN KEY (`id_produto`) REFERENCES `tb_produto` (`id_produto`),
  ADD CONSTRAINT `tb_venda_tb_item_venda_fk` FOREIGN KEY (`id_venda`) REFERENCES `tb_venda` (`id_venda`);


ALTER TABLE `tb_produto`
  ADD CONSTRAINT `tb_categoria_tb_produto_fk` FOREIGN KEY (`id_categoria`) REFERENCES `tb_categoria` (`id_categoria`);


ALTER TABLE `tb_usuario`
  ADD CONSTRAINT `tb_cargo_tb_usuario_fk` FOREIGN KEY (`id_cargo`) REFERENCES `tb_cargo` (`id_cargo`);


ALTER TABLE `tb_venda`
  ADD CONSTRAINT `tb_cliente_tb_venda_fk` FOREIGN KEY (`id_cliente`) REFERENCES `tb_cliente` (`id_cliente`);
COMMIT;
