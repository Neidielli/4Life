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
//import java.util.logging.Level;
//import java.util.logging.Logger;
import model.Funcionario;


public class funcionarioDAO {
    private Connection connection; //= null;
    int id;
    String nome;
    String CPF;
    String tipo_func;
    String telefone;
    String email;
    String senha;
    String especialidade;
    
    public funcionarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 

    public void cadastrar(Funcionario funcionario){ 
        String sql = "INSERT INTO funcionario(nome,CPF,tipo_func,telefone,email,senha,especialidade) VALUES(?,?,?,?,?,?,?)";
        try { 
            System.out.println("Entrou no try");
            PreparedStatement pdstmt = connection.prepareStatement(sql);
            
            pdstmt.setString(1, funcionario.getNome());
            pdstmt.setString(2, funcionario.getCPF());
            pdstmt.setString(3, funcionario.getTipo_func());
            pdstmt.setString(4, funcionario.getTelefone());
            pdstmt.setString(5, funcionario.getEmail());
            pdstmt.setString(6, funcionario.getSenha());
            pdstmt.setString(7, funcionario.getEspecialidade());
            
            pdstmt.execute();
            pdstmt.close();
        } 
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    } 
    public List<Funcionario> listaFunc(){
        try {
            List<Funcionario> lista = new ArrayList<Funcionario>();
            
            String sql = "select * from funcionario";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
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
        }catch(SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
