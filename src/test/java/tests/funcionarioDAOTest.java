/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Funcionario;
import DAO.FuncionarioDAO;

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
    
    private Connection connection;
    
    public funcionarioDAOTest() {
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
//        String delete = "delete from funcionario";
//        PreparedStatement stmt = connection.prepareStatement(delete);
//        stmt.executeUpdate(delete); // DEPOIS QUE TIVER BANCO SOMENTE PRA TESTES
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cadastrar method, of class FuncionarioDAO.
     */
    @Test
    public void testAdicionarFunionario() throws SQLException {
        FuncionarioDAO funcionario = new FuncionarioDAO();
        
//        int id = 1;
        String nome = "Mariana";
        String CPF = "123.456.789-12";
        String tipo_func = "enfermeiro";
        String telefone = "(41)99563-5689";
        String email = "enfermeiramaria@test.com";
        String especialidade = "gerente";
        
        
        Funcionario FuncionarioVerdadeiro1 = new Funcionario();
        
        FuncionarioVerdadeiro1.setNome(nome);
        FuncionarioVerdadeiro1.setCPF(CPF);
        FuncionarioVerdadeiro1.setTipo_func(tipo_func);
        FuncionarioVerdadeiro1.setTelefone(telefone);
        FuncionarioVerdadeiro1.setEmail(email);
        FuncionarioVerdadeiro1.setEspecialidade(especialidade);
        
        /*executa cadastro com dados corretos*/
        assertEquals(true, funcionario.cadastrar(FuncionarioVerdadeiro1));
    }
        @Test
    public void testAdicionarFunionarioFalso() throws SQLException {
        FuncionarioDAO funcionario = new FuncionarioDAO();
        
//        int id = 1;
        String nome = "Mariana Falsa";
        String CPF = "123.456.789-12";
        String tipo_func = "enfermeiro";
        String telefone = "(41)99563-5689";
        String email = null;
        String especialidade = "gerente";
        
        
        Funcionario FuncionarioFalso = new Funcionario();
        
        FuncionarioFalso.setNome(nome);
        FuncionarioFalso.setCPF(CPF);
        FuncionarioFalso.setTipo_func(tipo_func);
        FuncionarioFalso.setTelefone(telefone);
        FuncionarioFalso.setEmail(email);
        FuncionarioFalso.setEspecialidade(especialidade);
        
        /*executa cadastro com dados corretos*/
        assertEquals(false, funcionario.cadastrar(FuncionarioFalso));
    }

    /**
     * Test of EditarFuncionario method, of class FuncionarioDAO.
     */
//     @Test
//    public void testEditarFuncionario() throws SQLException {
//        FuncionarioDAO id = new FuncionarioDAO();
//        
//        int id = 1;
//        String nome = "maria";
//        String cpf = "12345678912";
//        String email = "test@.com";
//        String telefone = "35422124";
//        String senha= "parana";
//        
//        Funcionario funcionario = new Funcionario(id,nome ,cpf,email,telefone,senha);
//        
//        /*executa cadastro*/
//        assertEquals(true, id.adicionarFuncionario(funcionario));
//        
//        /*---------------------------*/
//        String nome = "maria";
//        String cpf = "12345678912";
//        String email = "test@.com";
//        String telefone = "35422124";
//        String senha= "parana";
//        
//        Funcionario funcionarioeditado = new Funcionario(id,nome ,cpf,email,telefone,senha);
//        
//        /*executa edição*/
//        assertEquals(true, id.editarFuncionario(uFuncionarioeditado));
//        
//        /*executa edição com dados incorretos*/
//        Funcionario.setFuncionario(null);
//        assertEquals(false, id.editarFuncionario(funcionario));
//        
//        /*consulta edição efetuada*/
//        String select = "select * from usuario where nome=? and cpf=? and email=? and telefone=? and senha=?";
//        PreparedStatement stmt = connection.prepareStatement(select);
//        
//        assertEquals(logradouro, rs.getString("nome"));
//        assertEquals(numero, rs.getString("cpf"));
//        assertEquals(bairro, rs.getString("email"));
//        assertEquals(cidade, rs.getString("telefone"));
//        assertEquals(estado, rs.getString("senha"));
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
    
    @Test
    public void testListaFuncionarioNotNull() {
        System.out.println("Lista funcionario");
        FuncionarioDAO instance = new FuncionarioDAO();
        List<Funcionario> result = instance.listaFunc();
        assertNotNull(result);
    } 
}
