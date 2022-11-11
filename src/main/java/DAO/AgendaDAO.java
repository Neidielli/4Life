/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.time.Instant;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
import java.util.Date; // DATE
//import java.sql.Date;
import javax.swing.JOptionPane;

import model.Agenda;

/**
 *
 * @author neidi
 */
public class AgendaDAO {
    private Connection connection;
    int id_Consulta;
    String procedimento;
    int idPaciente;
    int idProfissional;
    Date data_hora; // DATE
    String tipo_consulta;
    String hora;
    
    public AgendaDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean AgendarConsulta(Agenda agenda){ 
 
        try { 
            // seleciona os campos da tabela
            String sqlSelect = "select * from consultas where idProfissional='" + agenda.getFuncionario() +"'"; 
            PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
            
            // o resultado do select será guardado dentro do obj resultSet
            ResultSet rs = stmtSelect.executeQuery();
            
            System.out.println(rs.next());
            // condição para verificar se o obj resultSet já existe
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Horário Indisponível",
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
                System.out.println(rs.next());
                return false;
            } else {
                String sql = "INSERT INTO consultas(procedimento,idPaciente,idProfissional,data_hora,tipo_consulta,hora) VALUES(?,?,?,?,?,?)";
                PreparedStatement pdstmt = connection.prepareStatement(sql);

                java.util.Date utilDate = agenda.getData_hora(); // DATE
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // DATE

                pdstmt.setString(1, agenda.getProcedimento());

                pdstmt.setInt(2, agenda.getPaciente().getId()); //precisa captar o objeto
                pdstmt.setInt(3, agenda.getFuncionario().getId()); // idem

                pdstmt.setDate(4, sqlDate); // DATE
                pdstmt.setString(5, agenda.getTipo_consulta());
                pdstmt.setString(6, agenda.getHora());

                JOptionPane.showMessageDialog(null, "Consulta cadastrado com sucesso!! ");
                pdstmt.execute();
                pdstmt.close();

                return true;
            }
        } catch (SQLException exc) { 
            System.out.println("Erro ao agendar consulta: " + exc);
            
            return false;
        }
    }
    
    public void deletar(Agenda agenda) {
        String sql = "delete from consultas where id_Consultas=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, agenda.getId_Consulta());

            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    } // fim do mÃ©todo excluir consulta.
}
