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
    
}
