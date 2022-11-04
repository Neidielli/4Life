/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
/**
 * @author tayna
 */
import factory.ConnectionFactory;
import java.util.List;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import model.Funcionario;


public class funcionarioDAO {
    private Connection connection;
    int id;
    String nome;
    String CPF;
    String tipo_func;
    String telefone;
    String email;
    String especialidade;
    
    public funcionarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 

    public boolean cadastrar(Funcionario funcionario){ 
        String sql = "INSERT INTO funcionario(nome,CPF,tipo_func,telefone,email,especialidade) VALUES(?,?,?,?,?,?)";
  
        try { 
            PreparedStatement pdstmt = connection.prepareStatement(sql);
            
            pdstmt.setString(1, funcionario.getNome());
            pdstmt.setString(2, funcionario.getCPF());
            pdstmt.setString(3, funcionario.getTipo_func());
            pdstmt.setString(4, funcionario.getTelefone());
            pdstmt.setString(5, funcionario.getEmail());
            pdstmt.setString(6, funcionario.getEspecialidade());
            
            JOptionPane.showMessageDialog(null, "Funcionário " + funcionario.getNome()+ " cadastrado com sucesso!! ");
            pdstmt.executeUpdate();
            pdstmt.close();
            
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao cadastrar funcionário!"+exc);
            //throw new RuntimeException(exc);
            
            return false;
        } 
    } 
    
    public List<Funcionario> listaFunc(){
        /*this.connection = new ConnectionFactory().getConnection();
        PreparedStatement pdstmt = null;
        ResultSet rs = null;*/
        try {
            List<Funcionario> lista = new ArrayList<Funcionario>();
            String sql = "SELECT * from funcionario";
            PreparedStatement pdstmt = connection.prepareStatement(sql);
            ResultSet rs = pdstmt.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCPF(rs.getString("CPF"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setTipo_func(rs.getString("tipo_func"));
                funcionario.setEspecialidade(rs.getString("especialidade"));
                lista.add(funcionario);
            }
            return lista;
        }
        catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    }
    
    public boolean editar(Funcionario func){ 
        String upsql = "UPDATE funcionario set nome=?, CPF=?, tipo_func=?, telefone=?, email=?, especialidade=? WHERE id=?";
  
        try { 
            PreparedStatement pdstmt = connection.prepareStatement(upsql);
            
            pdstmt.setString(1, func.getNome());
            pdstmt.setString(2, func.getCPF());
            pdstmt.setString(3, func.getTipo_func());
            pdstmt.setString(4, func.getTelefone());
            pdstmt.setString(5, func.getEmail());
            pdstmt.setString(6, func.getEspecialidade());
            pdstmt.setInt(7, func.getId());
            
            pdstmt.executeUpdate();
            pdstmt.close();
            
            //JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao atualizar funcionário!"+exc);
            //throw new RuntimeException(exc); 
            return false;
        } 
    }
    
    public boolean deletar(Funcionario func){ 
        String delsql = "DELETE from funcionario WHERE id=?";
  
        try { 
            PreparedStatement pdstmt = connection.prepareStatement(delsql);
           
            pdstmt.setInt(1, func.getId());
            pdstmt.executeUpdate();
            pdstmt.close();
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao deletar funcionário!"+exc); 
            return false;
        } 
    }
}
