drop database if exists projetojava;

create database projetojava;
use projetojava;

create table funcionario (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(40),
    CPF varchar(13) NOT NULL UNIQUE,
    tipo_func varchar(30) NOT NULL,
    telefone varchar(15) NOT NULL,
    email varchar(40) NOT NULL UNIQUE,
    especialidade varchar(30) NOT NULL,
    PRIMARY KEY(id)
    );
