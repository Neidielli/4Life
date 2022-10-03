/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import model.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author neidi
 */
public class UsuarioDAO {
    private Connection connection;
    int id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String senha;
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone,senha)VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getSenha());
            //stmt.setInt(6, usuario.getId());
            
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    } // fim do método adiciona usuário.
    
    // Método listar todos os clientes
    public List<Usuario> listarUsuarios(){
        try{
            // vetor que armazena os registro do bd
            List<Usuario> lista = new ArrayList<Usuario>();
            // comando sql que lista os dados
            String sql = "select * from usuario";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // o resultado do select será guardado dentro do obj resultSet
            ResultSet rs = stmt.executeQuery();
            // laço de repetição para guardar os registros na lista
            while(rs.next()){
               
                Usuario u = new Usuario();
                
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));
                u.setEmail(rs.getString("email"));
                u.setTelefone(rs.getString("telefone"));    
                lista.add(u);
            }
            return lista;
        }catch(SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    // inicio do método Login.
    public boolean login(String email, String senha) { // OK
        try {
            // comando sql
            String sql = "select * from usuario where email=? and senha=?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            // indica ao java quem é quem.
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            // executa
            ResultSet rs = stmt.executeQuery();
            //verifica se existe registro
            if(rs.next()) { // realiza o login
                return true;
            }
                
        } catch (Exception e) {
        
        }
        return false;
    }
     public void alterar(Usuario usuario) { // OK
        String sql = "update usuario set nome=?, cpf=?, email=?, telefone=?, senha=? where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getSenha());
            stmt.setInt(6, usuario.getId());
            
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    } // fim do método alterar usuário. 
    public void excluir(Usuario usuario) {
        String sql = "delete from usuario where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, usuario.getId());
            
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    } // fim do método excluir usuário.
}
