create database if not exists 4Life;
use 4Life;

drop database if exists 4Life;

create database 4Life;
use 4Life;

create table funcionario (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(40),
    CPF varchar(13) NOT NULL UNIQUE,
    tipo_func varchar(30) NOT NULL,
    telefone varchar(15) NOT NULL,
    email varchar(40) NOT NULL UNIQUE,
    senha varchar(30) NOT NULL,
    especialidade varchar(30) NOT NULL,
    PRIMARY KEY(id)
    );
