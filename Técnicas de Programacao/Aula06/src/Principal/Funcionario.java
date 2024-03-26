/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alunos
 */
public class Funcionario extends Pessoa {
    
    private String cargo;
    private Float salarioBase;
    
    public Funcionario(String nome)
    {
        super(nome);        
    }
    
    public Funcionario(String nome, String cargo)
    {
        this(nome);
        this.cargo = cargo;
        
    }
    
    public Funcionario(String nome, String cargo, Float salarioBase)
    {
        super(nome);
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }
    //Métodos Get
    public String getCargo()
    {
        return cargo;
    }
    public Float getSalario()
    {
        return salarioBase;
    }
    
    //Métodos Set
    public Float setSalario(Float salarioBase)
    {
        this.salarioBase = salarioBase;
        return null;
    }
    
    public Float calculaSalario()
    {
        return salarioBase;
    }
}
