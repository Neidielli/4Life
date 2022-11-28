/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.util.List;

import model.Paciente;
import DAO.PacienteDAO;

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

/*======= Garante que o banco de dados estará limpo antes de realizar os testes =======*/         
//        String delete = "delete from paciente";
//        PreparedStatement stmt = connection.prepareStatement(delete);
//        stmt.executeUpdate(delete); // DEPOIS QUE TIVER BANCO SOMENTE PRA TESTES
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
        String nome = "Mara Testes";
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
    public void testListaPacNotNull() {
        System.out.println("listaPac");
        PacienteDAO instance = new PacienteDAO();
        List<Paciente> result = instance.listaPac();
        assertNotNull(result);
    }

    /**
     * Test of editar method, of class PacienteDAO.
     */
//    @Test
//    public void testEditarPaciente() throws SQLException {
//        PacienteDAO pacienteDAO = new PacienteDAO();
//        Paciente paciente = new Paciente();
//        Date nascimento = new Date(1988-11-20); // atribui uma data para o obj date
//        
////        int id = 0; id no banco é incremental
//        String nome = "Paciente Novo";
//        String cpf = "123.456.000-12";
//        String email = "paciente@novo.com"; 
//        String telefone = "(55)93542-0000";
//        Date data_nascimento = nascimento;
//        String cep = "86300-000";
//        String rua = "Nova";
//        String bairro = "Centro";
//        String cidade = "Curitiba";
//        String estado = "Paraná";
//        int num_endereco = 294;
//        
//        Paciente pacienteNovo = new Paciente();
//        
//        pacienteNovo.setNome(nome);
//        pacienteNovo.setCpf(cpf);
//        pacienteNovo.setEmail(email);
//        pacienteNovo.setTelefone(telefone);
//        pacienteNovo.setData_nascimento(data_nascimento);
//        pacienteNovo.setCep(cep);
//        pacienteNovo.setRua(rua);
//        pacienteNovo.setBairro(bairro);
//        pacienteNovo.setCidade(cidade);
//        pacienteNovo.setEstado(estado);
//        pacienteNovo.setNum_endereco(num_endereco);
//        
//        /*executa cadastro*/
//        assertEquals(true, pacienteDAO.cadastrar(pacienteNovo));
//        
//        /*---------------------------*/
//        Date nascimentoEditado = new Date(1988-11-23);
////        int id = 0; id no banco é incremental
//        nome = "Paciente Editado";
//        cpf = "123.456.000-12";
//        email = "paciente@editado.com"; 
//        telefone = "(55)93542-0000";
//        data_nascimento = nascimentoEditado;
//        cep = "86300-000";
//        rua = "Rua editada";
//        bairro = "Centro";
//        cidade = "Curitiba";
//        estado = "Paraná";
//        num_endereco = 294;
//        
//        Paciente pacienteEditado = new Paciente();
//        
//        pacienteEditado.setNome(nome);
//        pacienteEditado.setCpf(cpf);
//        pacienteEditado.setEmail(email);
//        pacienteEditado.setTelefone(telefone);
//        pacienteEditado.setData_nascimento(data_nascimento);
//        pacienteEditado.setCep(cep);
//        pacienteEditado.setRua(rua);
//        pacienteEditado.setBairro(bairro);
//        pacienteEditado.setCidade(cidade);
//        pacienteEditado.setEstado(estado);
//        pacienteEditado.setNum_endereco(num_endereco);
//        
//        /*executa edição*/
////        assertEquals(true, pacienteDAO.editar(pacienteEditado));
//    }
}
