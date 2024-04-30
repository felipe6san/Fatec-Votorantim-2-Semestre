/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author Alunos
 */
public abstract class Aluno extends Pessoa{
    //Atributos
    protected float nota;
    //Construtor
    public Aluno(String nome, String genero) {
        super(nome, genero);
    }
    
     public Aluno(String nome,int idade, String genero, float nota) {
        super(nome, idade,genero);
        this.nota = nota;
    }
     
     @Override
     public String getNome(){
         return super.nome;
     }
     
     public abstract String getNota();
     
     public void setNota(float nota){
         this.nota = nota;
     }
     
}
