/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author taynara
 */
public class TestcomJunit {
    
    
    @Test
    public void testandoDados() {
        
      String nome1 = new String ("4Life");
      String nome2 = new String ("4Life");
      String nome3 = "life";
      String nome4 = null;	
      
      int num1 = 10;
      int num2 = 7;
      
      assertEquals(nome1, nome2);  //verifica se são iguais
      
      assertTrue (num1 > num2);   //verifica se a condição é verdadeira

      assertFalse(num1 < num2);   //verifica se a condição é falsa
      
      assertEquals(17, num1 + num2); //verifica se o resultado da soma está correto

      assertNull(nome4);  //verifica se a string é null

      assertNotSame(nome1,nome3);  //verifica se não são iguais

    }
}
