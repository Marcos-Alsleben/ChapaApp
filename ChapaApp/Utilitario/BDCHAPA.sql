CREATE DATABASE BDCHAPA;

/*CREATE USER 'carton'@'%' IDENTIFIED BY '2574';

GRANT ALL ON *.* TO 'carton'@'%' WITH GRANT OPTION;


flush privileges; */


USE BDCHAPA;

/***** TABELA *****/
CREATE TABLE vendascliente (
  cod_vend int auto_increment primary key,
  motivo varchar (50)
);
Insert into vendascliente (motivo) values
('Aprovação'), ('Troca de cor'), ('Alter. montagem / quantidade'),
('Alteração de arte');

/***** TABELA *****/
CREATE TABLE programacao (
  cod_prog int auto_increment primary key,
  motivo varchar (50)
);
Insert into programacao (motivo) values
('Troca de máquina'), ('Completar tiragem'),
('Alteração de papel');

/***** TABELA *****/
CREATE TABLE preimpressao (
  cod_pre int auto_increment primary key,
  motivo varchar (50)
);
Insert into preimpressao (motivo) values
('Arquivo errado'), ('Não chega na cor'), ('Texto');

/***** TABELA *****/
CREATE TABLE copiachapa (
  cod_copchapa int auto_increment primary key,
  motivo varchar (50)
);
Insert into copiachapa (motivo) values
('Chapa arranhada'), ('Sugeira no cilindro');

/***** TABELA *****/
CREATE TABLE impressao (
  cod_imp int auto_increment primary key,
  motivo varchar (50)
  );
  Insert into impressao (motivo) values
  ('Chapa arranhada'), ('Não chega na cor'),
  ('Outro fator');
  
/***** TABELA *****/
CREATE TABLE outros (
  cod_out int auto_increment primary key,
  motivo varchar (50)
  );
  Insert into outros (motivo) values
  ('Gastou a camada'), ('Teste'),
  ('Chapa para reforço'), ('Reposição'),
  ('Sem definição');
  
  /***** TABELA *****/
CREATE TABLE operador (
  cadastro int not null UNIQUE,
  nome varchar (30)
  );
  Insert into operador (cadastro, nome) values
  ('20029', 'Fred'), ('21353', 'Janaira'),
  ('20250', 'Marcos'), ('21064', 'Maximiliano'),
  ('20189', 'Raquel');
  
  /***** TABELA *****/
CREATE TABLE maquina (
  cod_maq int auto_increment primary key,
  nome varchar (10)
  );
  Insert into maquina (nome) values
  ('I-5'), ('I-11'),
  ('I-12'), ('I-13');
  
  /***** TABELA *****/
CREATE TABLE horascompgraf (
  cod_hcg int auto_increment primary key,
  cadoperador int,
  nomeoperador varchar (15),
  ordemprod varchar (10),
  inicio timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  termino timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  criado timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  modificado timestamp NULL DEFAULT CURRENT_TIMESTAMP
  );
  
  /***** TABELA *****/
CREATE TABLE lotechapa (
  cod_lch int auto_increment primary key,
  lote varchar (20),
  situacao varchar(10),
  cod_cadch int
  );
  
  /***** TABELA *****/
CREATE TABLE cadastrochapa (
  cod_cadch int auto_increment primary key,
  ordemprod varchar (10),
  situacao varchar (15),
  turno varchar (6),
  cod_hcg int,
  obs varchar (200),
  criado timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  modificado timestamp NULL DEFAULT CURRENT_TIMESTAMP
  );
  
  alter table lotechapa
  add constraint fk_cadchlch foreign key (cod_cadch) references cadastrochapa (cod_cadch);
  
  alter table cadastrochapa
  add constraint fk_hcgcadch foreign key (cod_hcg) references horascompgraf (cod_hcg);
  