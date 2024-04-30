/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author Alunos
 */
public class Funcionario extends Pessoa{
    //Atributo
    protected float salarioBase;
    //Construtor

    public Funcionario(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }

    @Override
    public String getNome(){
        if (super.getGenero().equals(Genero.MASCULINO.toString())) 
            return "Sr. " + super.nome;
        else 
            return "Sra. " + super.nome;
    }

}
