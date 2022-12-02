/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import DAO.ProntuarioDAO;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import model.Paciente;
import model.Prontuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ProntuarioDAOTest {
    
    private Connection connection;
    
    public ProntuarioDAOTest() {
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
         
//        String delete = "delete * from consultas";
//        PreparedStatement stmt = connection.prepareStatement(delete);
//        stmt.executeUpdate(delete); 
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cadastrar method, of class ProntuarioDAO.
     */
    

    /**
     * Test of listaProntuario method, of class ProntuarioDAO.
     */
    
    @Test
    public void testVisualizarProntuario() {
//        System.out.println("VisualizarProntuario");
        
        ProntuarioDAO dao = new ProntuarioDAO();
     
        /*================= Paciente ===========================*/        
        
        int idPac = 1;
        
        
        Paciente paciente = new Paciente(); // atribuir um paciente a ele
        
        paciente.setId(idPac);
        
        
        /*================= Prontuario ===========================*/
        Paciente id_paciente = paciente; 
        String cirurgia = "sim";
        String gestante = "nao";
        String fumante = "nao";
        String infarto = "nao";
        String medicacao = "nao";
        String alergia = "nao";
        String tratamento = "nao";
        String falta_ar = "nao";
        String doenca = "nao";
        String diabetico = "sim";
        String observacao = "nao";
        
        
                
        
        Prontuario prontuarioValido = new Prontuario();
       
        prontuarioValido.setPaciente(id_paciente);
        prontuarioValido.setCirurgia(cirurgia);
        prontuarioValido.setGestante(gestante);
        prontuarioValido.setFumante(fumante);
        prontuarioValido.setInfarto(infarto);
        prontuarioValido.setMedicacao(medicacao);
        prontuarioValido.setAlergia(alergia);
        prontuarioValido.setTratamento(tratamento);
        prontuarioValido.setFalta_ar(falta_ar);
        prontuarioValido.setDoenca(doenca);
        prontuarioValido.setDiabetico(diabetico);
        prontuarioValido.setObservacao(observacao);
       
        /*executa cadastro com dados corretos*/
        assertEquals(false, dao.cadastrar(prontuarioValido));   
    }

}
