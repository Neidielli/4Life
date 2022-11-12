/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection; 
import java.sql.SQLException; 
import telas.*;
/**
 *
 * @author tayna
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            System.out.println("Conexão aberta!");
            
            LoginGUI telalogin = new LoginGUI();
            telalogin.setVisible(true);
            
            connection.close();
        }
     }
}
