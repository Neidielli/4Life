/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  tayna
 * Created: 31 de out. de 2022
 */
use projetojava;
create table paciente (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(200),
    cpf varchar(15) NOT NULL UNIQUE,
    email varchar(80) NOT NULL UNIQUE,
    telefone varchar(15) NOT NULL,
    data_nascimento date NOT NULL,
    cep varchar(11) NOT NULL,
    rua varchar(80) NOT NULL,
    bairro varchar(80) NOT NULL,
    cidade varchar(80) NOT NULL,
    estado varchar(50) NOT NULL,
    num_endereco int NOT NULL,
    PRIMARY KEY(id, nome)
);
ALTER TABLE `projetojava`.`paciente` 
ADD COLUMN `genero` VARCHAR(50) NOT NULL AFTER `num_endereco`,
ADD COLUMN `profissao` VARCHAR(80) NOT NULL AFTER `genero`,
ADD COLUMN `convenio` VARCHAR(80) NOT NULL AFTER `profissao`,
ADD COLUMN `plano` VARCHAR(50) NOT NULL AFTER `convenio`,
ADD COLUMN `num_convenio` VARCHAR(50) NOT NULL AFTER `plano`;

