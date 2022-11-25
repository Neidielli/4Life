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
import java.sql.PreparedStatement;
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
         
        String delete = "delete from consultas where procedimento = 'Consulta do AgendaTest'";
        PreparedStatement stmt = connection.prepareStatement(delete);
        stmt.executeUpdate(delete); 
    }

    /**
     * Test of AgendarConsulta method, of class AgendaDAO.
     */
    @Test
    public void testAgendarConsulta() {
//        System.out.println("AgendarConsulta");
        
        AgendaDAO dao = new AgendaDAO();
     
        /*================= Paciente ===========================*/
        Date nascimento = new Date(1978-11-12); // atribui uma data para o obj date
        
        String nome = "Maria Consulta";
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
        
        Paciente paciente = new Paciente(); // atribuir um paciente a ele
        
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setEmail(email);
        paciente.setTelefone(telefone);
        paciente.setData_nascimento(data_nascimento);
        paciente.setCep(cep);
        paciente.setRua(rua);
        paciente.setBairro(bairro);
        paciente.setCidade(cidade);
        paciente.setEstado(estado);
        paciente.setNum_endereco(num_endereco);
        
        /*================= Funcionario ===========================*/
        
        String nome2 = "Mariana Consulta";
        String CPF = "123.456.789-12";
        String tipo_func = "Médica";
        String telefone2 = "(41)99563-5689";
        String email2 = "marianna@test.com";
        String especialidade = "gerente";
        
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome(nome2);
        funcionario.setCPF(CPF);
        funcionario.setTipo_func(tipo_func);
        funcionario.setTelefone(telefone2);
        funcionario.setEmail(email2);
        funcionario.setEspecialidade(especialidade);
        
        /*================= Consulta ===========================*/
        Date agendamento = new Date(2022-11-10); // atribui uma data para o obj date
        
        String procedimento = "Consulta do Age11ndaTest";
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
//        assertEquals(true, dao.AgendarConsulta(agendaValido));   
    }
    
        @Test
    public void testAgendarConsultaFalsa() {
//        System.out.println("AgendarConsulta");
        
        AgendaDAO dao = new AgendaDAO();
        Date agendamento = new Date(2022-11-10); // atribui uma data para o obj date
        Paciente paciente = new Paciente(); // atribuir um paciente a ele
        Funcionario funcionario = new Funcionario(); // atribuir um funcionario a ele
        
        String procedimento = "Consulta";
        Paciente idPaciente = paciente;
        Funcionario idProfissional = funcionario;
        Date data_hora = agendamento;
        String tipo_consulta = "retorno";
        String hora = null; // hora não pode ser nula        
        
        Agenda agendaFalso = new Agenda();
        
        agendaFalso.setProcedimento(procedimento);
        agendaFalso.setPaciente(idPaciente);
        agendaFalso.setFuncionario(idProfissional);
        agendaFalso.setData_hora(data_hora);
        agendaFalso.setTipo_consulta(tipo_consulta);
        agendaFalso.setHora(hora);
       
        /*executa cadastro com dados corretos*/
//        assertEquals(false, dao.AgendarConsulta(agendaFalso));   
    }

    /**
     * Test of listarConsultas method, of class AgendaDAO.
     */
    @Test
    public void testListarConsultasNotNull() { // teste de visualizar consulta
//        System.out.println("listarConsultas");
        AgendaDAO instance = new AgendaDAO();
//        List<Agenda> expResult = null;
        List<Agenda> result = instance.listarConsultas();
        assertNotNull(result);
    }
    
}
