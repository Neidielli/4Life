create database if not exists projetojava;
use projetojava;

drop database if exists projetojava;

create database projetojava;
use projetojava;

create table usuario (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(40),
    cpf varchar(15) NOT NULL UNIQUE,
    email varchar(40) NOT NULL UNIQUE,
	telefone varchar(15) NOT NULL,
    senha varchar(30) NOT NULL,
    PRIMARY KEY(id)
    );
