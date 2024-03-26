

import Principal.Aluno;
import Principal.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteHeranca {
    
    
    @Test
    public void testeFuncionario(){
        
        float salario = 2500.f;
              
        Funcionario f1= new Funcionario("José","Tio da Limpeza", salario);
        System.out.println("Nome:"+ f1.getNome()+" Cargo: " +f1.getCargo() + " Salário: " + f1.calculaSalario());
        assertEquals(salario, f1.calculaSalario(),0);
        
    }
}    
   
    

