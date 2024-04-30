/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
    //Atributos
    protected String nome;
    private int idade;
    private String genero;
    
    //Construtor
    public Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    
    public Pessoa(String nome, int idade, String genero){
        this(nome,genero);
        this.idade = idade;
    }
    
    //Métodos abstratos deverão ser implementados nas classes filhas.
    public abstract String getNome();
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
}
