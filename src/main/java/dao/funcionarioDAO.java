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
import javax.swing.JOptionPane;
import model.Funcionario;


public class FuncionarioDAO {
    private Connection connection;
    int id;
    String nome;
    String CPF;
    String tipo_func;
    String telefone;
    String email;
    String especialidade;
    
    public FuncionarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 

    public boolean cadastrar(Funcionario funcionario){ 
        String sql = "INSERT INTO funcionario(nome,CPF,tipo_func,telefone,email,especialidade) VALUES(?,?,?,?,?,?)";
  
        try { 
            PreparedStatement pds = connection.prepareStatement(sql);
            
            pds.setString(1, funcionario.getNome());
            pds.setString(2, funcionario.getCPF());
            pds.setString(3, funcionario.getTipo_func());
            pds.setString(4, funcionario.getTelefone());
            pds.setString(5, funcionario.getEmail());
            pds.setString(6, funcionario.getEspecialidade());
            
            JOptionPane.showMessageDialog(null, "Funcionário " + funcionario.getNome()+ " cadastrado com sucesso!! ");
            pds.executeUpdate();
            pds.close();
            
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao cadastrar funcionário!"+exc);
            
            return false;
        } 
    } 
    
    public List<Funcionario> listaFunc(){
        try {
            List<Funcionario> lista = new ArrayList<Funcionario>();
            String sql = "SELECT * from funcionario";
            
            PreparedStatement pds = connection.prepareStatement(sql);
            ResultSet rs = pds.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                System.out.println(rs.getString("nome"));
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
    
    public void editar(Funcionario funcionario){ 
        String sql = "UPDATE funcionario set nome=?, CPF=?, tipo_func=?, telefone=?, email=?, especialidade=? WHERE id=?";
  
        try { 
            PreparedStatement pds = connection.prepareStatement(sql);
            
            pds.setString(1, funcionario.getNome());
            pds.setString(2, funcionario.getCPF());
            pds.setString(3, funcionario.getTipo_func());
            pds.setString(4, funcionario.getTelefone());
            pds.setString(5, funcionario.getEmail());
            pds.setString(6, funcionario.getEspecialidade());
            pds.setInt(7, funcionario.getId());
            
            pds.execute();
            pds.close();
            
        } 
        catch (SQLException exc) { 
            throw new RuntimeException(exc);
        } 
    }
    
    public boolean deletar(Funcionario funcionario){ 
        String del = "DELETE from funcionario WHERE id=?";
  
        try { 
            PreparedStatement pds = connection.prepareStatement(del);
           
            pds.setInt(1, funcionario.getId());
            pds.executeUpdate();
            pds.close();
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao deletar funcionário!"+exc); 
            return false;
        } 
    }
    public boolean pesquisaFunc(Funcionario func){
        String sql = "SELECT * from funcionario WHERE id=?";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
        
            pstmt.setInt(1, func.getId());
            ResultSet rs = pstmt.executeQuery(); //pesquisa e traz as informações do bd.
        
            if(rs.next()){
                func.setNome(rs.getString("nome"));
                func.setCPF(rs.getString("CPF"));
                func.setTipo_func(rs.getString("tipo_func"));
                func.setTelefone(rs.getString("telefone"));
                func.setEmail(rs.getString("email"));
                func.setEspecialidade(rs.getString("especialidade"));
            }
            return true;
        }
        catch(SQLException exc){
            throw new RuntimeException(exc);
        }
    }
    public ResultSet carregaTabela(){ 
        String sql = "SELECT id,nome,CPF,tipo_func,telefone,email,especialidade from funcionario";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            return rs;
        }
        catch(SQLException exc){
            throw new RuntimeException(exc);
        }
    }
    public static ResultSet carregaTabela(String tipo,String arg){
        String argumento = tipo+" "+"like '"+arg+"%'"; 
        String sqlt = "SELECT id,nome,CPF,tipo_func,telefone,email,especialidade from funcionario WHERE "+argumento+" "; 
        
        try{
            ConnectionFactory conexao = new ConnectionFactory();
            PreparedStatement pstmt = conexao.getConnection().prepareStatement(sqlt);
            ResultSet rs = pstmt.executeQuery();
            return rs;
        }
        catch(SQLException exc){
            throw new RuntimeException(exc);
        }
    }
}