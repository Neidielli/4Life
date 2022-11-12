/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import factory.ConnectionFactory;
import model.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
    
    public boolean cadastrar(Usuario usuario) {
        try {
            // seleciona os campos da tabela
            String sqlSelect = "SELECT * from usuario where cpf='" + usuario.getCpf() +"'"; 
            PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
            
            //stmtSelect.setString(1,cpf);
            // o resultado do select será guardado dentro do obj resultSet
            ResultSet rs = stmtSelect.executeQuery();
            
            System.out.println(rs.next());
            // condição para verificar se o obj resultSet já existe
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado!",
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
                System.out.println(rs.next());
                return false;
            } else {
            
                String sql = "INSERT INTO usuario(nome,cpf,email,telefone,senha) VALUES(?,?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getCpf());
                stmt.setString(3, usuario.getEmail());
                stmt.setString(4, usuario.getTelefone());
                stmt.setString(5, usuario.getSenha());
                
                JOptionPane.showMessageDialog(null, "Usuário " + usuario.getNome()+ " cadastrado com sucesso!! ");
                stmt.executeUpdate();
                stmt.close();
                
                return true;
            }    
        }
        catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    } // fim do mÃ©todo adiciona usuÃ¡rio.
    
    // MÃ©todo listar todos os clientes
    public List<Usuario> listaUsuarios(){
        try{
            // vetor que armazena os registro do bd
            List<Usuario> lista = new ArrayList<Usuario>();
            // comando sql que lista os dados
            String sql = "select * from usuario";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // o resultado do select serÃ¡ guardado dentro do obj resultSet
            ResultSet rs = stmt.executeQuery();
            // laÃ§o de repetiÃ§Ã£o para guardar os registros na lista
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
    public void editar(Usuario usuario) {
        String sql = "UPDATE usuario set nome=?, cpf=?, email=?, telefone=?, senha=? where id=?";
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
    } // fim do mÃ©todo alterar usuÃ¡rio. 
    public void deletar(Usuario usuario) {
        String sql = "DELETE from usuario where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, usuario.getId());

            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    } // fim do mÃ©todo excluir usuÃ¡rio.
    // inicio do mÃ©todo Login.
    public boolean login(String email, String senha) {
        try {
            // comando sql
            String sql = "SELECT * from usuario where email=? and senha=?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            // indica ao java quem Ã© quem.
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
    public boolean pesquisaUser(Usuario user){
        String sql = "SELECT * from usuario WHERE id=?";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            pstmt.setInt(1, user.getId());
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                user.setNome(rs.getString("nome"));
                user.setCpf(rs.getString("cpf"));
                user.setEmail(rs.getString("email"));
                user.setTelefone(rs.getString("telefone"));
                user.setSenha(rs.getString("senha"));
            }
            return true;
        }
        catch(SQLException exc){
            throw new RuntimeException(exc);
        }
    } 
    public ResultSet carregaTabela(){
        String sql = "SELECT id,nome,cpf,email,telefone from usuario";
        
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
        String sqlt = "SELECT id,nome,cpf,email,telefone from usuario WHERE "+argumento+""; 
        
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
