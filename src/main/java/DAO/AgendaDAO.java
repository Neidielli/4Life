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
import java.util.ArrayList;
import java.util.Date; // DATE
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

import model.Agenda;
import model.Funcionario;
import model.Paciente;
import telas.Agenda.TelaAgenda;
import telas.Agenda.TelaNovoAgendamento;

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
    
    public boolean AgendarConsulta(Agenda agenda, java.util.Date utilDate1){ 
 
        try { 
            
//            java.util.Date utilDate1 = TelaNovoAgendamento.campoData.getDate(); // DATE
            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime()); // DATE
            
            // seleciona os campos da tabela
            String sqlSelect = "select * from consultas where idProfissional='" + agenda.getFuncionario().getId() +"'" +
                    "and data_hora = '" + sqlDate1 + "'" +
                    "and hora = '" + TelaNovoAgendamento.campoHora.getSelectedItem() + "'"; 
            PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
            
            // o resultado do select será guardado dentro do obj resultSet
            ResultSet rs = stmtSelect.executeQuery();

            // condição para verificar se o obj resultSet já existe
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Horário Indisponível",
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
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
            throw new RuntimeException(exc);
        }
    }
    public List<Agenda> listarConsultas(){
        try{
            // vetor que armazena os registro do bd
            List<Agenda> lista = new ArrayList<Agenda>();
            // comando sql que lista os dados
            java.util.Date utilDate = TelaAgenda.calendarConsulta.getDate(); // DATE
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // DATE
            
            String sql = "SELECT c.id_Consulta, c.procedimento, p.nome, f.nome, c.data_hora, c.tipo_consulta,c.hora " +
            "FROM consultas as c " +
            "JOIN paciente as p on (c.idPaciente = p.id) " +
            "JOIN funcionario as f on (c.idProfissional = f.id)" +
            "WHERE f.nome ='" + TelaAgenda.textNomeMedico.getText() + "'" +
                    "and c.data_hora = '" + sqlDate + "'";
            
//            System.out.println(sql);
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // o resultado do select serÃ¡ guardado dentro do obj resultSet
            ResultSet rs = stmt.executeQuery();
            // laÃ§o de repetiÃ§Ã£o para guardar os registros na lista
            while(rs.next()){
              
                
                Agenda a = new Agenda();
                Paciente p = new Paciente();
                Funcionario f = new Funcionario();
                
                a.setId_Consulta(rs.getInt("c.id_Consulta"));
                a.setProcedimento(rs.getString("c.procedimento"));
  
                p.setNome(rs.getString("p.nome")); // retornar o nome do paciente
                f.setNome(rs.getString("f.nome")); // retornar o nome do profissional
                
                a.setData_hora(rs.getDate("c.data_hora"));
                a.setTipo_consulta(rs.getString("c.tipo_consulta"));
                a.setHora(rs.getString("c.hora"));
    
                a.setPaciente(p); // obj a vai listar obj paciente
                a.setFuncionario(f); // obj a vai listar obj funcionario
                
                lista.add(a);
            }
            return lista;
        }catch(SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public void deletar(Agenda agenda) {
        String sql = "delete from consultas where id_Consulta=?";
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
