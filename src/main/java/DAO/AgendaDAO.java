/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    String data_hora;
    String tipo_consulta;
    String hora;
    
    public AgendaDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean AgendarConsulta(Agenda agenda){ 
 
        try { 
            String sql = "INSERT INTO consultas(procedimento,idPaciente,idProfissional,data_hora,tipo_consulta,hora) VALUES(?,?,?,?,?,?)";
//            fk_consultas_paciente,fk_consultas_funcionario
            PreparedStatement pdstmt = connection.prepareStatement(sql);
           
            
            pdstmt.setString(1, agenda.getProcedimento());
            
            pdstmt.setInt(2, agenda.getPaciente().getId()); //precisa captar o objeto
            pdstmt.setInt(3, agenda.getFuncionario().getId()); // idem
            
            pdstmt.setString(4, agenda.getData_hora());
            pdstmt.setString(5, agenda.getTipo_consulta());
            pdstmt.setString(6, agenda.getHora());
            
            JOptionPane.showMessageDialog(null, "Consulta cadastrado com sucesso!! ");
            pdstmt.execute();
            pdstmt.close();
            
            return true;
        } 
        catch (SQLException exc) { 
            System.out.println("Erro ao agendar consulta: " + exc);
            
            return false;
        } 
    }
    
    public void excluir(Agenda agenda) {
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
