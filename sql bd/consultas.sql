/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  neidi
 * Created: 28/10/2022
 */
create table consultas (
    id_Consulta int NOT NULL AUTO_INCREMENT,
    procedimento varchar(200),
    idPaciente int NOT NULL,
    idProfissional int NOT NULL,
    data_hora datetime NOT NULL,
    tipo_consulta varchar(30) NOT NULL,
    PRIMARY KEY(id_Consulta)
    );

    alter table consultas ADD CONSTRAINT fk_consultas_paciente foreign key (idPaciente) references paciente (id);

    alter table consultas ADD CONSTRAINT fk_consultas_funcionario foreign key (idProfissional) references funcionario (id);
    
    alter table consultas add hora TIME NOT NULL;

