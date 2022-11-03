/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author neidi
 */
public class Agenda {
    
    private int id_Consulta;
    private String procedimento;
    //private Paciente paciente;
    private Funcionario funcionario;
    private String data_hora;
    private String tipo_consulta;
    private String hora;

    public int getId_Consulta() {
        return id_Consulta;
    }

    public void setId_Consulta(int id_Consulta) {
        this.id_Consulta = id_Consulta;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    //public Paciente getPaciente() { // PRECISA DA CLASSE PACIENTE.JAVA
      //  return paciente;
    //}

    //public void setPaciente(Paciente paciente) {
      //  this.paciente = paciente;
    //}

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) { 
        this.funcionario = funcionario;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
