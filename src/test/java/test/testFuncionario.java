/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import main.java.DAO.funcionarioDAO;
/**
 *
 * @author User
 */
public class testFuncionario {
    
@Test

 public void testFuncionario (){
    funcionarioDAO FuncionarioDAO = new funcionarioDAO();
     
    Funcionario FuncionarioDAO = new Funcionario();
        try{
            DAOFuncionario.open();
            FuncionarioDAO.close();
            FuncionarioDAO.setNome("joaoTEST");
            FuncionarioDAO.setLogin("loginTEST");
            FuncionarioDAO.setSenha("senhaTEST");
}catch (exception oe){
}
Assertions.assertEquals(1,FuncionarioDAO.criarFuncionario(FuncionarioDAO));
}
}