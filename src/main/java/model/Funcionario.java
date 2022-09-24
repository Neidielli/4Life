/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 * @author tayna
 */
public class Funcionario {
    private int id;
    private String nome;
    private String CPF;
    private String tipo_func;
    private String telefone;
    private String email;
    private String senha;
    private String especialidade;

    public Funcionario(int id, String nome, String CPF, String tipo_func, String telefone, String email, String senha, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.tipo_func = tipo_func;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.especialidade = especialidade;
    }

    public Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTipo_func() {
        return tipo_func;
    }

    public void setTipo_func(String tipo_func) {
        this.tipo_func = tipo_func;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
