/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import DAO.FuncionarioDAO;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String CPF = "12345678912";
        String tipo_func = "enfermeiro";
        String telefone = "enfermeiramaria@test.com";
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

    /**
     * Test of listaFunc method, of class FuncionarioDAO.
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
    public void testListaFuncionario() {
        FuncionarioDAO id = new FuncionarioDAO();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        
        
        lista = id.listaFunc();
        
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
    }
    
}
