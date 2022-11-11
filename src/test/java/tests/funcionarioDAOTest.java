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
    public void testCadastrar() {
        System.out.println("cadastrar");
        Funcionario funcionario = null;
        FuncionarioDAO instance = new FuncionarioDAO();
        boolean expResult = false;
        boolean result = instance.cadastrar(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaFunc method, of class FuncionarioDAO.
     */
    @Test
    public void testListaFunc() {
        System.out.println("listaFunc");
        FuncionarioDAO instance = new FuncionarioDAO();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listaFunc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class FuncionarioDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        Funcionario func = null;
        FuncionarioDAO instance = new FuncionarioDAO();
        boolean expResult = false;
//        boolean result = instance.editar(func);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
