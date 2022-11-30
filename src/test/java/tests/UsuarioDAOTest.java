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
        String nome = "Neid Testes";
        String cpf ="010.020.030-04"; // cpf é um varchar(15)
        String email = "neidTestes@gmail.com"; 
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
    public void testAdicionarEmailNull() throws SQLException {
         UsuarioDAO usuario = new UsuarioDAO();

//        int id="";
        String nome = "Neid Testes";
        String cpf ="010.020.030-04"; // cpf é um varchar(15)

        String telefone = "(41)90005-0000";
        String senha = "marimari";

        Usuario usuarioVerdadeiro1 = new Usuario();

        usuarioVerdadeiro1.setNome(nome);
        usuarioVerdadeiro1.setCpf(cpf);

        usuarioVerdadeiro1.setTelefone(telefone);
        usuarioVerdadeiro1.setSenha(senha);


        assertThrows(RuntimeException.class, () -> usuario.cadastrar(usuarioVerdadeiro1));
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