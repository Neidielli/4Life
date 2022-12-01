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
import javax.swing.JOptionPane;
import model.Prontuario;

/**
 *
 * @author tayna
 */
public class ProntuarioDAO {
    private Connection connection;
    
    int idProntuario;
    int id_paciente;
    String cirurgia;
    String gestante;
    String fumante;
    String infarto;
    String medicacao;
    String alergia;
    String tratamento;
    String falta_ar;
    String doenca;
    String diabetico;
    String observação;
    
    public ProntuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean cadastrar(Prontuario prontuario){ 
 
        try { 
             // seleciona os campos da tabela
            String sqlSelect = "select * from prontuario where id_paciente='" + prontuario.getPaciente().getId() +"'";
            
            PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
            
            // o resultado do select será guardado dentro do obj resultSet
            ResultSet rs = stmtSelect.executeQuery();
            
            // condição para verificar se o obj resultSet já existe
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Prontuario de Paciente já cadastrado",
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                String sql = "INSERT INTO prontuario(id_paciente,cirurgia,gestante,fumante,infarto,medicacao,alergia,tratamento,falta_ar,doenca,diabetico,observacao) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pdstmt = connection.prepareStatement(sql);

                pdstmt.setInt(1, prontuario.getPaciente().getId()); //precisa captar o objeto
                pdstmt.setString(2, prontuario.getCirurgia()); 
                pdstmt.setString(3, prontuario.getGestante());
                pdstmt.setString(4, prontuario.getFumante());
                pdstmt.setString(5, prontuario.getInfarto());
                pdstmt.setString(6, prontuario.getMedicacao());
                pdstmt.setString(7, prontuario.getAlergia());
                pdstmt.setString(8, prontuario.getTratamento());
                pdstmt.setString(9, prontuario.getFalta_ar());
                pdstmt.setString(10, prontuario.getDoenca());
                pdstmt.setString(11, prontuario.getDiabetico());
                pdstmt.setString(12, prontuario.getObservacao());

                JOptionPane.showMessageDialog(null, "Prontuario cadastrado com sucesso!! ");
                pdstmt.execute();
                pdstmt.close();

                return true;
            }
            
        } catch (SQLException exc) { 
            System.out.println("Erro ao agendar prontuario: " + exc); 
            throw new RuntimeException(exc);
        }
    }
    
}