/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author Alunos
 */
public final class Fundamental extends Aluno{
    
    public Fundamental(String nome, int idade, String genero, float nota){
            super(nome, idade, genero, nota);
    }

    @Override
    public String getNota() {
        if (nota == 9.0 >= 10.0) {
            return "A";
        } 
        else if (nota >= 7.0) {
            return "B";
        } 
        else if (nota >= 5.0) {
            return "C";
        } 
        else {
            return "D";
        }
    }
}

