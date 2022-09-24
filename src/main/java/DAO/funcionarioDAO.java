/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
/**
 * @author tayna
 */
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import model.Funcionario;
import javax.swing.JOptionPane;

public class funcionarioDAO {
    private Connection connection;
    
    public funcionarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 

    //public void adiciona(Funcionario funcionario) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    public void cadastrar(Funcionario funcionario){ 
        String sql = "INSERT INTO funcionario(nome,email,senha,id,CPF,telefone,tipo_func,especialidade) VALUES(?,?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEmail());
            stmt.setString(3, funcionario.getSenha());
            stmt.setInt(4, funcionario.getId());
            stmt.setString(5, funcionario.getCPF());
            stmt.setString(6, funcionario.getTelefone());
            stmt.setString(7, funcionario.getTipo_func());
            stmt.setString(8, funcionario.getEspecialidade());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException exc) { 
            throw new RuntimeException(exc);
        } 
        
    } 
    
}
