/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import DAO.FuncionarioDAO;
import java.util.List;
import model.Funcionario;
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
public class funcionarioDAOTest {
    
    public funcionarioDAOTest() {
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
     * Test of cadastrar method, of class FuncionarioDAO.
     */
    @Test
    public void testAdicionarFunionario() throws SQLException {
        FuncionarioDAO id = new FuncionarioDAO();
        
        int id = 1;
        String nome = "maria";
        String cpf = "12345678912";
        String email = "test@.com";
        String telefone = "35422124";
        String senha= "parana";
        
        
        Usuario usuario = new Usuario(id,nome ,cpf,email,telefone,senha);
        
        /*executa cadastro com dados corretos*/
        assertEquals(true, id.adicionarFUNCIONARIO(FUNCIONARIO));
        
        /* cadastro efetuado*/
        String select = "select * from usuario where nome=? and cpf=? and email=? and telefone=? and senha=?";
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

    /**
     * Test of listaFunc method, of class FuncionarioDAO.
     */
     @Test
    public void testEditarFuncionario() throws SQLException {
        FuncionarioDAO id = new FuncionarioDAO();
        
        int id = 1;
        String nome = "maria";
        String cpf = "12345678912";
        String email = "test@.com";
        String telefone = "35422124";
        String senha= "parana";
        
        Funcionario funcionario = new Funcionario(id,nome ,cpf,email,telefone,senha);
        
        /*executa cadastro*/
        assertEquals(true, id.adicionarFuncionario(funcionario));
        
        /*---------------------------*/
        String nome = "maria";
        String cpf = "12345678912";
        String email = "test@.com";
        String telefone = "35422124";
        String senha= "parana";
        
        Funcionario funcionarioeditado = new Funcionario(id,nome ,cpf,email,telefone,senha);
        
        /*executa edição*/
        assertEquals(true, id.editarFuncionario(uFuncionarioeditado));
        
        /*executa edição com dados incorretos*/
        Funcionario.setFuncionario(null);
        assertEquals(false, id.editarFuncionario(funcionario));
        
        /*consulta edição efetuada*/
        String select = "select * from usuario where nome=? and cpf=? and email=? and telefone=? and senha=?";
        PreparedStatement stmt = connection.prepareStatement(select);
        
        assertEquals(logradouro, rs.getString("nome"));
        assertEquals(numero, rs.getString("cpf"));
        assertEquals(bairro, rs.getString("email"));
        assertEquals(cidade, rs.getString("telefone"));
        assertEquals(estado, rs.getString("senha"));
        
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
    }
    
    @Test
    public void testListaFuncionario() {
        FuncionarioDAO id = new FuncionarioDAO();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        
        
        lista = id.listarFuncionario();
        
        assertNotEquals(0, lista.size());
    }
    
   
    
    /**
     * Test of deletar method, of class FuncionarioDAO.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Funcionario func = null;
        FuncionarioDAO instance = new FuncionarioDAO();
        boolean expResult = false;
        boolean result = instance.deletar(func);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
