/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  neidi
 * Created: 28/10/2022
 */
use projetojava;
create table paciente (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(200),
    cpf varchar(15) NOT NULL,
    email varchar(200) NOT NULL,
    telefone varchar(15) NOT NULL,
    data_nascimento date NOT NULL,
    endereco varchar(255) NOT NULL,
    convenio boolean,
    PRIMARY KEY(id),
    PRIMARY KEY(nome)
    );
