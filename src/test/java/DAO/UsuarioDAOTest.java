/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import dao.UsuarioDAO;
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
    @Test
    public void testAdiciona() {
        System.out.println("adiciona");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.adiciona(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarUsuarios method, of class UsuarioDAO.
     */
    @Test
    public void testListarUsuarios() {
        System.out.println("listarUsuarios");
        UsuarioDAO instance = new UsuarioDAO();
        List<Usuario> expResult = null;
        List<Usuario> result = instance.listarUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class UsuarioDAO.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.alterar(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class UsuarioDAO.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.excluir(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UsuarioDAO.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "";
        String senha = "";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = false;
        boolean result = instance.login(email, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
