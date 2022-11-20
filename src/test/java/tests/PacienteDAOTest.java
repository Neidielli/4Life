/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import DAO.PacienteDAO;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    private Connection connection;
    
    public PacienteDAOTest() {
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
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cadastrar method, of class PacienteDAO.
     */
    @Test
    public void testAdicionarPaciente1() throws SQLException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        Paciente paciente = new Paciente();
        Date nascimento = new Date(1978-11-12); // atribui uma data para o obj date
        
//        int id = 0; id no banco é incremental
        String nome = "maria";
        String cpf = "123.456.789-12";
        String email = "test@.com";
        String telefone = "(55)93542-2124";
        Date data_nascimento = nascimento;
        String cep = "86300-000";
        String rua = "Zero";
        String bairro = "Centro";
        String cidade = "Curitiba";
        String estado = "Paraná";
        int num_endereco = 98;
        
        
        Paciente pacienteVerdadeiro1 = new Paciente();
        
        pacienteVerdadeiro1.setNome(nome);
        pacienteVerdadeiro1.setCpf(cpf);
        pacienteVerdadeiro1.setEmail(email);
        pacienteVerdadeiro1.setTelefone(telefone);
        pacienteVerdadeiro1.setData_nascimento(data_nascimento);
        pacienteVerdadeiro1.setCep(cep);
        pacienteVerdadeiro1.setRua(rua);
        pacienteVerdadeiro1.setBairro(bairro);
        pacienteVerdadeiro1.setCidade(cidade);
        pacienteVerdadeiro1.setEstado(estado);
        pacienteVerdadeiro1.setNum_endereco(num_endereco);
        
        
        /*executa cadastro com dados corretos*/
        assertEquals(true, pacienteDAO.cadastrar(pacienteVerdadeiro1));        
    }
    
    /**
     * Test of cadastrar method, of class PacienteDAO.
     */
    @Test
    public void testAdicionarPacienteFalso() throws SQLException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        Paciente paciente = new Paciente();
        Date nascimento = new Date(1978-11-10); // atribui uma data para o obj date
        
//        int id = 0; id no banco é incremental
        String nome = "maria";
        String cpf = "123.456.789-12";
        String email = null; // Email não pode ser nulo
        String telefone = "(55)93542-2124";
        Date data_nascimento = nascimento;
        String cep = "86300-000";
        String rua = "Zero";
        String bairro = "Centro";
        String cidade = "Curitiba";
        String estado = "Paraná";
        int num_endereco = 98;
        
        
        Paciente pacienteFalso = new Paciente();
        
        pacienteFalso.setNome(nome);
        pacienteFalso.setCpf(cpf);
        pacienteFalso.setEmail(email);
        pacienteFalso.setTelefone(telefone);
        pacienteFalso.setData_nascimento(data_nascimento);
        pacienteFalso.setCep(cep);
        pacienteFalso.setRua(rua);
        pacienteFalso.setBairro(bairro);
        pacienteFalso.setCidade(cidade);
        pacienteFalso.setEstado(estado);
        pacienteFalso.setNum_endereco(num_endereco);
        
        
        /*executa cadastro com dados corretos*/
        assertEquals(false, pacienteDAO.cadastrar(pacienteFalso));
        
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
    }

    /**
     * Test of editar method, of class PacienteDAO.
     */
//    @Test
//    public void testEditarPaciente() throws SQLException {
//        PacienteDAO id = new PacienteDAO();
//        
//        int id = 1;
//        String nome = "maria magna";
//        String cpf = "120.450.789-12";
//        String email = "test@.com";
//        String telefone = "35422124";
//        String senha= "parana";
//        
//        PacienteDAO paciente = new paciente(id,nome ,cpf,email,telefone,senha);
//        
//        /*executa cadastro*/
//        assertEquals(true, id.cadastrar(paciente));
//        
//        
//        Paciente pacienteeditado = new Paciente(id,nome ,cpf,email,telefone,senha);
//        
//        /*executa edição*/
//        assertEquals(true, id.editar(Pacienteeditado));
//        
//        
//        /*consulta edição efetuada*/
//        String select = "select * from usuario where nome=? and cpf=? and email=? and telefone=? and senha=?";
//        PreparedStatement stmt = connection.prepareStatement(select);
//        
//        assertEquals(nome, rs.getString("nome"));
//        assertEquals(cpf, rs.getString("cpf"));
//        assertEquals(email, rs.getString("email"));
//        assertEquals(telefone, rs.getString("telefone"));
//        assertEquals(senha, rs.getString("senha"));
//        
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
//    }

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
        }
}
