/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import DAO.UsuarioDAO;
import java.util.List;
import model.Usuario;
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
    
    public UsuarioDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class UsuarioDAO.
     */
//    @Test
//    public void testAdiciona() {
//        System.out.println("adiciona");
//        Usuario usuario = null;
//        UsuarioDAO instance = new UsuarioDAO();
//        instance.adiciona(usuario);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarUsuarios method, of class UsuarioDAO.
//     */
//    @Test
//    public void testListarUsuarios() {
//        System.out.println("listarUsuarios");
//        UsuarioDAO instance = new UsuarioDAO();
//        List<Usuario> expResult = null;
//        List<Usuario> result = instance.listarUsuarios();
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of alterar method, of class UsuarioDAO.
//     */
//    @Test
//    public void testAlterar() {
//        System.out.println("alterar");
//        Usuario usuario = null;
//        UsuarioDAO instance = new UsuarioDAO();
//        instance.alterar(usuario);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of excluir method, of class UsuarioDAO.
//     */
//    @Test
//    public void testExcluir() {
//        System.out.println("excluir");
//        Usuario usuario = null;
//        UsuarioDAO instance = new UsuarioDAO();
//        instance.excluir(usuario);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
        
        // Com Login falso
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
        System.out.println("login falso usuario 2");
        String email = "taynara@teste.com";
        String senha = "senhataynara1";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = false;
        boolean result = instance.login(email, senha);
        assertEquals(expResult, result);
    }  
    @Test
    public void testexcluir1Verdadeiro1() {
        
        // Com deletar usuario existente
        System.out.println("excluir existente 1");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance =new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.excluir(email, senha);
        assertEquals(expResult, result);
    }    
    @Test
    public void testexcluir1Verdadeiro2() {
        
        // Com deletar usuario existente
        System.out.println("excluir existente 2");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance =new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.excluir(email, senha);
        assertEquals(expResult, result);
    } 
    @Test
    public void testexcluir1falso1() {
        
        // Com deletar usuario falso
        System.out.println("excluir falso 1");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance =new UsuarioDAO();
        boolean expResult = false;
        boolean result = instance.excluir(email, senha);
        assertEquals(expResult, result);
    }    
    @Test
    public void testexcluir1Falso2() {
        
        // Com deletar usuario falso
        System.out.println("excluir falso 2");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance =new UsuarioDAO();
        boolean expResult = false;
        boolean result = instance.excluir(email, senha);
        assertEquals(expResult, result);
    }  
    @Test
    public void testListarUsuario1Verdadeiro() {
        
        // Com Listar usuario verdadeiro 1
        System.out.println("listar existente");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.listarUsuario(email, senha);
        assertEquals(expResult, result);
    }    
         //Com Listar usuario verdadeiro 2
    @Test    
    public void testListarUsuario2Verdadeiro() {
        System.out.println("listar existente usuario 2");
        String email = "taynara@teste.com";
        String senha = "senhataynara";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.listarUsuario(email, senha);
        assertEquals(expResult, result);
    }  
    @Test
    public void testListarUsuario1Falso() {
        
        // Com Listar usuario falso 1
        System.out.println("listar usuario existente");
        String email = "neidielli@teste.com";
        String senha = "senhateste";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = false;
        boolean result = instance.listarUsuario(email, senha);
        assertEquals(expResult, result);
    }    
         //Com Listar usuario falso 2
    @Test    
    public void testListarUsuario2Falso() {
        System.out.println("listar usuario 2");
        String email = "taynara@teste.com";
        String senha = "senhataynara";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = false;
        boolean result = instance.listarUsuario(email, senha);
        assertEquals(expResult, result);
    }  
   @Test
    public void testAdicionarl() throws SQLException {
        usuario id = new usuario();
        
        int id="1";
        String nome= "maria";
        String cpf ="12345678912";
        String email="neidieli@teste.com";
        String telefone="35423542";
        String senha="123";
        
        usuario usuario = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa cadastro com dados corretos*/
        assertEquals(true, id.adicionarUsuario(usuario));
        
        /*consulta cadastro efetuado*/
        String select = "String select = \"select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? \";
        PreparedStatement stmt = connection.prepareStatement(select);
        
        stmt.setString(1, nome);
        stmt.setString(2, cpf);
        stmt.setString(3, email);
        stmt.setString(4, telefone);
        stmt.setString(5, senha);
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
        
    
         //Com Listar usuario verdadeiro 2
    @Test
    public void testAdicionar2() throws SQLException {
        usuario id = new usuario();
        
        int id="2";
        String nome= "joao";
        String cpf ="01234567891";
        String email="gabrel@teste.com";
        String telefone="35421122";
        String senha="321";
        
        usuario usuario = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa cadastro com dados corretos*/
        assertEquals(true, id.adicionarUsuario(usuario));
        
        /*consulta cadastro efetuado*/
        String select = "select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? ";
        PreparedStatement stmt = connection.prepareStatement(select);
        
        stmt.setString(1, nome);
        stmt.setString(2, cpf);
        stmt.setString(3, email);
        stmt.setString(4, telefone);
        stmt.setString(5, senha);
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
        
    @Test
    public void testAdicionarlFalso() throws SQLException {
        usuario id = new usuario();
        
        int id="";
        String nome= "";
        String cpf ="";
        String email="";
        String telefone="";
        String senha="";
        
        usuario usuario = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa cadastro com dados corretos*/
        assertEquals(false, id.adicionarUsuario(usuario));
        
        /*consulta cadastro efetuado*/
        String select = "select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? ";
        PreparedStatement stmt = connection.prepareStatement(select);
        
        stmt.setString(1, nome);
        stmt.setString(2, cpf);
        stmt.setString(3, email);
        stmt.setString(4, telefone);
        stmt.setString(5, senha);
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
        
         //usuario adiciona 2 falso
    @Test
    public void testListaUsuario() {
        UsuarioDAO id = new UsuarioDAO();
        List<Usuario> lista = new ArrayList<Usuario>();
        
        /*executa ListarImovel*/
        lista = id.listarUsuario("maria");
        
        for(Usuario Usuario : lista){
            assertEquals("maria", usuario.getUsuario());
        }
    }
    
 
    }   
    }
@Test
    public void testEditar1falso() throws SQLException {
        editar id = new editar();
        
        int id="";
        String nome= "";
        String cpf ="";
        String email="";
        String telefone="";
        String senha="";
        
        usuariousuario = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa cadastro*/
        assertEquals(true, id.adicionar(usuario));
        
        /*---------------------------*/
            id="2";
            nome= "";
            cpf ="12345678912";
            email="gabriel@teste.com";
            telefone="35423698";
            senha="00";
        
        usuario usuarioeditado = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa edição*/
        assertEquals(true, id.editar(usuarioeditado));
        
        /*executa edição com dados incorretos*/
        usuario.setnome(null);
        assertEquals(false, id.editarusuario(id));
        
        /*consulta edição efetuada*/
        String select = "select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? ";
        PreparedStatement stmt = connection.prepareStatement(select);
        
         stmt.setString(1, nome);
        stmt.setString(2, cpf);
        stmt.setString(3, email);
        stmt.setString(4, telefone);
        stmt.setString(5, senha);
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
        
    }    
         //Com alterar existente 2 
    @Test
    public void testEditar1Verdadeiro() throws SQLException {
        editar id = new editar();
        
        int id="";
        String nome= "";
        String cpf ="";
        String email="";
        String telefone="";
        String senha="";
        
        usuariousuario = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa cadastro*/
        assertEquals(true, id.adicionar(imovel));
        
        /*---------------------------*/
            id="2";
            nome= "";
            cpf ="12345678912";
            email="gabriel@teste.com";
            telefone="35423698";
            senha="00";
        
        usuario usuarioeditado = new usuario(id,nome,cpf,email,telefone,senha);
        
        /*executa edição*/
        assertEquals(true, id.editar(usuarioeditado));
        
        /*executa edição com dados incorretos*/
        usuario.setnome(null);
        assertEquals(false, id.editarusuario(id));
        
        /*consulta edição efetuada*/
        String select = "select * from usuario where nome=? and numero=? and cpf=? and email=? and telefone=? and senha=? ";
        PreparedStatement stmt = connection.prepareStatement(select);
        
         stmt.setString(1, nome);
        stmt.setString(2, cpf);
        stmt.setString(3, email);
        stmt.setString(4, telefone);
        stmt.setString(5, senha);
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
        
    }
    