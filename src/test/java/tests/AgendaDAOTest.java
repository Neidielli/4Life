/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import DAO.AgendaDAO;
import model.Agenda;
import model.Funcionario;
import model.Paciente;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author neidi
 */
public class AgendaDAOTest {
    
    private Connection connection;
    
    public AgendaDAOTest() {
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

    /**
     * Test of AgendarConsulta method, of class AgendaDAO.
     */
    @Test
    public void testAgendarConsulta() {
        System.out.println("AgendarConsulta");
        
        AgendaDAO dao = new AgendaDAO();
        Date agendamento = new Date(2022-11-10); // atribui uma data para o obj date
        Paciente paciente = new Paciente(); // atribuir um paciente a ele
        Funcionario funcionario = new Funcionario(); // atribuir um funcionario a ele
        
        String procedimento = "maria";
        Paciente idPaciente = paciente;
        Funcionario idProfissional = funcionario;
        Date data_hora = agendamento;
        String tipo_consulta = "retorno";
        String hora = "08:00";        
        
        Agenda agendaValido = new Agenda();
        
        agendaValido.setProcedimento(procedimento);
        agendaValido.setPaciente(idPaciente);
        agendaValido.setFuncionario(idProfissional);
        agendaValido.setData_hora(data_hora);
        agendaValido.setTipo_consulta(tipo_consulta);
        agendaValido.setHora(hora);
       
        /*executa cadastro com dados corretos*/
        assertEquals(true, dao.AgendarConsulta(agendaValido));   
    }

    /**
     * Test of listarConsultas method, of class AgendaDAO.
     */
    @Test
    public void testListarConsultasNotNull() { // teste de visualizar consulta
        System.out.println("listarConsultas");
        AgendaDAO instance = new AgendaDAO();
//        List<Agenda> expResult = null;
        List<Agenda> result = instance.listarConsultas();
        assertNotNull(result);
    }

    /**
     * Test of deletar method, of class AgendaDAO.
//     */
//    @Test
//    public void testDeletar() {
//        System.out.println("deletar");
//        Agenda agenda = null;
//        AgendaDAO instance = new AgendaDAO();
//        instance.deletar(agenda);
//    }
    
}
