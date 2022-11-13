/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import DAO.PacienteDAO;
import java.util.List;
import model.Paciente;
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
public class PacienteDAOTest {
    
    public PacienteDAOTest() {
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
     * Test of cadastrar method, of class PacienteDAO.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        Paciente paciente = null;
        PacienteDAO instance = new PacienteDAO();
        boolean expResult = false;
        boolean result = instance.cadastrar(paciente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaPac method, of class PacienteDAO.
     */
    @Test
    public void testListaPac() {
        System.out.println("listaPac");
        PacienteDAO instance = new PacienteDAO();
        List<Paciente> expResult = null;
        List<Paciente> result = instance.listaPac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class PacienteDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        Paciente paciente = null;
        PacienteDAO instance = new PacienteDAO();
        instance.editar(paciente);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class PacienteDAO.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Paciente paciente = null;
        PacienteDAO instance = new PacienteDAO();
        boolean expResult = false;
        boolean result = instance.deletar(paciente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testAdicionarPaciente1() throws SQLException {
        PacienteDAO id = new PacienteDAO();
        
        int id = 1;
        String nome = "maria";
        String cpf = "12345678912";
        String email = "test@.com";
        String telefone = "35422124";
        String senha= "parana";
        
        
        Paciente paciente = new Paciente(id,nome ,cpf,email,telefone,senha);
        
        /*executa cadastro com dados corretos*/
        assertEquals(true, id.adicionarPaciente(Paciente));
        
        /* cadastro efetuado*/
        String select = "select * from paciente where nome=? and cpf=? and email=? and telefone=? and senha=?";
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
     * Test of listaFunc method, of class PacienteDAO.
     */
     @Test
    public void testEditarPaciente() throws SQLException {
        PacienteDAO id = new PacienteDAO();
        
        int id = 1;
        String nome = "maria";
        String cpf = "12345678912";
        String email = "test@.com";
        String telefone = "35422124";
        String senha= "parana";
        
        PacienteDAO paciente = new paciente(id,nome ,cpf,email,telefone,senha);
        
        /*executa cadastro*/
        assertEquals(true, id.adicionarPacienteDAO(paciente));
        
        /*---------------------------*/
        String nome = "maria";
        String cpf = "12345678912";
        String email = "test@.com";
        String telefone = "35422124";
        String senha= "parana";
        
        Paciente pacienteeditado = new Paciente(id,nome ,cpf,email,telefone,senha);
        
        /*executa edição*/
        assertEquals(true, id.editarPaciente(Pacienteeditado));
        
        /*executa edição com dados incorretos*/
        Paciente.setPaciente(null);
        assertEquals(false, id.editarPaciente(Paciente));
        
        /*consulta edição efetuada*/
        String select = "select * from usuario where nome=? and cpf=? and email=? and telefone=? and senha=?";
        PreparedStatement stmt = connection.prepareStatement(select);
        
        assertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
        
        
        ResultSet rs = stmt.executeQuery();
        rs.next();

        /*realiza asserções confirmando que os dados foram adicionados ao banco corretamente*/
       ssertEquals(nome, rs.getString("nome"));
        assertEquals(cpf, rs.getString("cpf"));
        assertEquals(email, rs.getString("email"));
        assertEquals(telefone, rs.getString("telefone"));
        assertEquals(senha, rs.getString("senha"));
    }
    
    @Test
    public void testListaPaciente() {
        PacienteDAO id = new PacienteDAO();
        List<Paciente> lista = new ArrayList<Paciente>();
        
        
        lista = id.listarPaciente();
        
        assertNotEquals(0, lista.size());
    }
    
}
