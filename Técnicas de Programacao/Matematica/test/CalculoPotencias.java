/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import matematica.Matematica;

/**
 *
 * @author Alunos
 */
public class CalculoPotencias {
    
        @Test
        public void testePotenciaDeDois()
        {
            Matematica mat = new Matematica();
            // Teste 2^0 = 1
            int base = 2;
            int potencia = 0;
            assertEquals(1, mat.pot(base, potencia));
            
            // Teste 2^1 = 2
            base = 2;
            potencia = 1;
            assertEquals(2, mat.pot(base, potencia));
            
            // Teste 2^2 = 4
            base = 2;
            potencia = 2;
            assertEquals(4, mat.pot(base, potencia));
            
            // Teste 2^3 = 8
            base = 2;
            potencia = 3;
            assertEquals(8, mat.pot(base, potencia));
            
            // Teste 2^4 = 16
            base = 2;
            potencia = 4;
            assertEquals(16, mat.pot(base, potencia));
            
            // Teste 2^5 = 32
            base = 2;
            potencia = 5;
            assertEquals(32, mat.pot(base, potencia));           
        }
        
}
