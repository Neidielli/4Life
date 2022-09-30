/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
/**
 * @author tayna
 */
import factory.ConnectionFactory;
import java.util.List;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;


public class funcionarioDAO {
    private Connection connection = null;
    
    public funcionarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 

    public boolean cadastrar(Funcionario funcionario){ 
        String sql = "INSERT INTO funcionario(id,nome,CPF,tipo_func,telefone,email,senha,especialidade) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pdstmt = null;
        try { 
            pdstmt = connection.prepareStatement(sql);
            pdstmt.setInt(1, funcionario.getId());
            pdstmt.setString(2, funcionario.getNome());
            pdstmt.setString(3, funcionario.getCPF());
            pdstmt.setString(4, funcionario.getTipo_func());
            pdstmt.setString(5, funcionario.getTelefone());
            pdstmt.setString(6, funcionario.getEmail());
            pdstmt.setString(7, funcionario.getSenha());
            pdstmt.setString(8, funcionario.getEspecialidade());
            pdstmt.executeUpdate();
            
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao cadastrar funcionário!"+exc);
            
            return false;
            //throw new RuntimeException(exc);
        } 
        finally{
            ConnectionFactory.closeConnection(connection, pdstmt);
        }
    } 
    
    public List<Funcionario> listaFunc(){
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement pdstmt = null;
        ResultSet rs = null;
        
        List<Funcionario> listaFunc = new ArrayList<>();
        
        try {
            pdstmt = connection.prepareStatement("SELECT * from funcionario");
            rs = pdstmt.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCPF(rs.getString("CPF"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setTipo_func(rs.getString("tipo_func"));
                funcionario.setEspecialidade(rs.getString("especialidade"));
                listaFunc.add(funcionario);
            }
        }
        catch (SQLException exc) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        finally{
            ConnectionFactory.closeConnection(connection, pdstmt, rs);
        }
        return listaFunc;
    }
}
