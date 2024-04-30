/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author Alunos
 */
public class Colegial extends Aluno{

    public Colegial(String nome, int idade, String genero, float nota) {
        super(nome, idade, genero, nota);
    }
    
    
    @Override
    public String getNota(){
        return String.valueOf(super.nota);
    }
}
