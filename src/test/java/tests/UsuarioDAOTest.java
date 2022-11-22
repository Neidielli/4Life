/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Usuario;
import DAO.UsuarioDAO;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author neidi
 */
public class UsuarioDAOTest {
    
    private Connection connection;
    
    public UsuarioDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void bf() throws SQLException{
        this.connection = new ConnectionFactory().getConnection();

/*======= Garante que o banco de dados estará limpo antes de realizar os testes =======*/         
//        String delete = "delete from usuario";
//        PreparedStatement stmt = connection.prepareStatement(delete);
//        stmt.executeUpdate(delete); // DEPOIS QUE TIVER BANCO SOMENTE PRA TESTES
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class UsuarioDAO.
     */
      @Test
    public void testAdicionarl() throws SQLException {
         UsuarioDAO usuario = new UsuarioDAO();
        
//        int id="";
        String nome = "Neid";
        String cpf ="010.020.030-04"; // cpf é um varchar(15)
        String email = "mariNeid@gmail.com"; 
        String telefone = "(41)90005-0000";
        String senha = "marimari";
        
        Usuario usuarioVerdadeiro1 = new Usuario();
        
        usuarioVerdadeiro1.setNome(nome);
        usuarioVerdadeiro1.setCpf(cpf);
        usuarioVerdadeiro1.setEmail(email);
        usuarioVerdadeiro1.setTelefone(telefone);
        usuarioVerdadeiro1.setSenha(senha);
                
        /*executa cadastro com dados corretos*/
        assertEquals(true, usuario.cadastrar(usuarioVerdadeiro1));       
    }
        @Test
    public void testAdicionarFalso() throws SQLException {
        UsuarioDAO usuario = new UsuarioDAO();
        
//        int id="";
        String nome = "Neid";
        String cpf ="010.020.030-04"; // cpf é um varchar(15)
        String email = "emailfalso@hotmail.com"; 
        String telefone = "(41)90005-0000";
        String senha = null; // senha não podem ser nulos, devido ao login
        
        Usuario usuarioFalso1 = new Usuario();
        
        usuarioFalso1.setNome(nome);
        usuarioFalso1.setCpf(cpf);
        usuarioFalso1.setEmail(email);
        usuarioFalso1.setTelefone(telefone);
        usuarioFalso1.setSenha(senha);
                
        /*executa cadastro com usuário existente - esperara que tenha usuario*/ 
        assertEquals(false, usuario.cadastrar(usuarioFalso1));
    
    }
        @Test
    public void testAdicionarExistente() throws SQLException {
        UsuarioDAO usuario = new UsuarioDAO();
        
//        int id="";
        String nome = "Neid";
        String cpf ="010.020.030-04"; 
        String email = "mariNeid@gmail.com"; 
        String telefone = "(41)90005-0000";
        String senha = "marimari"; 
        
        Usuario usuarioExistente = new Usuario();
        
        usuarioExistente.setNome(nome);
        usuarioExistente.setCpf(cpf);
        usuarioExistente.setEmail(email);
        usuarioExistente.setTelefone(telefone);
        usuarioExistente.setSenha(senha);
                
        /*executa cadastro com usuário existente - esperara que tenha usuario*/ 
        assertEquals(true, usuario.cadastrar(usuarioExistente));
    
    }
    /**
     * Test of listarUsuarios method, of class UsuarioDAO.
    */
    @Test
    public void testListarUsuarioNotNull() {
        System.out.println("Listar usuario");
        UsuarioDAO instance = new UsuarioDAO();
        List<Usuario> result = instance.listaUsuarios();
        assertNotNull(result);
    }    
//    /**
//     * Test of alterar method, of class UsuarioDAO.
//     */
//    @Test
//    public void testEditar1falso() throws SQLException {
//        UsuarioDAO id = new UsuarioDAO();
//        
//        int id="";
//        String nome= "";
//        String cpf ="";
//        String email="";
//        String telefone="";
//        String senha="";
//        
//        usuariousuario = new usuario(id,nome,cpf,email,telefone,senha);
//        
//        /*executa cadastro*/
//        assertEquals(true, id.editar(usuario));
//        
//        /*---------------------------*/
//            id="2";
//            nome= "";
//            cpf ="12345678912";
//            email="gabriel@teste.com";
//            telefone="35423698";
//            senha="00";
//        
//        usuario usuarioeditado = new usuario(id,nome,cpf,email,telefone,senha);
//        
//        /*executa edição*/
//        assertEquals(true, id.editar(usuarioeditado));
//        
//        /*executa edição com dados incorretos*/
//        usuario.setnome(null);
//        assertEquals(false, id.editarusuario(id));
//        
//        /*consulta edição efetuada*/
//        String select = "select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? ";
//        PreparedStatement stmt = connection.prepareStatement(select);
//        
//         stmt.setString(1, nome);
//        stmt.setString(2, cpf);
//        stmt.setString(3, email);
//        stmt.setString(4, telefone);
//        stmt.setString(5, senha);
//        
//        ResultSet rs = stmt.executeQuery();
//        rs.next();
//
//        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
//        assertEquals(nome, rs.getString("nome"));
//        assertEquals(cpf, rs.getString("cpf"));
//        assertEquals(email, rs.getString("email"));
//        assertEquals(telefone, rs.getString("telefone"));
//        assertEquals(senha, rs.getString("senha"));
//        
//    }    
         //Com alterar existente 2 
//    @Test
//    public void testEditar1Verdadeiro() throws SQLException {
//        UsuarioDAO id = new UsuarioDAO();
//        
//        int id="";
//        String nome= "";
//        String cpf ="";
//        String email="";
//        String telefone="";
//        String senha="";
//        
//        usuariousuario = new usuario(id,nome,cpf,email,telefone,senha);
//        
//        /*executa cadastro*/
//        assertEquals(true, id.editar(imovel));
//        
//        /*---------------------------*/
//            id="2";
//            nome= "";
//            cpf ="12345678912";
//            email="gabriel@teste.com";
//            telefone="35423698";
//            senha="00";
//        
//        usuario usuarioeditado = new usuario(id,nome,cpf,email,telefone,senha);
//        
//        /*executa edição*/
//        assertEquals(true, id.editar(usuarioeditado));
//        
//        /*executa edição com dados incorretos*/
//        usuario.setnome(null);
//        assertEquals(false, id.editarusuario(id));
//        
//        /*consulta edição efetuada*/
//        String select = "select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? ";
//        PreparedStatement stmt = connection.prepareStatement(select);
//        
//         stmt.setString(1, nome);
//        stmt.setString(2, cpf);
//        stmt.setString(3, email);
//        stmt.setString(4, telefone);
//        stmt.setString(5, senha);
//        
//        ResultSet rs = stmt.executeQuery();
//        rs.next();
//
//        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
//        assertEquals(nome, rs.getString("nome"));
//        assertEquals(cpf, rs.getString("cpf"));
//        assertEquals(email, rs.getString("email"));
//        assertEquals(telefone, rs.getString("telefone"));
//        assertEquals(senha, rs.getString("senha"));
//        
//    }
    /**
     * Test of login method, of class UsuarioDAO.
     */
    @Test
    public void testLoginUsuario1Verdadeiro() {
        
        // Com Login existente
        System.out.println("login existente");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.login(email, senha);
        assertEquals(expResult, result);
    }    
         //Com Login verdadeiro
        @Test    
        public void testLoginUsuario2Verdadeiro() {
            System.out.println("login existente usuario 2");
            String email = "taynara@teste.com";
            String senha = "senhataynara";
            UsuarioDAO instance = new UsuarioDAO();
            boolean expResult = true;
            boolean result = instance.login(email, senha);
            assertEquals(expResult, result);
        }  
        @Test
        public void testLoginUsuario1Falso() {
        
            // Com Login que não existe no banco
            System.out.println("login Falso usuario 2");
            String email = "neidielli@teste1.com";
            String senha = "senhateste1";
            UsuarioDAO instance = new UsuarioDAO();
            boolean expResult = false;
            boolean result = instance.login(email, senha);
            assertEquals(expResult, result);
        }  
        @Test    
        public void testLoginUsuario2Falso() {
            // Com Login que não existe no banco
            System.out.println("login falso usuario 2");
            String email = "taynara@teste.com";
            String senha = "";
            UsuarioDAO instance = new UsuarioDAO();
            boolean expResult = false;
            boolean result = instance.login(email, senha);
            assertEquals(expResult, result);
        } 
}