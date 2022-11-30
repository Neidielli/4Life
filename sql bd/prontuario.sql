/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  tayna
 * Created: 30 de nov. de 2022
 */

use projetojava;

drop table if exists prontuario;

create table prontuario(
	id_prontuario int NOT NULL auto_increment,
    id_paciente int NOT NULL,
    cirurgia varchar(15) NOT NULL,
    gestante varchar(15) NOT NULL,
    fumante varchar(15) NOT NULL,
    infarto varchar(15) NOT NULL,
    medicacao varchar(100) NOT NULL,
    alergia varchar(100) NOT NULL,
    tratamento varchar(100) NOT NULL,
    falta_ar varchar(100) NOT NULL,
    doenca varchar(100) NOT NULL,
    diabetico varchar(100) NOT NULL,
    observacao varchar(400) NOT NULL,
    PRIMARY KEY(id_prontuario)
);

alter table prontuario ADD CONSTRAINT fk_prontuario_paciente foreign key (id_paciente) references paciente (id);
