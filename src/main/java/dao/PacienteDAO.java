/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author tayna
 */
import factory.ConnectionFactory;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Paciente;

public class PacienteDAO {
    private Connection connection;
    int id;
    String nome;
    String cpf;
    String email;
    String telefone;
    Date data_nascimento;
    String cep, rua, bairro, cidade, estado;
    int num_endereco;
    
    public PacienteDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean cadastrar(Paciente paciente){
        String sql = "INSERT INTO paciente(nome,cpf,email,telefone,data_nascimento,cep,rua,bairro,cidade,estado,num_endereco) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement pds = connection.prepareStatement(sql);
            java.util.Date utilDate = paciente.getData_nascimento(); // DATE
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // DATE
            
            pds.setString(1, paciente.getNome());
            pds.setString(2, paciente.getCpf());
            pds.setString(3, paciente.getEmail());
            pds.setString(4, paciente.getTelefone());
            pds.setDate(5, sqlDate);
            pds.setString(6, paciente.getCep());
            pds.setString(7, paciente.getRua());
            pds.setString(8, paciente.getBairro());
            pds.setString(9, paciente.getCidade());
            pds.setString(10, paciente.getEstado());
            pds.setInt(11, paciente.getNum_endereco());
            
            JOptionPane.showMessageDialog(null, "Paciente " + paciente.getNome()+ " cadastrado com sucesso!! ");
            pds.executeUpdate();
            pds.close();
            
            return true;
        }
        catch(SQLException exc){
            System.err.println("Erro ao cadastrar paciente!"+exc);
            
            return false;
        }
    }
    public List<Paciente> listaPac(){
        try {
            List<Paciente> lista = new ArrayList<Paciente>();
            String sql = "SELECT * from paciente";
            
            PreparedStatement pds = connection.prepareStatement(sql);
            ResultSet rs = pds.executeQuery();
            
            System.out.println(rs);
            
            while(rs.next()){
                Paciente paciente = new Paciente();
                
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                System.out.println(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setEmail(rs.getString("email"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setData_nascimento(rs.getDate("data_nascimento"));  
                System.out.println(rs.getDate("data_nascimento"));
                paciente.setCep(rs.getString("cep"));
                paciente.setRua(rs.getString("rua"));
                paciente.setBairro(rs.getString("bairro"));
                paciente.setCidade(rs.getString("cidade"));
                paciente.setEstado(rs.getString("estado"));
                paciente.setNum_endereco(rs.getInt("num_endereco"));
                
                lista.add(paciente);
            }
            return lista;
        }
        catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    }
    public void editar(Paciente paciente){
        String sql = "UPDATE paciente set nome=?, cpf=?, email=?, telefone=?, data_nascimento=?, cep=?, rua=?, bairro=?, cidade=?, estado=?, num_endereco=? WHERE id=?";
        
        try { 
            PreparedStatement pds = connection.prepareStatement(sql);
            java.util.Date utilDate = paciente.getData_nascimento(); // DATE
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // DATE
            
            pds.setString(1, paciente.getNome());
            pds.setString(2, paciente.getCpf());
            pds.setString(3, paciente.getEmail());
            pds.setString(4, paciente.getTelefone());
            //pds.setDate(5, paciente.getData_nascimento());
            pds.setDate(5, sqlDate);
            pds.setString(6, paciente.getCep());
            pds.setString(7, paciente.getRua());
            pds.setString(8, paciente.getBairro());
            pds.setString(9, paciente.getCidade());
            pds.setString(10, paciente.getEstado());
            pds.setInt(11, paciente.getNum_endereco());
            pds.setInt(12, paciente.getId());
            
            pds.executeUpdate();
            pds.close();
           
        } 
        catch (SQLException exc) { 
            throw new RuntimeException(exc); 
        } 
    }
    public boolean deletar(Paciente paciente){
        String del = "DELETE from paciente WHERE id=?";
  
        try { 
            PreparedStatement pds = connection.prepareStatement(del);
           
            pds.setInt(1, paciente.getId());
            pds.executeUpdate();
            pds.close();
            
            JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
            return true;
        } 
        catch (SQLException exc) { 
            System.err.println("Erro ao deletar paciente!"+exc); 
            return false;
        } 
    }
    public boolean pesquisaPac(Paciente pac){
        String sql = "SELECT * from paciente WHERE id=?";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
        
            pstmt.setInt(1, pac.getId());
            ResultSet rs = pstmt.executeQuery(); //pesquisa e traz as informações do bd.
        
            if(rs.next()){
                pac.setNome(rs.getString("nome"));
                pac.setCpf(rs.getString("cpf"));
                pac.setEmail(rs.getString("email"));
                pac.setTelefone(rs.getString("telefone"));
                pac.setData_nascimento(rs.getDate("data_nascimento"));
                pac.setCep(rs.getString("cep"));
                pac.setRua(rs.getString("rua"));
                pac.setBairro(rs.getString("bairro"));
                pac.setCidade(rs.getString("cidade"));
                pac.setEstado(rs.getString("estado"));
                pac.setNum_endereco(rs.getInt("num_endereco"));
            }
            return true;
        }
        catch(SQLException exc){
            throw new RuntimeException(exc);
        }
    }
    public ResultSet carregaTabela(){ //carrega a tabela com as informações do bd.
        String sql = "SELECT id,nome,cpf,data_nascimento,telefone,cidade,estado from paciente";
        
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
        String sqlt = "SELECT id,nome,cpf,data_nascimento,telefone,cidade,estado from paciente WHERE "+argumento+" "; 
        
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
